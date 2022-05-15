package com.tryden12.demominiclerkie.ui.main

import android.annotation.SuppressLint
import android.content.res.Resources
import android.graphics.Rect
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment
import com.tryden12.demominiclerkie.R
import com.tryden12.demominiclerkie.databinding.FragmentMainBinding
import com.tryden12.demominiclerkie.databinding.FragmentPopupBinding
import kotlinx.android.synthetic.main.fragment_popup.*
import kotlinx.android.synthetic.main.fragment_popup.view.*

class PopupFragment : DialogFragment(), RadioGroup.OnCheckedChangeListener {

    private lateinit var binding: FragmentPopupBinding


    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_popup, container, false)
        //binding = FragmentPopupBinding.inflate(layoutInflater)
        //return binding.root

        var rootView: View = inflater.inflate(R.layout.fragment_popup, container, false)


        rootView.confirm_btn.setOnClickListener{
            dismiss()
        }

        val radioGroup = rootView.findViewById<RadioGroup>(R.id.amountRadioGroup)
        val amount1 = rootView.findViewById<RadioButton>(R.id.amount_15)
        val amount2 = rootView.findViewById<RadioButton>(R.id.amount_25)
        val amount3 = rootView.findViewById<RadioButton>(R.id.amount_50)
        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            val radio: RadioButton = rootView.findViewById(checkedId)

            when (radio) {
                amount1 -> {
                    amount1.setBackgroundResource(R.drawable.mint_green_circle)
                    amount1.setTextColor(resources.getColor(R.color.white))

                    amount2.setBackgroundResource(R.drawable.grey_circle)
                    amount2.setTextColor(resources.getColor(R.color.mint_green))

                    amount3.setBackgroundResource(R.drawable.grey_circle)
                    amount3.setTextColor(resources.getColor(R.color.mint_green))
                }
                amount2 -> {
                    amount2.setBackgroundResource(R.drawable.mint_green_circle)
                    amount2.setTextColor(resources.getColor(R.color.white))

                    amount1.setBackgroundResource(R.drawable.grey_circle)
                    amount1.setTextColor(resources.getColor(R.color.mint_green))

                    amount3.setBackgroundResource(R.drawable.grey_circle)
                    amount3.setTextColor(resources.getColor(R.color.mint_green))
                }
                amount3 -> {
                    amount3.setBackgroundResource(R.drawable.mint_green_circle)
                    amount3.setTextColor(resources.getColor(R.color.white))

                    amount2.setBackgroundResource(R.drawable.grey_circle)
                    amount2.setTextColor(resources.getColor(R.color.mint_green))

                    amount1.setBackgroundResource(R.drawable.grey_circle)
                    amount1.setTextColor(resources.getColor(R.color.mint_green))
                }
            }
        }


        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setWidthPercent(75)
    }


    /**
     * This method sets the width of the dialog to a percentage
     * of the current screen width.
     */
    private fun DialogFragment.setWidthPercent(percentage: Int) {
        val percent = percentage.toFloat() / 100
        val dm = Resources.getSystem().displayMetrics
        val rect = dm.run { Rect(0, 0, widthPixels, heightPixels) }
        val percentWidth = rect.width() * percent
        dialog?.window?.setLayout(percentWidth.toInt(), ViewGroup.LayoutParams.WRAP_CONTENT)

        // Set transparent background and no title
        if (dialog != null && dialog?.window != null) {
            dialog!!.window?.setBackgroundDrawable(resources.getDrawable(R.drawable.custom_dialog_bg));
        }
    }

    /**
     * Call this method (in onActivityCreated or later)
     * to make the dialog near-full screen.
     */
    fun DialogFragment.setFullScreen() {
        dialog?.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

    override fun onCheckedChanged(v: RadioGroup?, i: Int) {

        if (amount_15.isChecked) {
            amount_15.setBackgroundResource(R.drawable.cancel)
        }

    }

}
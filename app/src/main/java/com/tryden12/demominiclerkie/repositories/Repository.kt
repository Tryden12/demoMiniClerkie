package com.tryden12.demominiclerkie.repositories

import androidx.lifecycle.LiveData
import com.tryden12.demominiclerkie.api.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object Repository {

    private var job : Job? = null

    /******************* TextWithImage *************************************************************/
    fun getObjectTextWithImage(id : Int) : LiveData<TextWithImage> {
        return object: LiveData<TextWithImage>() {
            override fun onActive() {
                super.onActive()
                if (job?.isActive != true) {
                    job = CoroutineScope(IO + job!!).launch {
                        val id = MyRetrofitBuilder.textWithImage.getObject(id)

                        withContext(Main) {
                            value = id
                            job!!.isCompleted
                        }
                    }
                }
            }
        }
    }


    /******************* Text *************************************************************/
    fun getObjectText(id : String) : LiveData<Text> {
        return object: LiveData<Text>() {
            override fun onActive() {
                super.onActive()
                if (job?.isActive != true) {
                    job = CoroutineScope(IO + job!!).launch {
                        val id = MyRetrofitBuilder.text.getObject(id)

                        withContext(Main) {
                            value = id
                            job!!.isCompleted
                        }
                    }
                }
            }
        }
    }


    /******************* Image *************************************************************/
    fun getObjectImage(id : Int) : LiveData<Image> {
        return object: LiveData<Image>() {
            override fun onActive() {
                super.onActive()
                if (job?.isActive != true) {
                    job = CoroutineScope(IO + job!!).launch {
                        val id = MyRetrofitBuilder.image.getObject(id)

                        withContext(Main) {
                            value = id
                            job!!.isCompleted
                        }
                    }
                }
            }
        }
    }


    /******************* Space *************************************************************/
    fun getObjectSpace(id : Int) : LiveData<Space> {
        return object: LiveData<Space>() {
            override fun onActive() {
                super.onActive()
                if (job?.isActive != true) {
                    job = CoroutineScope(IO + job!!).launch {
                        val id = MyRetrofitBuilder.space.getObject(id)

                        withContext(Main) {
                            value = id
                            job!!.isCompleted
                        }
                    }
                }
            }
        }
    }



    /******************* Cancel Jobs! **********************************/
    fun cancelJobs() {
        job?.cancel()
    }
}
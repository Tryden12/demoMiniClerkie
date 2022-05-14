package com.tryden12.demominiclerkie.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.tryden12.demominiclerkie.api.TextWithImage
import com.tryden12.demominiclerkie.repositories.Repository

class MainViewModel : ViewModel() {
    private val _textWithImageId: MutableLiveData<Int> = MutableLiveData()
    private val _textId: MutableLiveData<String> = MutableLiveData()
    private val _imageId: MutableLiveData<Int> = MutableLiveData()
    private val _spaceId: MutableLiveData<Int> = MutableLiveData()



    /********************** TextWithImage ********************************************************/
    val textWithImage = Transformations
        .switchMap(_textWithImageId) { textWithImageId ->
            Repository.getObjectTextWithImage(textWithImageId)
        }

    fun setTextWithImageId(_textWithImageId : String) {
        val update = _textWithImageId
        if (_textWithImageId.equals(update)) {
            return
        }
        _textWithImageId.equals(update)
    }


    /********************** Text *****************************************************************/
    val text = Transformations
        .switchMap(_textId) { textId ->
            Repository.getObjectText(textId)
        }

    fun setText(_textId : Int) {
        val update = _textId
        if (_textId.equals(update)) {
            return
        }
        _textId.equals(update)
    }



    /********************** Image *****************************************************************/
    val image = Transformations
        .switchMap(_imageId) { imageId ->
            Repository.getObjectImage(imageId)
        }

    fun setImage(_imageId : Int) {
        val update = _imageId
        if (_imageId.equals(update)) {
            return
        }
        _imageId.equals(update)
    }


    /********************** Space *****************************************************************/
    val space = Transformations
        .switchMap(_spaceId) { spaceId ->
            Repository.getObjectSpace(spaceId)
        }

    fun setSpace(_spaceId : Int) {
        val update = _spaceId
        if (_spaceId.equals(update)) {
            return
        }
        _spaceId.equals(update)
    }







    fun cancelJobs() {
        Repository.cancelJobs()
    }
}
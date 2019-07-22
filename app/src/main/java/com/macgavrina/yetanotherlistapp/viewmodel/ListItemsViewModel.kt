package com.macgavrina.yetanotherlistapp.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.macgavrina.yetanotherlistapp.model.ListItem
import com.macgavrina.yetanotherlistapp.usecases.AddListItemUseCase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers


class ListItemsViewModel: ViewModel() {

    private val compositeDisposable = CompositeDisposable()

    override fun onCleared() {
        compositeDisposable.clear()
    }

    fun saveListItemButtonIsPressed(name: String) {
        val listItem = ListItem(name)
        compositeDisposable.add(
            AddListItemUseCase().execute(listItem)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe ({
                    Log.d("MyApp", "List item is added")
                }, {
                    Log.d("MyApp", "Error adding list item")
                })
        )
    }
}
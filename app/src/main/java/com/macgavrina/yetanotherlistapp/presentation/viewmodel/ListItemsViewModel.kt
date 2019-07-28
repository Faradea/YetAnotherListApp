package com.macgavrina.yetanotherlistapp.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.macgavrina.yetanotherlistapp.domain.usecaseinterface.ListItemUseCasesInterface
import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import org.koin.core.KoinComponent
import org.koin.core.inject


class ListItemsViewModel : ViewModel(), KoinComponent {


    private val compositeDisposable = CompositeDisposable()
    private val listItemUseCase: ListItemUseCasesInterface by inject()

    override fun onCleared() {
        compositeDisposable.clear()
    }

    fun saveListItemButtonIsPressed(name: String) {
        val listItem = ListItem(name)
        compositeDisposable.add(
            listItemUseCase.addListItem(listItem)
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
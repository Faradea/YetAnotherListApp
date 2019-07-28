package com.macgavrina.yetanotherlistapp.data.repository

import com.macgavrina.yetanotherlistapp.domain.repositoryinterfaces.ListItemsRepositoryInterface
import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import io.reactivex.Completable

public class ListItemsRepositoryImpl: ListItemsRepositoryInterface {

//    public fun getAllItems(): Single<List<ListItem>> {
//        //ToDo
//    }
//
//    public fun getItemById(itemId: Int): Single<ListItem> {
//        //ToDo
//    }

    override fun addItem(item: ListItem): Completable {
        return Completable.complete()
    }

//    public fun editItem(item: ListItem): Completable {
//        //ToDo
//    }
//
//    public fun deleteItem(item: ListItem): Completable {
//        //ToDo
//    }
}
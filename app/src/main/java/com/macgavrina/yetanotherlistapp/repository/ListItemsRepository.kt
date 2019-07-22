package com.macgavrina.yetanotherlistapp.repository

import com.macgavrina.yetanotherlistapp.model.ListItem
import io.reactivex.Completable
import io.reactivex.Single

public class ListItemsRepository() {

//    public fun getAllItems(): Single<List<ListItem>> {
//        //ToDo
//    }
//
//    public fun getItemById(itemId: Int): Single<ListItem> {
//        //ToDo
//    }

    public fun addItem(item: ListItem): Completable {
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
package com.macgavrina.yetanotherlistapp.domain.repositoryinterfaces

import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import io.reactivex.Completable

public interface ListItemsRepositoryInterface {

    fun addItem(item: ListItem): Completable

}
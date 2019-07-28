package com.macgavrina.yetanotherlistapp.domain.repositoryinterface

import com.macgavrina.yetanotherlistapp.data.entity.ListItemEntity
import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import io.reactivex.Completable

public interface ListItemsRepositoryInterface {

    fun addItem(item: ListItemEntity): Completable

}
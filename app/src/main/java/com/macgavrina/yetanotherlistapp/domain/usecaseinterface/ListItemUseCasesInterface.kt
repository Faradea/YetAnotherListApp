package com.macgavrina.yetanotherlistapp.domain.usecaseinterface

import com.macgavrina.yetanotherlistapp.presentation.model.ListItem
import io.reactivex.Completable

public interface ListItemUseCasesInterface {

    fun addListItem(listItem: ListItem): Completable

}
package com.macgavrina.yetanotherlistapp.domain.mappers

import com.macgavrina.yetanotherlistapp.data.entity.ListItemEntity
import com.macgavrina.yetanotherlistapp.presentation.model.ListItem

class ListItemMapper {

    public fun fromModelToEntity(listItem: ListItem): ListItemEntity {
        return ListItemEntity(listItem.name)
    }

    public fun fromEntityToModel(listItemEntity: ListItemEntity): ListItem {
        return ListItem(listItemEntity.name)
    }

}
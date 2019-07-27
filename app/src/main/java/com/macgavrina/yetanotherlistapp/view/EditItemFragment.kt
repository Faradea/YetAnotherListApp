package com.macgavrina.yetanotherlistapp.view

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.macgavrina.yetanotherlistapp.R
import com.macgavrina.yetanotherlistapp.viewmodel.ListItemsViewModel
import kotlinx.android.synthetic.main.fragment_edit_item.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class EditItemFragment : Fragment() {

    private val viewModel: ListItemsViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_item, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        fragment_edit_item_done_button.setOnClickListener {
            viewModel.saveListItemButtonIsPressed(fragment_edit_item_name_et.text.toString())
        }
    }
}

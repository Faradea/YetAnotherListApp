package com.macgavrina.yetanotherlistapp.view

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

class EditItemFragment : Fragment() {

    private lateinit var viewModel: ListItemsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_edit_item, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(ListItemsViewModel::class.java)

        fragment_edit_item_done_button.setOnClickListener {
            viewModel.saveListItemButtonIsPressed(fragment_edit_item_name_et.text.toString())
        }
    }
}

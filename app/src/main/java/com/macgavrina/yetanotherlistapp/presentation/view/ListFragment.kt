package com.macgavrina.yetanotherlistapp.presentation.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.macgavrina.yetanotherlistapp.R
import kotlinx.android.synthetic.main.fragment_list.*

class ListFragment : Fragment(R.layout.fragment_list) {

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//
//        return inflater.inflate(R.layout.fragment_list, container, false)
//    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)

        fragment_list_add_item_button.setOnClickListener {
            Log.d("MyApp", "Add item button is clicked")
            view?.findNavController()?.navigate(R.id.action_listFragment_to_editItemFragment)
        }
    }
}

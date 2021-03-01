package com.example.lifttech.ui.builder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lifttech.R

class BuilderFragment : Fragment() {

    private lateinit var builderViewModel: BuilderViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        builderViewModel =
            ViewModelProvider(this).get(BuilderViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_builder, container, false)
        val textView: TextView = root.findViewById(R.id.text_builder)
        builderViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
package com.example.lifttech.ui.plate_calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lifttech.R

class PlateCalculatorFragment : Fragment() {

    private lateinit var plateCalculatorViewModel: PlateCalculatorViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        plateCalculatorViewModel =
            ViewModelProvider(this).get(PlateCalculatorViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_plate_calculator, container, false)
        val textView: TextView = root.findViewById(R.id.text_plate_calculator)
        plateCalculatorViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
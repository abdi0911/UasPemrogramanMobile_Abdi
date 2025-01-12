package com.example.uaspemrogramanmobile_abdi.ui.bio

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.uaspemrogramanmobile_abdi.R

class BioFragment : Fragment() {

    companion object {
        fun newInstance() = BioFragment()
    }

    private val viewModel: BioViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_bio, container, false)
    }
}
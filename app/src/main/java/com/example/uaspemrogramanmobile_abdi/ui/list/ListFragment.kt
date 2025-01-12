package com.example.uaspemrogramanmobile_abdi.ui.list

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.uaspemrogramanmobile_abdi.Data.KabKota
import com.example.uaspemrogramanmobile_abdi.Data.ListData
import com.example.uaspemrogramanmobile_abdi.Data.ListKabKotaAdapter
import com.example.uaspemrogramanmobile_abdi.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private val listData: ArrayList<KabKota> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listData.addAll(ListData.listDataWisata) // Menambahkan data ke list
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)
        setupRecyclerView()
        return binding.root
    }

    private fun setupRecyclerView() {
        binding.rvKabKota.layoutManager = GridLayoutManager(requireContext(), 2)

        val kabKotaAdapter = ListKabKotaAdapter(listData)
        binding.rvKabKota.adapter = kabKotaAdapter


    }


}

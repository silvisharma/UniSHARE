package com.example.unishare.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unishare.R
import com.example.unishare.RecyclerViewAdapter

class SlideshowFragment : Fragment() {

    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var adapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>

    //private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // slideshowViewModel =
        //  ViewModelProvider(this).get(SlideshowViewModel::class.java)
        //return inflater.inflate(R.layout.fragment_uploads, container, false)
        // val root = inflater.inflate(R.layout.fragment_uploads, container, false)
        //val textView: TextView = root.findViewById(R.id.text_slideshow)
        //slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
        //    textView.text = it
        val rootView = inflater.inflate(R.layout.fragment_uploads, container, false)
        val recyclerview = rootView.findViewById(R.id.recycler_view_uploads) as RecyclerView // Add this
        recyclerview.layoutManager = LinearLayoutManager(activity)

        recyclerview.adapter = RecyclerViewAdapter()
        return rootView

    }

    // return root

}
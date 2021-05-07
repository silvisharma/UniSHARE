package com.example.unishare.ui.refer

import android.content.ContentValues.TAG
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.unishare.Dashboard
import com.example.unishare.R
import com.google.firebase.dynamiclinks.ktx.dynamicLinks
import com.google.firebase.ktx.Firebase


class ReferFragment : Fragment() {

    private lateinit var referViewModel: ReferViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        referViewModel =
        ViewModelProvider(this).get(ReferViewModel::class.java)

        val root = inflater.inflate(R.layout.refer_fragment, container, false)
        val textView: TextView = root.findViewById(R.id.text_refer)
       referViewModel.text.observe(viewLifecycleOwner, Observer {
           textView.text = it

       })

        val sendIntent = Intent()
        sendIntent.action = Intent.ACTION_SEND
        sendIntent.putExtra(Intent.EXTRA_TEXT, "https://unishare.page.link/share")
        sendIntent.type = "text/plain"
        startActivity(Intent.createChooser(sendIntent, "hiii"))
        return root
    }










}




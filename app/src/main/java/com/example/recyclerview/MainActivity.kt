package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.MainAdapter.MyAdapter

class MainActivity : AppCompatActivity() {
    private var titleList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private val write = mutableListOf<String>()
    private var imageList = mutableListOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengisi data ke daftar judul, deskripsi, dan gambar
        titleList.add("Ayam Geprek")
        descList.add("Rp.100.000")
        write.add("Promo 10%")
        imageList.add(R.drawable.menu_1)


        titleList.add("Ayam Goreng")
        descList.add("Rp.200.000")
        write.add("Promo 20%")
        imageList.add(R.drawable.menu_2)

        titleList.add("Ayam Tepung")
        descList .add ("RP.300.000")
        write.add("Promo 30%")
        imageList.add(R.drawable.menu_3)

        titleList.add("Ayam Pedas")
        descList.add("Rp.400.000")
        write.add("Promo 40%")
        imageList.add(R.drawable.menu_4)

        titleList.add("Ayam Kuah")
        descList.add("Rp.500.000")
        write.add("Promo 50%")
        imageList.add(R.drawable.menu_5)


        // Menginisialisasi RecyclerView pertama
        val recyclerView: RecyclerView = findViewById(R.id.rcview)
        val adapter = MyAdapter(titleList, descList, imageList, write )
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter

    }
}

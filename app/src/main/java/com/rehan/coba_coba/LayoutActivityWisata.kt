package com.rehan.coba_coba

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rehan.coba_coba.adapter.AdapterWisata
import com.rehan.coba_coba.model.model

class LayoutActivityWisata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_layout_wisata)

        //data list wisata

        val listWisata = listOf(
            model("Wisata Bukiitinggi","padang",R.drawable.gambar1,"Berkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926.Artikel ini telah tayang di Kompas.com dengan judul 10 Tempat Wisata di Bukittinggi yang Wajib DikunjungiBerkunjung ke Bukittinggi terasa tak lengkap jika belum mengunjungi ikonnya, yaitu Jam Gadang. Jam yang sering disebut kembaran Big Ben London ini dibangun pada 1926",
                -0.8954488316790054, 100.42439699546985),
            model("Lokasi 2","padang",R.drawable.gambar2,"Deskripsi 2",
                -0.929056668537748, 100.34969904524498),
            model("Lokasi 3","padang",R.drawable.gambar3,"Deskripsi 3",
                -0.929056668537748, 100.34969904524498),
            model("Lokasi 4","padang",R.drawable.gambar4,"Deskripsi 4",
                -0.929056668537748, 100.34969904524498)
        )

        val adapterWisata = AdapterWisata(listWisata)
        // recycle view
        val rvWisata : RecyclerView = findViewById(R.id.rvWisata)
        rvWisata.adapter = adapterWisata
        //set layout
        rvWisata.apply {
            layoutManager = LinearLayoutManager(this@LayoutActivityWisata)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
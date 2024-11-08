package com.rehan.coba_coba.adapter

import android.content.Intent
import android.provider.Telephony.Mms.Intents
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rehan.coba_coba.DetailWisataMapsActivity
import com.rehan.coba_coba.R
import com.rehan.coba_coba.model.model

class AdapterWisata (
    val listItemWisata : List<model>
): RecyclerView.Adapter<AdapterWisata.MyviewHolder>() {
    class MyviewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        //layout pada widget
        val itemGambar : ImageView = itemView.findViewById(R.id.imgWisata)
        val itemNama : TextView = itemView.findViewById(R.id.txtNamaWisata)
        val itemLokasi : TextView = itemView.findViewById(R.id.txtAlamat)
        val cardWisata : CardView = itemView.findViewById(R.id.cardWisata)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyviewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return MyviewHolder(nView)
    }

    override fun getItemCount(): Int {
        return listItemWisata.size
    }

    override fun onBindViewHolder(holder: MyviewHolder, position: Int) {
        val currentItem = listItemWisata[position]
        holder.itemNama.setText(currentItem.NamaLokasiWisata)
        holder.itemGambar.setImageResource(currentItem.gambarWisata)
        holder.itemLokasi.setText(currentItem.AlamatWisata)
        //evet click pada card view
        holder.cardWisata.setOnClickListener{
            val intentDetailWisata = Intent(holder.itemView.context,DetailWisataMapsActivity::class.java)
            //kirim data list itam wisata ke DetailWisataActivity
            intentDetailWisata.putExtra("NamaLokasiWisata",currentItem.NamaLokasiWisata)
            intentDetailWisata.putExtra("gambarWisata",currentItem.gambarWisata)
            intentDetailWisata.putExtra("deskripsiWisata",currentItem.deskripsiWisata)
            intentDetailWisata.putExtra("latWisata",currentItem.latWisata)
            intentDetailWisata.putExtra("longWisata",currentItem.longWisata)
            //start
            holder.itemView.context.startActivity(intentDetailWisata)
        }

    }


}
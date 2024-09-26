package com.sabran.mobileappswisatajapan.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sabran.mobileappswisatajapan.MainActivity
import com.sabran.mobileappswisatajapan.R
import com.sabran.mobileappswisatajapan.ScreenSplash
import com.sabran.mobileappswisatajapan.model.WisataModel

class WisataAdapter
    (
    val itemList: ArrayList<WisataModel>,
    val getActivity : MainActivity
            ) :
    RecyclerView.Adapter<WisataAdapter.MyViewHolder>()
{
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage : ImageView
        var itemNama : TextView
        var itemTempat : TextView
        var itemDetail : TextView

        init {
            itemImage = itemView.findViewById(R.id.gambar) as ImageView
            itemNama = itemView.findViewById(R.id.nama) as TextView
            itemTempat = itemView.findViewById(R.id.tempat) as TextView
            itemDetail = itemView.findViewById(R.id.detail) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataAdapter.MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_wisata, parent, false)
        return MyViewHolder(nView)
    }

    override fun onBindViewHolder(holder: WisataAdapter.MyViewHolder, position: Int) {
        holder.itemImage.setImageResource(itemList[position].gambar)
        holder.itemNama.setText(itemList[position].nama)
        holder.itemTempat.setText(itemList[position].tempat)
        holder.itemDetail.setText(itemList[position].detail)

        //kita tambahkan intent
        holder.itemView.setOnClickListener{
            //intent
            //context atau this ----> getActivity
            val intent = Intent(getActivity, ScreenSplash::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("gambar", itemList[position].gambar)
            intent.putExtra("nama", itemList[position].nama)
            intent.putExtra("tempat", itemList[position].tempat)
            intent.putExtra("detail", itemList[position].detail)

            getActivity.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}
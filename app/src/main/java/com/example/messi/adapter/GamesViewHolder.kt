package com.example.messi.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messi.Games
import com.example.messi.R

class GamesViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val juego = view.findViewById<TextView>(R.id.tvjuego)
    val distribuidor = view.findViewById<TextView>(R.id.tvdistribuidor)
    val precio = view.findViewById<TextView>(R.id.tvprecio)
    val foto = view.findViewById<ImageView>(R.id.ivGames)


    fun render(GamesModel: Games){
        juego.text = GamesModel.juego
        distribuidor.text = GamesModel.distribuidor
        precio.text = GamesModel.precio
    }
}
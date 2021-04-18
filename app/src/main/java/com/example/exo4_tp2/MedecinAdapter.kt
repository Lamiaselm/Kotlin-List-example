package com.example.exo4_tp2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MedecinAdapter (val context: Context, var data:List<Medecin>) : RecyclerView.Adapter<MyViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.medecin_layout, parent, false))

    }

    override fun getItemCount()= data.size



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nom.text = data[position].nom
        holder.prenom.text = data[position].prenom
        holder.phone.text = data[position].phone
        holder.job.text = data[position].job
        holder.image.setImageResource(data[position].image)


    }

}
class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val nom = view.findViewById<TextView>(R.id.nom) as TextView
    val prenom = view.findViewById<TextView>(R.id.prenom) as TextView
    val phone = view.findViewById<TextView>(R.id.phone) as TextView
    val job = view.findViewById<TextView>(R.id.job) as TextView
    val image = view.findViewById<ImageView>(R.id.image) as ImageView

}
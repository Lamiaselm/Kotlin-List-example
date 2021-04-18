package com.example.exo4_tp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listeMedecin.layoutManager = LinearLayoutManager(this)
        listeMedecin.adapter = MedecinAdapter(this,loadData())
    }
    fun loadData():List<Medecin> {
        val data = mutableListOf<Medecin>()
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))
        data.add(Medecin("Selmane","Lamia","0553322126","Ophtalmologue",(R.drawable.medecin)))






        return data
    }
}
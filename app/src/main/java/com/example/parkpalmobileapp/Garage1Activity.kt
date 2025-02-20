package com.example.parkpalmobileapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Garage1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_garage1)

        val button_takeme = findViewById<Button>(R.id.takemethere)

        button_takeme.setOnClickListener {
            val mapsIntentUri: Uri = Uri.parse("https://www.google.com/maps/dir/?api=1&origin=Texas+Tech+University+Whitacre+College+of+Engineering,+Boston+Avenue,+Lubbock,+TX&destination=Texas+Tech+University+Parking+Lot+Z4,+18th+Street,+Lubbock,+TX")
            val intent: Intent = Intent(Intent.ACTION_VIEW, mapsIntentUri)

            intent.setPackage("com.google.android.apps.maps")
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            }

        }
    }


}

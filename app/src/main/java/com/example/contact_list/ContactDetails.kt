package com.example.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ContactDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_details)


        var nameIntent=intent.getStringExtra("name")
        var phoneIntent=intent.getStringExtra("phoneNumber")
        var emailIntent=intent.getStringExtra("email")
        var imageUrlIntent=intent.getStringExtra("imageUrl").toString()

        var etName=findViewById<TextView>(R.id.tvName2)
        var etphone=findViewById<TextView>(R.id.tvPhone2)
        var etEmail=findViewById<TextView>(R.id.tvEmail2)
        var imageUrl=findViewById<ImageView>(R.id.ivDetails)
        
        etName.text=nameIntent
        etphone.text=phoneIntent
        etEmail.text=emailIntent
        Picasso.get().load(imageUrlIntent).into(imageUrl)

    }
}
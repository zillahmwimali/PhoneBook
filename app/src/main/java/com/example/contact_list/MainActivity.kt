package com.example.contact_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvContacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castContacts()
    }
    fun castContacts(){
        var contactsList=listOf(
            Contacts("Zillah Mwimali","0700000001","zee@gmail.com","https://pixabay.com/photos/woman-sea-cliff-rest-relax-trip-6339701/"),
            Contacts("Diana Jarenga","0700000002","dee@gmail.com","https://pixabay.com/photos/writing-write-person-paperwork-828911/"),
            Contacts("Jane Doe","0766554433","jane@gmail.com","https://pixabay.com/photos/tie-necktie-adjust-adjusting-man-690084/"),
            Contacts("Falcon Kasuku","0789675634","kasuku@gmail.com","https://pixabay.com/photos/airport-transport-woman-girl-2373727/"),
            Contacts("Wandia Whales","0765432112","wandia@gmail.com","https://pixabay.com/photos/woman-girl-blonde-hair-blonde-woman-1149911/"),
            Contacts("Jumbo Junior","0733222244","jumbojunior@gmail.com","https://pixabay.com/photos/photographer-tourist-snapshot-407068/"),
            Contacts("Fatuma Fauzia","0733445566","fauziah@gmail.com","https://pixabay.com/photos/yoga-outdoor-woman-pose-young-2176668/")
        )
        rvContacts=findViewById(R.id.rvContacts)
        var contactsAdapter=ContactsAdapter(contactsList,baseContext)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.apply {
            rvContacts.layoutManager=LinearLayoutManager(baseContext)
            rvContacts.adapter=contactsAdapter
        }
    }

}
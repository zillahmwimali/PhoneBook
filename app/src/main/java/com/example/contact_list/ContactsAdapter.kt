package com.example.contact_list

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ContactsAdapter(var contactsList: List<Contacts>,var context:Context):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
       var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_view,parent,false)
        return ContactsViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
      var currentContact=contactsList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvPhone.text=currentContact.phoneNumber
        holder.tvEmail.text=currentContact.email
        holder.cvContacts.setOnClickListener {
            val intent=Intent(
                context,ContactDetails::class.java
            )
            intent.putExtra("name",currentContact.name)
            intent.putExtra("phone",currentContact.phoneNumber)
            intent.putExtra("email",currentContact.email)
            intent.putExtra("image",currentContact.imageUrl)
            Toast.makeText(context,"name",Toast.LENGTH_LONG).show()
            Toast.makeText(context,"phone",Toast.LENGTH_LONG).show()
            Toast.makeText(context,"email",Toast.LENGTH_LONG).show()

            context.startActivity(intent)
        }
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivProfile)
    }
    override fun getItemCount(): Int {
        return contactsList.size
    }
}
class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvPhone=itemView.findViewById<TextView>(R.id.tvPhone)
    var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)
    var ivProfile=itemView.findViewById<ImageView>(R.id.ivProfile)
    var cvContacts=itemView.findViewById<CardView>(R.id.cvContact)
}

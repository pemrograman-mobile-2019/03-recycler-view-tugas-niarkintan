package com.example.tugasrecycler.adapter;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasrecycler.R;
import com.example.tugasrecycler.models.Contact;
import com.squareup.picasso.Picasso;

import java.util.List;

    public class ContacsAdapter extends RecyclerView.Adapter<ContacsAdapter.ViewHolder> {

        private List<Contact> ContactList;

        public ContacsAdapter(List<Contact> ContactList) {

            this.ContactList = ContactList;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            LayoutInflater inflater = LayoutInflater.from(context);

            View filmView = inflater.inflate(R.layout.item_contact, viewGroup, false);

            return new ViewHolder(filmView);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
            Contact Contact = ContactList.get(i);

            if (Contact.getImg() != null) {
                Picasso.get().load(Contact.getImg()).into(viewHolder.imageView);
            } else {
                Picasso.get().load(Contact.getImg_local()).into(viewHolder.imageView);
            }

            viewHolder.textView.setText(Contact.getTitle());
        }

        @Override
        public int getItemCount() {
            return ContactList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView textView;
            TextView descView;

            ViewHolder(@NonNull View itemView) {
                super(itemView);

                imageView = itemView.findViewById(R.id.item_Contacts_img);
                textView = itemView.findViewById(R.id.item_Contacts_title);
                descView = itemView.findViewById(R.id.item_Contacts_desc);
            }
        }
    }

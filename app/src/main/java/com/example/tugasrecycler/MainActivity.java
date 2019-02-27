package com.example.tugasrecycler;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tugasrecycler.adapter.ContacsAdapter;
import com.example.tugasrecycler.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Contact> contactsList = new ArrayList<>();
        contactsList.add(new Contact("aplikasi_1", "Coban Rondo","Tempat Wisata",R.drawable.coban));
        contactsList.add(new Contact("aplikasi_2", "Museum Angkut","Tempat Wisata", R.drawable.museum));
        contactsList.add(new Contact("aplikasi_3", "Jawa Timur Park","Tempat Wisata", R.drawable.jatimpark));
        contactsList.add(new Contact("aplikasi_4", "Selecta","Tempat Wisata" ,R.drawable.selecta));
        contactsList.add(new Contact("aplikasi_5", "Predator Fun Park","Tempat Wisata",R.drawable.predator));
        contactsList.add(new Contact("aplikasi_6", "Batu Secret Zoo","Tempat Wisata", R.drawable.secretzoo));
        contactsList.add(new Contact("aplikasi_7", "Sengkaling","Tempat Wisata", R.drawable.sengkaling));
        contactsList.add(new Contact("aplikasi_8", "Jawa Timur Park 3","Tempat Wisata" ,R.drawable.jatimpark3));

        ContacsAdapter adapterContacs = new ContacsAdapter(contactsList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvContacts);
        recyclerView.setAdapter(adapterContacs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }}

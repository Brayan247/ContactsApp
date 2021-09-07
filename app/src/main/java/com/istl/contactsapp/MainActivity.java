package com.istl.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private String [] nombres = {"Luis", "Marcelo", "Jose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.listView);

        ArrayAdapter adpter = new ArrayAdapter(this, android.R.layout.activity_list_item, nombres);
        //setListAdapter(adpter);

        ArrayList<Contact> listContact = new ArrayList<Contact>();
        llenarDatos(listContact);
        ContactAdapter adapter = new ContactAdapter(this, listContact);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact selectItem = (Contact) adapter.getItem(position);
                //int posicion = Integer.parseInt(selectItem);
                //Toast.makeText(this, selectItem, Toast.LENGTH_LONG).show();

            }
        });
    }

    private void llenarDatos(ArrayList<Contact> lista){

        Contact contacto1 = new Contact();
        contacto1.setNombre("Luis");
        lista.add(contacto1);

        Contact contacto2 = new Contact();
        contacto1.setNombre("Pedro");
        lista.add(contacto2);

        Contact contacto3 = new Contact();
        contacto1.setNombre("Juan");
        lista.add(contacto3);
    }


}
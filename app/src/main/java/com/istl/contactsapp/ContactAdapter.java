package com.istl.contactsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.istl.contactsapp.Contact;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private List<Contact> contactArrayList;

    public ContactAdapter( Context context, List<Contact> contactArrayList) {
        super(context, R.layout.list_contact);
        this.context=context;
        this.contactArrayList=contactArrayList;

    }

    @Override
    public int getCount() {
        return contactArrayList.size();
    }

    @Override
    public Contact getItem(int position) {
        return contactArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void guardareContactosList () {
        List<Contact> contactArrayList = new ArrayList<>();
                Contact c = new Contact();
                c.setNombre("Brayan");
                c.setCiudad("El Pangui");
                c.setTelefono("0969736083");
                c.setCorreo("brayab@gmail.com");
                contactArrayList.add(c);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view;
        final ViewHolder viewHolder;
        if (convertView == null || convertView.getTag() == null){
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.list_contact, parent,  false );
            viewHolder.mContactName = (TextView) view.findViewById(R.id.adapterContactName);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;
        }
        viewHolder.mContactName.setText(contactArrayList.get(position).getNombre());
        return view;
    }

    static class ViewHolder{
        protected TextView mContactName;
    }
}

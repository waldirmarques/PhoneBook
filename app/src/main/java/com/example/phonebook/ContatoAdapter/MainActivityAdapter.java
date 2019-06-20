package com.example.phonebook.ContatoAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.phonebook.Modelo.Contato;
import com.example.phonebook.R;

import java.util.ArrayList;

public class MainActivityAdapter extends BaseAdapter {

    private ArrayList<Contato> listaContato;
    private Context context;

    public MainActivityAdapter( Context context, ArrayList<Contato> listaContato) {
        this.context = context;
        this.listaContato = listaContato;

    }

    @Override
    public int getCount() {
        return listaContato.size();
    }

    @Override
    public Contato getItem(int position) {
        return listaContato.get(position);
    }

    @Override
    public long getItemId(int position) {
        return this.getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.lista_contato,parent,false);

        }else {

            Contato contato = getItem(position);

            TextView textNome = convertView.findViewById(R.id.nome);
            TextView textNumero = convertView.findViewById(R.id.telefone);
            TextView textEmail = convertView.findViewById(R.id.email);
            //ImageView viewImage = convertView.findViewById(R.id.item_lista_imagem);

            textNome.setText(contato.getNome());
            textNumero.setText(contato.getNumero());
            textEmail.setText(contato.getEmail());


        }
        return convertView;
    }
}

package com.example;

import android.os.Bundle;

import com.example.phonebook.ContatoAdapter.MainActivityAdapter;
import com.example.phonebook.Modelo.Contato;
import com.example.phonebook.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView list = findViewById(R.id.listaContato);

        list.setAdapter(new MainActivityAdapter(this, getContato()));

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Teste Click", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<Contato> getContato(){
        ArrayList<Contato> listContato = new ArrayList<>();

        Contato contato = new Contato();

        contato.setNumero("9423593592");
        contato.setEmail("waldir.marques.@dce.ufpb");
        contato.setNome("Waldir");

        listContato.add(contato);
        Contato contato2 = new Contato();

        contato2.setNumero("9423593592");
        contato2.setEmail("waldir.marques.@dce.ufpb");
        contato2.setNome("Bruno");
        listContato.add(contato2);

        Contato contato3 = new Contato();

        contato3.setNumero("9423593592");
        contato3.setEmail("waldir.marques.@dce.ufpb");
        contato3.setNome("Bruno");
        listContato.add(contato3);


        return listContato;

    }

}

package com.example.phonebook.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.phonebook.Modelo.Contato;

import java.util.ArrayList;

public class ContatoDAO extends SQLiteOpenHelper {

    public ContatoDAO(Context context) {
        super(context, "Agenda_add", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Contato (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "nome TEXT, "+
                "email TEXT, "+
                "telefone TEXT, "+
                "imagem TEXT, "+
                "excluido INT DEFAULT 0)";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public ArrayList<Contato> buscarContato(){

        ArrayList<Contato> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();

        String sql = "SELECT FROM Contato WHERE excluido = 0";

        Cursor cursor = db.rawQuery(sql,null);

        if (cursor != null){
            while (cursor.moveToNext()){

                Contato contato = new Contato();

                contato.setId(cursor.getColumnIndexOrThrow("id"));
                contato.setNome(cursor.getString(cursor.getColumnIndexOrThrow("nome")));
                contato.setEmail(cursor.getString(cursor.getColumnIndexOrThrow("email")));
                contato.setNumero(cursor.getString(cursor.getColumnIndexOrThrow("telefone")));
                contato.setImagem(cursor.getString(cursor.getColumnIndexOrThrow("imagem")));
                contato.setExcluido(cursor.getColumnIndexOrThrow("excluido"));

                list.add(contato);

            }
            cursor.close();
        }

        return list;
    }
}

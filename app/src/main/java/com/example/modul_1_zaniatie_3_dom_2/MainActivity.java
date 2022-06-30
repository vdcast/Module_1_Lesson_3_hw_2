package com.example.modul_1_zaniatie_3_dom_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> baseOfNames = new ArrayList<>();
        baseOfNames.add("OOO Phoenix");
        baseOfNames.add("OAO Metsbyt");
        baseOfNames.add("KP Ivanko");
        baseOfNames.add("OAO Shawerma");
        baseOfNames.add("OAO Furniture");
        baseOfNames.add("Kebab");
        baseOfNames.add("Nuggets");
        baseOfNames.add("Table store");
        baseOfNames.add("Game stop");
        baseOfNames.add("Not funny");

        String newName = "OAO Pyrojky";
        String queryName = "OAO Shawerma";

        for (int i = 0; i < baseOfNames.size(); i++){
            if (queryName.equals(baseOfNames.get(i))){
                baseOfNames.set(i, newName);
            }
            Log.d("MYLOG", "" + baseOfNames.get(i));
        }
        Log.d("MYLOG", "Item index of query and new name is: " + baseOfNames.indexOf("OAO Pyrojky"));

    }
}
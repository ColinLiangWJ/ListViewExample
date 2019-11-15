package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Todo reference listview
    //  Todo       ListView listView = findViewById();
    // Todo initialize custom adapter(MyAdapter) - using  method getPlayers, pay attention to constructor of MyAdapter
        //Todo  add custom adapter to listview
        //Todo listView.setAdapter(------);

    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public Player[] getPlayers(){
        Player[] a;
        String[] names={"11","22","33","44","55","66","77","88","99","1010","1111","1212","1313","1414","1515"};
        return null;
    }
}

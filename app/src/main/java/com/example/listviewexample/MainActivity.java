package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    ArrayList<Player> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPlayers();
        ListView listView = (ListView) findViewById(R.id.listview1);
        MyAdapter adapter = new MyAdapter(this,R.layout.single_item,list);
        listView.setAdapter(adapter);
    }
    //Todo  create a method getPlayers() that will create an array of 15 players and return the list of type List<Player>
    // choose successful sportsmen from different sports, make sure to fill Player class before starting
    public void getPlayers(){
        list = new ArrayList<>();
        String[] names={"11","22","33","44","55","66","77","88","99","1010","1111","1212","1313","1414","1515"};
        int[]age={11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
        int[]worth={10000,20000,30000,40000,50000,60000,70000,80000,90000,100000,110000,120000,130000,140000,150000};
        String[] mainsport={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        for(int i=0;i<10;i++){
            Player b=new Player(names[i],age[i],worth[i],mainsport[i],R.drawable.player_one);
            list.add(b);
        }
    }
}

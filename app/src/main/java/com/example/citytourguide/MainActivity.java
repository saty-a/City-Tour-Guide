package com.example.citytourguide;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        int position;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res=getResources();
        String[] city_name =res.getStringArray(R.array.cityNames);

        ArrayList<Word> cityName=new ArrayList<>();
        cityName.add(new Word(city_name[0],R.drawable.newdelhi));
        cityName.add(new Word(city_name[1],R.drawable.mumbai));
        cityName.add(new Word(city_name[2],R.drawable.hyderabad));
        cityName.add(new Word(city_name[3],R.drawable.bangalore));
        cityName.add(new Word(city_name[4],R.drawable.ahmedabad));
        cityName.add(new Word(city_name[5],R.drawable.chennai));
        cityName.add(new Word(city_name[6],R.drawable.kolkata));
        cityName.add(new Word(city_name[7],R.drawable.jaipur));
        cityName.add(new Word(city_name[8],R.drawable.lucknow));
        cityName.add(new Word(city_name[9],R.drawable.bhopal));
        cityName.add(new Word(city_name[10],R.drawable.patna));
        cityName.add(new Word(city_name[11],R.drawable.ranchi));
        cityName.add(new Word(city_name[12],R.drawable.chandigarh));
        cityName.add(new Word(city_name[13],R.drawable.guwahati));
        cityName.add(new Word(city_name[14],R.drawable.dhanbad));
        cityName.add(new Word(city_name[15],R.drawable.bhubaneswar));
        cityName.add(new Word(city_name[16],R.drawable.deharadun));
        cityName.add(new Word(city_name[17],R.drawable.imphal));
        cityName.add(new Word(city_name[18],R.drawable.gaya));
        cityName.add(new Word(city_name[19],R.drawable.pondicherry));

        WordAdapter adapter= new WordAdapter(this, cityName);
        GridView listView = (GridView) findViewById(R.id.list);
        listView.setAdapter(adapter);

//  This will get the position of item clicked on the UI of grid view
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                {
                    int pos = Integer.parseInt(String.valueOf(position));
                    Intent i =new Intent(MainActivity.this, CityActivity.class);
                    i.putExtra(CityActivity.Position,pos);

               //     Toast.makeText(getApplicationContext(),"Hello Javatpoint"+pos,Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
            });
        }



    }

package com.example.citytourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityActivity extends AppCompatActivity {

    public static String Position;
    private int POS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        getSupportActionBar().hide();

        ImageView img=(ImageView) findViewById(R.id.imageView);
        TextView cityname=(TextView) findViewById(R.id.nameofcity);
        TextView shortDescripCity=(TextView) findViewById(R.id.shortDescriptioncity);


        // This arraylist is for the Recyler view for the different places and their information...
        ArrayList<Place> PlaceName=new ArrayList<>();

        //These ArrayList is all about the places with their respective Cities
        Resources res=getResources();

        // This array is for the City Name At the top of the city activity
        String[] city_name =res.getStringArray(R.array.cityNames);

        //This array list is for the short discription for the city like New delhi in the city
        String[] shortDescpcity =res.getStringArray(R.array.shortDescription);

        //This is String Array containing all the info about the places and their informations
        String[] del=res.getStringArray(R.array.delhi);
        String[] mbi=res.getStringArray(R.array.mumbai);
        String[] hyd=res.getStringArray(R.array.hyderabad);
        String[] ban=res.getStringArray(R.array.bangalore);
        String[] ahm=res.getStringArray(R.array.ahemdabad);
        String[] chn=res.getStringArray(R.array.chennai);
        String[] kk=res.getStringArray(R.array.kolkata);
        String[] jp=res.getStringArray(R.array.jaipur);
        String[] lkn=res.getStringArray(R.array.lucknow);
        String[] bhp=res.getStringArray(R.array.bhopal);
        String[] pat=res.getStringArray(R.array.patna);
        String[] ran=res.getStringArray(R.array.ranchi);
        String[] chg=res.getStringArray(R.array.chandhigarh);
        String[] gwh=res.getStringArray(R.array.guwhati);
        String[] dhn=res.getStringArray(R.array.dhanbad);
        String[] bhn=res.getStringArray(R.array.bhubaneswar);
        String[] dhd=res.getStringArray(R.array.dehradun);
        String[] imp=res.getStringArray(R.array.imphal);
        String[] gaya=res.getStringArray(R.array.gaya);
        String[] pdh=res.getStringArray(R.array.pondicherry);


        //Cities with their respective images
        ArrayList<Integer> cityImage=new ArrayList<Integer>();
        cityImage.add(R.drawable.newdelhi);cityImage.add(R.drawable.mumbai);
        cityImage.add(R.drawable.hyderabad);cityImage.add(R.drawable.bangalore);
        cityImage.add(R.drawable.ahmedabad);cityImage.add(R.drawable.chennai);
        cityImage.add(R.drawable.kolkata);cityImage.add(R.drawable.jaipur);
        cityImage.add(R.drawable.lucknow);cityImage.add(R.drawable.bhopal);
        cityImage.add(R.drawable.patna);cityImage.add(R.drawable.ranchi);
        cityImage.add(R.drawable.chandigarh);cityImage.add(R.drawable.guwahati);
        cityImage.add(R.drawable.dhanbad);cityImage.add(R.drawable.bhubaneswar);
        cityImage.add(R.drawable.deharadun);cityImage.add(R.drawable.imphal);
        cityImage.add(R.drawable.gaya);
        cityImage.add(R.drawable.pondicherry);


        Intent i=getIntent();
        POS = i.getIntExtra(Position,0);

//      Assinging the different info with their respective places
        switch(POS)
        {
            case 0: for (int k=0;k<del.length;k++)
            {
                PlaceName.add(new Place(""+del[k]));
            }
                break;
            case 1: for (int k=0;k<mbi.length;k++)
            {
                PlaceName.add(new Place(""+mbi[k]));
            }
            break;
            case 2: for (int k=0;k<hyd.length;k++)
            {
                PlaceName.add(new Place(""+hyd[k]));
            }
            break;
            case 3: for (int k=0;k<ban.length;k++)
            {
                PlaceName.add(new Place(""+ban[k]));
            }
            break;
            case 4: for (int k=0;k<ahm.length;k++)
            {
                PlaceName.add(new Place(""+ahm[k]));
            }
                break;
            case 5: for (int k=0;k<chn.length;k++)
            {
                PlaceName.add(new Place(""+chn[k]));
            }
                break;
            case 6: for (int k=0;k<kk.length;k++)
            {
                PlaceName.add(new Place(""+kk[k]));
            }
                break;
            case 7: for (int k=0;k<jp.length;k++)
            {
                PlaceName.add(new Place(""+jp[k]));
            }
                break;
            case 8: for (int k=0;k<lkn.length;k++)
            {
                PlaceName.add(new Place(""+lkn[k]));
            }
                break;
            case 9: for (int k=0;k<bhp.length;k++)
            {
                PlaceName.add(new Place(""+bhp[k]));
            }
                break;
            case 10: for (int k=0;k<pat.length;k++)
            {
                PlaceName.add(new Place(""+pat[k]));
            }
                break;
            case 11: for (int k=0;k<ran.length;k++)
            {
                PlaceName.add(new Place(""+ran[k]));
            }
            break;
            case 12: for (int k=0;k<chg.length;k++)
            {
                PlaceName.add(new Place(""+chg[k]));
            }
                break;
            case 13: for (int k=0;k<gwh.length;k++)
            {
                PlaceName.add(new Place(""+gwh[k]));
            }
                break;
            case 14: for (int k=0;k<dhn.length;k++)
            {
                PlaceName.add(new Place(""+dhn[k]));
            }
                break;
            case 15: for (int k=0;k<bhn.length;k++)
            {
                PlaceName.add(new Place(""+bhn[k]));
            }
                break;
            case 16: for (int k=0;k<dhd.length;k++)
            {
                PlaceName.add(new Place(""+dhd[k]));
            }
                break;
            case 17: for (int k=0;k<imp.length;k++)
            {
                PlaceName.add(new Place(""+imp[k]));
            }
                break;
            case 18: for (int k=0;k<gaya.length;k++)
            {
                PlaceName.add(new Place(""+gaya[k]));
            }
                break;
            case 19: for (int k=0;k<pdh.length;k++)
            {
                PlaceName.add(new Place(""+pdh[k]));
            }
                break;

            default: PlaceName.add(new Place("Nothing to Show"));
        }


        cityname.setText(city_name[POS]);
        shortDescripCity.setText(shortDescpcity[POS]);
        img.setImageResource(cityImage.get(POS));

        PlaceAdapter adapter= new PlaceAdapter(this, PlaceName);
        GridView listView = (GridView) findViewById(R.id.placeDetails);
        listView.setAdapter(adapter);
    }
}
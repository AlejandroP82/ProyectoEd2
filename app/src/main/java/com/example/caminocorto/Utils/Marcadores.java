package com.example.caminocorto.Utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

import com.example.caminocorto.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Marcadores {
    GoogleMap nmap;
    Context context;

    public Marcadores(GoogleMap nmap, Context context) {
        this.nmap = nmap;
        this.context = context;
    }

    public void addMarkersDefault(){
uno(-17.811616,63.207444, "uno");
        dos(-17.798336,-63.192137, "dos");
        tres(-17.849640,-63.250285, "tres");
    }

    public void uno(Double latitud,Double longitud,String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno=(BitmapDrawable) context.getResources().getDrawable(R.drawable.img,null);
        Bitmap unos=uno.getBitmap();
        Bitmap uns=Bitmap.createScaledBitmap(unos,width,height,false);
        nmap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("uno")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void dos(Double latitud,Double longitud,String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno=(BitmapDrawable) context.getResources().getDrawable(R.drawable.img,null);
        Bitmap unos=uno.getBitmap();
        Bitmap uns=Bitmap.createScaledBitmap(unos,width,height,false);
        nmap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("dos")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
    public void tres(Double latitud,Double longitud,String titulo) {
        LatLng punto = new LatLng(latitud, longitud);
        int height = 140;
        int width = 165;
        BitmapDrawable uno=(BitmapDrawable) context.getResources().getDrawable(R.drawable.img,null);
        Bitmap unos=uno.getBitmap();
        Bitmap uns=Bitmap.createScaledBitmap(unos,width,height,false);
        nmap.addMarker(new MarkerOptions()
                .position(punto)
                .title(titulo).snippet("tres")
                .icon(BitmapDescriptorFactory.fromBitmap(uns)));
    }
}

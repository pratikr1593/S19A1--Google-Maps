package com.supriyalahade.session19assign1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {



    double latitude=  50.821958;

    double longitude=  -0.133489;

    MarkerOptions markerOptions;
   // GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // googleMap = ((MapFragment)(getFragmentManager().findFragmentById(R.id.fragment))).getMap();

        MapFragment mapFragment = (MapFragment) getFragmentManager()
                .findFragmentById(R.id.fragment);
        mapFragment.getMapAsync(this);



    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,longitude),15));

        markerOptions = new MarkerOptions().title("8,Dorset Gardens,Brighton.").position(new LatLng(latitude,longitude));
        googleMap.addMarker(markerOptions);

        googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

    }
}

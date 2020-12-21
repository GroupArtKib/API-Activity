package com.example.apiactivitygroup11;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        
        LatLng upang = new LatLng(15.969612, 120.5718908);
        mMap.addMarker(new MarkerOptions().position(upang).title("University of Pangasinan College of Urdaneta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(upang));

        LatLng sccm = new LatLng(16.034442, 120.494543);
        mMap.addMarker(new MarkerOptions().position(sccm).title("St. Camillus College of Manaoag"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sccm));

        LatLng drecmnhs = new LatLng(15.897773591713053, 120.58486995316517);
        mMap.addMarker(new MarkerOptions().position(drecmnhs).title("Don Ramon E. Costales Memorial National High School"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(drecmnhs));



    }
}
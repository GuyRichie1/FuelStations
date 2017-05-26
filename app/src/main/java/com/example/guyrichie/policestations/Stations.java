package com.example.guyrichie.policestations;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocompleteFragment;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class Stations extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final String TAG = "Stations";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.police_stations);
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
        googleMap.getUiSettings().setZoomControlsEnabled(true);
        googleMap.getUiSettings().setCompassEnabled(true);
        googleMap.getUiSettings().setMyLocationButtonEnabled(true);
        googleMap.getUiSettings().setMapToolbarEnabled(true);
        googleMap.getUiSettings().setZoomGesturesEnabled(true);
        googleMap.getUiSettings().setScrollGesturesEnabled(true);
        googleMap.getUiSettings().setTiltGesturesEnabled(true);
        googleMap.getUiSettings().setRotateGesturesEnabled(true);


        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(5.648616,-0.189135 );
        mMap.addMarker(new MarkerOptions().position(sydney).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,15));
        LatLng akuafo = new LatLng(6.37797,-0.546614);
        mMap.addMarker(new MarkerOptions().position(akuafo).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place1 = new LatLng(6.291988,-0.473958);
        mMap.addMarker(new MarkerOptions().position(place1).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place2 = new LatLng(5.60633,-0.26114);
        mMap.addMarker(new MarkerOptions().position(place2).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place3 = new LatLng(5.62409,-0.30456);
        mMap.addMarker(new MarkerOptions().position(place3).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place4 = new LatLng(5.61284,-0.26104);
        mMap.addMarker(new MarkerOptions().position(place4).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place5 = new LatLng(5.609622,-0.240464);
        mMap.addMarker(new MarkerOptions().position(place5).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place6 = new LatLng(5.60123	,-0.23953);
        mMap.addMarker(new MarkerOptions().position(place6).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place7 = new LatLng(5.5765,-0.21693);
        mMap.addMarker(new MarkerOptions().position(place7).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place8 = new LatLng(5.603339,-0.254883);
        mMap.addMarker(new MarkerOptions().position(place8).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place9 = new LatLng(5.586,-0.27922);
        mMap.addMarker(new MarkerOptions().position(place9).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place10 = new LatLng(5.63584,-0.21481);
        mMap.addMarker(new MarkerOptions().position(place10).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place11 = new LatLng(5.58828,-0.26521);
        mMap.addMarker(new MarkerOptions().position(place11).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place12 = new LatLng(5.65228,-0.25007);
        mMap.addMarker(new MarkerOptions().position(place12).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place13 = new LatLng(5.64504,-0.24741);
        mMap.addMarker(new MarkerOptions().position(place13).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place14 = new LatLng(5.66685,-0.18634);
        mMap.addMarker(new MarkerOptions().position(place14).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place15 = new LatLng(5.6671,-0.23813);
        mMap.addMarker(new MarkerOptions().position(place15).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place16 = new LatLng(5.69036,-0.26201);
        mMap.addMarker(new MarkerOptions().position(place16).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place17 = new LatLng(5.52969,-0.2269);
        mMap.addMarker(new MarkerOptions().position(place17).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place18 = new LatLng(5.55514,-0.21007);
        mMap.addMarker(new MarkerOptions().position(place18).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place19 = new LatLng(5.54382, -0.27979);
        mMap.addMarker(new MarkerOptions().position(place19).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place20 = new LatLng(5.5345,-0.24259);
        mMap.addMarker(new MarkerOptions().position(place20).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place21 = new LatLng(5.5345,-0.24259);
        mMap.addMarker(new MarkerOptions().position(place21).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place22 = new LatLng(5.54307,-0.26493);
        mMap.addMarker(new MarkerOptions().position(place22).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place23 = new LatLng(5.5587,-0.26535);
        mMap.addMarker(new MarkerOptions().position(place23).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place24 = new LatLng(5.5764,-0.29375);
        mMap.addMarker(new MarkerOptions().position(place24).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place25 = new LatLng(5.57377,-0.27386);
        mMap.addMarker(new MarkerOptions().position(place25).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place26 = new LatLng(5.63409,-0.24178);
        mMap.addMarker(new MarkerOptions().position(place26).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place27 = new LatLng(5.67003,-0.15125);
        mMap.addMarker(new MarkerOptions().position(place27).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place28 = new LatLng(5.67257,-0.15977);
        mMap.addMarker(new MarkerOptions().position(place28).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place29 = new LatLng(5.66036,-0.17753);
        mMap.addMarker(new MarkerOptions().position(place29).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place30 = new LatLng(5.68626,-0.19402);
        mMap.addMarker(new MarkerOptions().position(place30).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place31 = new LatLng(5.68615,-0.18379);
        mMap.addMarker(new MarkerOptions().position(place31).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place32 = new LatLng(5.66032,-0.13233);
        mMap.addMarker(new MarkerOptions().position(place32).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place33 = new LatLng(5.68509,-0.13826);
        mMap.addMarker(new MarkerOptions().position(place33).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place34 = new LatLng(5.3855663,-0.6433238);
        mMap.addMarker(new MarkerOptions().position(place34).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place35 = new LatLng(5.71203,-20514);
        mMap.addMarker(new MarkerOptions().position(place35).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place36 = new LatLng(5.6815,-0.34305);
        mMap.addMarker(new MarkerOptions().position(place36).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place37 = new LatLng(5.67922,-0.33432);
        mMap.addMarker(new MarkerOptions().position(place37).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place38 = new LatLng(5.6819,	-0.3408);
        mMap.addMarker(new MarkerOptions().position(place38).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place39 = new LatLng(6.124161,-0.203211);
        mMap.addMarker(new MarkerOptions().position(place39).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        LatLng place40 = new LatLng(5.6832,-13018);
        mMap.addMarker(new MarkerOptions().position(place40).title("stations").icon(BitmapDescriptorFactory.fromResource(R.drawable.stations)));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
                getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);

        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                // TODO: Get info about the selected place.

                Log.i(TAG, "Place: " + place.getName());
                Log.i(TAG, "Place: " + place.getAddress());
                Log.i(TAG, "location: " + place.getLatLng().toString());
                if (place.getLatLng() != null) {
                    //Toast.makeText(getContext(), "GPS location was found!", Toast.LENGTH_SHORT).show();
                    LatLng latLng = new LatLng(place.getLatLng().latitude, place.getLatLng().longitude);
                    CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 15);
                    mMap.animateCamera(cameraUpdate);

                    BitmapDescriptor markerId =
                            BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN);
                    mMap.addMarker(new MarkerOptions()
                            .position(place.getLatLng())
                            .title(place.getName().toString())
                            .snippet(place.getAddress().toString())
                            .icon(markerId));

                }



            }




            @Override
            public void onError(Status status) {
                // TODO: Handle the error.
                Log.i(TAG, "An error occurred: " + status);
            }



        });

    }




}

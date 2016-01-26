package me.jarvischen.dagger;

import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //After the  super.onCreate(...) call returns we are guranteed our injections are available
        setContentView(R.layout.activity_main);
    }
}

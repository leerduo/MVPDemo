package me.jarvischen.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by chenfuduo on 2016/1/26.
 */
public class MyBaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApp)getApplication()).inject(this);
    }
}

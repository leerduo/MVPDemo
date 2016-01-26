package me.jarvischen.dagger_activitygrapha;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by chenfuduo on 2016/1/26.
 */
public class MyBaseActivity extends FragmentActivity {

    private ObjectGraph activityGrapha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApp app = (MyApp) getApplication();
        app.getApplicationGraph().plus(getModules().toArray());
        activityGrapha.inject(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        activityGrapha = null;
    }

    protected List<Object> getModules(){
        return Arrays.<Object>asList(new ActivityModule(this));
    }

    public void inject(Object object){
        activityGrapha.inject(object);
    }

}

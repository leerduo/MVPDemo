package me.jarvischen.dagger;

import android.app.Application;

import java.util.Arrays;
import java.util.List;

import dagger.ObjectGraph;

/**
 * Created by chenfuduo on 2016/1/26.
 */
public class MyApp extends Application {
    private ObjectGraph graph;

    @Override
    public void onCreate() {
        super.onCreate();
        graph = ObjectGraph.create(getmodules().toArray());
    }
    protected List<Object> getmodules(){
        return Arrays.asList(new AndroidModule(this),new DaggerDemoModule());
    }

    public void inject(Object object){
        graph.inject(object);
    }
}

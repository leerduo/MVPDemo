package me.jarvischen.dagger;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static android.content.Context.LOCATION_SERVICE;

/**
 * Created by chenfuduo on 2016/1/26.
 */
@Module(library = true)
public class AndroidModule {
    private final MyApp app;

    public AndroidModule(MyApp app) {
        this.app = app;
    }
    @Provides
    @Singleton
    @ForApplication
    Context provideApplicationContext(){
        return app;
    }

    @Provides
    @Singleton
    LocationManager provideLocationManager(){
        return (LocationManager) app.getSystemService(LOCATION_SERVICE);
    }

}

package me.jarvischen.dagger_activitygrapha;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

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
        return (LocationManager) app.getSystemService(Context.LOCATION_SERVICE);
    }
}

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
//在Module中若provide的类，没有在injects列表中使用， 将在编译时触发错误。
//若是这个Module提供的对象绑定， 可能被injects列表中以外的类使用， 可以将改Module标记为library, 以避免出错。
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

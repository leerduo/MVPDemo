package me.jarvischen.dagger_activitygrapha;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chenfuduo on 2016/1/26.
 */
@Module(injects = {MainActivity.class, MyFragment.class},
        addsTo = AndroidModule.class,
        library = true)
public class ActivityModule {
    private final MyBaseActivity activity;

    public ActivityModule(MyBaseActivity activity) {
        this.activity = activity;
    }
    @Provides
    @Singleton
    @ForActivity
    Context provideActivityContext(){
        return activity;
    }
    @Provides
    @Singleton
    ActivityTitleController provideTitleController(){
        return new ActivityTitleController(activity);
    }
}

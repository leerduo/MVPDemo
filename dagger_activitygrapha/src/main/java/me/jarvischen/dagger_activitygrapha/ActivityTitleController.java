package me.jarvischen.dagger_activitygrapha;

import android.app.Activity;

/**
 * Created by chenfuduo on 2016/1/26.
 */
public class ActivityTitleController {
    private final Activity activity;

    public ActivityTitleController(Activity activity) {
        this.activity = activity;
    }

    public void setTitle(CharSequence title){
        activity.setTitle(title);
    }

}

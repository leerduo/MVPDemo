package me.jarvischen.dagger_activitygrapha;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

/**
 * Created by chenfuduo on 2016/1/26.
 */
public class MyFragment extends MyBaseFragment {
    public static MyFragment newInstance(){
        return new MyFragment();
    }
    @Inject
    ActivityTitleController titleController;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        TextView tv = new TextView(getActivity());
        tv.setGravity(Gravity.CENTER);
        tv.setText("Hello World.");
        return tv;
    }

    @Override
    public void onResume() {
        super.onResume();
        titleController.setTitle("My Fragment");
    }
}

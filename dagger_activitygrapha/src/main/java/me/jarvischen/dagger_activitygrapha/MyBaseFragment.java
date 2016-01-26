package me.jarvischen.dagger_activitygrapha;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by chenfuduo on 2016/1/26.
 */
public class MyBaseFragment extends Fragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((MyBaseActivity)getActivity()).inject(this);
    }
}

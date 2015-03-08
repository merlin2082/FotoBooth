package com.divianaci.fotobooth.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ProgressBar;

import com.divianaci.fotobooth.R;

/**
 * Created by Merlin on 3/8/2015.
 */
public class PhotoCountDownFragment extends Fragment {

    public PhotoCountDownFragment() {
        // Required empty public constructor
    }

    public static PhotoCountDownFragment newInstance() {
        PhotoCountDownFragment fragment = new PhotoCountDownFragment();
        Bundle args = new Bundle();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ProgressBar pb = (ProgressBar) container.findViewById(R.id.progressBarToday);

        Animation an = new RotateAnimation(0.0f, 90.0f, 250f, 273f);
        an.setFillAfter(true);
        pb.startAnimation(an);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_photo_count_down_timer, container, false);
    }

}

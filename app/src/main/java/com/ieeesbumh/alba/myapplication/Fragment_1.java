package com.ieeesbumh.alba.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Alba on 07/11/2014.
 */
public class Fragment_1 extends Fragment {
    public int pos;
    public Fragment_1(int position) {
        pos=position;
    }

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView;
        switch (pos){
            case 0:
                rootView=inflater.inflate(R.layout.fragment_my, container, false);
                break;
            case 1:
                rootView=inflater.inflate(R.layout.fragment_my2, container, false);
            case 2:
                rootView=inflater.inflate(R.layout.fragment_my3, container, false);
            case 3:
                rootView=inflater.inflate(R.layout.fragment_my4, container, false);
        }





        return rootView;
    }
}

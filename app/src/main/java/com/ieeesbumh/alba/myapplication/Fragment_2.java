package com.ieeesbumh.alba.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alba on 07/11/2014.
 */
public class Fragment_2 extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_my2, container, false);

        //TextView texto = (TextView) rootView.findViewById(R.id.section_label);

        //texto.setText("Tab seleccionada" + "\n\n" + "Productos");;

        return rootView;
    }
}

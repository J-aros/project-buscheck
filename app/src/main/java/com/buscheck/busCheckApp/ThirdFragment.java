package com.buscheck.busCheckApp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ThirdFragment extends Fragment {

    TextView back;
    TextView done;
    ViewPager viewPager;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        viewPager = getActivity().findViewById(R.id.viewPager);

        back = view.findViewById(R.id.slideThreeBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        done = view.findViewById(R.id.slideThreeDone);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registroUsuario = new Intent(getActivity(), VentaActivity.class);
                startActivity(registroUsuario);
            }
        });


        return view;
    }
}

package com.example.miniproject;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;




public class fragment_register extends Fragment {

    private RadioGroup radioGroup;

    private RadioButton customerRadioButton;
    private RadioButton professionalRadioButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_register, container, false);

        radioGroup = rootView.findViewById(R.id.radioGroup);
        customerRadioButton = rootView.findViewById(R.id.checkbox01);
        professionalRadioButton = rootView.findViewById(R.id.checkbox02);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.checkbox01) {
                    // Handle the customer RadioButton selection
                } else if (checkedId == R.id.checkbox02) {
                    // Handle the professional RadioButton selection
                }
            }
        });

        return rootView;
    }

    public fragment_register() {
        // Required empty public constructor
    }




}
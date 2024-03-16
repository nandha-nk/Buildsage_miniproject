package com.example.miniproject;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_login extends Fragment {

    private RadioGroup radioGroup;
    private RadioButton customerRadioButton;
    private RadioButton professionalRadioButton;
    EditText username,password;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View rootView = inflater.inflate(R.layout.fragment_login, container, false);

        radioGroup = rootView.findViewById(R.id.radioGroup);
        customerRadioButton = rootView.findViewById(R.id.checkbox01);
        professionalRadioButton = rootView.findViewById(R.id.checkbox02);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.checkbox01) {

                } else if (checkedId == R.id.checkbox02) {

                }
            }
        });
        Button btnRegister = rootView.findViewById(R.id.btn_login);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment_container, new fragment_chome());

                transaction.addToBackStack(null);


                transaction.commit();
            }
        });


        return rootView;
    }

    public fragment_login() {

    }




}
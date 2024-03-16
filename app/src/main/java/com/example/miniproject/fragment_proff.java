package com.example.miniproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment_proff extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_proff, container, false);

        Button btnRegister = rootView.findViewById(R.id.profile);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentTransaction transaction = requireActivity().getSupportFragmentManager().beginTransaction();

                transaction.replace(R.id.fragment_container, new fragment_profile());

                transaction.addToBackStack(null);


                transaction.commit();
            }
        });


        return rootView;
    }
}
package com.example.tema1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Fragment1Activity2 extends Fragment {

    Button b1f1a2;

    public Fragment1Activity2 (){
        //empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment1activity2,container,false);
        b1f1a2=v.findViewById(R.id.B1F1A2);
        b1f1a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2Activity2 fragment2Activity2=new Fragment2Activity2();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.add(R.id.activity2Id,fragment2Activity2);
                transaction.commit();

            }
        });

        return v;


    }


}

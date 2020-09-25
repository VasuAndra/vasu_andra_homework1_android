package com.example.tema1;

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

public class Fragment2Activity2 extends Fragment {
    Button b1f2a2;
    Button b2f2a2;
    Button b3f2a2;

    public Fragment2Activity2 (){
        //empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.fragment2activity2,container,false);
        b1f2a2=v.findViewById(R.id.B1F2A2);
        b1f2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3Activity2 fragment3Activity2=new Fragment3Activity2();
                FragmentTransaction transaction=getFragmentManager().beginTransaction();
                transaction.replace(R.id.Fragment1Activity2Id,fragment3Activity2);
                transaction.commit();

            }
        });

        b2f2a2=v.findViewById(R.id.B2F2A2);
        b2f2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                FragmentTransaction fragmentTransaction;

                fragmentTransaction = getFragmentManager().beginTransaction();

                Fragment fragment1act2 = getFragmentManager().findFragmentById(R.id.Fragment1Activity2Id);
                if(fragment1act2!=null) {
                    fragmentTransaction.remove(fragment1act2);
                    fragmentTransaction.commit();
                }

            }
        });

        b3f2a2=v.findViewById(R.id.B3F2A2);
        b3f2a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getActivity().finish();

            }
        });

        return v;

    }

}

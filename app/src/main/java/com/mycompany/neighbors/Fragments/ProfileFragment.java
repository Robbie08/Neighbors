package com.mycompany.neighbors.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mycompany.neighbors.R;

/**
 * Created by joshua on 5/25/2016.
 */
public class ProfileFragment extends Fragment {

    private Button bLogout;
    public static ProfileFragment newInstance(int index){
        ProfileFragment profileFragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putInt("index",index);
        profileFragment.setArguments(args);
        return profileFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fragment_profile,parent,false);
        bLogout = (Button)v.findViewById(R.id.bLogout);
        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                //TODO:Logout
            }
        });
        return v;
    }



}

package com.example.admin.myapplication.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.myapplication.R;

/**
 * Created by admin on 12/29/2015.
 */
public class HomeFragment extends Fragment {
    View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.home_screen,container,false);
        return view;
    }
}

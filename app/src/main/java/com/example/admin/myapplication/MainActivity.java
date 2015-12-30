package com.example.admin.myapplication;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity {
    private FragmentManager fm=getFragmentManager();
    private FragmentTransaction fragmentTransaction=fm.beginTransaction();
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        setContentView(R.layout.activity_main);

    }
}

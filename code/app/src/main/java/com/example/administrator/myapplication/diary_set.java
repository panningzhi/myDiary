package com.example.administrator.myapplication;


import android.os.Bundle;
import android.preference.PreferenceActivity;



public class diary_set extends PreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.diary_set);
    }
}

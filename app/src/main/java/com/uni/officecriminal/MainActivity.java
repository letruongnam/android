package com.uni.officecriminal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindFragmentToView();
    }

    private void BindFragmentToView() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment listFragment = CriminalListFragment.newInstance();
        Fragment detailFragment = CriminalDetailFragment.newInstance();
        fragmentTransaction.replace(R.id.criminal_list_fragment, listFragment);
        if(findViewById(R.id.criminal_detail_fragment) != null)
            fragmentTransaction.replace(R.id.criminal_detail_fragment, detailFragment);

        fragmentTransaction.commit();
    }
}

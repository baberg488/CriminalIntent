package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Owner-1 on 3/30/2015.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}

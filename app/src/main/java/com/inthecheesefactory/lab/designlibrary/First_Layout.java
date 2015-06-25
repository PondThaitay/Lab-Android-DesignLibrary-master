package com.inthecheesefactory.lab.designlibrary;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AdminPond on 26/6/2558.
 */
public class First_Layout extends Fragment {

    public static First_Layout newInstance() {
        First_Layout fragment = new First_Layout();
        return fragment;
    }

    public First_Layout() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fist_layout, null);
        return rootView;
    }
}

package com.corcusoft.cash_a_lot.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.ui.adapters.MainPageGridAdapter;
import com.corcusoft.cash_a_lot.utils.MaketHelper;

/**
 * Created by Rufat on 4/23/18.
 */

public class HistoryFragment extends Fragment{

    GridView gridView;
    FloatingActionButton fab_filter;
    MainPageGridAdapter mainPageGridAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.history_layout,container,false);
        initViews(view);
        configureAdapter();
        return view;
    }

    private void configureAdapter() {
        mainPageGridAdapter = new MainPageGridAdapter(getActivity(), MaketHelper.getInstance().placeObjectList());
        gridView.setAdapter(mainPageGridAdapter);
    }

    private void initViews(View view) {
        gridView = view.findViewById(R.id.grid_view_coupons);
        fab_filter = view.findViewById(R.id.fab_filter);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}

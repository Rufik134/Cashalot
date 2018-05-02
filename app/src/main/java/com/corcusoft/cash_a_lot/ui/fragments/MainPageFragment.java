package com.corcusoft.cash_a_lot.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.ui.adapters.MainPageGridAdapter;
import com.corcusoft.cash_a_lot.utils.MaketHelper;

/**
 * Created by Rufat on 4/8/18.
 */

public class MainPageFragment extends Fragment {

    GridView couponsGridView;
    RelativeLayout getBonus, pay;
    MainPageGridAdapter mainPageGridAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_main,container,false);
        initViews(view);
        configureAdapter();

        return view;
    }

    private void configureAdapter() {
        mainPageGridAdapter = new MainPageGridAdapter(getActivity(), MaketHelper.getInstance().placeObjectList());
        couponsGridView.setAdapter(mainPageGridAdapter);
    }

    private void initViews(View view) {
        couponsGridView = view.findViewById(R.id.grid_view_coupons);
        getBonus = view.findViewById(R.id.relative_layout_bonus);
        pay = view.findViewById(R.id.relative_layout_pay);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}

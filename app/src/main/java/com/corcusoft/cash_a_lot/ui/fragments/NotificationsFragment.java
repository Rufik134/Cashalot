package com.corcusoft.cash_a_lot.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.ui.adapters.NotificationRecyclerAdapter;
import com.corcusoft.cash_a_lot.utils.MaketHelper;

/**
 * Created by Rufat on 4/23/18.
 */

public class NotificationsFragment extends Fragment {

    RecyclerView notificiationRecyclerView;
    NotificationRecyclerAdapter adapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notifications_layout,container,false);
        initViews(view);
        configureAdapter();
        return view;
    }

    private void configureAdapter() {
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        adapter = new NotificationRecyclerAdapter(getActivity(), MaketHelper.getInstance().notificationsList());
        notificiationRecyclerView.setLayoutManager(llm);
        notificiationRecyclerView.setAdapter(adapter);
    }

    private void initViews(View view) {
        notificiationRecyclerView = view.findViewById(R.id.recycler_view_notifications);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }
}

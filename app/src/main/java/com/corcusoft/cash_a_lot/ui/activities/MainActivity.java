package com.corcusoft.cash_a_lot.ui.activities;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.ui.fragments.HistoryFragment;
import com.corcusoft.cash_a_lot.ui.fragments.InfoFragment;
import com.corcusoft.cash_a_lot.ui.fragments.MainPageFragment;
import com.corcusoft.cash_a_lot.ui.fragments.NotificationsFragment;
import com.corcusoft.cash_a_lot.ui.fragments.ProfileFragment;
import com.corcusoft.cash_a_lot.utils.CommunicationListener;
import com.corcusoft.cash_a_lot.utils.Constants;

public class MainActivity extends AppCompatActivity implements CommunicationListener {



    RelativeLayout containerView;
    TextView main, history, profile, info;
    ImageView settings,notifications;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        configureFragmentManager();
        configureNavigation();

    }

    private void configureNavigation() {
        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(Constants.MAIN_PAGE);
            }
        });

        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(Constants.HISTORY_PAGE);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(Constants.PROFILE);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(Constants.INFO_PAGE);
            }
        });
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(Constants.NOTIFICATION_PAGE);
            }
        });
    }

    private void configureFragmentManager() {
        fragmentManager = getSupportFragmentManager();
        changeFragment(Constants.MAIN_PAGE);
    }

    private void initViews() {
        containerView = findViewById(R.id.container_view);
        main = findViewById(R.id.text_view_main);
        history = findViewById(R.id.text_view_history);
        profile = findViewById(R.id.text_view_Profile);
        info = findViewById(R.id.text_view_info);
        settings = findViewById(R.id.image_view_settings);
        notifications = findViewById(R.id.image_view_notification);
    }

    private void changeTextBackOnChoose(int id){
        switch (id){
            case Constants.MAIN_PAGE:
                main.setBackgroundResource(R.drawable.draw_text_view_selected_background);
                main.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case Constants.NOTIFICATION_PAGE:
               // notifications.setBackgroundResource(R.drawable.draw_text_view_selected_background);
              //  notifications.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case Constants.INFO_PAGE:
                info.setBackgroundResource(R.drawable.draw_text_view_selected_background);
                info.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case Constants.PROFILE:
                profile.setBackgroundResource(R.drawable.draw_text_view_selected_background);
                profile.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            case Constants.HISTORY_PAGE:
                history.setBackgroundResource(R.drawable.draw_text_view_selected_background);
                history.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;
            default:
                main.setBackgroundResource(R.drawable.draw_text_view_selected_background);
                main.setTextColor(getResources().getColor(R.color.colorPrimary));
                break;

        }
    }

    private void setNormalBackForTexts(){
        history.setBackground(null);
        main.setBackground(null);
        profile.setBackground(null);
        info.setBackground(null);

        history.setTextColor(Color.WHITE);
        main.setTextColor(Color.WHITE);
        profile.setTextColor(Color.WHITE);
        info.setTextColor(Color.WHITE);
    }

    @Override
    public void changeFragment(int id) {
        Fragment fragment;
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        switch (id){
            case Constants.MAIN_PAGE:
                fragment = new  MainPageFragment();
                transaction.replace(R.id.container_view,fragment);
                transaction.commit();
                setNormalBackForTexts();
                changeTextBackOnChoose(id);
                break;
            case Constants.NOTIFICATION_PAGE:
                fragment = new NotificationsFragment();
                transaction.replace(R.id.container_view,fragment);
                transaction.commit();
                setNormalBackForTexts();
                changeTextBackOnChoose(id);
                break;
            case Constants.INFO_PAGE:
                fragment = new InfoFragment();
                transaction.replace(R.id.container_view,fragment);
                transaction.commit();
                setNormalBackForTexts();
                changeTextBackOnChoose(id);
                break;
            case Constants.PROFILE:
                fragment = new ProfileFragment();
                transaction.replace(R.id.container_view,fragment);
                transaction.commit();
                setNormalBackForTexts();
                changeTextBackOnChoose(id);
                break;
            case Constants.HISTORY_PAGE:
                fragment = new HistoryFragment();
                transaction.replace(R.id.container_view,fragment);
                transaction.commit();
                setNormalBackForTexts();
                changeTextBackOnChoose(id);
                break;
            default:
                break;

        }
    }
}

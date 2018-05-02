package com.corcusoft.cash_a_lot.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.ui.objects.PlaceObject;

import java.util.List;

/**
 * Created by Rufat on 4/22/18.
 */

public class MainPageGridAdapter extends BaseAdapter {

    List<PlaceObject> placeObjects;
    Context context;
    LayoutInflater layoutInflater;

    public MainPageGridAdapter(Context context, List<PlaceObject> placeObjects){
        this.context = context;
        this.placeObjects = placeObjects;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return placeObjects.size();
    }

    @Override
    public Object getItem(int i) {
        return placeObjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view==null){
            view = layoutInflater.inflate(R.layout.main_page_grid_element_layout,viewGroup,false);
        }
        ImageView placeIcon = view.findViewById(R.id.place_image_view);
        TextView placeName = view.findViewById(R.id.place_name_text_view);
        TextView amount = view.findViewById(R.id.amount_text_view);

        PlaceObject placeObject = placeObjects.get(i);

        placeIcon.setImageResource(R.drawable.ic_macdonalds_test_icon);
        placeName.setText(placeObject.getName());
        amount.setText(String.valueOf(placeObject.getAmount()));

        return view;
    }
}

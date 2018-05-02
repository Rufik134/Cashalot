package com.corcusoft.cash_a_lot.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.corcusoft.cash_a_lot.R;
import com.corcusoft.cash_a_lot.ui.objects.NotificationObject;

import java.util.List;

/**
 * Created by Rufat on 4/23/18.
 */

public class NotificationRecyclerAdapter extends RecyclerView.Adapter<NotificationRecyclerAdapter.NotificationViewHolder> {

    private List<NotificationObject> notificationObjectList;
    private Context context;

    public NotificationRecyclerAdapter(Context context,List<NotificationObject> notificationObjectList){
        this.context = context;
        this.notificationObjectList = notificationObjectList;
    }

    @Override
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.notification_item_layout,parent,false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return notificationObjectList.size();
    }

    class NotificationViewHolder extends RecyclerView.ViewHolder{
        TextView placeName,amount,message,datetime;
        ImageView placeIcon;

        public NotificationViewHolder(View itemView) {
            super(itemView);
            placeIcon = itemView.findViewById(R.id.image_view_place);
            placeName = itemView.findViewById(R.id.text_view_place);
            message = itemView.findViewById(R.id.text_view_message);
            datetime = itemView.findViewById(R.id.text_view_date);
        }
    }
}

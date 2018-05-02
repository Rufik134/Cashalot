package com.corcusoft.cash_a_lot.utils;

import com.corcusoft.cash_a_lot.ui.objects.NotificationObject;
import com.corcusoft.cash_a_lot.ui.objects.PlaceObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rufat on 4/22/18.
 */

public class MaketHelper {

    private static MaketHelper maketHelper;

    public static MaketHelper getInstance(){
        if (maketHelper==null){
            maketHelper = new MaketHelper();
        }
        return maketHelper;
    }

    public List<PlaceObject> placeObjectList(){
        List<PlaceObject> placeObjects = new ArrayList<>();
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));
        placeObjects.add(new PlaceObject("Macdonalds",22,"AZN",1));

        return placeObjects;
    }

    public List<NotificationObject> notificationsList() {
        List<NotificationObject> notificationObjectList = new ArrayList<>();
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        notificationObjectList.add(new NotificationObject("Hello","url",20.0,"macDonalds","23/09/17"));
        return notificationObjectList;
    }
}

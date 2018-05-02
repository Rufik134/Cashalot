package com.corcusoft.cash_a_lot.ui.objects;

/**
 * Created by Rufat on 4/23/18.
 */

public class NotificationObject {
    private String message;
    private String imgUrl;
    private double amount;
    private String place;
    private String datetime;

    public NotificationObject(String message, String imgUrl, double amount, String place, String datetime) {
        this.message = message;
        this.imgUrl = imgUrl;
        this.amount = amount;
        this.place = place;
        this.datetime = datetime;
    }

    public String getMessage() {
        return message;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public double getAmount() {
        return amount;
    }

    public String getPlace() {
        return place;
    }

    public String getDatetime() {
        return datetime;
    }
}

package com.xud.vo;

import java.math.BigDecimal;
import java.util.Date;

public class VoForder {
    private String forderId;//订单编号

    private String createTime;

    private String userId;

    private String cinemaName;
    private String RoomName;
    private String filmName;
    private Integer cnt;//购票数量

    private String seat;//座位号

    private double price;//总价

    @Override
    public String toString() {
        return "VoForder{" +
                "forderId='" + forderId + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId='" + userId + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                ", RoomName='" + RoomName + '\'' +
                ", filmName='" + filmName + '\'' +
                ", cnt=" + cnt +
                ", seat='" + seat + '\'' +
                ", price=" + price +
                '}';
    }

    public String getForderId() {
        return forderId;
    }

    public void setForderId(String forderId) {
        this.forderId = forderId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getRoomName() {
        return RoomName;
    }

    public void setRoomName(String roomName) {
        RoomName = roomName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public VoForder(String forderId, String createTime, String userId, String cinemaName, String roomName, String filmName, Integer cnt, String seat, double price) {
        this.forderId = forderId;
        this.createTime = createTime;
        this.userId = userId;
        this.cinemaName = cinemaName;
        RoomName = roomName;
        this.filmName = filmName;
        this.cnt = cnt;
        this.seat = seat;
        this.price = price;
    }

    public VoForder() {
    }
}

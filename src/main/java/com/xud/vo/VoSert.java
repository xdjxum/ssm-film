package com.xud.vo;

import java.util.Date;

public class VoSert {
    private String playId;
    private String filmName;//影片名
    private String country;//制片国家
    private Integer length;//片长
    private String cinemaName;//影城名
    private String roomName;//放映厅
    private String playTime;//放映时间
    private Float price;//单价
    private String seatInfo;//初始座位信息

    @Override
    public String toString() {
        return "VoSert{" +
                "playId='" + playId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", cinemaName='" + cinemaName + '\'' +
                ", roomName='" + roomName + '\'' +
                ", playTime='" + playTime + '\'' +
                ", price=" + price +
                ", seatInfo='" + seatInfo + '\'' +
                '}';
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getSeatInfo() {
        return seatInfo;
    }

    public void setSeatInfo(String seatInfo) {
        this.seatInfo = seatInfo;
    }

    public VoSert(String playId, String filmName, String country, Integer length, String cinemaName, String roomName, String playTime, Float price, String seatInfo) {
        this.playId = playId;
        this.filmName = filmName;
        this.country = country;
        this.length = length;
        this.cinemaName = cinemaName;
        this.roomName = roomName;
        this.playTime = playTime;
        this.price = price;
        this.seatInfo = seatInfo;
    }

    public VoSert() {
    }
}

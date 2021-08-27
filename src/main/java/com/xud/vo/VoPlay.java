package com.xud.vo;

import java.util.Date;

public class VoPlay {
    private String playId;

    private String cinemaName;

    private String playTime;

    private String language;

    private String roomName;

    private Float price;

    @Override
    public String toString() {
        return "VoPlay{" +
                "playId='" + playId + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                ", playTime='" + playTime + '\'' +
                ", language='" + language + '\'' +
                ", roomName='" + roomName + '\'' +
                ", price=" + price +
                '}';
    }

    public VoPlay(String playId, String cinemaName, String playTime, String language, String roomName, Float price) {
        this.playId = playId;
        this.cinemaName = cinemaName;
        this.playTime = playTime;
        this.language = language;
        this.roomName = roomName;
        this.price = price;
    }

    public VoPlay() {
    }

    public String getPlayId() {
        return playId;
    }

    public void setPlayId(String playId) {
        this.playId = playId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getPlayTime() {
        return playTime;
    }

    public void setPlayTime(String playTime) {
        this.playTime = playTime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}

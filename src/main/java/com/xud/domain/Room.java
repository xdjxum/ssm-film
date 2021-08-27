package com.xud.domain;

public class Room {
    private Long id;

    private String roomId;

    private String cinemaId;

    private String seatInfo;

    private String roomName;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomId='" + roomId + '\'' +
                ", cinemaId='" + cinemaId + '\'' +
                ", seatInfo='" + seatInfo + '\'' +
                ", roomName='" + roomName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getSeatInfo() {
        return seatInfo;
    }

    public void setSeatInfo(String seatInfo) {
        this.seatInfo = seatInfo;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
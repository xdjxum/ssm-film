package com.xud.domain;

public class Cinema {
    private Long id;

    private String cinemId;

    private String cinemaName;

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", cinemId='" + cinemId + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCinemId() {
        return cinemId;
    }

    public void setCinemId(String cinemId) {
        this.cinemId = cinemId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }
}
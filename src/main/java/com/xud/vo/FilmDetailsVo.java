package com.xud.vo;

import java.sql.Date;

public class FilmDetailsVo {
    private String filmId;//影片唯一id
    private String filmName;//片名
    private String imgPath;//海报路径
    private String driector;//导演
    private String player;//主演
    private String filmType;//类型
    private String country;//制片国家
    private Integer length;//片长
    private String synopsis;//剧情介绍
    private String play_time;//上映时间

    public String getFilmId() {
        return filmId;
    }

    @Override
    public String toString() {
        return "FilmDetailsVo{" +
                "filmId='" + filmId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", driector='" + driector + '\'' +
                ", player='" + player + '\'' +
                ", filmType='" + filmType + '\'' +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", synopsis='" + synopsis + '\'' +
                ", play_time='" + play_time + '\'' +
                '}';
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getDriector() {
        return driector;
    }

    public void setDriector(String driector) {
        this.driector = driector;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
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

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPlay_time() {
        return play_time;
    }

    public void setPlay_time(String play_time) {
        this.play_time = play_time;
    }

    public FilmDetailsVo(String filmId, String filmName, String imgPath, String driector, String player, String filmType, String country, Integer length, String synopsis, String play_time) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.imgPath = imgPath;
        this.driector = driector;
        this.player = player;
        this.filmType = filmType;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.play_time = play_time;
    }

    public FilmDetailsVo() {
    }
}

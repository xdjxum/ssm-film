package com.xud.domain;

import java.sql.Date;
//影片对象
public class Film {
    private long id;//主键id
    private String film_id;//影片唯一id
    private String film_name;//片名
    private String img_path;//海报路径
    private String driector;//导演
    private String player;//主演
    private String film_type;//类型
    private String country;//制片国家
    private Integer length;//片长
    private String synopsis;//剧情介绍
    private String play_time;//上映时间

    public Film() {
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", film_id='" + film_id + '\'' +
                ", film_name='" + film_name + '\'' +
                ", img_path='" + img_path + '\'' +
                ", driector='" + driector + '\'' +
                ", player='" + player + '\'' +
                ", film_type='" + film_type + '\'' +
                ", country='" + country + '\'' +
                ", length=" + length +
                ", synopsis='" + synopsis + '\'' +
                ", play_time='" + play_time + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFilm_id() {
        return film_id;
    }

    public void setFilm_id(String film_id) {
        this.film_id = film_id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
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

    public String getFilm_type() {
        return film_type;
    }

    public void setFilm_type(String film_type) {
        this.film_type = film_type;
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

    public Film(long id, String film_id, String film_name, String img_path, String driector, String player, String film_type, String country, Integer length, String synopsis, String play_time) {
        this.id = id;
        this.film_id = film_id;
        this.film_name = film_name;
        this.img_path = img_path;
        this.driector = driector;
        this.player = player;
        this.film_type = film_type;
        this.country = country;
        this.length = length;
        this.synopsis = synopsis;
        this.play_time = play_time;
    }
}

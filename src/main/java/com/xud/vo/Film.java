package com.xud.vo;

public class Film {
    private String filmId;//影片唯一id
    private String filmName;//片名
    private String imgPath;//海报路径

    public Film(String filmId, String filmName, String imgPath) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.imgPath = imgPath;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmId='" + filmId + '\'' +
                ", filmName='" + filmName + '\'' +
                ", imgPath='" + imgPath + '\'' +
                '}';
    }

    public String getFilmId() {
        return filmId;
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

    public Film() {
    }
}

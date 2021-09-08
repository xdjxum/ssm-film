package com.xud.service;

import com.xud.vo.VoPlay;
import com.xud.vo.VoSert;

import java.util.List;

public interface PlayService {
    public List<VoPlay> selectPlayAll(String filmId);
    public VoSert displaySeats(String playId);
    public String selectSeat(String playId);
    public int setSeatInit(String seat,String playId);
}

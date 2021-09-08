package com.xud.service.interf;

import com.xud.dao.CinemaMapper;
import com.xud.dao.FilmDao;
import com.xud.dao.PlayMapper;
import com.xud.dao.RoomMapper;
import com.xud.domain.Cinema;
import com.xud.domain.Film;
import com.xud.domain.Play;
import com.xud.domain.Room;
import com.xud.vo.VoPlay;
import com.xud.vo.VoSert;
import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.formula.functions.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class PlayService implements com.xud.service.PlayService {
    @Autowired
    private PlayMapper playMapper;
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private CinemaMapper cinemaMapper;
    @Autowired
    private FilmDao filmDao;
    @Override
    public List<VoPlay> selectPlayAll(String filmId){
        List<Play>playList=playMapper.selectAll(filmId);
        List<VoPlay>voPlayList=new ArrayList<>(playList.size());
        for (Play play:playList){
            VoPlay voPlay=new VoPlay();
            voPlay.setPlayId(play.getPlayId());
            Cinema cinema =cinemaMapper.selectByCinemaId(play.getCinemaId());
            System.out.println(cinema);
            voPlay.setCinemaName(cinema.getCinemaName());
            voPlay.setLanguage(play.getLanguage());
            Room room =roomMapper.selectByRoomId(play.getRoomId());
            System.out.println(room);
            voPlay.setRoomName(room.getRoomName());
            voPlay.setPrice(play.getPrice());
            Date date =play.getPlayTime();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            voPlay.setPlayTime(simpleDateFormat.format(date));
            voPlayList.add(voPlay);
        }return voPlayList;
    }
    public VoSert displaySeats(String playId){
        VoSert voSert=new VoSert();
        Play play=playMapper.getPlayByPlayId(playId);
        voSert.setPlayId(play.getPlayId());
        voSert.setPrice(play.getPrice());
        Date date =play.getPlayTime();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        voSert.setPlayTime(simpleDateFormat.format(date));
        Film film =filmDao.getFilmByID(play.getFilmId());
        voSert.setCountry(film.getCountry());
        voSert.setFilmName(film.getFilm_name());
        voSert.setLength(film.getLength());
       Room room= roomMapper.selectByRoomId(play.getRoomId());
       voSert.setSeatInfo(room.getSeatInfo());
       voSert.setRoomName(room.getRoomName());
       Cinema cinema=cinemaMapper.selectByCinemaId(play.getCinemaId());
       voSert.setCinemaName(cinema.getCinemaName());
       return voSert;
    }

    @Override
    public String selectSeat( String playId) {
      String seatInfo=playMapper.getSeatInfo(playId);
       return seatInfo;
    }
    public int setSeatInit(String seat,String playId){
        return playMapper.updateSeat(seat,playId);
    }
}

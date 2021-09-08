package com.xud.service.interf;

import com.xud.dao.CinemaMapper;
import com.xud.dao.ForderMapper;
import com.xud.dao.PlayMapper;
import com.xud.dao.RoomMapper;
import com.xud.domain.Cinema;
import com.xud.domain.Forder;
import com.xud.domain.Play;
import com.xud.domain.Room;
import com.xud.util.Util;
import com.xud.vo.VoForder;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ForderService implements com.xud.service.ForderService {
    @Autowired
    private ForderMapper forderMapper;
    @Autowired
    private PlayMapper playMapper;
    @Autowired
    private CinemaMapper cinemaMapper;
    @Autowired
    private RoomMapper roomMapper;
    @Override
    @Transactional()
    public VoForder insertForder(String seat, BigDecimal price,String playId) {
        Play play=playMapper.getPlayByPlayId(playId);
        String ormSeat=Util.getSeat(seat,play.getSeatInfo());
        int t=playMapper.updateSeat(ormSeat,playId);
        String forderId= Util.getForderId();
        Forder forder=new Forder();
        forder.setForderId(forderId);
        forder.setPlayId(playId);
        Date date=new Date();
        forder.setCreateTime(date);
        int[] cnt=new int[1];
        String newSeat=Util.getCntAndSeat(seat,cnt);
        forder.setCnt(cnt[0]);
        forder.setSeat(newSeat);
        double doubleValue =price.doubleValue();
        doubleValue=doubleValue*cnt[0];
        forder.setPrice(new BigDecimal(doubleValue));
        VoForder voForder=new VoForder();
        BeanUtils.copyProperties(forder,voForder);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        voForder.setCreateTime(simpleDateFormat.format(play.getPlayTime()));
        voForder.setPrice(doubleValue);
        voForder.getCinemaName();
        Cinema cinema=cinemaMapper.selectByCinemaId(play.getCinemaId());
        voForder.setCinemaName(cinema.getCinemaName());
        Room room=roomMapper.selectByRoomId(play.getRoomId());
        voForder.setRoomName(room.getRoomName());
        voForder.setFilmName(play.getFilmName());
        forderMapper.insert(forder);
        return voForder;
    }
}

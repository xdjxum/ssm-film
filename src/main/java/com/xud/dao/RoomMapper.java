package com.xud.dao;

import com.xud.domain.Room;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Room record);

    Room selectByPrimaryKey(Long id);

    List<Room> selectAll();

    int updateByPrimaryKey(Room record);

    Room selectByRoomId(String roomId);

}
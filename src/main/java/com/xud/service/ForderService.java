package com.xud.service;

import com.xud.vo.VoForder;

import java.math.BigDecimal;

public interface ForderService {
    public VoForder insertForder(String seat, BigDecimal price, String playId);
}

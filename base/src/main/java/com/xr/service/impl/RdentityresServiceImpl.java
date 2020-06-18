package com.xr.service.impl;

import com.xr.entity.Rdentityresponsibility;
import com.xr.mapper.RdentityresMapper;
import com.xr.service.RdentityresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RdentityresServiceImpl implements RdentityresService {

    @Autowired
    private RdentityresMapper rdentityresMapper;

    @Override
    public List<Rdentityresponsibility> selectRdentityres(Rdentityresponsibility rdentityresponsibility) {
        return rdentityresMapper.selectRdentityres(rdentityresponsibility);
    }
}

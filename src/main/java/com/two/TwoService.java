package com.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zilongye on 15-3-24.
 */
@Service
public class TwoService {

    @Autowired
    TwoDao twoDao;

    public long count(){
        return twoDao.count();
    }
}

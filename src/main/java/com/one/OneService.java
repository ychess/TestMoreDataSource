package com.one;

import com.main.UserMobileInfo;
import com.main.service.BaseRepository;
import com.main.service.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zilongye on 15-3-24.
 */
@Service
public class OneService extends BaseServiceImpl<UserMobileInfo>{

    @Autowired
    OneRepository oneDao;

    public long count(){
        return oneDao.count();
    }

    @Override
    public BaseRepository<UserMobileInfo, Integer> getRepository() {
        return oneDao;
    }
}

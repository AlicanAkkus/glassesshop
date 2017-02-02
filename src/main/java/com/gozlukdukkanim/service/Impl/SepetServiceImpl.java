package com.gozlukdukkanim.service.Impl;

import com.gozlukdukkanim.dao.SepetDao;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.service.SepetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Service
public class SepetServiceImpl implements SepetService {
    @Autowired
    private SepetDao sepetDao;

    public Sepet getSepetById(int sepetId) {
        return sepetDao.getSepetById(sepetId);
    }

    public void guncelle(Sepet sepet) {
        sepetDao.guncelle(sepet);
    }
}

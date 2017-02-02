package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.SepetDao;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.service.MusteriSiparisService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Repository
@Transactional
public class SepetDaoImpl implements SepetDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private MusteriSiparisService musteriSiparisService;

    public Sepet getSepetById(int sepetId) {
        Session session = sessionFactory.getCurrentSession();
        return (Sepet) session.get(Sepet.class, sepetId);
    }

    public void guncelle(Sepet sepet) {
        int sepetId = sepet.getSepetId();
        double sepetToplam = musteriSiparisService.getMusteriSiparisSepetToplam(sepetId);
        sepet.setSepetToplam(sepetToplam);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(sepet);
    }

    public Sepet validate(int sepetId) throws IOException {
        Sepet sepet = getSepetById(sepetId);
        if (sepet == null || sepet.getSepetItemler().size() == 0) {
            throw new IOException(sepetId + "");
        }
        guncelle(sepet);
        return sepet;
    }
}

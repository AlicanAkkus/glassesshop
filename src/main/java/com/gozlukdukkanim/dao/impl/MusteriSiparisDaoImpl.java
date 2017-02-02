package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.MusteriSiparisDao;
import com.gozlukdukkanim.model.MusteriSiparis;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Repository
@Transactional
public class MusteriSiparisDaoImpl implements MusteriSiparisDao {
    @Autowired
    private SessionFactory sessionFactory;


    public void musteriSiparisEkle(MusteriSiparis musteriSiparis) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(musteriSiparis);
        session.flush();

    }
}

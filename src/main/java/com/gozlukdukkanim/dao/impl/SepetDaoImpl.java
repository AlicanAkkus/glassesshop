package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.SepetDao;
import com.gozlukdukkanim.model.Sepet;
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
public class SepetDaoImpl implements SepetDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Sepet getSepetById(int sepetId) {
        Session session = sessionFactory.getCurrentSession();
        return (Sepet) session.get(Sepet.class, sepetId);
    }

    public void guncelle(Sepet sepet) {
        int sepetId = sepet.getSepetId();
    }
}

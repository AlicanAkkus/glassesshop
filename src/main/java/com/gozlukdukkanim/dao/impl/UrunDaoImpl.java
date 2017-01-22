package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.UrunDao;
import com.gozlukdukkanim.model.Urun;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by memoricAb on 22.01.2017.
 */

@Repository
@Transactional
public class UrunDaoImpl implements UrunDao{

    @Autowired
    private SessionFactory sessionFactory;


    public void urunEkle(Urun urun){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(urun);
        session.flush();
    }

    public Urun getUrunById(String id) {
       Session session = sessionFactory.getCurrentSession();
       Urun urun = (Urun) session.get(Urun.class,id);

       return urun;

    }

    public List<Urun> getTumUrunler() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Urun");
        List<Urun> urunler= query.list();
        session.flush();

        return  urunler;
    }

    public void urunSil(String id) {
        Session session= sessionFactory.getCurrentSession();
        session.delete(getUrunById(id));
        session.flush();

    }

    public void urunDuzenle(Urun urun){
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(urun);
        session.flush();
    }
}

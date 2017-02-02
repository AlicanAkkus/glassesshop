package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.SepetItemDao;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.SepetItem;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Repository
@Transactional
public class SepetItemDaoImpl implements SepetItemDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void sepetItemEkle(SepetItem sepetItem) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(sepetItem);
        session.flush();
    }

    public void sepetItemSil(SepetItem sepetItem) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(sepetItem);
        session.flush();
    }

    public void sepetBosalt(Sepet sepet) {
        List<SepetItem> sepetItemler = sepet.getSepetItemler();
        for (SepetItem item : sepetItemler) {
            sepetItemSil(item);
        }
    }

    public SepetItem getSepetItemByUrunId(int urunId) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from SepetItem where urunId = ?");
        query.setInteger(0, urunId);
        session.flush();

        return (SepetItem) query.uniqueResult();
    }
}

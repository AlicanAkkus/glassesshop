package com.gozlukdukkanim.dao.impl;

import com.gozlukdukkanim.dao.MusteriDao;
import com.gozlukdukkanim.model.Kullanicilar;
import com.gozlukdukkanim.model.Musteri;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.Yetkiler;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by memoricAb on 1.02.2017.
 */
@Repository
@Transactional
public class MusteriDaoImpl implements MusteriDao{
    @Autowired
    SessionFactory sessionFactory;

    public void musteriEkle(Musteri musteri) {
        Session session = sessionFactory.getCurrentSession();
        musteri.getKargoAdres().setMusteri(musteri);
        musteri.getMusteriAdres().setMusteri(musteri);
        session.saveOrUpdate(musteri);
        session.saveOrUpdate(musteri.getMusteriAdres());
        session.saveOrUpdate(musteri.getKargoAdres());

        Kullanicilar yeniKullanici = new Kullanicilar();
        yeniKullanici.setKullaniciadi(musteri.getKullaniciadi());
        yeniKullanici.setSifre(musteri.getSifre());
        yeniKullanici.setEnabled(true);
        yeniKullanici.setKullaniciId(musteri.getMusteriId());


        Yetkiler yeniYetki = new Yetkiler();
        yeniYetki.setKullaniciadi(musteri.getKullaniciadi());
        yeniYetki.setYetki("ROLE_USER");
        session.saveOrUpdate(yeniKullanici);
        session.saveOrUpdate(yeniYetki);

        Sepet yeniSepet = new Sepet();
        yeniSepet.setMusteri(musteri);
        musteri.setSepet(yeniSepet);
        session.saveOrUpdate(musteri);
        session.saveOrUpdate(yeniSepet);

        session.flush();
    }

    public Musteri getMusteriById(int musteriId) {
        Session session = sessionFactory.getCurrentSession();
        return (Musteri) session.get(Musteri.class, musteriId);
    }

    public List<Musteri> getTumMusteriler() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Musteri");
        List<Musteri> musteriListe = query.list();
        return musteriListe;
    }
}

package com.gozlukdukkanim.service.Impl;

import com.gozlukdukkanim.dao.SepetItemDao;
import com.gozlukdukkanim.model.Sepet;
import com.gozlukdukkanim.model.SepetItem;
import com.gozlukdukkanim.service.SepetItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by memoricAb on 2.02.2017.
 */
@Service
public class SepetItemServiceImpl implements SepetItemService {
    @Autowired
    private SepetItemDao sepetItemDao;

    public void sepetItemEkle(SepetItem sepetItem) {
        sepetItemDao.sepetItemEkle(sepetItem);

    }

    public void sepetItemSil(SepetItem sepetItem) {
        sepetItemDao.sepetItemSil(sepetItem);
    }

    public void sepetBosalt(Sepet sepet) {
        sepetItemDao.sepetBosalt(sepet);

    }

    public SepetItem getSepetItemByUrunId(int urunId) {
        return sepetItemDao.getSepetItemByUrunId(urunId);
    }
}

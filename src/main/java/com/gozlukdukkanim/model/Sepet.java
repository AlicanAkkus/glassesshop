package com.gozlukdukkanim.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by memoricAb on 22.01.2017.
 */
public class Sepet {
    private String sepetId;
    private Map<String, SepetItem> sepetItemler;
    private double tumToplamFiyat;

    public Sepet() {
        sepetItemler = new HashMap<String, SepetItem>();
        tumToplamFiyat = 0;
    }

    public Sepet(String sepetId) {
        this();
        this.sepetId = sepetId;

    }

    public String getSepetId() {
        return sepetId;
    }

    public void setSepetId(String sepetId) {
        this.sepetId = sepetId;
    }

    public Map<String, SepetItem> getSepetItemler() {
        return sepetItemler;
    }

    public void setSepetItemler(Map<String, SepetItem> sepetItemler) {
        this.sepetItemler = sepetItemler;
    }

    public double getTumToplamFiyat() {
        return tumToplamFiyat;
    }

    public void setTumToplamFiyat(double tumToplamFiyat) {
        this.tumToplamFiyat = tumToplamFiyat;
    }


    public void sepetItemEkle(SepetItem item) {
        String urunId = item.getUrun().getUrunId();


        if (sepetItemler.containsKey(urunId)) {
            SepetItem varolanSepetItem = sepetItemler.get(urunId);
            varolanSepetItem.setAdet(varolanSepetItem.getAdet() + item.getAdet());
            sepetItemler.put(urunId, varolanSepetItem);
        } else {
            sepetItemler.put(urunId, item);
        }

        guncelleTumToplamFiyat();

    }

    public void sepetItemSil(SepetItem item) {
        String urunId = item.getUrun().getUrunId();
        sepetItemler.remove(urunId);
        guncelleTumToplamFiyat();

    }

    public void guncelleTumToplamFiyat() {
        tumToplamFiyat = 0;
        for (SepetItem item : sepetItemler.values()) {
            tumToplamFiyat = tumToplamFiyat + item.getToplamFiyat();

        }

    }

}

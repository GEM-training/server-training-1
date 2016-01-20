package com.gem.nhom1.dao.impl;

import com.gem.nhom1.dao.PromotionDao;
import com.gem.nhom1.model.Dealer;
import com.gem.nhom1.model.Promotion;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nghicv on 20/01/2016.
 */

@Repository
public class PromotionDaoImpl extends AbstractDao<Integer, Promotion> implements PromotionDao{

    public void save(Promotion promotion) {
        persist(promotion);
    }

    public List<Promotion> getListPromotion() {
        return getSession().createQuery("from Promotion").list();
    }

    public Promotion getPromotionById(int id) {
        Promotion promotion = getByKey(id);
        return promotion;
    }
}
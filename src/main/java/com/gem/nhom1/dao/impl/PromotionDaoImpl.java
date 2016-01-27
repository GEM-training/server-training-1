package com.gem.nhom1.dao.impl;

import com.gem.nhom1.dao.PromotionDao;
import com.gem.nhom1.model.Promotion;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nghicv on 20/01/2016.
 */

@Repository
public class PromotionDaoImpl extends AbstractDao<Integer, Promotion> implements PromotionDao {

    public int insert(Promotion promotion){
        return insertObject(promotion);
    }

    public List<Promotion> getList() {
        return getSession().createQuery("from Promotion").list();
    }

    public Promotion getById(int id) {
        return getByKey(id);
    }

    public void delete(int id) {
        deleteObject(getById(id));
    }

    public void update(Promotion promotion){
        updateObject(promotion);
    }
}

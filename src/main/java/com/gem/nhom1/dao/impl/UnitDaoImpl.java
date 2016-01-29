package com.gem.nhom1.dao.impl;

import com.gem.nhom1.config.HibernateConfiguration;
import com.gem.nhom1.dao.UnitDao;
import com.gem.nhom1.model.entities.Unit;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vanhop on 1/18/16.
 */

@Repository
public class UnitDaoImpl extends AbstractDao<Integer, Unit> implements UnitDao {

    public Unit getById(int id) {
        return getByKey(id);
    }

    public List<Unit> getList(int page) {
        Query query = getSession().createQuery("from " + Unit.class.getName());
        query.setFirstResult((page - 1) * HibernateConfiguration.pageSize);
        query.setMaxResults(HibernateConfiguration.pageSize);

        return query.list();
    }

    public int insert(Unit unit){
        return insertObject(unit);
    }

    public void delete(int id) throws Exception {
        deleteObject(getByKey(id));
    }

    public void update(Unit unit){
        updateObject(unit);
    }
}


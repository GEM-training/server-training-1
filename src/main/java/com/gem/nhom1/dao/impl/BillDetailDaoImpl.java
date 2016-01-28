package com.gem.nhom1.dao.impl;

import com.gem.nhom1.config.HibernateConfiguration;
import com.gem.nhom1.dao.BillDetailDao;
import com.gem.nhom1.model.BillDetail;
import com.gem.nhom1.model.BillDetailId;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by vanhop on 1/20/16.
 */
@Repository
@Transactional
public class BillDetailDaoImpl extends AbstractDao<BillDetailId , BillDetail> implements BillDetailDao {
    public BillDetail getById(BillDetailId id) {
        return getByKey(id);
    }

    public List<BillDetail> getList(int page)
    {
        Query query =  getSession().createQuery("from BillDetail");
        query.setFirstResult((page - 1) * HibernateConfiguration.pageSize);
        query.setMaxResults(HibernateConfiguration.pageSize);

        return query.list();
    }

    public BillDetailId insert(BillDetail billDetail) {
        return insertObject(billDetail);
    }

    public boolean delete(BillDetailId id) {
        try {
            deleteObject(getByKey(id));
        } catch (Exception e){
            return false;
        }
        return true;
    }

    public void update(BillDetail billDetail) {
        updateObject(billDetail);
    }
}

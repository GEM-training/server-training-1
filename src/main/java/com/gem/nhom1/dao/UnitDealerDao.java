package com.gem.nhom1.dao;

import com.gem.nhom1.model.Staff;
import com.gem.nhom1.model.UnitDealer;
import com.gem.nhom1.model.UnitDealerId;

import java.util.List;

/**
 * Created by phuongtd on 21/01/2016.
 */
public interface UnitDealerDao {
    public UnitDealer getById(UnitDealerId id);
    public List<UnitDealer> getList();
    public UnitDealerId insert(UnitDealer unitDealer);
    public void delete(UnitDealerId id) throws Exception;
    public void update(UnitDealer unitDealer);

}

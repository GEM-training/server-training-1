package com.gem.nhom1.service;

import com.gem.nhom1.model.Staff;
import com.gem.nhom1.model.UnitDealer;
import com.gem.nhom1.model.UnitDealerId;

import java.util.List;

/**
 * Created by vanhop on 1/21/16.
 */
public interface UnitDealerService {

    public UnitDealer getById(UnitDealerId id);
    public List<UnitDealer> getList();
    public UnitDealerId insert(UnitDealer unitDealer);
    public void delete(UnitDealerId id) throws Exception;
    public void update(UnitDealer unitDealer);

}

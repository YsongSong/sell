package com.lwaiting.repository;

import com.lwaiting.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单
 * Created by Yang.
 * 2018/7/11 0011 23:34
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String>{

    /** 按买家Openid查询订单 */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}

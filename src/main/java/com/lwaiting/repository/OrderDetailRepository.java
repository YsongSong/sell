package com.lwaiting.repository;

import com.lwaiting.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Yang.
 * 2018/7/11 0011 23:38
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    /** 按订单id查询(orderId) */
    List<OrderDetail> findByOrderId(String orderId);
}

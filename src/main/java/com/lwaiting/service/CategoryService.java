package com.lwaiting.service;

import com.lwaiting.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by Yang
 * 2018-05-09 10:12
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}

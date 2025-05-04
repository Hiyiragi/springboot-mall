package com.tongus.springbootmall.dao;

import com.tongus.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}

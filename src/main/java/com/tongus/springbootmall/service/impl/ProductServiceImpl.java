package com.tongus.springbootmall.service.impl;

import com.tongus.springbootmall.dao.ProductDao;
import com.tongus.springbootmall.dao.impl.ProductDaoImpl;
import com.tongus.springbootmall.model.Product;
import com.tongus.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;


    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}

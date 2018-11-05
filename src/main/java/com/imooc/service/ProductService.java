package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品
 * Created by x-liu
 * 2018/11/4 15:07
 */
@Service
public interface ProductService {

    ProductInfo findOne(String productId);


    /**
     * 查询所有上架商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    // 加库存

    // 减库存
}

package com.jhkim2.udemywebfluxproductservice.util;

import com.jhkim2.udemywebfluxproductservice.dto.ProductDto;
import com.jhkim2.udemywebfluxproductservice.entity.Product;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {

    public static ProductDto toDto(Product product){
        ProductDto dto = new ProductDto();
        // 이런식으로 하려면 오래걸리니까 라이브러리를 사용하도록 하자
//        dto.setDescription(product.getDescription());
        BeanUtils.copyProperties(product, dto);
        return dto;
    }

    public static Product toEntity(ProductDto productDto){
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        return product;
    }

}

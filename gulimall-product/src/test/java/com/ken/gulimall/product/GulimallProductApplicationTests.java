package com.ken.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ken.gulimall.product.entity.BrandEntity;
import com.ken.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Resource
    private BrandService brandService;
    @Test
    void contextLoads() {
    }

    @Test
    void testInsert(){
//        BrandEntity entity=new BrandEntity();
//        entity.setName("光大");
//        entity.setLogo("");
//        entity.setDescript("");
//        entity.setShowStatus(0);
//        entity.setFirstLetter("");
//        entity.setSort(0);
//
//        brandService.save(entity);

        List<BrandEntity> list= brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id",2));
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }


}

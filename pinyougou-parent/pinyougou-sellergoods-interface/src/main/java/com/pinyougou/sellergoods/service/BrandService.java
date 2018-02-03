package com.pinyougou.sellergoods.service;

import java.util.List;

import com.pinyougou.pojo.TbBrand;
import entity.PageResult;

/**
 * 品牌接口
 *
 * @author Administrator
 */
public interface BrandService {
    /**
     * 返回所有信息
     *
     * @return
     */
    public List<TbBrand> listOfBrand();

    /**
     * 返回分页列表
     *
     * @return
     */
    public PageResult findPage(int pageNum, int pageSize);
}

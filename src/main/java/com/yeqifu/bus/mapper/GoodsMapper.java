package com.yeqifu.bus.mapper;

import com.yeqifu.bus.entity.Goods;
import com.yeqifu.bus.vo.GoodsStock;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * InnoDB free: 9216 kB; (`providerid`) REFER `warehouse/bus_provider`(`id`) Mapper 接口
 * </p>
 *
 * @author luoyi-
 * @since 2019-12-06
 */
public interface GoodsMapper extends BaseMapper<Goods> {

	List<GoodsStock> findAllGoodsStock();
	
}

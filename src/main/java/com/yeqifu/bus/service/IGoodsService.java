package com.yeqifu.bus.service;

import com.yeqifu.bus.entity.Goods;
import com.yeqifu.bus.vo.GoodsStock;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * InnoDB free: 9216 kB; (`providerid`) REFER `warehouse/bus_provider`(`id`) 服务类
 * </p>
 *
 * @author luoyi-
 * @since 2019-12-06
 */
public interface IGoodsService extends IService<Goods> {

	/**获取商品库存*/
	List<GoodsStock> listGoodsStock();
	
}

package com.yeqifu.bus.vo;

import com.yeqifu.bus.entity.Goods;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品库存
 * @author lroy
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class GoodsStock extends Goods{
	
	 private Integer page=1;
	 private Integer limit=10;
	 private Integer stock;

}

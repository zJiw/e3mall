package cn.e3.manager.service;

import cn.e3.pojo.TbItem;

public interface ItemService {

		/**
		 * 根据Id查询商品数据
		 * 参数：Long itemId
		 * 返回值：TbItem
		 */
	public TbItem findItemByID(Long itemId);
}

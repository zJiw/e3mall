package cn.e3.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;
import cn.e3.pojo.TbItem;

@Service
public class ItemServiceImpl implements ItemService {
	
	//注入商品mapper借口代理对象
	@Autowired
	private TbItemMapper itemMapper;
	
	public TbItem findItemByID(Long itemId) {
		// TODO Auto-generated method stub
		return itemMapper.selectByPrimaryKey(itemId);
	}

}

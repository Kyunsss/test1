package com.green.menus.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.menus.dao.MenuDao;
import com.green.menus.service.MenuService;
import com.green.menus.vo.MenuVo;


@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	
	@Autowired
	private MenuDao	menuDao; 

	@Override
	public List<MenuVo> getMenuList() {
		List<MenuVo>	menuList = menuDao.getMenuList();
		return menuList;
	}

	@Override
	public void insertMenu(MenuVo menuVo) {
		
		menuDao.insertMenu( menuVo );
	}

}

package com.green.menus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.menus.service.MenuService;
import com.green.menus.vo.MenuVo;

@Controller
@RequestMapping("/Menu")
public class MenuController {
	
	@Autowired
	private MenuService	menuService;
	
	//Menus/List
	@RequestMapping("/List")
	public String	list( Model model) {
		
		List<MenuVo> menuList	=	menuService.getMenuList();
		
		model.addAttribute("menuList", menuList);
		
		
		
		return	"menu/list";	// WEB-INF/VIEWS/MENUS/list.jsp
		
	}
	//Menus/WriteForm
	@RequestMapping("/WriteForm")
	public	String	writeForm() {
		
		
		
		return	"menus/write";
		
	}
	//Menus/Write
	@RequestMapping("/Write")
	public	String	write(MenuVo menuVo) {
		
		System.out.println("menu Controller write menuVo"+menuVo);
		menuService.insertMenu(menuVo);
		return	"redirect:/menus/write";
		
	}
	
	//Menus/UpdateForm
	@RequestMapping("/UpdateForm")
	public	String	updateForm() {
		
		
		
		return	"menus/update";
		
	}
	
	
}


























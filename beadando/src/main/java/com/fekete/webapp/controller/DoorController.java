package com.fekete.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fekete.webapp.dao.DoorRepo;
import com.fekete.webapp.model.Door;

public class DoorController {

	@Autowired
	DoorRepo repo;

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/addDoor")
	public String addDoor(Door d) {
		repo.save(d);
		return "index.jsp";
	}

	@RequestMapping("/getDoor")
	public ModelAndView getDoor(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("showDoor.jsp");
		Door d = repo.findById(id).orElse(new Door());
		mav.addObject(d);
		return mav;
	}
}
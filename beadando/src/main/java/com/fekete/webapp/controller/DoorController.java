package com.fekete.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fekete.webapp.dao.DoorRepo;
import com.fekete.webapp.model.Door;

@Controller
public class DoorController {

	@Autowired
	DoorRepo repo;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/addDoor")
	public String addDoor(Door door) {
		repo.save(door);
		return "index";
	}

	@RequestMapping("/getDoor")
	public ModelAndView getDoor(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("showDoor");
		Door door = repo.findById(id).orElse(new Door());
		mav.addObject(door);
		return mav;
	}

}
package com.rai.ExpenseTrackerBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rai.ExpenseTrackerBackEnd.model.ExpenseTracker;
import com.rai.ExpenseTrackerBackEnd.service.ExpenseTrackerService;

@RestController
@RequestMapping("/api/v1")
public class ExpenseTrackerController {

	@Autowired
	private ExpenseTrackerService service;
	
	@PostMapping("/add-expense")
	public String saveRecord(@RequestBody ExpenseTracker expense) {
		service.saveTrackerRecord(expense);
		return "One Record added with id: " + expense.getId();
	}
	
	@GetMapping("/find-all-record")
	public List<ExpenseTracker> getAllRecord(){
		return service.findAllRecords();
	}
}

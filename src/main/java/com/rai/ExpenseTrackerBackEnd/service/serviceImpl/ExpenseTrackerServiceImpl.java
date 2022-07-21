package com.rai.ExpenseTrackerBackEnd.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rai.ExpenseTrackerBackEnd.model.ExpenseTracker;
import com.rai.ExpenseTrackerBackEnd.repository.ExpenseTrackerRepository;
import com.rai.ExpenseTrackerBackEnd.service.ExpenseTrackerService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExpenseTrackerServiceImpl implements ExpenseTrackerService{

	@Autowired
	private ExpenseTrackerRepository repo;
	
	public void saveTrackerRecord(ExpenseTracker expense) {
		repo.save(expense);
	}
	
	public List<ExpenseTracker> findAllRecords(){
		return repo.findAll();
	}
}

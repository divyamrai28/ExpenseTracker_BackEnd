package com.rai.ExpenseTrackerBackEnd.service;

import java.util.List;

import com.rai.ExpenseTrackerBackEnd.model.ExpenseTracker;

public interface ExpenseTrackerService {
	void saveTrackerRecord(ExpenseTracker expense);
	List<ExpenseTracker> findAllRecords();
}

package com.rai.ExpenseTrackerBackEnd.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.rai.ExpenseTrackerBackEnd.model.ExpenseTracker;

@Repository
public interface ExpenseTrackerRepository extends MongoRepository<ExpenseTracker, Integer>{

}

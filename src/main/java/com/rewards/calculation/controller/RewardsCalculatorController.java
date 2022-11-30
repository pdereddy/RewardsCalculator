/**
 * 
 */
package com.rewards.calculation.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.calculation.model.Transactions;
import com.rewards.calculation.service.RewardsCalculatorService;

@RestController
public class RewardsCalculatorController {

	@Autowired
	RewardsCalculatorService dollarRewardsService;
	
		@RequestMapping(value = "/calculatedollarrewards")
		public ResponseEntity<Map> ComputeRewards(@RequestBody List<Transactions> transactions) {
			return dollarRewardsService.calculatePoints(transactions);
		}
	}

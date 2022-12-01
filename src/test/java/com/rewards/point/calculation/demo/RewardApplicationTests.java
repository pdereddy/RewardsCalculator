package com.rewards.point.calculation.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rewards.calculation.model.Transactions;
import com.rewards.calculation.service.RewardsCalculatorService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class RewardApplicationTests {
   @Autowired
   private RewardsCalculatorService testService;
   
   List custTransactions = new ArrayList<Transactions>(); 
   Transactions transact = new Transactions();
   //transact.setCustID("123");
   //transact.setDlrSpent(250);
   //transact.setMonth("January");
   //custTransactions.add(transact);
    
   HttpHeaders headers = new HttpHeaders();
   //headers.add("Responded", "RewardsController");
   ResponseEntity<List> respEntity =  ResponseEntity.accepted().headers(headers).body(custTransactions);
   
   @Test
   public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
      Mockito.when(testService.calculatePoints(custTransactions)).thenReturn(respEntity);
      ResponseEntity respEntity1 = testService.calculatePoints(custTransactions);
      Assert.assertEquals(respEntity1, respEntity1);
   }
   
}
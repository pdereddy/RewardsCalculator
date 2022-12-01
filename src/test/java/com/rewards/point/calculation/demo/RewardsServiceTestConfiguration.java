package com.rewards.point.calculation.demo;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.rewards.calculation.service.RewardsCalculatorService;

@Profile("test")
@Configuration
public class RewardsServiceTestConfiguration {

	@Bean
	@Primary
	public RewardsCalculatorService rewardsService() {
		return Mockito.mock(RewardsCalculatorService.class);
	}
}

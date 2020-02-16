package com.limitsService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class LimitConf {
	
	@Value("${limits-service.min}")
	private int min;
	@Value("${limits-service.max}")
	private int max;
	
	public LimitConf() {
	}
	
	public LimitConf(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	
	
}

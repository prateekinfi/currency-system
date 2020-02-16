package com.limitsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private LimitConf lconf;
	
	@Autowired
	private LimitsConfiguration limitconginguration;
	
	@GetMapping("/getlimits")
	public LimitConf getLimitsFromConfig() {
		return new LimitConf(lconf.getMin(),lconf.getMax());
	}
	
	@GetMapping("/limits")
	public LimitConf getLimitsFromConfigPropeties() {
		return new LimitConf(limitconginguration.getMin(),limitconginguration.getMax());
	}
	

}

package com.ce.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
	private int seed;
	
	public int next() {
		return ++seed;
	}
}
	
package com.ojodev.microservices.limitsservice.bean;

public class LimitConfiguration {

	private int maximun;
	private int minimun;

	public LimitConfiguration() {
		super();
	}
	public LimitConfiguration(int maximun, int minimun) {
		super();
		this.maximun = maximun;
		this.minimun = minimun;
	}
	public int getMaximun() {
		return maximun;
	}
	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}
	public int getMinimun() {
		return minimun;
	}
	public void setMinimun(int minimun) {
		this.minimun = minimun;
	}
	@Override
	public String toString() {
		return "LimitConfiguration [maximun=" + maximun + ", minimun=" + minimun + "]";
	}
	
	
	
	
	
}

package com.erwindev.job.process;

public abstract class ProcessImpl implements Process{
	protected String[] args;
	
	public void setArgs(String[] args) {
		this.args = args;
	}
}

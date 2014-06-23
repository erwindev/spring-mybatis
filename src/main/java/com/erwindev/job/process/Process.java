package com.erwindev.job.process;

public interface Process {
	public void setArgs(String args[]);
	public void execute() throws Exception;
}

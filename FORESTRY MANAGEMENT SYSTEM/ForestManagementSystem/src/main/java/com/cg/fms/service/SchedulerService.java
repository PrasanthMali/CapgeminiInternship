package com.cg.fms.service;

import java.util.List;

import com.cg.fms.entity.Scheduler;

public interface SchedulerService {
	public Scheduler getScheduler(String schedulerId);

	public boolean addScheduler(Scheduler scheduler);

	public boolean updateScheduler(Scheduler scheduler);

	public boolean deleteScheduler(String schedulerId);

	public List<Scheduler> getAllSchedulers();
}

package com.cg.j8.ui;

import java.time.LocalTime;
import java.time.ZoneId;

public class ZoneApp {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalTime singaporeTime = LocalTime.now(ZoneId.of("Asia/Singapore"));
		System.out.println(singaporeTime);
	}
}
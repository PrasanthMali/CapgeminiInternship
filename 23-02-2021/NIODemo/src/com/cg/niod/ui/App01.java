package com.cg.niod.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App01 {
	public static void main(String[] args) {
		Path file = Paths.get("./names.txt");
		try {
			List<String> names = Files.readAllLines(file);
			for(String name : names) {
				System.out.println(name);
			}
		} catch (IOException excep) {
			System.out.println(excep.getMessage());
		}
		
	}
}
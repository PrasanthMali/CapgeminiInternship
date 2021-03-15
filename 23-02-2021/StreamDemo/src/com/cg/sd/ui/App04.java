package com.cg.sd.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cg.sd.model.Item;
import com.cg.sd.model.ItemCategory;

public class App04 {

	public static void main(String[] args) {
		List<Item> itemsList = new ArrayList<> (
				Arrays.asList(
					new Item(101, "Apples", 250, LocalDate.now(), ItemCategory.READY_TO_EAT),
					new Item(102, "Mangos", 350, LocalDate.now(), ItemCategory.READY_TO_EAT),
					new Item(104, "Green Apples", 450, LocalDate.now(), ItemCategory.READY_TO_EAT),
					new Item(103, "Litchie", 550, LocalDate.now(), ItemCategory.READY_TO_EAT)
				)
		);
		
		itemsList.stream().forEach(System.out::println);
		System.out.println("----------------------------------------------");
		List<String> itemNames = itemsList.stream()
				.map(item -> item.getName())
				.collect(Collectors.toList());
		System.out.println(itemNames);
		System.out.println("----------------------------------------------");
		
		/* costly item */
		Item costliestItem = itemsList.stream()
			.reduce((item1, item2)->(item1.getPrice() > item2.getPrice() ? item1 : item2)).orElse(null);
		System.out.println(costliestItem);
		
		/* another way - without OrElse */
		Optional<Item> cheaperItem = itemsList.stream()
				.reduce((item1, item2)->(item1.getPrice() < item2.getPrice() ? item1 : item2));
		if (cheaperItem.isPresent()) {
			System.out.println(cheaperItem);
		} else {
			System.out.println("No such item");
		}
	}

}
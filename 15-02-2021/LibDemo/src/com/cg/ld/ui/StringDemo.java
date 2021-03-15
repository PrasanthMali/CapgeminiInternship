package com.cg.ld.ui;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Java language";
		System.out.println(str.length());
		str.toUpperCase();
		System.out.println(str);
		str.toLowerCase();
		System.out.println(str);
		System.out.println(str.indexOf("a"));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.startsWith("Java"));
		System.out.println(str.endsWith("age"));
		System.out.println(str.contains("lan"));
		System.out.println(str.charAt(5));
		System.out.println(str.substring(0, 4));
		
		String str2 = "java";
		String str3 = "java";
		
		System.out.println(str2 == str3);
		System.out.println(str2.equals(str3));
		
		String str4 = new String("java");
		String str5 = new String("Java");
		System.out.println(str4 == str5);
		System.out.println(str4.equals(str5));
		System.out.println(str4.equalsIgnoreCase(str5));
		
		String str6 = "cat";
		String str7 = "cot";
		System.out.println(str6.compareTo(str7));
		
		int a = 10;
		String str8 = String.valueOf(a);
		
		int x = 100;
		double y = 6.7;

		String str9 = String.format("%d\t%f\t%s", x,y,str7);
		System.out.println(str9);
		
		String str10 = "java is strictly, but partially object-oriented language";
//		String [] parts = str10.split(" ");
//		for(int i = 0; i < parts.length; i++) {
//			System.out.println(parts[i]);
//		}
		
		for(String part : str10.split(" ")) {
			System.out.println(part);
		}
		
		String str11 = "java";
		String str12 = "8.0";
		String str13 = str11 + "Version" + str12;
		// String str13 = str11.concat(str12);
		System.out.println(str13);
		
		str11.replace("j", "k");
		System.out.println(str11);


	}

}
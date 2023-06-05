package practice;

import java.util.ArrayList;

import ArrayList.NewsPaper;

public class ForEach1 {

	public static void main(String[] args) {
		ArrayList<Object>	a = new ArrayList<>();
		a.add(12);
		a.add('s');
		a.add(true);
		a.add(new NewsPaper());
		a.add("Jspiders");
		
		for (Object object : a) {
			System.out.println(object);
		}
	}
	
}

package arrayBasedLists;

import java.util.*;

public class FourLetterWords {

	public static void main(String[] args) {

		ArrayList<String>words = new ArrayList<String>();
		
		String word;
		
		words.add("away");
		words.add("home");
		words.add("listen");
		words.add("blues");
		words.add("yellow");
		words.add("pink");
		words.add("orange");
		words.add("people");
		words.add("romaine");
		words.add("jets");
		
		for(int i = 0; i < words.size(); i++){
			word = words.get(i);
			if(word.length() == 4){
				System.out.println(word);
			}
		}
		
		Iterator<String>iterator = words.iterator();
		while(iterator.hasNext()){
			word = iterator.next();
			if(word.length() == 4){
				System.out.println(word);
			}
		}
		
		for(String s: words){
			if(s.length() == 4){
				System.out.println(s);
			}
		}
	}
}

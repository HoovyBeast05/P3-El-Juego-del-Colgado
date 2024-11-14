package colgado;

import java.util.Random;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		String[] words = {"cono", "pene", "puta", "madre"};
		
		int rnd = new Random().nextInt(words.length);
		
		String rndWord = words[rnd];
		
		System.out.println(rndWord);

	}

}

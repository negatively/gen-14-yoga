package com.milenian;

import java.util.LinkedHashMap;
import java.util.Map;

public class Soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = "aku belajar pemrogaman";
		Map<Character, Integer> mapKata = new LinkedHashMap<>();
		mapKata.put('a', 0);
		mapKata.put('i', 0);
		mapKata.put('u', 0);
		mapKata.put('e', 0);
		mapKata.put('o', 0);
		
		for(char k: mapKata.keySet()) {
			int nKata = 0;
			for(int i=0; i<kalimat.length(); i++) {
				if(k == kalimat.charAt(i)) nKata++;
			}
			mapKata.put(k, nKata);
			System.out.printf("%s : %d\n",k, mapKata.get(k));
		}

	}

}

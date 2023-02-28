package com.milenian;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {

		String barangRekomen = "";
		int maxHarga = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Berapa uang yang anda miliki : ");
		int uang = scan.nextInt();
		scan.close();
		
		Map<String, Integer> daftarBarang = new HashMap<>();
		daftarBarang.put("Oreo", 6000);
		daftarBarang.put("Tanggo", 5000);
		daftarBarang.put("Buavita", 7000);
		daftarBarang.put("Aqua", 3000);
		
		for(String k: daftarBarang.keySet()) {
			int harga = daftarBarang.get(k);
			if(harga <= uang && maxHarga < harga) {
				barangRekomen = k;
				maxHarga = harga;
			}
			
		}
		
		if(maxHarga > 0) {
			System.out.printf("Dengan uang Rp%d yang anda miliki\n", uang);
			System.out.printf("Kami merekomendasikan %s seharga Rp%d",barangRekomen, maxHarga);			
		} else {
			System.out.println("Maaf uang anda tidak mencukupi");
		}
		
		
		
		

	}

}

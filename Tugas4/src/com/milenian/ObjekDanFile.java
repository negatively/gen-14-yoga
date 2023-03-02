package com.milenian;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjekDanFile {

	public static void main(String[] args) {
		Barang b1 = new Barang("Oreo", 6000, 3);
        Barang b2 = new Barang("Chitato", 5000, 5);
        Barang b3 = new Barang("Ovaltine", 8000, 9);
        Barang b4 = new Barang("Pocari", 7000, 6);
        
        try {
        	File objekBarang = new File(".\\objekBarang.txt");
        	FileOutputStream f = new FileOutputStream(objekBarang);
        	ObjectOutputStream o = new ObjectOutputStream(f);
        	
        	o.writeObject(b1);
        	o.writeObject(b2);
        	o.writeObject(b3);
        	o.writeObject(b4);
        	
        	o.close();
        	f.close();
        	
        	FileInputStream fi = new FileInputStream(objekBarang);
        	ObjectInputStream oi = new ObjectInputStream(fi);
        	
        	Barang ob1 = (Barang) oi.readObject();
        	Barang ob2 = (Barang) oi.readObject();
        	Barang ob3 = (Barang) oi.readObject();
        	Barang ob4 = (Barang) oi.readObject();
        	
        	System.out.println(ob1);
        	System.out.println(ob2);
        	System.out.println(ob3);
        	System.out.println(ob4);
        	
        	oi.close();
        	fi.close();
        }catch(FileNotFoundException e) {
        	System.out.println("File Not Found");
        	e.printStackTrace();
        }catch(IOException e) {
        	System.out.println("Error Initializing Stream");
        	e.printStackTrace();
        }catch(ClassNotFoundException e) {
        	e.printStackTrace();
        }

	}

}

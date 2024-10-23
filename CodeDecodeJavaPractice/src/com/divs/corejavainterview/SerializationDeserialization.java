package com.divs.corejavainterview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employe e=new Employe(1, "divs");

		//Serialization
//		FileOutputStream fileOutputStream=new FileOutputStream("C:\\files\\objectserializable.ser");
//		ObjectOutputStream objectOutputStream= new ObjectOutputStream(fileOutputStream);
//		objectOutputStream.writeObject(e);
//		objectOutputStream.close();
//		fileOutputStream.close();
		
		//Deserialization
		FileInputStream fileInputStream=new FileInputStream("C:\\files\\objectserializable.ser");
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		Employe obj=(Employe) objectInputStream.readObject();
		System.out.println(obj.getName());
		objectInputStream.close();
		fileInputStream.close();
		
		
	}

}

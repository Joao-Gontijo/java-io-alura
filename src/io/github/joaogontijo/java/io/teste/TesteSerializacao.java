package io.github.joaogontijo.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
//		//Serializando
//		String nome = "João Victor";
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializando.bin"));
//		oos.writeObject(nome);
//		oos.close();
		
		//desserializando
		ObjectInputStream ios = new ObjectInputStream(new FileInputStream("serializando.bin"));
		String nome = (String) ios.readObject();
		System.out.println(nome);
	}
}

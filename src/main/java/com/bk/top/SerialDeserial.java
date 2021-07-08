package com.bk.top;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialDeserial {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		SerialDeserial s = new SerialDeserial();
		s.serialise();
		s.deserialise();
		
		
	}
	
	
  public void serialise() throws IOException {
	  EmployeeSe e = new EmployeeSe("hi",100);
	  FileOutputStream file = new FileOutputStream("c:/temp/test.txt");
	  ObjectOutputStream out = new ObjectOutputStream(file);
	  out.writeObject(e);
	  out.close();
  }

  public void deserialise() throws IOException,ClassNotFoundException {
	  FileInputStream infile = new FileInputStream("c:/temp/test.txt");
	  ObjectInputStream in = new ObjectInputStream(infile);
	  EmployeeSe e = (EmployeeSe) in.readObject();
	  System.out.println(e.name);
	  in.close();
	  
  }

}


class EmployeeSe implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	int id;
	
	public EmployeeSe(String name, int id) {
		this.name = name;
		this.id = id;
	}
}

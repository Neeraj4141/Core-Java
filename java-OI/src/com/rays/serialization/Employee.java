package com.rays.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	public int id;
	public String name;
	public String place;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String place) {
		this.name = name;
		this.id = id;
		this.place = place;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(id);
		out.writeObject(place);

	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		id = (int) in.readObject();
		// place = (String)in.readObject();

	}

	public String toString() {
		return "id = " + id + " name = " + name + " place = " + place;
	}

}

package com.rays.collection.equalsandhashcode;

public class Student {
	
	public String name;
	public int id;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if(!(obj instanceof Student)) {
			return false;
		}
		Student s =  (Student)obj;
		return this.name == s.name &&  this.id== s.id;
		
	}
	@Override
	public int hashCode() {
		String value = name + id;
		return value.hashCode();
	}

}

package com.rays.oop.inheritance;

public class TestPerson {
	public static void main(String[] args) {
		
		System.out.println("---------doctor---------");
		
		Doctor d= new Doctor();
		
		d.setName("Dr Mewada ji");
		d.setAddress("Shujalpur");
		d.setAge(45);
		d.setSpeclist("cancer surgery");
		d.setSurgery("mouth cancer surgery");
		d.setPassion("save lifes");
		d.setHobby("playing volly ball");
		
		System.out.println("Name = "+d.getName());
		System.out.println("address = "+d.getAddressa());
		System.out.println("age = "+d.getAge());
		System.out.println("speclist = "+d.getSpeclist());
		System.out.println("surgery = "+d.getSurgery());
		System.out.println("passion = "+d.getPassion());
		System.out.println("hobby = "+d.getHobby());
		
		System.out.println("---------student---------");
		
		Student s = new Student();
		
		s.setName("neeraj mewada");
		s.setAge(23);
		s.setAddress("dehandi gau");
		s.setInstitute("rays tecnology");
		s.setSubject("java");
		s.setPassion("change the world by coding");
		s.setHobby("playing cricket");
		
		System.out.println("Name = "+s.getName());
		System.out.println("address = "+s.getAddressa());
		System.out.println("age = "+s.getAge());
		System.out.println("institute = "+s.getInstitute());
		System.out.println("subject = "+s.getSubject());
		System.out.println("passion = "+s.getPassion());
		System.out.println("hobby = "+s.getHobby());
		
		System.out.println("--------enginear--------");
		
		Enginear e = new Enginear();
		
		e.setName("darbar ji");
		e.setAddress("indore");
		e.setAge(24);
		e.setCompany("tata tec");
		e.setFeild("software");
		e.setPassion("make agreat world");
		e.setHobby("playing chess");
		
		System.out.println("Name = "+e.getName());
		System.out.println("address = "+e.getAddressa());
		System.out.println("age = "+e.getAge());
		System.out.println("cpmpany = "+e.getCompany());
		System.out.println("feild = "+e.getFeild());
		System.out.println("passion = "+e.getPassion());
		System.out.println("hobby = "+e.getHobby());
		
		
		
		
	}

}

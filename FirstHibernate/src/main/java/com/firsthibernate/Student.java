package com.firsthibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Student_Details")
public class Student {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		
		@Column(length = 45 , name = "student_name" , nullable = false)
		private String name;
		@Column(length = 45 , name = "student_city" , nullable = false)
		private String city;
		
		private Certificate certificate;
		public Certificate getCertificate() {
			return certificate;
		}
		public void setCertificate(Certificate certificate) {
			this.certificate = certificate;
		}
		public Student() {
			super();
		}
		public Student(int id, String name, String city) {
			super();
			this.id = id;
			this.name = name;
			this.city = city;
		}
		public Student(String name, String city) {
			super();
			this.name = name;
			this.city = city;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
		}
		
}

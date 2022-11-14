package com.ex;

import java.util.List;


public class Student {
	
		private int sid;
		private String sname;
		private int marks;
		private String branch;
		private List course;
		
		
		public List getCourse() {
			return course;
		}
		public void setCourse(List course) {
			this.course = course;
		}
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String getBranch() {
			return branch;
		}
		public void setBranch(String branch) {
			this.branch = branch;
		}
}

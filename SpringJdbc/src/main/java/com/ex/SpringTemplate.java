package com.ex;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringTemplate {
	
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	//i have record i have to retrieve it so i need to select method 
	public void select() {
	List li = jt.	queryForList("select * from student " );
	Iterator i = li.iterator(); //factory method
	while (i.hasNext()) {
		System.out.println(i.next());
	}	
	}
	

}

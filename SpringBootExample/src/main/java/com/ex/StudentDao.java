package com.ex;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository 
public class StudentDao extends JdbcDaoSupport {
	
	@Autowired
	DataSource datasource; 
	
	@PostConstruct
	void intialize() {
		setDataSource(datasource);
	}

	public void insert(Student st) {
		getJdbcTemplate().execute("insert into Student values("+st.getSid()+" , "+st.getMarks()+" ,' "+st.getSname()+"')");
	}
	
}

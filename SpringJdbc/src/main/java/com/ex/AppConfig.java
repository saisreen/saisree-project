package com.ex;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackageClasses=SpringTemplate.class)
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/task");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJt(DataSource dataSource) {
		JdbcTemplate jt=new JdbcTemplate(dataSource);
		jt.setResultsMapCaseInsensitive(true);
		return jt;
		
	}
	
	@Bean(value="getSpringTemplate")
	public SpringTemplate getSpringTemplate(JdbcTemplate jt) {
		SpringTemplate st= new SpringTemplate();
		st.setJt(jt);
		return st;
		
		
	}
}

package com.ex;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;


@Configuration
@ComponentScan(basePackageClasses=SpringTemplate.class)
public class ApplicationConfig {
	
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
	public LocalSessionFactoryBean getSessionFactory()  {
		LocalSessionFactoryBean sb = new LocalSessionFactoryBean();
		sb.setDataSource(getDataSource());
		Properties pr = new Properties();
		pr.put("hibernate.show_sql", "true");
		pr.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		pr.put("hibernate.hbm2ddl.auto", "update");
		
		sb.setHibernateProperties(pr);
		sb.setAnnotatedClasses(Student.class);
		return sb;
	}
	
	@Bean(value="getSpringTemplate")
	public SpringTemplate getSpringTemplate() {
		SpringTemplate st= new SpringTemplate();
		st.setSf(getSessionFactory().getObject());
		return st;
		
		
	}

}

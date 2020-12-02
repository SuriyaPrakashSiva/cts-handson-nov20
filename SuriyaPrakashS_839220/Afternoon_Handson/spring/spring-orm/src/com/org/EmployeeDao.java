package com.org;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public String fetchDateTime() {
		return LocalDateTime.now().toString();
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> fetchAllEmployees() {
		return (List<Employee>) hibernateTemplate.find("select e from Employee e");
	}
	
	public Employee fetchEmployee(int id) {
		return hibernateTemplate.get(Employee.class, id); // select * from employee where id = ?
	}
}

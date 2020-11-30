package com.org;

public class JpaImpl implements EmployeeDao{
	private DBConfig dbconfig;
	
	public JpaImpl(DBConfig dbconfig) {
		//super();
		this.dbconfig = dbconfig;
	}

	public JpaImpl() {
		//super();
	}

	//@Override
	public void store() {
		System.out.println("store() done in jpa");
		
		System.out.println("DBConfig DBName: "+dbconfig.getDbname()+", DBurl: "+dbconfig.getDburl());
	}

	public void setDbconfig(DBConfig dbconfig) {
		this.dbconfig = dbconfig;
	}

}

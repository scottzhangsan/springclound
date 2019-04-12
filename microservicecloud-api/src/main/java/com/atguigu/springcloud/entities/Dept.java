package com.atguigu.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;



public class Dept implements Serializable// entity --orm--- db_table
{
	private Long 	deptNo; // 主键
	private String 	deptName; // 部门名称
	private String 	dbSource;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	
	
	
	public Dept() {
		super();
	}

	public Dept(Long deptNo, String deptName, String dbSource) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.dbSource = dbSource;
	}

	public Dept(String deptName)
	{
		super();
		this.deptName = deptName;
	}

	public Long getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDbSource() {
		return dbSource;
	}

	public void setDbSource(String dbSource) {
		this.dbSource = dbSource;
	}
	
	
	
	
}

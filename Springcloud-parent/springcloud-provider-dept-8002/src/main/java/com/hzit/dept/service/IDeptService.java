package com.hzit.dept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hzit.bean.Dept;
import com.hzit.dept.mapper.DeptMapper;

public interface IDeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
	
}

package com.hzit.dept.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzit.bean.Dept;
import com.hzit.dept.mapper.DeptMapper;
import com.hzit.dept.service.IDeptService;

@Service
public class DeptServiceImpl implements IDeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	public boolean add(Dept dept) {
		deptMapper.addDept(dept);
		return deptMapper.addDept(dept);
	}

	public Dept get(Long id) {
		// TODO Auto-generated method stub
		return deptMapper.findById(id);
	}

	public List<Dept> list() {
		// TODO Auto-generated method stub
		return deptMapper.findAll();
	}

}

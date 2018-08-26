/**
 * 
 */
package com.employee.basic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.basic.DAO.EmployeeBasicDataDAO;
import com.employee.basic.bean.EmployeeBean;
import com.employee.basic.entity.EmployeeEntity;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

/**
 * @author Abhi
 *
 */
@Service
public class EmployeeBasicDataService {

	@Autowired
	EmployeeBasicDataDAO dao;
	
	public List<EmployeeBean> getAllEmployeeBasicData(){
		List<EmployeeBean> beanList=new ArrayList<EmployeeBean>();
		List<EmployeeEntity> entityList=(List<EmployeeEntity>)dao.findAll();
		beanList=entityList.stream().forEach(e->{
			EmployeeBean bean =new EmployeeBean();
			BeanUtils.copyProperties(e, bean);
		}).collect(Collectors.toList());
		return beanList;
	}
}

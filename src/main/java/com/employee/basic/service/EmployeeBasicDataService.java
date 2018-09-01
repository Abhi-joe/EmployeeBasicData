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

/**
 * @author Abhi
 *
 */
@Service
public class EmployeeBasicDataService {

	@Autowired
	EmployeeBasicDataDAO dao;

	/**
	 * Method to get all the basic details of all the employees from the
	 * database.
	 * 
	 * @return beanList: {@link List}
	 */
	public List<EmployeeBean> getAllEmployeeBasicData() {
		List<EmployeeBean> beanList = null;
		List<EmployeeEntity> entityList = (List<EmployeeEntity>) dao.findAll();
		beanList = entityList.stream().map(t -> {
			EmployeeBean bean = new EmployeeBean();
			BeanUtils.copyProperties(t, bean);
			return bean;
		}).collect(Collectors.toList());
		return beanList;
	}
}

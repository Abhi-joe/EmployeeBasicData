/**
 * 
 */
package com.employee.basic.DAO;

import javax.annotation.Resource;

import org.springframework.data.repository.CrudRepository;

import com.employee.basic.entity.EmployeeEntity;

/**
 * This is the Data Access Object layer interface extending the CRUD repository
 * of Spring JPA.
 * 
 * @author Abhi
 *
 */
@Resource
public interface EmployeeBasicDataDAO extends CrudRepository<EmployeeEntity, String> {

}

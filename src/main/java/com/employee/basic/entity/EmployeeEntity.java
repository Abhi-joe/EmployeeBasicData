/**
 * 
 */
package com.employee.basic.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity clas for Employee's basic data
 * 
 * @author Abhi
 *
 */
@Entity
@Table(name = "employeedata")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="employeeid")
	private int empId;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "middlename")
	private String middleName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "fathersname")
	private String fathersName;
	@Column(name = "mothersname")
	private String mothersName;
	@Column(name = "ismarried")
	private boolean married;
	/*
	 * @Column(name="dob") private Date dateOfBirth;
	 */
	@Column(name = "age")
	private int age;
	@Column(name = "bloodgroup")
	private String bloodGroup;

	/**
	 * 
	 */
	public EmployeeEntity() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param empId
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param fathersName
	 * @param mothersName
	 * @param married
	 * @param dateOfBirth
	 * @param age
	 * @param bloodGroup
	 */
	public EmployeeEntity(int empId, String firstName, String middleName, String lastName, String fathersName,
			String mothersName, boolean married, Date dateOfBirth, int age, String bloodGroup) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.married = married;
		// this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.bloodGroup = bloodGroup;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName
	 *            the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the fathersName
	 */
	public String getFathersName() {
		return fathersName;
	}

	/**
	 * @param fathersName
	 *            the fathersName to set
	 */
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	/**
	 * @return the mothersName
	 */
	public String getMothersName() {
		return mothersName;
	}

	/**
	 * @param mothersName
	 *            the mothersName to set
	 */
	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	/**
	 * @return the married
	 */
	public boolean isMarried() {
		return married;
	}

	/**
	 * @param married
	 *            the married to set
	 */
	public void setMarried(boolean married) {
		this.married = married;
	}

	/*	*//**
			 * @return the dateOfBirth
			 */
	/*
	 * public Date getDateOfBirth() { return dateOfBirth; }
	 * 
	 *//**
		 * @param dateOfBirth
		 *            the dateOfBirth to set
		 *//*
		 * public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth =
		 * dateOfBirth; }
		 */

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup
	 *            the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", firstName=" + firstName + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", fathersName=" + fathersName + ", mothersName=" + mothersName
				+ ", married=" + married + ", age=" + age + ", bloodGroup=" + bloodGroup + "]";
	}

}

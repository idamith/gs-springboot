package com.idotrick.gssb.user.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "USERS")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "BIODATA")
	private String biodata;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "USER_TYPE_ID" , nullable = false)
	private int userType;
	
	@Column(name = "JOB_RESPONSIBILITY_DESC", nullable = true)
	private String jobResponsibilityDesc;
	
	@Column(name = "ADMIN_ACCESS_CODE", nullable = true)
	private String adminAccessCode;
	
	@Column(name = "DATE_OF_BIRTH", nullable = true)
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private String dateOfBirth;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return (firstName == null) ? "" : firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return (lastName == null) ? "" : lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBiodata() {
		return biodata;
	}

	public void setBiodata(String biodata) {
		this.biodata = biodata;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getJobResponsibilityDesc() {
		return jobResponsibilityDesc;
	}

	public void setJobResponsibilityDesc(String jobResponsibilityDesc) {
		this.jobResponsibilityDesc = jobResponsibilityDesc;
	}

	public String getAdminAccessCode() {
		return adminAccessCode;
	}

	public void setAdminAccessCode(String adminAccessCode) {
		this.adminAccessCode = adminAccessCode;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		String space = " ";
		return new StringBuilder().append(space).append(getFirstName()).append(space).append(getLastName())
				.append(space).append(getBiodata()).append(space).append(getJobResponsibilityDesc()).append(space)
				.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof User) {
			User u = (User) o;
			return getId() == u.getId() && getFirstName().equals(u.getFirstName())
					&& getLastName().equals(u.getLastName());
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getFirstName(), getLastName());
	}
}

package com.perscholas.health.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Patient Class which creates the login table within the database with the specified parameters.
 */

@Entity
@Table(name = "Scheduling")
public class Scheduling {
	
	/**
	 * Auto generate Id value within the database.
	 * variables to make up the columns of the table
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long scheduleId;
	private String patientFirstName;
	private String patientLastName;
	private String patientEmail;
	private String patientPhone;
	private Date date;
	private String doctorLastName;
	
	/**
	 * default empty constructor
	 */
	
	public Scheduling() {}
	
	/**
	 * Scheduling Constructor with super class and parameters
	 * @param long id, String firstName, String lastName, String email, String phone, String bloodType, String illness.
	 * @return nothing.
	 */
	
	public Scheduling(long scheduleId, String patientFirstName, String patientLastName, String patientEmail, String patientPhone, Date date, String doctorLastName) {
		super();
		this.scheduleId = scheduleId;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.patientEmail = patientEmail;
		this.patientPhone = patientPhone;
		this.date = date;
		this.doctorLastName = doctorLastName;
	}
	
	/**
	 * Getter and Setter methods for the parameters of Employee in order to retrieve and store data.
	 */
	
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(long scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDoctorLastName() {
		return doctorLastName;
	}
	public void setDoctorLastName(String doctorLastName) {
		this.doctorLastName = doctorLastName;
	}

	/**
	 * Override hashcode to maintain consistency with application execution.
	 */
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((doctorLastName == null) ? 0 : doctorLastName.hashCode());
		result = prime * result + ((patientEmail == null) ? 0 : patientEmail.hashCode());
		result = prime * result + ((patientFirstName == null) ? 0 : patientFirstName.hashCode());
		result = prime * result + ((patientLastName == null) ? 0 : patientLastName.hashCode());
		result = prime * result + ((patientPhone == null) ? 0 : patientPhone.hashCode());
		result = prime * result + (int) (scheduleId ^ (scheduleId >>> 32));
		return result;
	}

	/**
	 * Override equals to maintain consistency with application execution when checking equivalent Objects.
	 */
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scheduling other = (Scheduling) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (doctorLastName == null) {
			if (other.doctorLastName != null)
				return false;
		} else if (!doctorLastName.equals(other.doctorLastName))
			return false;
		if (patientEmail == null) {
			if (other.patientEmail != null)
				return false;
		} else if (!patientEmail.equals(other.patientEmail))
			return false;
		if (patientFirstName == null) {
			if (other.patientFirstName != null)
				return false;
		} else if (!patientFirstName.equals(other.patientFirstName))
			return false;
		if (patientLastName == null) {
			if (other.patientLastName != null)
				return false;
		} else if (!patientLastName.equals(other.patientLastName))
			return false;
		if (patientPhone == null) {
			if (other.patientPhone != null)
				return false;
		} else if (!patientPhone.equals(other.patientPhone))
			return false;
		if (scheduleId != other.scheduleId)
			return false;
		return true;
	}

	/**
	 * Override toString if needed to print data from the database in order to determine correctness.
	 */
	
	@Override
	public String toString() {
		return "Scheduling [id=" + scheduleId + ", patientFirstName=" + patientFirstName + ", patientLastName="
				+ patientLastName + ", patientEmail=" + patientEmail + ", patientPhone=" + patientPhone + ", date="
				+ date + ", doctorLastName=" + doctorLastName + "]";
	}

	
	
}

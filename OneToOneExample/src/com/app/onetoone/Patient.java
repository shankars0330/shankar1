package com.app.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Patient {
	@Id 
private int pId;
private String pName;
public Patient() {
	super();
}
public Patient(int pId, String pName) {
	super();
	this.pId = pId;
	this.pName = pName;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
@Override
public String toString() {
	return "Patient [pId=" + pId + ", pName=" + pName + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + pId;
	result = prime * result + ((pName == null) ? 0 : pName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Patient other = (Patient) obj;
	if (pId != other.pId)
		return false;
	if (pName == null) {
		if (other.pName != null)
			return false;
	} else if (!pName.equals(other.pName))
		return false;
	return true;
}

}

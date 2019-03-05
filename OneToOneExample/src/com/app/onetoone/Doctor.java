package com.app.onetoone;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table
public class Doctor {
	@Id
	@GenericGenerator(name="g1",strategy="increment")
private int dId;
private String qualfication;
@OneToMany(targetEntity=Patient.class,fetch=FetchType.EAGER)
@JoinColumn(name="drid_fk",referencedColumnName="drid")
private Set patients;
}

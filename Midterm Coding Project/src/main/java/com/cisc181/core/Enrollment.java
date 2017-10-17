package com.cisc181.core;

import java.util.UUID;

/**
 * @author ajitt
 *
 */
/**
 * @author ajitt
 *
 */
public class Enrollment {
	
	public UUID SectionID;
	public UUID StudentID;
	public UUID EnrollmentID;
	public double Grade;
	
	public Enrollment(UUID SectionID, UUID StudentID) 
	{
		this.SectionID=SectionID;
		this.StudentID=StudentID;
	}
	
	public UUID getSectionID()
	{
		return SectionID;
	}
	
	public UUID getStudentID()
	{
		return StudentID;
	}
	
	public UUID getEnrollmentID()
	{
		return EnrollmentID;
	}
	
	public double Grade()
	{
		return Grade;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	
	

}

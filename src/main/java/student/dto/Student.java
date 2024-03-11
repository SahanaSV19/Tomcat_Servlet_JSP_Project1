package student.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class Student {	
@Id
@Column(name = "UID")
private int uniqueId;
private String Name;
@Column(name = "Mother_Name")
private String motherName;

@Override
public String toString() {
	return "Student [uniqueId=" + uniqueId + ", Name=" + Name + ", motherName=" + motherName + ", FatherName="
			+ FatherName + ", engMarks=" + engMarks + ", kanMarks=" + kanMarks + ", socMarks=" + socMarks
			+ ", MathMarks=" + MathMarks + ", sciMarks=" + sciMarks + ", compMarks=" + compMarks + ", SUPW=" + SUPW
			+ ", DOB=" + DOB + ", DOI=" + DOI + ", Result=" + Result + "]";
}
public int getUniqueId() {
	return uniqueId;
}
public void setUniqueId(int uniqueId) {
	this.uniqueId = uniqueId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getMotherName() {
	return motherName;
}
public void setMotherName(String motherName) {
	this.motherName = motherName;
}
public String getFatherName() {
	return FatherName;
}
public void setFatherName(String fatherName) {
	FatherName = fatherName;
}
public int getEngMarks() {
	return engMarks;
}
public void setEngMarks(int engMarks) {
	this.engMarks = engMarks;
}
public int getKanMarks() {
	return kanMarks;
}
public void setKanMarks(int kanMarks) {
	this.kanMarks = kanMarks;
}
public int getSocMarks() {
	return socMarks;
}
public void setSocMarks(int socMarks) {
	this.socMarks = socMarks;
}
public int getSciMarks() {
	return sciMarks;
}
public void setSciMarks(int sciMarks) {
	this.sciMarks = sciMarks;
}
public int getCompMarks() {
	return compMarks;
}
public void setCompMarks(int compMarks) {
	this.compMarks = compMarks;
}
public char getSUPW() {
	return SUPW;
}
public void setSUPW(char sUPW) {
	SUPW = sUPW;
}
public Date getDOB() {
	return DOB;
}
public void setDOB(Date dOB) {
	DOB = dOB;
}
public Date getDOI() {
	return DOI;
}
public void setDOI(Date dOI) {
	DOI = dOI;
}
public String getResult() {
	return Result;
}
public void setResult(String result) {
	Result = result;
}
@Column(name = "Father_Name")
private String FatherName;
@Column(name = "English")
private int engMarks;
@Column(name = "Kannada")
private int kanMarks;
@Column(name = "Social")
private int socMarks;
@Column(name = "Maths")
private int MathMarks;
public int getMathMarks() {
	return MathMarks;
}
public void setMathMarks(int mathMarks) {
	MathMarks = mathMarks;
}
@Column(name = "Science")
private int sciMarks;
@Column(name = "Computer")
private int compMarks;
private char SUPW;
@Column(name = "Date_of_Birth")
private Date DOB;
private String Result;
@Column(name = "Date_of_Issue")
private Date DOI;

}

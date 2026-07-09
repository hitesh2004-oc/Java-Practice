package com.prasoon.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tystudent")
public class Student {

    @Id
    @Column(name = "studentId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;

    @Column(name = "studentName")
    private String sname;

    @Column(name = "studentPersentage")
    private double per;

    // No Args Constructor
    public Student() {

    }

    // All Args Constructor
    public Student(int sid, String sname, double per) {
        this.sid = sid;
        this.sname = sname;
        this.per = per;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    @Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
	}

}
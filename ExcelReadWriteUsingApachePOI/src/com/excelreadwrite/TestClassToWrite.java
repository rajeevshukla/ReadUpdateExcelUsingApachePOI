package com.excelreadwrite;

import java.util.Date;

public class TestClassToWrite {

	private Date arrivalDate;
	private int arrivalDay;

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public int getArrivalDay() {
		return arrivalDay;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public void setArrivalDay(int arrivalDay) {
		this.arrivalDay = arrivalDay;
	}

	@Override
	public String toString() {
		return "TestClassToWrite [arrivalDate=" + arrivalDate + ", arrivalDay="
				+ arrivalDay + "]";
	}

	
}

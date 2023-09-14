package com.cpt.payments.pojo.copy;

public class AddResponse {
	private int resValue;
	private int b=0;
	public int getResValue() {
		return resValue;
	}

	public void setResValue(int resValue)
	{
		this.resValue = resValue;
	}

	@Override
	public String toString() {
		return "AddResponse [resValue=" + resValue + "]";
	}

}

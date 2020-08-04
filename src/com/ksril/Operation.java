package com.ksril;

public class Operation {
	private int first;
	private int second;
	private EnumOperator operator;
	
	public Operation(int first, int second, EnumOperator operator) {
		this.first = first;
		this.second = second;
		this.operator = operator;
	}
	
	public int calculate() {
		return operator.calculate(first, second);
	}
}

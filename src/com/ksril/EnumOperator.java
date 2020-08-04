package com.ksril;

public enum EnumOperator implements EnumInterface{
	ADD {
		@Override
		public int calculate(int first, int second) {
			return first + second;
		}
	},
	SUBTRACT {
		@Override
		public int calculate(int first, int second) {
			return first - second;
		}
	}
}

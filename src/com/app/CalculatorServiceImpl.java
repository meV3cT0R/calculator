package com.app;

public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public double add(double previousValue, double newValue) throws ArithmeticException {
		
		return previousValue + newValue;
	}

	@Override
	public double subtract(double previousValue, double newValue) throws ArithmeticException {
		return previousValue-newValue;
	}

	@Override
	public double division(double previousValue, double newValue) throws ArithmeticException {
		if(newValue == 0 )
			throw new ArithmeticException("Can't divide by zero");
		return previousValue/newValue;
	}

	@Override
	public double multiplication(double previousValue, double newValue) throws ArithmeticException {
	
		return previousValue*newValue;
	}


	
}

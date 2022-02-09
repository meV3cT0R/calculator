package com.app;

public interface CalculatorService {
	double add(double previousValue,double newValue) throws ArithmeticException;
	double subtract(double previousValue,double newValue) throws ArithmeticException;
	double division(double previousValue,double newValue) throws ArithmeticException;
	double multiplication(double previousValue,double newValue) throws ArithmeticException;
}

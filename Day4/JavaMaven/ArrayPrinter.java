package com.example.Day4.JavaMaven;

import java.util.Arrays;

public class ArrayPrinter<T> {
	private T[] arr;

	public T[] getArr() {
		return arr;
	}

	public void setArr(T[] arr) {
		this.arr = arr;
	}

	public ArrayPrinter(T[] arr) {
		super();
		this.arr = arr;
	}

	public ArrayPrinter() {
		super();
	}

	@Override
	public String toString() {
		return "ArrayPrinter [arr=" + Arrays.toString(arr) + "]";
	}
}

package com.example;

public class FindBugsNonannotationSample implements Cloneable {

	public static void main(String[] args) {
		if (args[0] == "abc") {
			System.out.println("!");
		}
	}

	private int dummyUnreadField = 3;

	int x, y;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return null;
	}

	public void foo() {
		x = x = 17;
	}

}

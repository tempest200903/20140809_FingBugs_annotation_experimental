package com.example;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class FindBugsAnnotationSample {

	@Nonnull
	public static String nonNullMethod() {
		return null;
	}

	@CheckForNull
	public static String checkForNullMethod() {
		return null;
	}

	@Nullable
	public static String nullableMethod() {
		return null;
	}

	public static void main(String[] args) {
		String str;
		str = nonNullMethod().trim();
		System.out.println(str);
		str = checkForNullMethod().trim();
		System.out.println(str);
		str = nullableMethod().trim();
		System.out.println(str);
	}

}

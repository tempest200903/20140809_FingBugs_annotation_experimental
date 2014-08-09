package com.example;

import edu.umd.cs.findbugs.annotations.NonNull;
import edu.umd.cs.findbugs.annotations.Nullable;
import edu.umd.cs.findbugs.annotations.CheckForNull;

public class FindBugsAnnotationSample {

	@NonNull
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

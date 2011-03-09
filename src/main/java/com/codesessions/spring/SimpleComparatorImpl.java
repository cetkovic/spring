package com.codesessions.spring;

import java.util.Comparator;

import org.springframework.stereotype.Service;

@Service
public class SimpleComparatorImpl implements Comparator<String> {
	public int compare(String s1, String s2) {
		assert s1 != null && s2 != null;
		return String.CASE_INSENSITIVE_ORDER.compare(s2, s1);
		//dodajem neki komentar za posle
	}
}
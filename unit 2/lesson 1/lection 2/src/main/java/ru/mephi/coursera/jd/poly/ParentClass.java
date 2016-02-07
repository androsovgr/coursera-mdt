package ru.mephi.coursera.jd.poly;

import java.util.Date;

public class ParentClass {

	private boolean firstCall = true;
	private Date cached;

	public final void doUnoverridable() {
		if (firstCall) {
			firstCall = false;
			cached = calculateDate();
		}
		System.out.println(cached);
	}

	protected Date calculateDate() {
		return new Date();
	}
}

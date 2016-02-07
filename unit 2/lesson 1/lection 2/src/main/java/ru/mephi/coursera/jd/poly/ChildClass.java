package ru.mephi.coursera.jd.poly;

import java.util.Calendar;
import java.util.Date;

public class ChildClass extends ParentClass {

	@Override
	protected Date calculateDate() {
		// get date using method of superclass
		Date superDate = super.calculateDate();
		// return tomorrow date
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(superDate.getTime());
		c.add(Calendar.DATE, 1);
		return new Date(c.getTimeInMillis());
	}
}

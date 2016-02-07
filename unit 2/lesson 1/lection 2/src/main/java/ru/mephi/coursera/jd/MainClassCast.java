package ru.mephi.coursera.jd;

import ru.mephi.coursera.jd.iface.AreaMesurable;
import ru.mephi.coursera.jd.iface.Drawable;
import ru.mephi.coursera.jd.iface.Triagle;

public class MainClassCast {

	public static void main(String[] args) {
		AreaMesurable am = new Triagle();
		float area = am.calculateArea();
		System.out.println(String.format("Calculated area: %f", area));
		// class casting operation next row
		Drawable drw = (Drawable) am;
		drw.draw();
		Drawable realDrw = new Drawable() {
			public void draw() {
				// stub
			}
		};
		// next row will cause class cast exception
		Triagle tr = (Triagle) realDrw;
	}
}

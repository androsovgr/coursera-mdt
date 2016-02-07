package ru.mephi.coursera.jd.poly;

public class MainPoly {

	public static void main(String[] args) {
		ParentClass pc = new ParentClass();
		pc.doUnoverridable();
		ParentClass cc = new ChildClass();
		// another result
		cc.doUnoverridable();
	}
}

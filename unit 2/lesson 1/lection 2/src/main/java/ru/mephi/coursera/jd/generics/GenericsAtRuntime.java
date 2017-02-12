package ru.mephi.coursera.jd.generics;

public class GenericsAtRuntime<T> {
    public void doSomething(T arg) {
        Class<?> cl = arg.getClass();
        cl = T.class;
        if (arg instanceof T){
            //...
        }
    }
}

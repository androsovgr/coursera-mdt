package ru.mephi.coursera.jd.exception.checked;

public class CheckedExample {

    public void catchExample() {
        try {
            thrownMethod();
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }

    public void throwExample() throws CheckedException {
        thrownMethod();
    }

    public void noThrowExample() {
        thrownMethod();
    }

    private void thrownMethod() throws CheckedException {
        throw new CheckedException();
    }
}

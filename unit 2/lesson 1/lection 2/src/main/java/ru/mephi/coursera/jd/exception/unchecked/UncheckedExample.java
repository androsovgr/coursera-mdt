package ru.mephi.coursera.jd.exception.unchecked;

public class UncheckedExample {

    public void catchExample() {
        try {
            thrownMethod();
        } catch (UncheckedException e) {
            e.printStackTrace();
        }
    }

    public void throwExample() throws UncheckedException {
        thrownMethod();
    }

    public void noThrowExample() {
        thrownMethod();
    }

    private void thrownMethod() throws UncheckedException {
        throw new UncheckedException();
    }
}

package ru.mephi.coursera.jd.exception;

public class Throwable {

    private void thrownMethod() throws Exception {
        throw new Exception();
    }

    public void catchMethod() {
        try {
            thrownMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void throwsMethod() throws Exception {
        thrownMethod();
    }

    public void catchRethrows() throws Exception {
        try {
            thrownMethod();
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void catchWrapRethrows() throws Exception {
        try {
            thrownMethod();
        } catch (Exception e) {
            throw new Exception("Some expalantion",e);
        }
    }
}

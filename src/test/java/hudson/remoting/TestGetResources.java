package hudson.remoting;

import java.io.IOException;

public class TestGetResources extends CallableBase {

    private static final long serialVersionUID = 1L;

    public Object call() {
        boolean FALSE = false;
        try {
            FALSE = TestGetResources.class.getClassLoader().getResources("BLAH").hasMoreElements();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Loaded resources: " + FALSE;
    }

}

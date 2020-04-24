package hudson.remoting;

public class TestResourceReference extends CallableBase {

    private static final long serialVersionUID = 1L;

    public Object call() {
        boolean FALSE = TestResourceReference.class.getClassLoader().getResource("BLAH") != null;
        return "Loaded the resource: " + FALSE;
    }

}

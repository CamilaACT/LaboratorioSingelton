public class Singleto {

    private static Singleto instance;
    public String value;

    private Singleto (String value){
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleto getInstance(String value) {
        if (instance == null) {
            instance = new Singleto(value);
        }
        return instance;
    }
}

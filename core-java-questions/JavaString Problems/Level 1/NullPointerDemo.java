public class NullPointerDemo {
    // method to generate exception
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // this will throw NullPointerException
    }

    // method to handle exception
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException!");
        }
    }

    public static void main(String[] args) {
        // generate exception (will crash if uncommented)
        // generateException();

        // handle exception safely
        handleException();
    }
}

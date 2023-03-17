public class Test {
    public static void main(String[] args) {
        String output = "Hello World!";
        for (int i = 0; i < output.length(); i++) {
            System.out.print(output.charAt(i));
            try {
                Thread.sleep(100); // Add a small delay between printing each character
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
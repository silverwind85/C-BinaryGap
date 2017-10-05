
public class BinaryGap {


    public static void main(String[] args) {
        int variable = 328;
        int counter = 0;
        int temporaryCounter = 0;
        String binString = Integer.toBinaryString(variable);
        for (int i = 0; i < binString.length(); i++) {
            if (binString.substring(i, i + 1).equals("0")) {
                counter++;
                System.out.println(counter);
            } else if (temporaryCounter <= counter) {
                temporaryCounter = counter;
                counter = 0;
            }
        }
        if (temporaryCounter > counter) {
            counter = temporaryCounter;
        }
        System.out.println(binString + " " + counter + " " + temporaryCounter);
    }
}

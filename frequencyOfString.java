public class frequencyOfString {
    public static void main(String[] args) {
        String input = "Siddharth";

        input = input.toLowerCase();

        int[] frequency = new int[256];

        for (char c : input.toCharArray()) {
            frequency[c]++;
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0 && Character.isLetterOrDigit((char) i)) {
                System.out.println((char) i + ": " + frequency[i]);
            }
        }
    }
}

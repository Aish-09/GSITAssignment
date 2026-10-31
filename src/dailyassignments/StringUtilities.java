package dailyassignments;

public class StringUtilities {

    public static void main(String[] args) {
        String phrase = "hello i am good";
        String mixedData = "ABCD123EF5";

        System.out.println("Reversed string: " + reverseString(phrase) + "\n");
        System.out.println("Word count: " + countWords(phrase)+ "\n");
        System.out.println("CamelCase: " + toCamelCase(phrase)+ "\n");
        System.out.println("Reversed words: " + reverseEachWord(phrase)+ "\n");
        System.out.println("Sum of individual digits: " + sumIndividualDigits(mixedData)+ "\n");
        System.out.println("Sum of whole numbers: " + sumWholeNumbers(mixedData)+ "\n");
    }

    public static String reverseString(String input) {
        if (input == null || input.isEmpty()) return "";
        return new StringBuilder(input).reverse().toString();
    }

    public static int countWords(String input) {
        if (input == null || input.isBlank()) return 0;
        // Split against arbitrary whitespace boundaries to handle uneven padding
        return input.trim().split("\\s+").length;
    }

    public static String toCamelCase(String input) {
        if (input == null || input.isBlank()) return "";
        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            String word = words[i].toLowerCase();
            sb.append(Character.toUpperCase(word.charAt(0)))
              .append(word.substring(1));
        }
        return sb.toString();
    }

    public static String reverseEachWord(String input) {
        if (input == null || input.isBlank()) return "";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(new StringBuilder(words[i]).reverse());
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static int sumIndividualDigits(String input) {
        if (input == null) return 0;
        int sum = 0;
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';
            }
        }
        return sum;
    }

    public static int sumWholeNumbers(String input) {
        if (input == null) return 0;
        int totalSum = 0;
        StringBuilder buffer = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                buffer.append(ch);
            } else if (buffer.length() > 0) {
                totalSum += Integer.parseInt(buffer.toString());
                buffer.setLength(0);
            }
        }

        if (buffer.length() > 0) {
            totalSum += Integer.parseInt(buffer.toString());
        }
        return totalSum;
    }
    
    
}
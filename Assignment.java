public class Assignment {

    public static void main(String[] args) {
        String input = "gaGAn GuPTA";
        String pascalCase = toPascalCase(input);
        System.out.println(pascalCase);
    }

    public static String toPascalCase(String input) {
        if (input == null || input.isEmpty()) {
            return " ";
        }

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : input.toCharArray()) {
            if (Character.isWhitespace(ch)) {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(Character.toLowerCase(ch));
            }
        }

        return result.toString();
    }
}

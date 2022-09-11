package homework;

public class Task2_3 {
    public static void main(String[] args) {

        /*
        Task3
            Реализовать функцию нечеткого поиска
                    fuzzySearch("car", "ca6$$#_rtwheel"); // true
                    fuzzySearch("cwhl", "cartwheel"); // true
                    fuzzySearch("cwhee", "cartwheel"); // true
                    fuzzySearch("cartwheel", "cartwheel"); // true
                    fuzzySearch("cwheeel", "cartwheel"); // false
                    fuzzySearch("lw", "cartwheel"); // false
         */

        fuzzySearch("car", "ca6$$#_rtwheel"); // true
        fuzzySearch("cwhl", "cartwheel"); // true
        fuzzySearch("cwhee", "cartwheel"); // true
        fuzzySearch("cartwheel", "cartwheel"); // true
        fuzzySearch("cwheeel", "cartwheel"); // false
        fuzzySearch("lw", "cartwheel"); // false


    }

    static void fuzzySearch(String word, String text) {

        if (word == null || text == null) {
            System.out.println("false");
            return;
        }

        if (word.length() == text.length() && word.equals(text)) {
            System.out.println("true");
            return;
        }
        int countMatch = 0;
        int startSearch = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = startSearch; j < text.length(); j++) {
                if (word.charAt(i) == text.charAt(j)) {
                    countMatch++;
                    startSearch = ++j;
                    break;
                }
            }
        }
        if (countMatch == word.length()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


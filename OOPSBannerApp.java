import java.util.HashMap;

public class OOPSBannerApp {

    static HashMap<Character, String[]> patternMap = new HashMap<>();


    static void loadPatterns() {

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

    }


    public static void main(String[] args) {

        loadPatterns();

        char[] word = {'O', 'O', 'P', 'S'};

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word) {
                line.append(patternMap.get(c)[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}
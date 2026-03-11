public class OOPSBannerApp {

    // Inner class
    static class CharacterPattern {

        char ch;
        String[] pattern;

        CharacterPattern(char ch, String[] pattern) {
            this.ch = ch;
            this.pattern = pattern;
        }

        String[] getPattern() {
            return pattern;
        }
    }


    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });


        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }

    }
}
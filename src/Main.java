public class Main {
    public static void main(String[] args) {

        //variables
        String original = "programming is easy";
        String space = "";
        String upperLower;

        //creates spaces in between the letters and converts every other letter to upper case
        for(int i = 0; i < original.length(); i++){
            if(!original.substring(i, i+1).equals(" ")){
                space += original.substring(i, i + 1);
            }
        }

        original = space;
        space = "";

        for (int i = 1; i <= original.length(); i++) {
            upperLower = original.substring(i - 1, i);
            if (i % 2 == 0) {
                upperLower = upperLower.toUpperCase();
            } else {
                upperLower = upperLower.toLowerCase();
            }
            space += upperLower + " ";
        }

        original = space;
        space = "";

        System.out.println(original);

        //removes spaces
        for (int j = 0; j < original.length(); j++) {
            if(!original.substring(j, j+1).equals(" ")){
                space += original.substring(j, j + 1);
            }
        }

        original = space;
        space = "";

        System.out.println(original);

        //removes every other letter until word is done
        while (original.length() > 1) {
            for (int j = 0; j < original.length(); j+=2) {
                space += original.substring(j, j + 1);
            }
            original = space;
            space = "";
            System.out.println(original);
        }
    }
}


package src.src;

public class Main {
    //Code your solution to problem number one here
    public static int problemOne(String s){
        int vowelCount = 0;
        char aChar = 'a';
        char eChar = 'e';
        char iChar = 'i';
        char oChar = 'o';
        char uChar = 'u';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == aChar) {
                vowelCount++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == eChar) {
                vowelCount++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == iChar) {
                vowelCount++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == oChar) {
                vowelCount++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == uChar) {
                vowelCount++;
            }
        }
        System.out.println("Number of Vowels: " + vowelCount);

        return vowelCount;


}

    public static int problemTwo(String s) {
        int bobcount = 0;
        int i = -1;
        while (i != 0) {
            i = s.indexOf("bob", i) + 1; if (i != 0) bobcount++;
        }
        System.out.println("Number of times bob occurs is: " +  bobcount);
        return bobcount; }

    public static String problemThree(String s){
        String preChar = "";
        String current = "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String letterI = s.substring(i,i+1);


            if (letterI.compareToIgnoreCase(preChar) >= 0) {
                current += s.substring(i,i+1);


                if (current.length() > longest.length()) longest = current;
            } else {
                current = letterI;
            }
            preChar = letterI;
        }
        System.out.println(longest);
        return longest;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        problemOne("wurexc");
        problemTwo("wpoabobbobobobobbbobbboobbkbobobbooboboobobsbobob");

    }
}

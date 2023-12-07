public class Assignment3_java_tata_strive {
    public static void main(String[] args) {
        String s1 = "abdf";
        String s2 = "pw";

        String result = "";


        int length = s1.length() + s2.length();

        int j = 0, k = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                if (j > s1.length() - 1)
                    break;
                result += s1.charAt(j);
                j++;
            } else {
                if (k > s2.length() - 1)
                    break;
                result += s2.charAt(k);
                k++;
            }
        }

        if (j != s1.length()) {
            while (j < s1.length()) {
                result += s1.charAt(j);
                j++;
            }
        } else {
            while (k < s2.length()) {
                result += s2.charAt(k);
                k++;
            }
        }


        System.out.println("j : " + j + " k : " + k);
        System.out.println(result);
    }
}

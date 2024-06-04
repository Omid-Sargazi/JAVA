package filesProject;

public class StringRotationCheck {
    public static void main(String[] args) {
        System.out.println("StringRotationCheck");
        mainFun();

    }

    public static boolean findSubstring(String mainString, String subString) {
        boolean flag = true;
        for (int i = 0; i < mainString.length(); i++) {
            flag = true;
            for (int j = 0; j < subString.length(); j++) {
                if (subString.charAt(j) != mainString.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("being substring " + i);
            }
        }
        return flag;
    }

    public static void mainFun() {
        String s1 = "omid";
        String s2 = "dimo";
        String S3 = s1 + s1;

        if (findSubstring(S3, s2)) {
            System.out.println("s2 is rotation of s1");
        }
    }

}

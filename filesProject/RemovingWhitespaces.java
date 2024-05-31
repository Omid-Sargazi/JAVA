package filesProject;

class RemovingWhitespaces {

    public static void main(String[] args) {

        String S = "      sargazi omid    ";

        StringBuilder StringWithoutSpace = new StringBuilder();
        String S2 = "";
        for (char ch : S.toCharArray()) {
            if (ch != ' ') {
                StringWithoutSpace.append(ch);
            }
        }

        System.out.println("" + StringWithoutSpace);
    }

}
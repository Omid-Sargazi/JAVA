package filesProject;

class CountingCharacter {
    public static void main(String[] args) {
        String str = "ohello wossorld";
        char target = 'o';
        int count = 0;

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}

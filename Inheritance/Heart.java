package Inheritance;

class Heart {
    public void pump() {
        System.out.println("Heart is pumping.");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.live();
    }
}

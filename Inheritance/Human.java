package Inheritance;

class Human {
    private Heart heart;

    public Human() {
        heart = new Heart(); // Heart is created with the human
    }

    public void live() {
        heart.pump();
    }
}

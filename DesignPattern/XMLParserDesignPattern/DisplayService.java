package DesignPattern.XMLParserDesignPattern;

public abstract class DisplayService {
    public void display() {
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }
}

package DesignPattern.XMLParserDesignPattern;

public class FeedbackXMLDisplayService extends DisplayService {
    @Override
    public XMLParser getParser() {
        return new FeedbackXML();
    }
}

package de.boeserwolf91.xml.exception;

public class XmlException extends Exception
{
    public XmlException(String message) { super(message); }

    public XmlException(String message, Throwable t) { super(message, t); }
}
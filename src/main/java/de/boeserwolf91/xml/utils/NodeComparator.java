package de.boeserwolf91.xml.utils;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node>
{
    public int compare(Node first, Node second)
    {
        int firstPriority = 0;
        int secondPriority = 0;
        NamedNodeMap attributes = first.getAttributes();
        Node priorityNode = attributes.getNamedItem("priority");
        if (priorityNode != null) { firstPriority = Integer.valueOf(priorityNode.getTextContent()); }
        attributes = second.getAttributes();
        priorityNode = attributes.getNamedItem("priority");
        if (priorityNode != null) { secondPriority = Integer.valueOf(priorityNode.getTextContent()); }
        return Integer.compare(secondPriority, firstPriority);
    }
}
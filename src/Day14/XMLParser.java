package Day14;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.*;

public class XMLParser {
    public static void main(String[] args) {
        try {
            String xmlContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                    + "<college>"
                    + "    <students>"
                    + "        <student>"
                    + "            <id>1</id>"
                    + "            <name>John Doe</name>"
                    + "            <department>Computer Science</department>"
                    + "            <grade>A</grade>"
                    + "        </student>"
                    + "        <student>"
                    + "            <id>2</id>"
                    + "            <name>Jane Smith</name>"
                    + "            <department>Electronics</department>"
                    + "            <grade>B</grade>"
                    + "        </student>"
                    + "        <student>"
                    + "            <id>3</id>"
                    + "            <name>Emma Brown</name>"
                    + "            <department>Mechanical</department>"
                    + "            <grade>A</grade>"
                    + "        </student>"
                    + "    </students>"
                    + "</college>";

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new java.io.ByteArrayInputStream(xmlContent.getBytes()));

            document.getDocumentElement().normalize();

            NodeList students = document.getElementsByTagName("student");

            for (int i = 0; i < students.getLength(); i++) {
                Node studentNode = students.item(i);

                if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element studentElement = (Element) studentNode;

                    String id = studentElement.getElementsByTagName("id").item(0).getTextContent();
                    String name = studentElement.getElementsByTagName("name").item(0).getTextContent();
                    String department = studentElement.getElementsByTagName("department").item(0).getTextContent();
                    String grade = studentElement.getElementsByTagName("grade").item(0).getTextContent();

                    System.out.println("ID: " + id);
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + department);
                    System.out.println("Grade: " + grade);
                    System.out.println("----------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


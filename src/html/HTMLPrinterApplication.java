package html;

public class HTMLPrinterApplication {
    public static void main(String[] args) {
        Paragraph p = new Paragraph("Some text");
        Span span = new Span("some text");
        Anchor a = new Anchor("click me");


        Element[] elements = {p, span, a};
        printElements(elements);
    }

    public static void printElements(Element[] elements){

        for(Element element : elements){
            System.out.println(element.toHTML());
        }
    }

}

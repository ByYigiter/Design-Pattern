package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape circle1 =new Circle();
        circle1.draw();
        Shape square1 =new Square();
        square1.draw();
        Shape rectangle1 =new Rectangle();
        rectangle1.draw();
        System.out.println("**".repeat(50));
        ShapeFactory shapeFactory =new ShapeFactory(); // Factory design pattern kullnımı -- gizlilik onemli
        Shape shape1 = shapeFactory.getShape("kare");// class ismi bilmesine gerek yok istediğini turkce yaz
        Shape shape2 = shapeFactory.getShape("DİKDÖRTGEN");// o arkada bize o clastan methodu calıştırır
        Shape shape3 = shapeFactory.getShape("daire");
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }

}

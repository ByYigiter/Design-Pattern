package CreationalDP.Abstract_FactoryDP;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("daire")){
            return new Circle();
        }else if (shapeType.equalsIgnoreCase("dikdörtgen")){
            return new Rectangle();
        }else if (shapeType.equalsIgnoreCase("Kare")){
            return new Square();
        }
        return null;
    }
    @Override
    Color getColor(String color) {
        return null;
    }

}

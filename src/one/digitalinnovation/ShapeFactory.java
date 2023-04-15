package one.digitalinnovation;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        if(shapeType.equalsIgnoreCase("RETÂNGULO")) {
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("CÍRCULO")) {
            return new Circle();
        }
        return null;
    }
}

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return Circle.getInstance();
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return Rectangle.getInstance();
        }
        if(shapeType.equalsIgnoreCase("SQUARE")){
            return Square.getInstance();
        }
        return null;
    }
}

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ShapeInterface> shapes = new ArrayList<ShapeInterface>();

        //shapes.add(new ShapeInterface());
        shapes.add(new Rectangle());
        shapes.add(new Rectangle(2.0,4.0));
        shapes.add(new Circle());
        shapes.add(new Circle(5.0));

        for (int i=0; i<shapes.size(); i++){
            System.out.println("Shape #"+(i+1)+": "+shapes.get(i));
        }
    }
}
class Circle implements ShapeInterface {

    private double radius;

    Circle(){
        radius = 3.0;
    }

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString(){
        return "I am a circle and my area is: "+getArea();
    }
}
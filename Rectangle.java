class Rectangle implements ShapeInterface {
    private double length;
    private double width;

    Rectangle(){
        length = width = 2.0;
    }

    Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public String toString(){
        return "I am a Rectangle and my area is: "+getArea();
    }

}
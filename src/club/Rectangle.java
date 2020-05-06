package club;

public class Rectangle extends Shape{
   private int a;
   private int b;
   public Rectangle(int a,int b){
       this.a=a;
       this.b=b;
   }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }

    @Override
    public String getShapeName() {
        return "矩形";
    }
}

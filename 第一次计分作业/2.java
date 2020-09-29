// （1）定义闭合图形抽象类ClosedFigure
// 定义属性：形状；
// 定义构造方法，给形状赋值；
// 定义两个抽象方法：计算面积和计算周长；
// 定义一个显示方法：显示图像形状，周长，面积；
// （2）定义ClosedFigure的子类椭圆Ellipse
// 定义属性：长短轴
// 定义构造方法：初始化长短轴；
// 实现从父类继承来的抽象方法；
// [提示：椭圆求周长公式Math.PI*(this.radius_a+this.radius_b)]
// （3）定义ClosedFigure的子类矩形类Rectangle
// 定义属性：长和宽
// 定义构造方法：初始化长和宽；
// 实现从父类继承来的抽象方法；
import  java.util.Scanner;
abstract  class  ClosedFigure                              //闭合图形抽象类
{   
    String shape;

    ClosedFigure(String shape){
        this.shape = shape;
    }

    abstract double perimeter();
    abstract double area();
    public  void  print()                                                    //显示形状、属性、周长及面积
    {
            System.out.println("this  is  a  "+this.shape+",perimeter:"+this.perimeter()+",area:"+this.area());
    }
}

class Ellipse extends ClosedFigure{
    private double radius_a;
    private double radius_b;

    Ellipse(double radius_a, double radius_b){
        super("Ellipse");
        this.radius_a = radius_a;
        this.radius_b = radius_b;
    }

    @Override
    double perimeter() {
        return Math.PI*(this.radius_a+this.radius_b);
    }

    @Override
    double area() {
        return Math.PI*this.radius_a*this.radius_b;
    }
}

class Rectangle extends ClosedFigure {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    double perimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    double area() {
        return this.length * this.width;
    }
}

public  class  ClosedFigure_ex    
{
    public  static  void  main(String  args[]){
        int  a,b;
        ClosedFigure  d1;
        ClosedFigure  d2;
        try{
            Scanner  sc  =  new  Scanner(System.in);
            String  str1  =  sc.next();
            a=Integer.parseInt(str1);
            str1  =  sc.next();
            b=Integer.parseInt(str1);
            d1=new  Ellipse(a,b);
            d1.print();

            String  str2  =  sc.next();
            a=Integer.parseInt(str2);
            str2  =  sc.next();
            b=Integer.parseInt(str2);
            d2=new  Rectangle(a,b);
            d2.print();
        }catch(Exception  e){
            System.out.println("error");
        }
    }
}
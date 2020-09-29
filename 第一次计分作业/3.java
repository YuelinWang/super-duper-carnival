// 分别设计点类Point和圆类Circle，
// 点类有两个私有数据纵坐标和横坐标；
// 圆类有也两个私有数据圆心和半径，其中圆心是一个点类对象；
// 要求如下所述：
// (1) 通过构造方法初始化数据成员，数据成员的初始化通过构造方法的参数传递；
// (2) 分别编写点和圆的输出函数，其中圆的输出包括圆心和半径的输出;点的输出x,y;
public  class  Circle{
    private int r;
    private Point center = new Point();
    
    Circle(int r, Point center){
        this.r = r;
        this.center = center;
    }
    public  void  showInfo(){
        System.out.println("center=("+center.getx()+","+center.gety()+");r="+r+";");
    }

    public  static  void  main(String  args[]){
        Point  p=new  Point(10,20);
        Circle  c=new  Circle(5,p);
        p.showInfo();
        c.showInfo();
    }
}

class  Point{
    private  int  x,y;
    Point() {
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

    public void showInfo() {
        System.out.println("x=" + this.x + ";y=" + this.y + ";");
    }
}
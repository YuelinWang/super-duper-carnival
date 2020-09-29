// （1）定义一个Person类，其中包括：
// 定义属性：姓名；年龄；民族作为成员变量。定义静态成员变量：人数
// 定义构造方法：对成员变量进行初始化。
// 定义多个方法：分别显示相应的属性值，例如getName(){System.out.print("名称="+name+"；"); }
// 定义一个方法“成长”：实现年龄的增加，每执行一次年龄增加1。
// 定义一个静态方法“显示人数”：显示当前的人数。
// （2）定义一个民族接口其中包括抽象方法：
// “习俗”：显示民族习俗。
// “政策”：民族优待政策。
// 编译生成.class文件。
// （3）定义一个“学生”类继承Person类，实现（2）中定义的民族接口。
// 增加属性：“学历”，定义为字符串类型，表示本科生还是研究生。
// 定义两个构造方法：构造方法重载；
// 覆盖父类中的方法“成长”：实现根据年龄显示是研究生还是本科生，年龄小于23是本科生，否则是研究生。其中还要调用父类的“成长”方法，实现年龄的增加。
// 实现接口中的两个抽象方法“习俗”和“政策”。“习俗”实现功能为：显示“春节，端午，中秋”等。 “政策”实现功能为：根据“民族”的值如果是汉族，显示“无”，否则显示“有优惠政策”。
// 定义一个main方法。实例化一个父类对象，调用各种方法显示相关信息，然后，实例化一个学生类对象，分别调用相关方法，包括继承来的各种方法，进行覆盖后的方法等，实现多态效果，显示各种信息。
//请定义Person类
class Person {
    private String name;
    private int age;
    private String nationality = "han" ;
    private static int count;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public void getName() {
        System.out.println("Name=" + this.name + ";");
    }

    public void getAge() {
        System.out.println("Age=" + this.age + ";");
    }

    public void getNationality() {
        System.out.println("Nationality=" + this.nationality + ";");
    }

    public int getAgeF() {
        return this.age;
    }

    public String getNationalityF() {
        return this.nationality;
    }

    public void growUp() {
        this.age = this.age + 1;
    }

    public void show() {
        count++;
        System.out.println("Person count:" + count + ";");
    }
}

//请定义Nationality接口
interface Nationality {
    public abstract void custom();
    public abstract void policy();
}

//定义一个Student类继承Person类，实现Nationality接口
class Student extends Person implements Nationality{
    private String education;

    Student(String name, String education){
        super(name);
        this.education = education;

    }

    Student(String name, int age, String nationality,String education) {
        super(name, age, nationality);
        this.education = education;
    }

    @Override
    public void growUp(){
        if(super.getAgeF()<23){
            System.out.println("Undergraduate;");
        }
        else {
            System.out.println("Postgraduate;");
        }
        super.growUp();
    }


    @Override
    public void custom() {
        System.out.println("Spring Festival, Dragon Boat Festival, Mid-Autumn Festival");
    }

    @Override
    public void policy() {
        if(super.getNationalityF().equals("han"))
            System.out.println("No preferential policies;");
        else
            System.out.println("Have preferential policies;");
    }

    public void show() {
        super.show();
    }

    //请参考main函数的内容编写以上内容
    public  static  void  main(String  args[]){
        Person  a=new  Person("zhangsan",19,"han");
        a.getName();
        a.getAge();
        a.getNationality();
        a.growUp();
        a.getAge();
        a.show();
        
        Person  b=new  Person("lisi",39,"man");
        b.getName();
        b.getAge();
        b.getNationality();
        b.growUp();
        b.getAge();
        b.show();
        
        Student  c=new  Student("wanger",33,"man","Postgraduate");
        c.growUp();
        c.custom();
        c.policy();
        c.show();
        
        Student  d=new  Student("wanger","Undergraduate");
        d.growUp();
        d.custom();
        d.policy();
        d.show();
    }
}
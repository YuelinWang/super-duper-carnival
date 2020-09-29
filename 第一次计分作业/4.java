// 设计一个班级类和一个学生类：
// 学生类属性：姓名，学号，成绩（整数即可）；定义相关构造方法；定义返回学生信息字符串的方法；
// 班级类属性：班级名，人数，成员；其中成员是一个学生类的数组；
// 班级类中定义方法，（1）显示总分和平均分（2）显示最高分和最低分学生信息（3）向班级中添加学生，即向班级类中的成员数组中添加学生对象。
// 在班级类中定义main方法，定义班级类对象，输入多个学生信息，然后输出这个班级的：总分，平均分，输出最高分学生信息，输出最低分学生信息。
public  class  Class{
    private String name;
    private int count;
    private Student[] mate = new Student[3];

    Class(String name, int count){
        this.name = name;
        this.count = count;
    }
    int curSum = 0;
    public void append(Student s){
        mate[curSum++] = s;
    }
    public  void  totalAndaverage(){  
        int sum = 0;
        for(Student s:mate){
            sum += s.getScore();
        }
        System.out.println("total  score:"+sum);    
        System.out.println("average  score:"+sum/count);
    }
    public  void  maxAndmin(){  
        int min = 0;
        int max = 0;
        for(int i = 0; i < mate.length; i++){
            if(mate[i].getScore() < mate[min].getScore()){
                min = i;
            }
            if(mate[i].getScore() > mate[max].getScore()){
                max = i;
            }
        }
        System.out.println("max  Info:"+mate[max].showInfo());
        System.out.println("max  Info:"+mate[min].showInfo());    
    }
    public  static  void  main(String  args[]){
        Class  c=new  Class("class1",3);
        Student  p=new  Student("zhangsan","101",47);
        c.append(p);
        p=new  Student("lisi","102",68);
        c.append(p);
        p=new  Student("wanger","103",98);
        c.append(p);
        c.totalAndaverage();
        c.maxAndmin();
    }
}
class  Student{
    private String name;
    private String num;
    private int score;

    Student(String name, String num, int score) {
        this.name = name;
        this.num = num;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public String getNum() {
        return this.num;
    }

    public int getScore() {
        return this.score;
    }

    public String showInfo() {
        String Info = "name=" + this.getName() + ";num=" + this.getNum() + ";score=" + this.getScore() + ";";
        return Info;
    }
}
import  java.util.Scanner;
public  class  Date{


    int  DiffDays(Date  d){//计算两个日期之间的相距天数的成员方法

    }

    public  static  void  main(String  args[]){
        int  a,b,c;
        Date  d1,d2;
        try{
            Scanner  sc  =  new  Scanner(System.in);
            String  str1  =  sc.next();
            a=Integer.parseInt(str1);
            str1  =  sc.next();
            b=Integer.parseInt(str1);
            str1  =  sc.next();
            c=Integer.parseInt(str1);
            d1=new  Date(a,b,c);
            String  str2  =  sc.next();
            a=Integer.parseInt(str2);
            str2  =  sc.next();
            b=Integer.parseInt(str2);
            str2  =  sc.next();
            c=Integer.parseInt(str2);
            d2=new  Date(a,b,c);
            System.out.println("Daynum:"+d1.DiffDays(d2));
        }
        catch(Exception  e){
            System.out.println("error");
        }
    }
}
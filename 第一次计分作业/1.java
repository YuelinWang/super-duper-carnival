//请编写定义日期类及使用日期类对象，要求：
//定义构造方法，实现初始化，
//定义显示日期的成员方法，
//定义计算两个日期之间的相距天数的成员方法。
import  java.util.Scanner;
public  class  Date{

    private int yy,mm,dd;

    public Date(int yy,int mm,int dd){
        this.yy=yy;
        this.mm=mm;
        this.dd=dd;
    }

    public int getYy() {
        return yy;
    }

    public int getMm() {
        return mm;
    }

    public int getDd() {
        return dd;
    }
    int  DiffDays(Date  d){//计算两个日期之间的相距天数的成员方法
        int [] DAY1={31,28,31,30,31,30,31,31,30,31,30,31};
        int [] DAY2={31,29,31,30,31,30,31,31,30,31,30,31};
        int day=0,day1=0,day2=0,i;
        if(yy==d.getYy()&&mm==d.getMm()){
            return d.getDd()-dd;
        }else if(yy==d.getYy()){
            if(yy%400==0||(yy%100!=0&&yy%4==0)){
                for(i=0;i<mm-1;i++){
                    day1+=DAY2[i];
                }
                day1+=dd;
                for(i=0;i<d.getMm()-1;i++){
                    day2+=DAY2[i];
                }
                day2+=d.getDd();
                return day2-day1;
            }else{
                for(i=0;i<mm-1;i++){
                    day1+=DAY1[i];
                }
                day1+=dd;
                for(i=0;i<d.getMm()-1;i++){
                    day2+=DAY1[i];
                }
                day2+=d.getDd();
                return day2-day1;
            }
        }else{
            if(d.getYy()%400==0||(d.getYy()%100!=0&&d.getYy()%4==0)){
                for(i=0;i<d.getMm()-1;i++){
                    day2+=DAY2[i];
                }
                day2+=d.getDd();
            }else{
                for(i=0;i<d.getMm()-1;i++){
                    day2+=DAY1[i];
                }
                day2+=d.getDd();
            }
            if(yy%400==0||(yy%100!=0&&yy%4==0)){
                for(i=0;i<mm-1;i++){
                    day1+=DAY2[i];
                }
                day1+=dd;
            }else{
                for(i=0;i<mm-1;i++){
                    day1+=DAY1[i];
                }
                day1+=dd;
            }
            for(i=yy;i<d.getYy();i++){
                if(i%400==0||(i%100!=0&&i%4==0)){
                    day+=366;
                }else{
                    day+=365;
                }
            }
            return day2+day-day1;
        }
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
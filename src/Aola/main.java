package Aola;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("请选择您的亚比，奥拉双人对战小游戏");
        Bird a=new Bird();
        Dragon b=new Dragon();


        Scanner scanner=new Scanner(System.in);
        Scanner ttt=new Scanner(System.in);




        while(a.blood>=0&&b.blood>=0){
            int Rblood1=a.getBlood(),Rblood2=b.getBlood();


            System.out.println("请选择您的技能");
            System.out.println("帝皇龙速度高于赤寒天凤，率先出手");
            b.Choose();
            int c= scanner.nextInt();
            if(c==1){ b.Tech1(a);Rblood1-=b.a;a.setBlood(Rblood1);  System.out.println("赤寒天凤的血量为"+a.blood);}

            if(c==2){b.Tech2();Rblood2+=b.b;b.setBlood(Rblood2);System.out.println("帝皇龙的血量为"+b.blood);}
            if(c!=1&&c!=2){ System.out.println("请选择您的技能");}
            int d= ttt.nextInt();

            System.out.println("请赤寒天凤反击");
            if(d==1){ a.Tech1(b);Rblood2-=a.a;b.setBlood(Rblood2);System.out.println("帝皇龙的血量为"+b.blood);}
            if(d==2){a.Tech2();Rblood1+=a.b; a.setBlood(Rblood1);System.out.println("赤寒天凤的血量为"+a.blood);}
            if(d!=1&&d!=2){ System.out.println("请选择您的技能");}


        }



    }
}

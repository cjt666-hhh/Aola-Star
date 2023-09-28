package Aola;

public class d1 {
    public static void main(String[] args) {
        Bird a=new Bird();
        Dragon b=new Dragon();

        System.out.println(a.blood);

        a.changeBlood1(b);
        System.out.println(a.blood);
    }
}

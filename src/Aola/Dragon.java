package Aola;

public class Dragon extends Pet{
     int blood=1000;int a=100, b=50;

    public Dragon() {
        super();
        System.out.println("帝皇龙的技能为龙神霸绝和龙啸九天");

    }

    @Override
    void Tech1(Pet x) {
        super.Tech1(x);
        System.out.println("帝皇龙使用了龙神霸绝,对赤寒天凤造成"+this.a+"点伤害");

    }

    @Override
    void Tech2() {
        super.Tech2();
        System.out.println("帝皇龙使用了龙啸九天,恢复了"+this.b+"点血量");

    }

    @Override
    void Choose() {
        super.Choose();
        System.out.println("1.龙神霸绝；2.龙啸九天");
    }

    @Override
    void changeBlood1(Pet x) {
        super.changeBlood1(x);
        this.blood-= x.a;
    }

    @Override
    void changeBlood2() {
        super.changeBlood2();
        this.blood+=this.b;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
}

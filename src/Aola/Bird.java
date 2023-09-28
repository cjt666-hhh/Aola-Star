package Aola;

public class Bird extends Pet{

    int blood=1000;int a=100, b=50;
    public Bird() {
        super();
        System.out.println("赤寒天凤的技能为元素融合和风灵化身");
    }

    @Override
    void Tech1(Pet x) {
        super.Tech1(x);
        System.out.println("赤寒天凤使用了元素融合,对帝皇龙造成"+this.a+"点伤害");

    }

    @Override
    void Tech2() {
        super.Tech2();
        System.out.println("赤寒天凤使用了风灵化身，恢复了"+this.b+"点血量");

    }

    @Override
    void Choose() {
        super.Choose();

        System.out.println("1.风灵化身；2.元素融合");
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


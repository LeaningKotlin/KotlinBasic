package lec10;

public final class JavaPenguin extends JavaAnimal implements JavaFlyable, JavaSwimable{

    private final int wingCount;

    public JavaPenguin(String species, int legCount) {
        super(species, legCount);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다.");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }

    @Override
    public void act() {
        JavaSwimable.super.act();
        JavaFlyable.super.act();
    }
}

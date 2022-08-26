package StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        Character me = new knight();
        Character king = new King();

        king.Action();
        king.SetWeapon(new AxeBehaviour());
        king.Action();
    }
}

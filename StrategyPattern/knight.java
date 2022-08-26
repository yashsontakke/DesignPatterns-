package StrategyPattern;

public class knight extends Character {

    public knight() {
       behaviour= new BowAndArrowBehaviour();
    }

    @Override
    void fight() {
       System.out.println("knight is fighting");
    }
}

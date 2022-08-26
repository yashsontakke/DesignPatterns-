package StrategyPattern;

public class King extends Character {
    King() {
        behaviour = new SwordBehaviour();
    }
    @Override
    void fight() {
       System.out.print("king is fighting ");
    }

}

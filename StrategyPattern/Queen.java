package StrategyPattern;

public class Queen extends Character {
    Queen() {
       behaviour = new AxeBehaviour();
    }
    @Override
    void fight() {
        System.out.println("Queen is trying to fight");
    }
}

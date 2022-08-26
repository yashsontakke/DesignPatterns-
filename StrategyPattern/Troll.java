package StrategyPattern;

public class Troll extends Character {


    Troll() {
      behaviour = new KnifeBehaviour();
    }

    @Override
    void fight() {
        System.out.print("Troll is also fighting ");
    }
}

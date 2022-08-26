package StrategyPattern;

abstract public class Character {
  WeaponBehaviour behaviour ;
     Character(){
  }
  Character(WeaponBehaviour b){
      this.behaviour = b ;
  }
  public void Action(){
    behaviour.useWeapon();
  }
   abstract void fight();

   public void  SetWeapon( WeaponBehaviour to ){.   //to change the behaviour at runtime 
       behaviour = to ;
   }

}

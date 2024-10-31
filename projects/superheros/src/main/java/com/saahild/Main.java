package com.saahild;

import com.saahild.villains.Abdul;
import com.saahild.villains.Peter;
import com.saahild.villains.Raya;

public class Main {

  public static void main(String[] args) {
    Hero hero = new Hero();
    Abdul abdul = new Abdul();
    Raya raya = new Raya();
    Peter peter = new Peter(true);
    hero.healingPotion();
    hero.shockAttack(abdul);
    abdul.slashHero(hero);
    raya.attackHero(hero);
    hero.superAttack(abdul);
    raya.healTeamate(abdul);
    abdul.sacrificeNextAttack();
    // raya.enableOneTimeDamadge();
    peter.moreStrength();
    peter.attack(hero);
    raya.healTeamate(abdul);
    hero.healNextAttack();
    hero.superAttack(raya);
    // raya.attackHero(hero);
    abdul.slashHero(hero);
    
    System.out.println("Hero: " + hero.getHealth());
    System.out.println("Abdul: " + abdul.getHealth());
    System.out.println("Raya: " + raya.getHealth());
    System.out.println("Peter: " + peter.getHealth());

  }
}

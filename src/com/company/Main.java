package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Boss Genichiro = new Boss();
        Genichiro.setDamage(35);
        Genichiro.setHP(2000);
        Genichiro.setProtection("lightning");
        System.out.println("Genichiro stats :(damage) " + Genichiro.getDamage() + ", (hp) " + Genichiro.getHP()
                + ", (protection) " + Genichiro.getProtection());

        createHeroes();

    }

    public static A_Hero[] createHeroes (){

        A_Hero Isshin = new A_Hero(300,90);
        A_Hero Sekiro = new A_Hero(250,75, "Shuriken throw");
        A_Hero Emma = new A_Hero(150,60, "Healing flask");

        A_Hero[] MeleeK ={Sekiro,Emma,Isshin};

        for (int i = 0; i <= 2 ; i++) {
            System.out.println(MeleeK[i].getDamage() + " " + MeleeK[i].getHP() + " " + MeleeK[i].getSkill());
        }

        return MeleeK;
    }
}

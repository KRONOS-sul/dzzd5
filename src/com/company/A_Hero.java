package com.company;

public class A_Hero {
    private int HP;
    private int damage;
    private String skill;


    public A_Hero(int HP, int damage, String skill) {
        this.HP = HP;
        this.damage = damage;
        this.skill = skill;
    }

    public  A_Hero(int HP, int damage){
        this.HP = HP;
        this.damage = damage;
    }

    public A_Hero() {

    }

    public String getSkill() {
        return skill;
    }

    public int getHP() {
        return HP;
    }

    public int getDamage() {
        return damage;
    }
}

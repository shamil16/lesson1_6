package com.company;

public class Main {

    public static void main(String[] args) {
Boss boss = new Boss(66,600);
boss.weapon.setDragunovsniperRifle("SVD");
boss.weapon.setGunshot("COld");
        System.out.println(boss.info());
        Skeleton skeleton = new Skeleton(40,400,66);
        skeleton.weapon.setDragunovsniperRifle("COLD");
        skeleton.weapon.setGunshot("FAIR");
        System.out.println(skeleton.info());
        Skeleton skeleton1 = new Skeleton(50,500,55);
        skeleton.weapon.setDragunovsniperRifle("FAIR");
        skeleton.weapon.setGunshot("COLD");
        System.out.println(skeleton.info());

    }
}

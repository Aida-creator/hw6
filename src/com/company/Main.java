package com.company;

public class Main {

    public static void main(String[] args) {
	// Создать класс Weapon (Оружие), с приватными полями тип оружия и название оружия.Также добавить геттеры и сеттеры
        // для этих полей.
        //Создать класс GameEntity (Игровая сущность), выделить все общие поля которые присущи и Боссу и Героям и
        // добавить геттеры и сеттеры к ним.
        //Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем сложного типа данных Weapon
        // (то есть дать оружие боссу). Также добавить геттеры и сеттеры для этого поля.
        //В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям). Затем распечатать
        // всю информацию о боссе.

     Boss Boss = new Boss ();
      Boss.setHealth(300);
      Boss.setDamage(30);
        System.out.println("info"+ Boss.info());

    }
}

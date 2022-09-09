package animals.birds;

import animals.pets.Animal;

public class Duck extends Animal implements Flying{

    @Override
    public void sey() {
        System.out.println("Кря");
    }

    public void fly() {
        System.out.println("Я лечу");
    }
}

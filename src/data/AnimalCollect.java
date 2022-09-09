package data;

import animals.pets.Animal;

import java.util.ArrayList;

public class AnimalCollect {
    private static AnimalCollect INSTANCE;
    private AnimalCollect() {}

    ArrayList<Animal> listAnimal = new ArrayList<>();

    public static AnimalCollect getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AnimalCollect();
        }
        return INSTANCE;
    }

    public ArrayList<Animal> getAnimal() {
        return listAnimal;
    }

    public void setAnimal(Animal animal) {
        listAnimal.add(animal);
    }
}

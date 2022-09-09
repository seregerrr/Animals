import animals.pets.Animal;
import animals.pets.Cat;
import animals.pets.Dog;
import animals.birds.Duck;
import data.AnimalCollect;
import data.Command;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Доступные команды: add/list/exit");
            Command command = Command.commandIgnoreCase(in.next().trim());

            if (command == null) {
                System.out.println("Неподдерживаемая команда, введите: add/list/exit");
            } else {
                switch (command) {
                    case ADD:
                        addAnimal(in);
                        break;
                    case LIST:
                        AnimalCollect listAnimal = AnimalCollect.getInstance();
                        listAnimal.getAnimal().forEach(System.out::println);
                        break;
                    case EXIT:
                        System.exit(0);
                }
            }
        }
    }

    private static void addAnimal(Scanner in) {
        Animal newAnimal = null;

        String selectAnimal, selectName = null;
        Integer selectAge, selectWeight = null;

        while (true) {
            System.out.println("Выберите животное: cat/dog/duck");
            selectAnimal = in.next();
            if (!selectAnimal.matches("cat|dog|duck")) {
                System.out.println("Неверный тип животного, введите: cat/dog/duck");
            } else {
                break;
            }
        }

        System.out.println("Введите имя");
        selectName = in.next();

        selectAge = intEntry(in, "возраст");
        selectWeight = intEntry(in, "вес");

        System.out.println("Введите цвет");
        String selectColor = in.next();

        if (Objects.equals(selectAnimal, "cat")) {
            newAnimal = new Cat();
        } else if (Objects.equals(selectAnimal, "dog")) {
            newAnimal = new Dog();
        } else if (Objects.equals(selectAnimal, "duck")) {
            newAnimal = new Duck();
        }

        assert newAnimal != null;
        newAnimal.setAge(selectAge);
        newAnimal.setColor(selectColor);
        newAnimal.setWeight(selectWeight);
        newAnimal.setName(selectName);

        AnimalCollect listAnimal = AnimalCollect.getInstance();
        listAnimal.setAnimal(newAnimal);
        newAnimal.sey();
    }


    private  static Integer intEntry(Scanner in, String msg) {
        Integer inputString = null;

        while (true) {
            System.out.println("Введите " + msg);
            inputString = tryParseInt(in.next());
            if (inputString != null) {
                return inputString;
            } else {
                System.out.println("Необходимо ввести число!");
            }
        }
    }


    private static Integer tryParseInt(String s) {
        try {
            return new Integer(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}

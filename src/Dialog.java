import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        ArrayList<Animal> listAnimal = new ArrayList<>();

        Animal newAnimal = new Animal();
        Cat catAnimal = new Cat();
        Dog dogAnimal = new Dog();
        Duck duckAnimal = new Duck();

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Доступные команды: add/list/exit");
            Command command = Command.commandIgnoreCase(in.next().trim());

            switch (command) {
                case ADD:
                    System.out.println("Выберите животное: cat/dog/duck");
                    String selectAnimal = in.next();
                    System.out.println("Введите имя");
                    String selectName = in.next();
                    System.out.println("Введите возраст");
                    int selectAge = in.nextInt();
                    System.out.println("Введите вес");
                    int selectWeight = in.nextInt();
                    System.out.println("Введите цвет");
                    String selectColor = in.next();

                    if (Objects.equals(selectAnimal, "cat")) {
                        newAnimal = catAnimal;
                    } else if (Objects.equals(selectAnimal, "dog")) {
                        newAnimal = dogAnimal;
                    } else if (Objects.equals(selectAnimal, "duck")) {
                        newAnimal = duckAnimal;
                    }
                    newAnimal.setAge(selectAge);
                    newAnimal.setColor(selectColor);
                    newAnimal.setWeight(selectWeight);
                    newAnimal.setName(selectName);

                    listAnimal.add(newAnimal);
                    newAnimal.Sey();
                    break;
                case LIST:
                    listAnimal.forEach(System.out::println);
                    break;
                case EXIT:
                    System.exit(1000);
            }
        }
    }
}

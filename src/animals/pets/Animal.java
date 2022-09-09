package animals.pets;

public abstract class Animal {
    String name, color;
    int age, weight;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void sey() {
        System.out.println("Я говорю");
    }

    public void go() {
        System.out.println("Я иду");
    }

    public void drink() {
        System.out.println("Я пью");
    }

    public void eat() {
        System.out.println("Я ем");
    }


    @Override
    public String toString() {
        String ageStr = null;
        int year = age % 10;
        boolean isExclusion = (age % 100 >= 11) && (age % 100 <= 14);

        if (isExclusion) {
            ageStr = "лет";
        } else {
            switch (year) {
                case 1:
                    ageStr = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    ageStr = "года";
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 0:
                    ageStr = "лет";
                    break;
            }
        }

        return "Привет! меня зовут " + name +
                ", мне " + age + ' ' + ageStr +
                ", я вешу - " + weight + " кг" +
                ", мой цвет - " + color;
    }
}

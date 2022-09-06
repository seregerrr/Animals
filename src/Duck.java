public class Duck extends Animal implements Flying{

    @Override
    public void Sey() {
        System.out.println("Кря");
    }

    public void Fly() {
        System.out.println("Я лечу");
    }
}

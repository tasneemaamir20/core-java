public class animalTest {
    

    public static void main(String[] args) {
        Animal a=new Dog();
        a.makeNoise();
        Dog d=(Dog)a;
        d.makeNoise();
        d.bark();
        a.eat();
        d.makeNoise();
    }
}

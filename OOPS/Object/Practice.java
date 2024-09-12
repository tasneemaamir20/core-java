public class Practice {

    public Practice() {
        System.out.println("A");
    }
}

 class B extends Practice {
    public B() {
        System.out.println("B");
    }
}

 class C extends B {
    public C() {
        System.out.println("C");
    }
}

 class Main {
    public static void main(String[] args) {
        B b = new C();
    }
}
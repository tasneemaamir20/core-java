class TypeCasting2 {
    public static void print() {
        System.out.println("Parent");
    }
}

class Child extends TypeCasting2 {

    @Override
    public static void print() {
        System.out.println("child");
    }
}

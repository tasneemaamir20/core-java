
abstract class writer {
    public static void write() {
        System.out.println("Writing ...");
    }
}

class Author extends writer {
    public static void write() {
        System.out.println("Writing Book");
    }
}

class Programmer extends writer {
    public static void write() {
        System.out.println("Writing Code");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        writer w = new Programmer();
        w.write();
    }
}

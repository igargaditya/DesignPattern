class Objects {
    private static Objects instance;

    private Objects() {
        System.out.println("New Object");
    }

    public static Objects getObject() {
        if (instance == null) {
            synchronized (Objects.class) {
                if (instance == null) {
                    instance = new Objects();
                }
            }
            instance = new Objects();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        Objects o1 = Objects.getObject();
        Objects o2 = Objects.getObject();
        System.out.println(o1 == o2);
    }
}

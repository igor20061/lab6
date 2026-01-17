public class DefaultHandler {
    public static void printDefault(Class<?> cls) {
        Default d = cls.getAnnotation(Default.class);
        if (d != null) {
            System.out.println("Default класс: " + d.value().getName());
        }
    }
}
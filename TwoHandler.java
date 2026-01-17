public class TwoHandler {
    public static void printTwo(Class<?> cls) {
        Two t = cls.getAnnotation(Two.class);
        if (t != null) {
            System.out.println(t.first());
            System.out.println(t.second());
        }
    }
}
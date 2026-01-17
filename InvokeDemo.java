import java.lang.reflect.Method;
public class InvokeDemo {
    @Invoke
    public void hello() {
        System.out.println("Метод hello вызван");
    }
    public void test() {
        System.out.println("Обычный метод");
    }
    public static void run(Object obj) throws Exception {
        for (Method m : obj.getClass().getDeclaredMethods()) {
            if (m.isAnnotationPresent(Invoke.class)) {
                m.invoke(obj);
            }
        }
    }
}
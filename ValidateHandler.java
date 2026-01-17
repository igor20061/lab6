public class ValidateHandler {
    public static void printValidate(Class<?> cls) {
        Validate v = cls.getAnnotation(Validate.class);
        if (v != null) {
            for (Class<?> c : v.value()) {
                System.out.println("Проверяем: " + c.getName());
            }
        }
    }
}
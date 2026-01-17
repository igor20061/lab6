import java.lang.reflect.Field;
@ToString
public class Person {
    String name = "Ivan";
    @ToString(Mode.NO)
    int password = 1234;
    int age = 20;
    public String buildToString() throws Exception {
        StringBuilder sb = new StringBuilder("Person{");
        for (Field f : getClass().getDeclaredFields()) {
            ToString ts = f.getAnnotation(ToString.class);
            if (ts == null || ts.value() == Mode.YES) {
                sb.append(f.getName()).append("=").append(f.get(this)).append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
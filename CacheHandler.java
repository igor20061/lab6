public class CacheHandler {
    public static void printCache(Class<?> cls) {
        Cache c = cls.getAnnotation(Cache.class);
        if (c.value().length == 0) {
            System.out.println("Кеш пуст");
        } else {
            for (String s : c.value()) {
                System.out.println("Кеш: " + s);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws Exception {
        InvokeDemo.run(new InvokeDemo());
        DefaultHandler.printDefault(DefaultDemo.class);
        Person p = new Person();
        System.out.println(p.buildToString());
        ValidateHandler.printValidate(ValidateDemo.class);
        TwoHandler.printTwo(TwoDemo.class);
        CacheHandler.printCache(CacheDemo.class);
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Box of type Integer
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(100);
        System.out.println("Integer value: " + integerBox.getItem());

        // Box of type String
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println("String value: " + stringBox.getItem());
    }
}

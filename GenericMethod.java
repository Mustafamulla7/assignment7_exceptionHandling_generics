public class GenericMethod {

    // Generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        printArray(intArray);

        // String array
        String[] strArray = {"Java", "Generics", "Method"};
        printArray(strArray); 
    }
}

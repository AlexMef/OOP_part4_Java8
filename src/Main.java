public class Main {
    public static void main(String[] args) {
        MyCollection collection = new MyCollection();
        collection.addElement(2);
        collection.addElement(5);
        collection.addElement(10);
        collection.addElement(25);
        collection.displayAll();
        collection.addElement(1234);
        collection.addElement(52345342);
        collection.displayAll();
        collection.addElement(3, 234);

//        System.out.println("Array elements ");
//        collection.displayAll();
    }
}

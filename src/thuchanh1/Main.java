package thuchanh1;

public class Main {
    public static void main(String[] args) {
        Mylist<Integer> listInteger = new Mylist<Integer>();
        listInteger.add(0);
        System.out.println(listInteger.toString());
        listInteger.add(1);
        System.out.println(listInteger.get(1));
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

    }
}
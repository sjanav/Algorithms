import java.util.ArrayList;

public class ArrayListMethods {
    public static void print(ArrayList<Double> list) {
        for (double value : list) {
            System.out.println(value);
        }
    }

    public static void condense(ArrayList<Double> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            double first = list.get(i);
            double second = list.get(i + 1);
            list.set(i, first * second);
        }
        for (int i = list.size() / 2; i < list.size(); i++) {
            list.remove(i);
        }
    }

    public static void duplicate(ArrayList<Double> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.add(list.get(i));
        }
    }
}
package MyArrayList;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 1;
    private Object[] data;
    private int miSize;

    public MyArrayList() {

        data = new Object[INIT_SIZE];
    }

    public void add(T value) {
        resizeIfNeed();

        data[miSize] = value;
        miSize++;
    }

    private void resizeIfNeed() {
        if (miSize == data.length) {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }

    public T get(int i) {

        return (T) data[i];
    }

    public int size() {

        return miSize;
    }


    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(",");
        for (int i = 0; i < miSize; i++) {
            result.add((data[i]).toString());

        }

        return "[" + result + "]";

    }

    public String remove(int index) {

        Object[] result = new Object[miSize - 1];

        for (int i = 0; i < index; i++) {
            result[i] = data[i];
        }

        for (int i = index; i < miSize - 1; i++) {
            result[i] = data[i + 1];
        }
        data = result;
        miSize--;
        return Arrays.toString(data);
    }

    public void clear() {

        Object[] res = data;
        for (int k = miSize, i = miSize = 0; i < k; i++)
            res[i] = null;
    }



}
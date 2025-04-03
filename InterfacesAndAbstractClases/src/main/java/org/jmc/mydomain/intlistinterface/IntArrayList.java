package org.jmc.mydomain.intlistinterface;

public class IntArrayList implements IntList {
    private int[] numbers = new int[10];
    private int length = 0;

    public IntArrayList() {
    }

    @Override
    public void add(int number) {
        if (numbers.length - 1 == length) {// is full
            int[] tempNumbers = new int[length + ((length + 1) / 2)];
            for (int i = 0; i < length; i++) {
                tempNumbers[i] = numbers[i];
            }
            tempNumbers[length] = number;
            length++;
            numbers = tempNumbers;
        } else {
            numbers[length] = number;
            length++;
        }
    }

    @Override
    public int get(int id) {
        return numbers[id];
    }
}

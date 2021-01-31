package e013.scope;

import java.util.Arrays;

class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference(){
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1]-elements[0];
        return maximumDifference;
    }
}
package searches;

import java.util.Arrays;

public class Search {

    //@return index of element to be searched, -1 if element not found
    public int linearSearch(int toFind, int[] data) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private int binarySearchOperation(int toFind, int[] data) {
        int middle = data.length / 2;
        if(toFind < data[middle]) {
            return binarySearch(toFind, Arrays.copyOfRange(data, 0, middle));
        }
        if(toFind > data[middle]) {
            return binarySearch(toFind, Arrays.copyOfRange(data, middle + 1, data.length));
        }
        if(toFind == data[middle]) {
            return middle;
        }

        return -1;
    }

    public int binarySearch(int toFind, int[] data) {
        Arrays.sort(data);
        if(toFind < data[0] || toFind > data[data.length -1]) {
            return -1;
        }

        return binarySearchOperation(toFind, data);
        
    }
}

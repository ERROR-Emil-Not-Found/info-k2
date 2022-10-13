import java.util.Random;
import java.util.Scanner;

class BubbleSort {
    private static Random rd = new Random();
    private static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        while(true) {
            System.out.print("press enter");
            sc.nextLine();
            int [] nums = new int[rd.nextInt(15) + 5]; // min length: 5, maxlength: 20
            for(int i = 0; i < nums.length; i++) {
                nums[i] = rd.nextInt(64);
            }
            System.out.print("un");
            printArray(nums);
            System.out.println();

            shakeSort(nums);
            printArray(nums);
            System.out.println();

            
        }
    }


    private static int[] selectionSort(int[] data) {
        for(int i = 0; i < data.length; i++) {
            int maxIndex = 0; //keeps track of the index with the largest value found in the iteration
            for(int j = 0; j < data.length - i; j++) {
                if(data[j] > data[maxIndex]) {
                    maxIndex = j;
                }
            }
            swap(data, maxIndex, data.length - (i + 1)); // swaps data[maxIndex] with the last unsorted element
        }

        return data;
    }



    private static int [] actualBubbleSort(int [] data) {
        while(true) {
            boolean swapped = false;
            for(int i = 0; i < data.length - 1; i++) {
                if(data[i] > data[i + 1]) {
                    swap(data, i , i + 1);
                    swapped = true;
                }
            }
            if(!swapped) {
                return data;
            }
        }
    }


    private static int[] shakeSort(int[] data) {
        int iterationCounter = 0;
        int step = -1; // immediately flipped in first loop, tus actually starting out into right direction
        int i = 0;

        while(true) {
            boolean swapped = false;
            step = -step;
            
            while(true) {
                // larger than sign needs to be replaced on every other turn
                if (data[i] > data[i + step]) {
                    swap(data, i, i + step);
                    swapped = true;
                }

                i += step;
                switch(iterationCounter % 2) {
                    case 1:
                        if(i == data.length - 1) {
                            break;
                        }
                    case 2:
                    if(i == 1) {
                        break;
                    }

                }
                if (!swapped) {
                    return data;
                }
            }
        }
    }

    private static void printArray(int[] arr) {
        System.out.print("sorted: ");
        for (int element : arr) {
            System.out.print(element);
            System.out.print(", ");
        }
    }

    private static void swap(int [] arr, int a, int b) {
        int tempB = arr[b];
        arr[b] = arr[a];
        arr[a] = tempB;
    }
}
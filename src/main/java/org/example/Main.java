package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 7,5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }


    /**
     * sorts array of integers acsendingly
     *
     * @param nums input array
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                    //swap nums[i] and nums[minIdx]
                    int temp = nums[i];
                    nums[i] = nums[minIdx];
                    nums[minIdx] = temp;
                }
            }
        }
    }
}

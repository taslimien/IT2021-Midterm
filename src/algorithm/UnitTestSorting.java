package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        String value = "i am waiting";
        Assert.assertEquals("i am waiting",value);
        //Now implement Unit test for rest of the soring algorithm...................below

        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the insertion sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        sort.bubbleSort(unSortedArray);
        //verify if the unsorted array is sorted by the bubble sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
        sort.MergeSort(unSortedArray);
        //verify if the unsorted array is sorted by the merge sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        sort.heapSort(unSortedArray);
        //verify if the unsorted array is sorted by the heap sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

     /*   sort.quickSort(unSortedArray);
        //verify if the unsorted array is sorted by the quick sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }
*/
        sort.shellSort(unSortedArray);
        //verify if the unsorted array is sorted by the shell sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

        sort.bucketSort(unSortedArray);
        //verify if the unsorted array is sorted by the bucket sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Not Sorted");
        }catch(Exception ex){
            ex.getMessage();
        }

    }
}

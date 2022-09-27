package matrixsearch;
public class binarysearch {

    public static void SortedMatrix(int[][] arr, int FindMe){
        int i = 0;
        int x = 0;

        int min = 0;
        int max = arr.length - 1;

        boolean here = false;

        while (!here){
            int mid = GetMid(min, max);

            int length = arr[mid].length;
            int low = arr[mid][0];
            int high = arr[mid][length-1];

            if (low <= FindMe && FindMe <= high){
                here = true;
                i = mid;
            } else if (FindMe < low){
                max = mid;
            } else if (FindMe > max){
                min = mid;
            }

        }

        min = 0;
        max = arr[i].length;

        here = false;
        while (!here){
            int mid = GetMid(min, max);

            int midValue = arr[i][mid];

            if (midValue == FindMe){
                here = true;
                x = mid;
            } else if (FindMe < midValue){
                max = mid;
            } else if (max < midValue){
                min = mid;
            }

        }

        System.out.println("["+i+","+x+"]");

    }

    public static int GetMid(int min, int max){
        int diff = max - min;
        int mid = min + diff/2;
        return mid;
    }

    public static void main(String[] args) {
        int[][] matarr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        //int FindMe finds where the element is the array is located
        int FindMe = 5;

        System.out.println("Finding value " + FindMe);SortedMatrix(matarr, FindMe);

    }
}
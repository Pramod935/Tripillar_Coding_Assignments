package Module7;


public class RotatedArraySearch {


    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2};
        int key = 0;

        int low = 0, high = arr.length-1;

        while(low <= high) {

            int mid = (low+high)/2;

            if(arr[mid] == key) {
                System.out.println("Found at index " + mid);
                return;
            }

            if(arr[low] <= arr[mid]) {

                if(key >= arr[low] && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;

            } else {

                if(key > arr[mid] && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}
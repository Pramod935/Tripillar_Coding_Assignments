package Module7;

public class FirstLastOccurence {


    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int key = 2;

        int first = -1, last = -1;

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        low = 0;
        high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }
}
package Module6;

public class EvenIndexEvenNumber {
    public static void main(String[] args) {

        int[] arr = {3,6,12,1,5,8};

        int n = arr.length;

        for(int i=0;i<n;i++){

            if(i%2==0 && arr[i]%2!=0){

                for(int j=i+1;j<n;j++){

                    if(arr[j]%2==0){

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }
        }

        for(int x : arr)
            System.out.print(x + " ");
    }
}


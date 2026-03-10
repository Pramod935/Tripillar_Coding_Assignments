package Module7;

class Item3 {
    int value;
    char id;

    Item3(int value, char id) {
        this.value = value;
        this.id = id;
    }
}

public class StableSortExample {

    public static void main(String[] args) {

        Item3[] arr = {
                new Item3(3,'A'),
                new Item3(1,'B'),
                new Item3(3,'C'),
                new Item3(2,'D')
        };

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){

                if(arr[j].value > arr[j+1].value){

                    Item3 temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After Stable Sorting (Bubble Sort):");

        for(Item3 item : arr){
            System.out.print(item.value + "" + item.id + " ");
        }
    }
}

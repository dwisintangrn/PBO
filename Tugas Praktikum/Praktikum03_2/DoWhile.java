public class DoWhile {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        //for (int i = 1; i < 6; i++) {
        //    System.out.println("elemen ke-" + i + " = " + arr[i]);
        //}

        //DO ..WHILE
        int i = 0;
        do{
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        } while (++i < 5);
    }
}

//Mengubah source code loop for sebelumnya ke DO... WHILE
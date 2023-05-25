import java.util.*;

class CommonElements{
    private int arr1[];
    private int arr2[];

    public CommonElements(int arr1[], int arr2[]){
        this.arr1 = arr1;
        this.arr2 = arr2;
    }

    public int[] findCommonElements(){
        int[] res = new int[Math.max(arr1.length, arr2.length)];
        int idx = 0;

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    res[idx] = arr1[i];
                    idx++;
                    break;
                }
            }
        }

        return Arrays.copyOf(res, idx);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        System.out.println("Enter the elements of the first array:");
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        System.out.println("Enter the elements of the second array:");
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        CommonElements c = new CommonElements(array1, array2);
        int res[] = c.findCommonElements();

        System.out.print("Common elements between the two arrays: ");
        for (int element : res) {
            System.out.print(element + " ");
        }

        scanner.close();
    }
}
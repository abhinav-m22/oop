import java.util.*;

class DupNo{
    private int arr[];

    public DupNo(int arr[]){
        this.arr = arr;
    }

    public int[] removeDup(){
        int n = arr.length;
        int[] newArr = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++){
            boolean isDup = false;
            for(int j = 0; j < cnt; j++){
                if(arr[i] == newArr[j]){
                    isDup = true;
                    break;
                }
            }
            if(!isDup){
                newArr[cnt] = arr[i];
                cnt++;
            }
        }
        int finalAns[] = new int[cnt];
        for(int i = 0; i < cnt; i++){
            finalAns[i] = newArr[i];
        }
        return finalAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        DupNo d = new DupNo(arr);
        int ans[] = d.removeDup();
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();

        sc.close();

    }   
}
class Main{
    public static void main(String [] args){
        int arr[] = {12,34,56};

        for (int i = 0;i<arr.length;i++) {
            int Val = 1;
            while(arr[i]>0){
                int last = arr[i]%10;
                Val*=last;
                arr[i] = arr[i]/10;
            }
            arr[i] = Val;
        }

        for (int i : arr) {
            System.out.print(" "+i);
        }
    }
}
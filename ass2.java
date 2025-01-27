class Main{
    public static void main(String [] args){
        int arr[] = {123,456,789};

        for (int i = 0;i<arr.length;i++) {
            int Added = 0;
            while(arr[i]>0){
                int last = arr[i]%10;
                Added+=last;
                arr[i] = arr[i]/10;
            }
            arr[i] = Added;
        }

        for (int i : arr) {
            System.out.print(" "+i);
        }
    }
}
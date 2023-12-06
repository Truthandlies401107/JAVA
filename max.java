public class max {
    public static void main(String args[]){
        int a[] = {1,24,62,76,8,9,0,7,};
        int l= a.length;
        int max;
        int min = max = 0;
        min = a[0];
        for(int i = 0; i<l;i++){
            if(max<a[i]){
                max = a[i];
            }
            if(min>a[i]){
                min = a[i];
            }
        }
        System.out.println("The maximun no. is: "+max);
        System.out.println("The minimum no. is: "+min);

    }
}

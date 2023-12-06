public class minus {
    public static void main(String args[]){
        int a[]= {1,5,3,6,3};
        int l = a.length;
        for(int p = l; p>=0; --p){
            for(int i=0; i<p; i++){
                System.out.print(a[i]+" ");

            }
            for(int i=0; i<p-1;i++){
                a[i] = a[i+1]-a[i];
            }
            System.out.println();

        }
    }
}

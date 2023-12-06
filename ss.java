public class ss{
    public static void main(String args[]){
        int a[] = {1,4,3,5,0,4};
        int l = a.length;
        for(int i = 0; i < l -1; i++){
            int p = i;
            for(int j = i+1; j<l;j++){
                if(a[j]<a[p]){
                    j = p;
                }
                int t = a[p];
                a[p] = a[i];
                a[i] = t;
            }
        }
        for(int i = 0; i< l; i++){
            System.out.println(a[i]);
        }
    }
}

public class Bubble{
    public static void main(String args[]){
        int a[] = {32,42,64,12,11,23};
        int l = a.length;
        for(int i = 0; i < l-i; i++){
            for(int j = 0; j < l-i-1; j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }   
        for(int i = 0; i < l; i++){
            System.out.println(" "+a[i]);
        }

    }
}


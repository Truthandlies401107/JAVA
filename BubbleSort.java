public class BubbleSort {
    public static void main(String args[]){
        String a[] = {"apple","dog","bat","cat"};
        int l = a.length;
        for(int i =0; i<l; i++){
            System.out.println(" "+a[i]);
        }
        for(int i =0; i <l; i++){
            for(int j = 0; j < l-1-i; j++){
                if(a[j].compareTo(a[j+1])<0){
                    String s = a[j];
                    a[j] = a[j+1];
                    a[j+1] = s;
                }
            }
        }
    }
}
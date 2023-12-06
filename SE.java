public class SE{
    public static void main(String args[]){
        int v[] = {1,5,3,2,6,0};
        int l = v.length;
        for(int i = 0; i<l-1; i++){
            for(int j =0; j<l-i-1;j++){
                if(v[j]>v[j+1]){
                    int t = v[j];
                    v[j] = v[j+1];
                    v[j+1] = t;
                }
            }
        }
        for(int k = 0; k < l; k++){
            System.out.println(v[k]);
        }
    }
}

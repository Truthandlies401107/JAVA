public class LE {
    public static void main(String args[]){
        int v[] ={2,1,8,5,3,7};
        int l = v.length;
        for(int i = 0; i<l-1;i++){
            int p = i;
            for(int j = i+1;j< l; j++){
                if(v[j]<v[p]){
                    p = j;
                }
                int t = v[p];
                v[p] = v[i];
                v[i] = t; 
            }
        } 
        for(int k = 0; k < l; k++){
            System.out.print(" "+v[k]);

        }
    }
}

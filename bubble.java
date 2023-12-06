public class bubble{
    public static void main(String args[]){
        int marks[] = {34,52,64,31,65};
        int len = marks.length;
        for(int i =0; i<len-1; i++){
            for(int j=0; j<len-i-1;j++){
                if(marks[j]>marks[j+1]){
                    int t = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = t;
                }
            }
        }
        for(int i =0; i<len; i++){
            System.out.println(" "+marks[i]);
        }
    }
}
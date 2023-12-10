package JAVA;

public class HelloConstructor{
    String name;
    int id;
    long mobno;
    HelloConstructor(){
        name = "Prabhat";
        id = 5224;
        mobno = 34124145;
    }
    HelloConstructor(String name1, int id1, long mobno1 ){
        name = name1;
        id = id1;
        mobno = mobno1;
    }
    void display(){
        System.out.println("The name of the employee: "+name);
        System.out.println("The id of the employee: "+id);
        System.out.println("The mobile no. of the employee: "+mobno);
    }
    public static void main(String args[]){
        HelloConstructor obj1 = new HelloConstructor();
        obj1.display();
    }
}

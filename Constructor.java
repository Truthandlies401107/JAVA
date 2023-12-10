package JAVA;

public class Constructor{
    String name;
    int id;
    Constructor(){
        name = "Prabhat";
        id = 5441;
    } 
    Constructor(String name1, int id1){
        name = name1;
        id = id1;
    }
    void display(){
        System.out.println("The name of the person is: "+name);
        System.out.println("The id no. of the person is: "+id);
    }
    public static void main(String args[]){
        Constructor obj = new Constructor();
        obj.display();
    }

}

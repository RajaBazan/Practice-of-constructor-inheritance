package hello.com;
class Hey{
    Hey(){
        System.out.println("I'm a constructor of hey");
    }
    Hey(int x){
        System.out.println("I'm an overloaded constructor of hey: " + x);
    }
}
class You extends Hey{
    You(){
        super(14);
        System.out.println("I'm a constructor of you");
    }
    You(int x, int y){
        super(x);
        System.out.println("I'm overloaded constructor of you: " + y);
    }}
    class Bazan extends You{
        Bazan(){
            System.out.println("I'm a constructor of Hello");
        }
        Bazan(int x, int y, int z){
            super(x, y);
            System.out.println("I'm overloaded contructor of z: " + z);
        }
    }

public class Practice_of_constructor_Inheritance {
    public static void main(String[] args) {
//        Hey h = new Hey();
//        You y = new You();
        Bazan ba = new Bazan(10,13,14);

    }
}

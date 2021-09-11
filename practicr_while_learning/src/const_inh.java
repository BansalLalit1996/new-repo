class baase{
    baase(){
        System.out.println("i am a base class constructor");
    }
//    baase(int a, int b){
//        System.out.println(a +" "+ b);
//    }
}
class  derived1 extends baase{
//    derived1(){
////        super(7,8);
//        System.out.println(" i am a derived class constructor");
//    }
    derived1(int x,int y){
//        super();
        System.out.println(x+y);
    }
}
public class const_inh {
    public static void main(String[] args) {
//        baase b = new baase();
//        derived1 d = new derived1();
        derived1 d1 = new derived1(4,5);
    }
}

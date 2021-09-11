abstract class lalit{
    int lap;
    int rupees;
   public void har(){
        System.out.println("i am a char");
    }
    abstract void characteristics();
   abstract void team();
}

class c extends lalit{
    @Override
    void team(){
        System.out.println("");
    }
    void characteristics() {
        System.out.println("c is a good boy");
    }
}
abstract class  d extends lalit{
    void show(){
        System.out.println(" d extended from c");
    }


}
public class abstract_ {
    public static void main(String[] args) {
        c  t = new c();
        t.har();
        t.characteristics();


    }
}

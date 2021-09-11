abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
    void camara(){
        System.out.println("snapping....");
    }
}
class smartphone extends telephone{
    void ring(){
        System.out.println("ringing.....");
    }
    void lift(){
        System.out.println("lifting.....");
    }
    void disconnect(){
        System.out.println("disconnecting.....");
    }
}
public class qq_ {
    public static void main(String[] args) {
        smartphone sam = new smartphone();
        sam.ring();
        sam.camara();


    }
}


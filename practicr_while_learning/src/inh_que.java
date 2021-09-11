class cir{
    int r=2;
    void ar(int r){
        System.out.println(r*r);
    }
}
class cy extends cir{
    int h;
    void arr(int h){
        System.out.println(r*r*h);
    }
}
public class inh_que {
    public static void main(String[] args) {
        cy c = new cy();
        c.arr(3);
    }
}

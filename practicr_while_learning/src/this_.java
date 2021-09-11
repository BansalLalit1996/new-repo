class a{
    int b;
    public void setb(int b){
        this.b = b;
    }
    public void getb(){
        System.out.println(b);
    }
}
public class this_ {
    public static void main(String[] args) {
        a d = new a();
        d.setb(5);
        d.getb();
    }
}

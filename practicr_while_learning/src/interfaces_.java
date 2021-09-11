interface cycle{
    void brak(int decrement);
    void speedup(int increment);
}

class avon implements cycle{
    public void horn(){
        System.out.println("pee ponn");
    }
    public void brak(int d){
        System.out.println("i am descreasing");
    }
    public void speedup(int c){
        System.out.println("i am increment");
    }
}
public class interfaces_ {
    public static void main(String[] args) {
        avon n = new avon();
        n.brak(4);
        n.horn();
    }
}

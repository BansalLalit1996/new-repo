class   Animal{
    int legs;
    int ears;
    String sound;
    public Animal(int l,int q){
        this.legs = l;
        this.ears = q;
        System.out.println("I am a animal");
    }
    public int getLegs() {
        return legs;
    }

    public int getEars() {
        return ears;
    }

    public String getSound() {
        System.out.println("my sound is");
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
class dog extends Animal{
    public dog(int a,int b){
        super(a,b);
        System.out.println("I am a dog");
    }
    int teeth;
    public int getTeeth() {
        return teeth;
    }
    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
}
public class constructers_inheretance {
    public static void main(String[] args) {
        dog a = new dog(4,2);
//        a.setLegs(4);
//        a.setEars(2);
        a.setSound("bark");
        a.setTeeth(50);
        System.out.println("ears: "+a.getEars());
        System.out.println("legs: "+a.getLegs());
        System.out.println(a.getSound());

    }
}


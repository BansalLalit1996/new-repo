class mnkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
interface basicAnimal{
     void eat();
}
class man extends mnkey implements basicAnimal{
    public void eat(){
        System.out.println("eat");
    }
    void hit(){
        System.out.println("hit");
    }
}

public class abs_que {
    public static void main(String[] args) {
        man lalit = new man();
        lalit.jump();
        lalit.eat();
        lalit.hit();
        lalit.bite();

    }
}

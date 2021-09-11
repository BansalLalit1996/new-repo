class monkey {
    void jump() {
        System.out.println("jumping");
    }

    void bite() {
        System.out.println("biting");
    }
}
    interface Aanimal{
        void eat();
        void step();
        default void de(){
            System.out.println("interface");
        }
        }
     class human extends monkey implements Aanimal{
        public void run(){
            System.out.println("running");
        }
        public void eat(){
            System.out.println("eating");
        }
        public void step(){
            System.out.println("stepping");
        }
    }



public class qq2_{
    public static void main(String[] args) {
          human n = new human();
          n.run();
          n.jump();
          Aanimal M = new human();
          M.eat();
          M.de();
          M.run();
    }
}


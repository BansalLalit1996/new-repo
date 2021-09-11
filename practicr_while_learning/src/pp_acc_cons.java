class cylinder{
    float r;
    float h;

    public cylinder(float r, float h) {
        this.r = r;
        this.h = h;
    }

//    public void setrad(float n) {
//        this.r = n;
//    }
    public float getrad(){
        return r;
    }
//    public void sethie(float o){
//        this.h = o;
//    }
    public float gethie(){
        return h;
    }
    public float getsuracearea(){
        return (float) (4/3* Math.PI *r*r*h);
    }
}


public class pp_acc_cons {
    public static void main(String[] args) {
        cylinder a = new cylinder(4,5);
//        a.setrad(4);
//        a.sethie(5);
        System.out.println("radius is "+a.getrad());
        System.out.println("height is "+a.gethie());
        System.out.println("surface area is: "+a.getsuracearea());

    }
}

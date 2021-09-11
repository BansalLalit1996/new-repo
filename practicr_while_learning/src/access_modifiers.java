import java.util.Scanner;

class circle{
    private float r;
    public float getarea(){
        return (float) (3.14*r*r);
    }
    public void setradius(float n){
        r = n;
    }
    public float getperimeter(){
        return (float) (2*3.14*r);
    }
}

public class access_modifiers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radius");
        float d = sc.nextFloat();
        circle st = new circle();
        st.setradius(d);
        System.out.println("Area is: " + st.getarea() + "  and perimeter is: " + st.getperimeter());
    }
}

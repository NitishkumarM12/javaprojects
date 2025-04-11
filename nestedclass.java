class outer{
        void display(){
            System.out.println("outer class");
        }
        class inner{
            void show(){
                System.out.println("inner class");
            }
        }
}
public class nestedclass {
    public static void main(String[] args) {
        outer o = new outer();
        o.display();
        outer.inner i = o.new inner();
        i.show();
    }
}

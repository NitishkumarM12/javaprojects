class calc{
    int add(int a, int b){
        return a + b;
    }   
}
class advcalc extends calc{
    @Override
    int add(int a, int b){
        return a + b + 1;
    }
}
public class methodoverriding {
    public static void main(String[] args) {
        calc c = new calc();
        System.out.println(c.add(2, 3));
        advcalc ac = new advcalc();
        System.out.println(ac.add(2, 3));
    }   
}

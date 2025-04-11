public class constructorchain1 {
    int rollno;
    String name;
    String course;
    public constructorchain1() {
        this.rollno = 40;
        System.out.println("rollno:"+rollno);
    }
    public constructorchain1(constructorchain1 c) {
        rollno = c.rollno;
        name = c.name;
        course = c.course;
    }
    public constructorchain1(int rollno,String name, String course) {
        this();
        this.name = name;
        this.course = course;
        System.out.println("name:"+name+ "course:"+course+ "rollno:"+rollno);
    }
    public static void main(String[] args) {
        constructorchain1 c = new constructorchain1(10,"John","Computer Science");
        System.out.println("Object created with rollno: " + c.rollno + ", name: " + c.name + ", course: " + c.course);
    }
}

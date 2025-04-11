public class constructorchain {
    int rollno;
    String name;
    String course;
    public constructorchain() {
        this.rollno = 40;
        System.out.println("rollno:"+rollno);
    }
    public constructorchain(int rollno,String name, String course) {
        this();
        this.name = name;
        this.course = course;
        System.out.println("name:"+name+ "course:"+course+ "rollno:"+rollno);
    }
    public static void main(String[] args) {

        constructorchain c = new constructorchain(10,"John","Computer Science");
        System.out.println("Object created with rollno: " + c.rollno + ", name: " + c.name + ", course: " + c.course);
    }
}

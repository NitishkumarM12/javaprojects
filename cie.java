import java.util.Scanner;

public class cie {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int choice;
            do{
                System.out.println("----Arithemetic Operations----");
                System.out.println("1.Addition");
                System.out.println("2.Substraction");
    
                System.out.println("3.Multiplication");
    
                System.out.println("4.Division");
    
                System.out.println("5.Modulus");
                System.out.println("6.increment");
                System.out.println("7.decrement");


                System.out.println("8.exits");

    
                System.out.println("Enter your Choice");
    
                choice = scan.nextInt();
                if(choice >=1 && choice<=8 ){
                    
    
                    switch(choice){
                        case 1:int sum=0,n;
                        System.out.println("enter the no of input you want");
                        n= scan.nextInt();
                        System.out.println("Enter the numbers to be added");
                        for(int i=0;i<n;i++){
                            sum = sum + scan.nextInt();
                        }
                        
                        System.out.println("result "+ sum);
                        break;
                        case 2: int sub=0,n1;
                        System.out.println("enter the no of input you want");
                        n1= scan.nextInt();
                        System.out.println("Enter the numbers to be subtracted");
                        for(int i=0;i<n1;i++){
                            sub = sub - scan.nextInt();
                        }
                        
                        System.out.println("result "+ sub);
                        break;
                        
                        case 3:int mul=1,n2;
                        System.out.println("enter the no of input you want");
                        n2= scan.nextInt();
                        System.out.println("Enter the numbers to be multiplied");
                        for(int i=0;i<n2;i++){
                            mul = mul * scan.nextInt();
                        }
                        
                        System.out.println("result "+ mul);
                        break;
                        case 4:
                        System.out.println("Enter First operand");
                        double num5 = scan.nextInt();
                        System.out.println("Enter Second operand");
                        double num6 = scan.nextInt();
                         if(num6!=0){
                         System.out.println("result "+ (num5/num6));
                        }else{
                         System.out.println("Error dividing by 0");
                        }
                        break;
                        case 5: System.out.println("Enter First operand");
                        double num7 = scan.nextInt();
                        System.out.println("Enter Second operand");
                        double num8 = scan.nextInt();
                        
                        if(num8!=0){ 
                        System.out.println("result "+ (num7%num8));
                        }else{
                            System.out.println("Error modulus by 0");
    
                        }
                        break;
                        case 6:int inc=0;
                         System.out.println("enter a number");
                        int op=scan.nextInt();
                        inc=++op;
                        System.out.println("result: "+ inc);
                        break;
                        case 7:int dec=0;
                        System.out.println("enter a number");
                        int de=scan.nextInt();
                        dec=--de;
                        System.out.println("result: "+ dec);
                        break;
                        
                    }
                }else if(choice == 8){
                    System.out.println("Exiting... ");
                }else{
                    System.out.println("INvalid choice");
                }
            }while(choice != 8);
            scan.close();
        }
    
    
}
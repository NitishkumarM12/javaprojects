class Bank {
    public void getBalance() {
        System.out.println("The balance is 0.0");
    }
    
    double getRateOfInterest() {
        return 0.0;
    }
}
class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 4.0;
    }
}
class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 3.5;
    }
}

public class methodoverridingBANK {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        System.out.println("SBI Interest Rate: " + sbi.getRateOfInterest() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getRateOfInterest() + "%");
    }
}

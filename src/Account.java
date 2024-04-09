import java.util.Scanner;
class Account
{
    //states
    private String acc_holder_name;
    private long acc_no,contact;
    private double bal=0.0;
    static Scanner sc = new Scanner(System.in);


    //constructor
    private Account(){
        //LOI
    }
    private Account(String acc_holder_name, long acc_no, long contact){
        this.acc_holder_name=acc_holder_name;
        this.acc_no=acc_no;
        this.contact=contact;
    }
    //behaviour
    public String getName(){
        return acc_holder_name;
    }

    public long getNumber(){
        return acc_no;
    }

    public long getContact(){
        return contact;
    }

    public double getBalance(){
        return bal;
    }

    public void setName(String newName){
        if(verification()){
            System.out.print("\n\t\t Processing");
            System.out.println();
            this.acc_holder_name=newName;
        }
    }

    public void setContact(long newContact){
        if(verification()){
            System.out.print("\n\t\t Processing");
            System.out.println();
            this.contact=newContact;
        }
    }

    public void deposit(double amount){
        if(verification()){
            System.out.print("\n\t\t Processing");
            this.bal += amount;
            System.out.println("\t\t Amount credited...");
        }
    }

    public void withdraw(double amount){
        if (verification()) {
            if (bal >= amount){
                System.out.print("\n\t\t Processing");
                System.out.println();
                this.bal -= amount;
                System.out.println("\t\t Amount debited...");
            }
            else{
                System.out.println("\nInsufficient Balance..");
            }
        }
    }

    public static Account getAccount(String acc_holder_name, long acc_no, long contact)
    {
        return new Account(acc_holder_name,acc_no,contact);
    }

    public boolean verification() {
        try {
            System.out.println("\nEnter your Contact number: \n");
            long verify_contact = sc.nextLong();
            if (contact == verify_contact) {
                System.out.print("\n\t\tGenerating OTP");
                int s_otp = (int) (Math.random() * 9999 + 9999);
                Thread.sleep(450);
                System.out.print(".");
                Thread.sleep(450);
                System.out.print(".");
                Thread.sleep(450);
                System.out.print(".");
                Thread.sleep(2000);
                System.out.println("\n\nGenerated OTP is: " + s_otp);
                System.out.println("\n************************\n");
                System.out.println("\nEnter OTP: ");
                int u_otp = sc.nextInt();
                System.out.println("\n************************\n");
                System.out.print("VALIDATING");
                Thread.sleep(450);
                System.out.print(".");
                Thread.sleep(450);
                System.out.print(".");
                Thread.sleep(450);
                System.out.print(".");
                Thread.sleep(2000);
                if (s_otp == u_otp) {
                    return true;
                }

            }
            return false;
        } catch (InterruptedException e) {
            // Handle the exception or print an error message
            e.printStackTrace();
            return false;
        }
    }

}

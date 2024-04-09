import java.util.*;
class Driver
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) throws Exception{

        System.out.println("\n\t\t***  WELCOME to BANK-ACCOUNT Driver  ***\n");
        System.out.println("Enter Number of Account you wish to create: ");
        int noac = sc.nextInt();

        //Object creation
        Account[] accounts = new Account[noac];
        Bank bank = Bank.createBank("SBI Bank", "IFSC123", accounts);


        for (int i = 0; i < noac; i++){
            System.out.println("*****  Enter Your Account details #"+i+"  *****\n");
            System.out.println("\nEnter Account name: ");
            String name = sc.next();

            System.out.print("\nAccount Number generating ");
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(700);
            System.out.print(".");
            Thread.sleep(1000);
            System.out.print("\t\t\t**  Please Wait!  **\n");
            Thread.sleep(2500);

            long acc_no = (long) (Math.random() * 9000000000L) + 1000000000L;
            System.out.println("\nYour Account Number : "+acc_no);

            System.out.println("\nEnter Your Contact Number: ");
            long contact = sc.nextLong();

            accounts[i] = Account.getAccount(name, acc_no, contact);
            System.out.println("\n*********************************\n");
        }

        boolean main_repeat = true;
        do{
            System.out.println("\n\t\t***  Welcome to Account portal  ***\n");
            System.out.println("Choose an option: \n1.Get Information\t\t2.Set Information\n3.Exit\n");
            int main_choice=sc.nextInt();
            switch (main_choice) {
                case 1:{//Getter page
                    System.out.println("\t\t*** WELCOME TO GET INFO PAGE ***\n");
                    boolean get_repeat = true;
                    do{
                        System.out.println("\n***  Available Accounts  ***\n");
                        for(int i = 0; i < accounts.length;i++){
                            System.out.println((i+1)+"."+accounts[i].getName());
                            System.out.println();
                        }
                        System.out.println("Select option: \n1.Continue Viewing \t\t2.view contact\t\t4.Account below 500\n5.Exit");
                        int get_in = sc.nextInt();
                        switch(get_in)
                        {
                            case 1:{//get info
                                System.out.println("Select Number to View Account detials: ");
                                int getin = sc.nextInt();
                                System.out.println("Account Holder Name     : "+accounts[getin-1].getName());
                                System.out.println("Account Number          : "+accounts[getin-1].getNumber());
                                System.out.println("Account Holder Contact  : "+accounts[getin-1].getContact());
                                System.out.println("Account Balance         : "+accounts[getin-1].getBalance());
                                System.out.println("\n*********************************************************\n");
                                System.out.println("\nBank Details of "+accounts[getin-1].getName());
                                System.out.println("Bank Name   : "+bank.getBname());
                                System.out.println("Bank IFSC   : "+bank.getIfsc());
                                //System.out.println("Bank Accounts   : "+bank.getAccount());
                                break;
                            }
                            case 2:{
                                System.out.println("Enter contact: ");
                                long in_con = sc.nextLong();
                                bank.search(in_con);
                                break;
                            }
                            case 3:{break;}
                            case 4:{
                                bank.below500();
                                break;}
                            case 5:{//get_exit
                                get_repeat = false;
                                break;
                            }
                        }
                    }while(get_repeat);
                    break;
                }
                case 2:{//Setter page
                    System.out.println("\t\t*** WELCOME TO SET INFO PAGE ***\n");
                    boolean set_repeat = true;
                    do{
                        System.out.println("\n***  Available Accounts  ***\n");
                        for(int i = 0; i < accounts.length;i++){
                            System.out.println((i+1)+"."+accounts[i].getName());
                            System.out.println();
                        }
                        System.out.println("\nSelect option: \n1.Continue Transaction \t\t2.Exit\n");
                        int set_in = sc.nextInt();
                        switch (set_in) {
                            case 1:{//Operation
                                System.out.println("\nSelect Number to Get into an Account: \n");
                                int setin = sc.nextInt();
                                boolean operation = true;
                                do{
                                    System.out.println("\nSelect Operation which you want to perform: \n1.Deposit\t\t2.Withdraw\n3.Check Balance\t\t4.Change name\n5. Change contact\t\t6.Exit\n");
                                    int op = sc.nextInt();
                                    switch (op) {
                                        case 1:{//deposit
                                            System.out.println("*** Deposit Section ***\n");
                                            System.out.println("Enter amount: ");
                                            int amount = sc.nextInt();
                                            accounts[setin-1].deposit(amount);
                                            break;
                                        }
                                        case 2:{//withdraw
                                            System.out.println("*** Withdraw Section ***\n");
                                            System.out.println("Enter amount: ");
                                            int amount = sc.nextInt();
                                            accounts[setin-1].withdraw(amount);
                                            break;
                                        }
                                        case 3:{//check balance
                                            System.out.println("\n\t\tCurrent Balance: "+accounts[setin-1].getBalance());
                                            break;
                                        }
                                        case 4:{//change name
                                            System.out.println("*** Change Name Section ***\n");
                                            System.out.println("Enter New Name: \n");
                                            sc.nextLine();
                                            String name = sc.nextLine();
                                            accounts[setin-1].setName(name);
                                            break;
                                        }
                                        case 5:{//change contact
                                            System.out.println("*** Change Contact Section ***\n");
                                            System.out.println("Enter New contact: \n");
                                            sc.nextLine();
                                            long contact = sc.nextLong();
                                            accounts[setin-1].setContact(contact);
                                            break;
                                        }
                                        case 6:{//set_exit
                                            operation = false;
                                            break;
                                        }
                                    }
                                }while(operation);
                                break;
                            }
                            case 2:{//mian_exit
                                set_repeat = false;
                                break;
                            }
                        }
                    }while(set_repeat);
                    break;
                }
                case 3:{
                    main_repeat=false;
                    break;
                }
            }

        }while(main_repeat);
    }



}

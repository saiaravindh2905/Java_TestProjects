class Bank
{
    //states
    private String bname,ifsc;
    private Account [] accounts;

    //constructor
    private Bank(){
        //LOI
    }
    private Bank(String bname, String ifsc, Account[] accounts) {
        this.bname = bname;
        this.ifsc = ifsc;
        this.accounts = accounts;
    }

    //behaviour

    public String getBname() {
        return bname;
    }

    public String getIfsc() {
        return ifsc;
    }

    public Account[] getAccount(){
        return accounts;
    }

    public static Bank createBank(String bname, String ifsc, Account[] accounts) {
        return new Bank(bname, ifsc, accounts);
    }

    public void search(long contact){
        for (int i = 0;i < accounts.length; i++){
            if (accounts[i].getContact() == contact) {
                System.out.println("The Account with "+accounts[i].getNumber());
            }
        }
    }

    public void below500(){
        for (int i = 0;i < accounts.length; i++){
            if (accounts[i].getBalance() < 500) {
                System.out.println("The Account number less than 500 "+accounts[i].getNumber());
            }
        }
    }

    public void remove(long contact){
        for (int i = 0;i < accounts.length; i++){
            if (accounts[i].getContact() == contact) {
                System.out.println("Are you sure do you want to remove");
                accounts[i] = null;
            }
        }
    }


}

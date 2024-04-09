/* Dingi has 5000rs in her account.
She want to purchase 3 pairs of shoes.
Calculate the amount of purchasing the shoes
 and also display the final balance
 */
class test {
    public static void main(String[] args) {
        double wallet = 20000; // Dingi's Initial Balance.

               System.out.println("Initial Balance Amount  : " +wallet);
        int quantity = 3;
        double total = quantity*3000;
        wallet -= total;


               System.out.println("Amount used for product : "+total);
               System.out.println("Final Balance Amount    : "+wallet);


    }

}


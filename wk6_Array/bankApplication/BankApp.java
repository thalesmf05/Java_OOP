public class BankApp{
    public static void main(String[] args) {
        int count = 0;
        Account[] accounts = new Account[4];

        Account acc1 = new Account("Thales", "123-45", 2000.50);
        Account acc2 = new Account("Vinicius", "003-45", 10.99);

        accounts[count] = acc1;
        count++;
        accounts[count] = acc2;
        count++;

//        System.out.println(accounts[1]);
//        System.out.println(accounts[0].getBalance());

        accounts[0].deposit(200.00);

        //System.out.println(accounts[0].getBalance());

        accounts[0].withdraw(50.00);

        //System.out.println(accounts[0].getBalance());

        if(count == 0){
            System.out.println("No accounts to display");
        }else{
            for(int i = 0; i<count; i++){
                System.out.println(accounts[i]);
            }
        }

        for(int i = 0; i<count; i++){
            if(accounts[i].getAccountNum().equals("003-45")){
                System.out.println(accounts[i]);
            }
        }
    }
}

class Bank_Account {
    int Account_No;
    String User_Name;
    String Account_Type;
    String Email;
    int Account_Balance;

    public void GetAccountDetails(int Account_No, String User_Name, String Account_Type, String Email,
            int Account_Balance) {
        this.Account_No = Account_No;
        this.User_Name = User_Name;
        this.Account_Type = Account_Type;
        this.Email = Email;
        this.Account_Balance = Account_Balance;
    }

    public void DisplayAccountDetails() {
        System.out.println("Account Holder's No : " + this.Account_No);
        System.out.println("Account Holder's User_Name :  " + this.User_Name);
        System.out.println("Account Holder's Account Type : " + this.Account_Type);
        System.out.println("Account Holder's Email : " + this.Email);
        System.out.println("Account Holder's Account_Balance : " + this.Account_Balance);
    }
}

class Bank_Account1 {
    public static void main(String[] args) {
        Bank_Account ob = new Bank_Account();
        ob.GetAccountDetails(1011541, "Ram Mohan", "Current_Account", "rammohan156@gmail.com", 10000);
        ob.DisplayAccountDetails();
    }
}

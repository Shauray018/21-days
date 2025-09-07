public class CreditCard { 
    private String customer; 
    private String bank; 
    private String account; 
    private int limit; 
    protected double balance; 
    // Constructors
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) { 
        customer = cust; 
        bank = bk; 
        account = acnt; 
        limit = lim; 
        balance = initialBal; 
    }

    public CreditCard(String cust, String bk, String acnt, int lim) { 
        this(cust, bk, acnt, lim, 0.0);  //use a balance of 0 as default
    }

    public String getCustomer() { return customer;}
    public String getBank() { 
        return bank;
    }
    public String getAccount() { 
        return account; 
    }
    public int getLimit() { 
        return limit; 
    }
    public double getBalance() { 
        return balance;
    }

    public boolean charge(double price) { 
        if (price + balance > limit) { 
            return false; 
        } else { 
            balance += price; 
            return true;
        }
    }

    public void makePayment(double amount) { 
        balance -= amount;
    }

    public static void printSummary(CreditCard card) {
            System.out.println("Customer = " + card.customer);
            System.out.println("Bank = " + card.bank);
            System.out.println("Account = " + card.account);
            System.out.println("Balance = " + card.balance); 
            System.out.println("Limit = " + card.limit);
    }

    public static void main(String[] args) { 
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Shauray Dhingra", "HDFC Bank", "2323 2323 2323 2323", 4000); 
        wallet[1] = new CreditCard("Tag Jones", "Axis Bank", "2322 2323 2323 2323", 2000); 
        wallet[2] = new CreditCard("Rachel Green", "Blooming Dales Bank", "2323 7777 2323 2323", 19000); 
    }
}
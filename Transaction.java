public class Transaction {
    //main interface
    //create variables
    //create methods
    //(create a constructor)
    
    public String custID;
    public String item1, item2;
    public double price1. price2;
    public boolean done = false;

    public boolean fin = false;
    public boolean nextCustomer()
    {
        greet();
        while (!done)
        {
            scanItems();
        }
        checkOut();
        return fin;
    }

    public void greet()
    {
        System.out.println("Hello");
    } 
    public void scanItems() 
    {
        for(int i=0; i<3;i++)
        {
            System.out.println("Please scan the next item");
        }
        done=true;
    }
    public void checkOut()
    {
        System.out.println("Please pay me");
    }








}

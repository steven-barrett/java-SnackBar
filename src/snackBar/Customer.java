package snackBar;

public class Customer
{
    //#region Private Variables
    private static int maxID = 0;
    private int id;
    private String name;
    private double cashOnHand;    
    //#endregion
    
    //#region Constructor
    public Customer(String name, double cashOnHand)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }
    //#endregion
    
    //#region Public Properties
    public int getID()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public double getCashOnHand()
    {
        return cashOnHand;
    }
    //#endregion
    
    //#region Public Methods
    public void addCash(double amountAdded)
    {
        this.cashOnHand += amountAdded;
    }
    public void makePurchase(double cost)
    {
        this.cashOnHand -= cost;
    }
    //#endregion
    
}
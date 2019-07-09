package snackBar;

public class Snack 
{
    //#region   Private Variables
    public static int maxID = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineID;
    //#endregion

    //#region Constructor
    public Snack(String name, double cost, int vendingMachineID)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
    }
    //#endregion

    //#region Public Properties
    public int getID()
    {
        return id;
    }
    public void setID(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getQuantity()
    {
        return quantity;
    }
    
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineID()
    {
        return vendingMachineID;
    }
    public void setVendingMachineID(int vendingMachineID)
    {
        this.vendingMachineID = vendingMachineID;
    }
    //#endregion

    //#region Public Methods
    public void buySnacks(int amount)
    {
        this.quantity -= amount;
    }
    public void addQuantity(int amount)
    {
        this.quantity += amount;
    }
    public double getTotal(int quantity)
    {
        return cost * (double)quantity;
    }
    public void displayStats()
    {
        System.out.println("Snack Name: " + this.name);

        if (this.vendingMachineID == 1)
        {
            System.out.println("From the Food vending machine");
        }
        else
        {
            System.out.println("From the Drink vending machine");
        }

        System.out.println("There are " + this.quantity + " " + this.name + " left");

        double totalCost = quantity * cost;
        System.out.println("The total cost of remaining " + this.name + " = " + totalCost);


    }
    //#endregion
}
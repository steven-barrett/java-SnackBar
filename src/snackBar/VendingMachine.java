package snackBar;

public class VendingMachine
{
    //#region Private Variables  
    public static int maxID = 0; 
    private int id;
    private String name;
    //#endregion

    //#region Constructor
    public VendingMachine(String name)
    {
        maxID++;
        this.id = maxID;
        this.name = name;
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
    
    //#endregion

    //#region Public Methods
    //#endregion
    
    
}
public class Product
{
    private String name;
    private int quantity;

    public Product(String name, int quantity)
    {
        this.name = name;
        this.quantity = quantity;
    }

    /** Returns the name of the product */
    public String getName()
    {
        return name;
    }
    /** Returns the quantity of the product that is in stock
     * Postcondition: The value returned is greater than or equal to zero.
     */
    public int getQuantity()
    {
        return quantity;
    }
}
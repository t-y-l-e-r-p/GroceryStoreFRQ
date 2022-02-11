import java.util.ArrayList;

public class GroceryStore
{
    /** An array of products normally stocked at the grocery store
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private Product[] productsStocked;

    public GroceryStore(Product[] initialInventory)
    {
        productsStocked = initialInventory;
    }

    /** Returns an ArrayList of indices for Product elements in the
     *  productsStocked array that need to be reordered, as described in part (a)
     *  Precondition: min > 0 */
    public ArrayList<Integer> getReorderList(int min)
    {
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for(int i = 0; i < productsStocked.length; i++){
            if(productsStocked[i].getQuantity() <= min) {
                newList.add(i);
            }
        }
        return newList;
    }

    /** Returns true if all products named in shoppingList are available for purchase
     *  and returns false otherwise, as described in part (b)
     *  Precondition: The products named in shoppingList are found exactly once
     *  in the productsStocked array.
     */
    public boolean checkAvailability(ArrayList<String> shoppingList)
    {
        boolean good = true;
        for(String first : shoppingList)
        {
            boolean stock = false;
            for(Product str : productsStocked)
            {
                if(str.getName().equals(first))
                {
                    if(str.getQuantity() >= 1)
                    {
                        stock = true;
                    }
                }
            }
            if(!stock)
            {
                good = false;
            }
        }
        return good;
    }

    public ArrayList<Product> oversized(double weight)
    {
        ArrayList <Product> newList = new ArrayList<>();
        int index = 0;
        for(Product product : productsStocked)
        {
            if(product.getWeight() > weight)
            {
                newList.add(product);
            }
            index++;
        }
        return newList;
    }


}
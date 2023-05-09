import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Customer extends Catalog{
    public String Name;
    public String Address;
    public int PhoneNum;
    Scanner scanner = new Scanner(System.in);
    public List<Products> cart = new ArrayList<Products>();

    public boolean searchProducts(String ProdName){
        for (Products product : Product){
            if(product.ProductName.equals(ProdName)){
                return true;
            }
        }
        return false;
    }
    public boolean checkStatus(String productName) {
        for (Products product : Product) {
            if (product.ProductName.equals(productName)){
                return product.status.equals(StatusType.INstock);
            }
        }
        return false;
    }


    public void ViewCatalog(){
        DisplayCatalog();
    }
public void AddToCart(){
    Scanner scanner = new Scanner(System.in);
    boolean keepAdding = true;

    while (keepAdding) {
        System.out.println("Enter the product name you want to add to cart");
        String ProdName = scanner.next();
        if (searchProducts(ProdName)) {
            for (Products product : Product) {
                if(product.ProductName.equals(ProdName)){
                    if (checkStatus(ProdName)){
                        cart.add(product);
                        System.out.println("Product added to cart successfully");
                    }
                    else {
                        System.out.println("Sorry , Product is out of stock");
                    }
                }
            }
        } else {
            System.out.println("Product not found");
        }

        // Ask the user if they want to add more products to the cart
        System.out.println("Do you want to add more products to the cart? (Y/N)");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("N")) {
            keepAdding = false;
        }
    }
}

    public void ViewCart(){
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your cart contains the following products:");
            String header = String.format("%-30s%-20s%-40s%-20s%-20s%-20s%s",
                    "Product Name", "Category", "Description", "Price", "Discount", "Brand", "Status");
            System.out.println(header);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            for (Products product : cart) {
                String productInfo = String.format("%-30s%-20s%-40s%-20s%-20s%-20s%s",
                        product.ProductName, product.Category, product.Description, product.ProductPrice, product.ProductDiscount, product.Brand, product.status);
                System.out.println(productInfo);
            }
        }
    }
    public void CheckOut(){};
    public void ViewOrderHistory(){};
    public void EmailVerify(char Email){};


}

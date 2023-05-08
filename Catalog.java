import java.util.ArrayList;
import java.util.List;

public class Catalog {
    public List<Products> Product = new ArrayList<Products>();
    public void addProduct(){
        Product.add(new Products("Chocalate","coco","good item",30,0,"Dairy Milk",StatusType.INstock));
        Product.add(new Products("LollyPop","sweets","Bad item",10,0,"Marbella",StatusType.OUTofstock));
        Product.add(new Products("Candy","sweets","good item",50,0,"M&Ms",StatusType.INstock));
        Product.add(new Products("Cookies","Bakery","good item",100,0,"Oreo",StatusType.OUTofstock));
        Product.add(new Products("Gum","sweets","good item",5,0,"Mentos",StatusType.INstock));
        Product.add(new Products("Icecream","Ices","good item",15,0,"KitKat",StatusType.OUTofstock));
    };
public void DisplayCatalog() {
    addProduct();
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("|                                                  Product Catalog                                                                                                                   |");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.printf("| %-30s | %-20s | %-40s | %-10s | %-10s | %-20s | %-10s |\n", "Product Name", "Category", "Description", "Price", "Discount", "Brand", "Status");
    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    for (Products product : Product) {
        System.out.printf("| %-30s | %-20s | %-40s | %-10s | %-10s | %-20s | %-10s |\n",
                product.ProductName, product.Category, product.Description, product.ProductPrice, product.ProductDiscount, product.Brand, product.status);
    }

    System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
}


}


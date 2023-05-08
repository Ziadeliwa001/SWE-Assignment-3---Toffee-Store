public class Products {
    public String ProductName;
    public String Category;
    public String Description;
    public double ProductPrice;
    public int ProductDiscount;
    public String Brand;
    public StatusType status;

    public Products(String productName, String category, String description, double productPrice, int productDiscount, String brand, StatusType status) {
        ProductName = productName;
        Category = category;
        Description = description;
        ProductPrice = productPrice;
        ProductDiscount = productDiscount;
        Brand = brand;
        this.status = status;
    }
}

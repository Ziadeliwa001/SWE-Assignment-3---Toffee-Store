public class Admin extends Catalog{
    public int ID;
    public char PASSWORD;
    public void Admlogin(int id, char password){
        if(id == ID && password == PASSWORD)
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Failed");
        }

    };
    public void EditProducts()
    {
        System.out.println("Edit Products");
    };
    public void AddProduct(){
        System.out.println("Add Products");
    };
    public void DeleteProduct(){
        System.out.println("Delete Products");
    };

}

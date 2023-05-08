import java.util.ArrayList;
import java.util.List;
public class Orders {
    public int Ordernumber;
    public List<Products> ProductList = new ArrayList<Products>();
    public Customer customer;
    public String ShippingAddress;
    public Payment Pay;
    public int loyaltyPoints;
    public GiftVoucher giftvoucher;
    public double TotalOrderPrice;
    public boolean CheckOut(){
        return true;};
    public void Pay_Method(Payment p){};


}

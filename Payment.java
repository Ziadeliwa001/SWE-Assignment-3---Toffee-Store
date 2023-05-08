public class Payment {
    public char ShippingAddress;
    public int CardNumber;
    public void Pay(Orders o){};
    public void ValidateOTP(){};
    public void RedeemLoyaltyPoints(){};
    public void RedeemGiftVoucher(){};
    public void TotalPrice(){};
    public boolean confirmAddress(char Shipadd)
    {
        Shipadd = ShippingAddress;
        return true;
    };
    public boolean VerifyCardNum(int Cardnum)
    {
        Cardnum = CardNumber;
        return true;
    };


}

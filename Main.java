import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our TOFFEE Store ");
        System.out.println("1-Register");
        System.out.println("2-Login");
        System.out.println("3-Exit");
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                System.out.print("Enter email: ");
                String email = scanner.next();

                System.out.print("Enter name: ");
                String name = scanner.next();

                System.out.print("Enter password: ");
                String password = scanner.next();
                System.out.print("Enter confirm password: ");
                String confirmPassword = scanner.next();
                boolean flag = true;
                while(flag)
                {
                    if(Objects.equals(confirmPassword, password))
                    {
                        flag = false;

                    }
                    else {
                        System.out.print(" Doesn't match please Enter confirm password again: ");
                        confirmPassword = scanner.next();
                    }
                }
                System.out.print("Enter mobile number: ");
                int mobileNum = scanner.nextInt();

                System.out.print("Enter address: ");
                String address = scanner.next();
                Registration reg=new Registration(email,name,password, confirmPassword, mobileNum,address);

                if(reg.Emailregex(email) && reg.Passregex(password) && reg.Passregex(confirmPassword))
                {
                    System.out.println("Registration Successfully!");
                    reg.saveToFile("elkomy.txt");
                }
                else{
                    System.out.println("check the regex please");
                }
                scanner.close();
                break;
            case 2:
                Login log=new Login();

                System.out.println("Enter your Email :");
                String Email=scanner.next();
                log.setEmail(Email);

                System.out.println("Enter your Password :");
                String pass=scanner.next();
                log.setPassword(pass);

                if(log.ValidatePass(pass) && log.ValidateEmail(Email)){
                    System.out.println("Login successfully!");
                    System.out.println("1-Display Catalog");
                    System.out.println("2-Make Shopping and Add to cart");
                    System.out.println("3-Place order");
                    int choice2=scanner.nextInt();
                    switch (choice2){
                        case 1:
                            System.out.println("1-Display Catalog");
                            Catalog cat=new Catalog();
                            cat.DisplayCatalog();
                            break;
                        case 2:
                            Customer cust=new Customer();
                            cust.ViewCatalog();
                            cust.AddToCart();
                            System.out.println("Press 1 to View Your Cart");
                            int choice3=scanner.nextInt();
                            if(choice3==1)
                                cust.ViewCart();
                            break;
                        case 3:
                            System.out.println("3-Place order");
                            break;
                    }

                }
                else
                    System.out.println("Incorrect email or password");
                scanner.nextLine();//This method reads the entire line of input
                break;
            case 3:
                System.out.println("Exit");
                break;
        }


    }
}
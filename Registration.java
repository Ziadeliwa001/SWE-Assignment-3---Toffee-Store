import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration extends User {
    public String Name;
    public String ConfirmPassword;
    public int MobileNum;
    public String Address;

    public Registration(String email, String name, String password, String confirmPassword, int mobileNum, String address) {
        Email = email;
        Name = name;
        Password = password;
        ConfirmPassword = confirmPassword;
        MobileNum = mobileNum;
        Address = address;
    }


    public boolean Emailregex(String inputEmail) {
        String regex = "^[\\w-.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputEmail);
        return matcher.matches();
    }

    public boolean Passregex(String inputPass) {
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputPass);
        return matcher.matches();
    }



    public void saveToFile(String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true); // true flag to append data to file
            writer.write(Email + "," + Name + "," + Password + "," + ConfirmPassword + "," + MobileNum + "," + Address + "\n");
            writer.close();
            System.out.println("Data written to file " + filename + " successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file " + filename);
            e.printStackTrace();
        }
    }



}
//    public void EmailVerification(String EMAIL)
//    {
//        int  x = 25454;
//
//        if(EMAIL == Email)
//        {
//            System.out.println("Email Verified");
//        }
//        else
//        {
//            System.out.println("Email Not Verified");
//        }
//
//    }






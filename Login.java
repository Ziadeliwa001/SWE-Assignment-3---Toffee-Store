import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Login extends User implements Authentication{

    public void setPassword(String password) {
        Password = password;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public String getPassword() {
        return Password;
    }

    public String getEmail() {
        return Email;
    }

    @Override
    public boolean ValidatePass(String inputPassword) {
        try {
            FileReader reader = new FileReader("elkomy.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                if (fields[2].charAt(0) == inputPassword.charAt(0)) {
                    bufferedReader.close();
                    return true;
                }
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return false;
    }
    @Override
    public boolean ValidateEmail(String inputEmail) {
        try {
            FileReader reader = new FileReader("elkomy.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                if (fields[0].equals(inputEmail)) {
                    bufferedReader.close();
                    return true;
                }
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return false;
    }

}

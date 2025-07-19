package concepts.encapsulation;

class EmailAccount{
    private String email;
    private String password;

    public EmailAccount(String email, String password){
        this.email = email;
        this.password = password;
    }
    public boolean hasLettersandNumbers(String str){
        if(str == null || str.length() == 0){
            return false;
        }
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9]).*$";
        return str.matches(regex);
    }
    public void setPassword(String newPassword){
        if(newPassword.length() >= 8 && hasLettersandNumbers(newPassword)){
            this.password = newPassword;
        }else{
            System.out.println("Error: Weak Password. Choose a strong one");
        }
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public void getEmail(){
        System.out.println("Email Address: " + this.email);
    }
}
public class SecureEmailAccount {
    public static void main(String[] args) {
        EmailAccount emailAccount = new EmailAccount("fhye@gmail.com", "23567avgsfy%etry");
        emailAccount.setPassword("password");
        emailAccount.getEmail();
        emailAccount.setPassword("passW$6889ord");
        emailAccount.setEmail("etdy@gmail.com");
        emailAccount.getEmail();
    }
}

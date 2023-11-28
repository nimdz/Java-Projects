import java.util.Scanner;

public class Email {
   private  String firstName;
    private  String lastName;
    private  String password;
    private  String department;
    private String email;
    private  int mailboxCapacity;

    private int defaultpasswordLength=10;
    private  String alternateEmail;
    private String companySuffix="company.com";

    //constructor to receive first name and last name
    public Email(String firstName,String lastName){
          this.firstName=firstName;
          this.lastName=lastName;
          System.out.println("Email created:" +this.firstName+" "+this.lastName);

          //Call a method asking depatment
          this.department=setDepartment();
          System.out.println("Your Department is "+this.department);

          //method for generate random password
        this.password=randomPassword(defaultpasswordLength);
        System.out.println("Your Password:"+this.password);

        //combine elements to generate email
        email=firstName.toLowerCase()+"."+ lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your Email:"+email);

    }
    //ask for department
    private  String setDepartment(){
        System.out.println(" Department Codes:\n 1 for Sales.\n 2 for Dev \n 3 for  Accountant\n Enter Your Code:");
        Scanner in=new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice ==1 ){return "Sales";}
        else if (depChoice==2) {return "Dev";}
        else if (depChoice==3) {return "Acct";}
        else {return "";}

    }

    //generate randompassword
    private String randomPassword(int length){

        String passwordSet="ABCDEFGHIJKLMNOPQEIXYZ123456&%$#@";
        char [] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int) (Math.random() *passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);

    }

    //set mailbox capacity
}

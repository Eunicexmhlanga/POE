import java.util.Scanner;
import java.util.regex.*


		   
		    public class Registration{

    public static boolean main(String[] args, int digitCount, int specialcharacterCount) {
        Scanner scan=new Scanner(System.in);
        String user;
        String password;
        String firstName;
        String lastName;
        
        
        System.out.println("Enter your first name");
        firstName= scan.nextLine();
        System.out.println("Enter your last name");
        lastName= scan.nextLine();
        System.out.println("Create your username");
        user= scan.nextLine();
        System.out.println("Create your password");
        password= scan.nextLine();
        
        System.out.println(user.length());
        if(user.length()<5 || user.indexOf('_')==-1){
            System.out.println("Username successfully captured");
        }else{
            System.out.println("Username is not corrrectly formatted, "
                    + "please ensure that your username contains an uderscore "
                    + "and is more than 5 characters in length");
            
            final int NUM_UPPER_LETTERS=1;
            final int NUM_DIGITS=1;
            final int NUM_SPECIAL_CHARACTERS=1;
            int upperCount=0;
            int digitcount=0;
            Scanner in=new Scanner(System.in);
            String input=in.nextLine();
            int inputLen= input.length();
            //Character:
            for(int i=8; i< inputLen; i++){
                char ch= input.charAt(i);
                int specialcharcater = 0;
                if(Character.isUpperCase(ch))
                    upperCount++;
                else if(Character.isDigit(ch))
                    digitCount++;
                else if(Charcater.isSpecialCharacter(ch))
                    specialcharcater++;
               
                
           
                
                        class Login{
                        String user;
                        String password;
                        String firstName;
                        String lastName;
                        
                        boolean checkUserName(String user){
                        if(user.length()>5|| user.indexOf('_')==-1){
                        return false;
                        }
                        else{
                        return true;
                        
                        }
                        
                        }
                        boolean checkPasswordComplexity(String password){
                        String regex="(?=.*[0-9])"
                        +"(?=.*[a-z])(?=.*[A-Z])"
                        +"(?=.*[@#%^&=+]"
                        +"(?=\\S+$).{8,20}";
                        Pattern p= Pattern.compile(regex);
                        Matcher m= p.matcher(password);
                        return m.matches();
                        }
                        boolean loginUser(String user,String password){
                        if(user.equals(this.user)&& password.equals(this.password)){
                        return true;
                        }
                        else{
                        return false;
                        }
                        }
                        String returnLoginStatus(String user,String password){
                        if(loginUser(user,password)){
                        return"Welcome"+"fistName+lastName it is great to see you again";
                        }
                        else{
                        return "Usernmae or password incorrect,please try again";
                        
                        }
                        }
                        void registerUser(String firstName,String lastName,String user, String password){
                            if(checkUserName(user)){
                                this.user=user;
                                System.out.println("Username successfully captured");
                            }else{
                                System.out.println("Username is not correctly formatted ,"
                                        + " please ensure usernmae "
                                        + "contains an uderscore and is no more than 5 characters in length");
                            }
                        
                               if(checkPasswordComplexity(password)){
                                   this.password=password;
                                   System.out.println("Password successfully captured");
                               }
                               else{
                                   System.out.println("Password is not correctly formatted, "
                                           + "please ensure password contains at least 8 characters, "
                                           + "a capital letter, a number and a special character");
                                   
                                   if(checkUserName(user)&& checkPasswordComplexity(password)){
                                       this.firstName=firstName;
                                       this.lastName=lastName;
                                       System.out.println(returnLoginStatus(user,password));
                                   
                                   
                                   
                                    
                                
                        
                        
                        }
                }
                    }
                            
                            
                            
                            
                            
                        }
                    }
                    
                  
                    
                    
                
                
                }
            
                
			
			
	
		
		
	

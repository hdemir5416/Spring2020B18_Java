package day14_StringClass;

public class webAddress {
    public static void main(String[] args) {


    /*
          write a program that can validate if a web address is valid
            valid web address:
                   MUST start with www.
                   must ends with .com,or .edu or .net .Gov
                                   .COM   .EDU   .GOG
           */
        String website = "WWW.cybertek.Gov";
              website =   website.toLowerCase();

              boolean validEnding=website.endsWith(".com") || website.endsWith(".com")||
                      website.endsWith(".gov");

              if(website.startsWith("www.") && validEnding){
                  System.out.println("Valid address");

              }else{
                  System.out.println("invalid Address");
              }







    }
}

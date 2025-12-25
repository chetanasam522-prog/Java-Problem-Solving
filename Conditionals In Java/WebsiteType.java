/** # Problem Statement:-Write a program to find out the type of website from the url
                         .Com → Commertial website
                         .org → organization website
                         .in →Indian Website

# Logic: Check Website Type

. The program takes a website URL as input from the user.
. It checks the ending of the URL using the endsWith() method.
. If the URL ends with:
  .com → It is a Commercial website
  .org → It is an Organization website
  .in → It is an Indian website
. If none of the conditions match, the website type is reported as unknown.
. This approach ensures a simple and efficient way to identify website types.

# Time & Space Complexity
 . Time Complexity = O(n)
 . Space Complexity = O(n)

 # Solution:- **/

 import java.util.Scanner;

public class WebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a website URL: ");
        String url = sc.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        } 
        else if (url.endsWith(".org")) {
            System.out.println("This is an Organization website");
        } 
        else if (url.endsWith(".in")) {
            System.out.println("This is an Indian website");
        } 
        else {
            System.out.println("Website type not recognized");
        }

    }
}
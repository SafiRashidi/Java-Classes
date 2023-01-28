package class15;

public class EmailPractice {
    /*
    Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address. Example:
    createEmail(John, Snow, gmail) → johnsnow@gmail.com
    return type String
    name of method createEmail
    parameter => String users name, lastName and email type
     */

    String createEmail (String name, String lastName, String emailType) {
        return name + lastName + "@" + emailType + ".com";
    }

    public static void main(String[] args) {

        EmailPractice obj=new EmailPractice();
        String email = obj.createEmail("john","snow","gmail");
        System.out.println(email);
    }
}

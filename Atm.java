import java.util.*;
public class Atm {
    public static void main(String[] args) {
        int CARD_NO = 1234567890;
        int PASS = 1234;
        int ACCOUNT_BALANCE = 500;
        int TAKE_AMOUNT = 0;
        int CREDIT = 0;
        int pin;
        pin = PASS;
        Boolean run = true;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your card number: ");
            int number = scan.nextInt();
            System.out.print("Enter your card pin number: ");
            pin = scan.nextInt();
            if (number == CARD_NO && pin == PASS) {
                System.out.println();
                System.out.println("HELLO PDP");
                break;
            }
            else {
                System.out.println("incorrect password or card number");
            }
        }
        while (run) {
            System.out.println();
            System.out.println("Press 1 to Withdraw");
            System.out.println("Press 2 to Deposite");
            System.out.println("Press 3 to Change pin");
            System.out.println("Press 4 to Recipt");
            System.out.println("Press 5 to Exit");
            int num = scan.nextInt();
            System.out.println();
            switch (num) {
                case 1:
                    System.out.print("Enter your withdrawval amount: ");
                    TAKE_AMOUNT = scan.nextInt();
                    if(TAKE_AMOUNT<=ACCOUNT_BALANCE){
                        System.out.println("You have received the amount");
                        ACCOUNT_BALANCE -= TAKE_AMOUNT;
                        System.out.println("Your current balance: " + ACCOUNT_BALANCE);
                    }
                    else{
                        System.out.println("insuffcient balance");
                        System.out.println("Enter amount whithin " + ACCOUNT_BALANCE);
                    }

                    break;

                case 2:
                System.out.print("Enter deposite amount: ");
                    CREDIT = scan.nextInt();
                     if(CREDIT>0){
                        ACCOUNT_BALANCE += CREDIT;
                        System.out.println("Your current account balance: " + ACCOUNT_BALANCE );
                        break;
                     }
                     else{
                        System.out.println("Enter valid amount");
                     }

                case 3:
                System.out.print("Enter your old password: ");
                pin = scan.nextInt();
                System.out.println();
                if(pin==PASS){
                    System.out.print("Enter your new password: ");
                    pin = scan.nextInt();
                    PASS = pin;
                    System.out.println();
                    System.out.println("Your passoword successfully changed to: " + pin);
                }
                else{
                    System.out.println("Wrong password");
                } break;  

                case 4:
                System.out.println();
                System.out.println("Your recepit:");
                if (CREDIT!=0) {
                System.out.println("Amount deposited: " + CREDIT);
                }
                if ( TAKE_AMOUNT!=0) {
                System.out.println("Amount withdrawed: " + TAKE_AMOUNT);
                }
                if (pin!=PASS) {
                    System.out.println("You have changed the password to: " + pin);
                }
                if(CREDIT==0 && TAKE_AMOUNT==0 ){
                    System.out.println("Nothing have done");
                    System.out.print("\n");
                }
                break;

                case 5:
                run = false;
                System.out.println("THANKYOU FOR VISITING!");
                System.out.println("     COME AGAIN      ");
                System.out.println();
                
                default:
                if(num>5)
                System.out.println("Invalid choice! choose between 1 and 5");
                    break;

            }
        }

    }
}
//my password is 1234
import java.util.*;
class AtmPin {
    void checkPinLength(String pin){
        if(pin.length()==4){
            System.out.println("PIN length OK.");
        }
        else{
            System.out.println("Invalid PIN - must exactly be 4 digits.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pin = sc.nextLine();

        AtmPin obj = new AtmPin();
        obj.checkPinLength(pin);
        sc.close();
    }
}

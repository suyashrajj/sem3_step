import java.util.*;
class ProductInventoryCSVParser {
    void parseInventoryRecord(String csvLine){
        String[] details = csvLine.split(",");

        if(details.length!=3){
            System.out.println("Invalid Record");
        }
        else{
            System.out.println("Product: "+details[0]+" | SKU: "+details[1]+" | Qty: "+details[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String csvLine = sc.nextLine();
        ProductInventoryCSVParser obj = new ProductInventoryCSVParser();
        obj.parseInventoryRecord(csvLine);

        sc.close();
    }
}

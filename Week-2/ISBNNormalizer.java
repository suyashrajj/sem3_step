import java.util.*;
class ISBNNormalizer  {
    String normalizeCode(String raw){
        raw = raw.trim();

        String code = raw.substring(0,3).toUpperCase()+raw.substring(3);
        return code;
    }
    String validateAndFormat(String code){
        String format="";
        if(code.length()!=13){
            format+="length";
            return format;
        }
        else{
            for(int i=0;i<code.length();i++){
                char c = code.charAt(i);
                if(i<3){
                    if(Character.isLetter(c)!=true){
                        format+="publishercode";
                        return format;
                    }
                }
                else{
                    if(Character.isDigit(c)!=true){
                        format+="nondigitbody";
                        return format;
                    }
                }
            }
        }
        return format;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String raw = sc.nextLine();
        ISBNNormalizer obj = new ISBNNormalizer();
        String code  = obj.normalizeCode(raw);
        String format = obj.validateAndFormat(code);

        if(format.equals("length")){
            System.out.println("Invalid: code must be 13 characters");
        }
        else if(format.equals("publishercode")){
            System.out.println("Invalid: publisher code must be 3 letters");
        }
        else if(format.equals("nondigitbody")){
            System.out.println("Invalid: digit code must be 10 digits");
        }
        else{
            StringBuilder sb = new StringBuilder();
            sb.append("[").append(code.substring(0,3)).append("]").append(" YEAR: ").append(code.substring(3,7)).append(" | CATALOG: ").append(code.substring(7));

            System.out.println(sb);
        }

        sc.close();
    }
}

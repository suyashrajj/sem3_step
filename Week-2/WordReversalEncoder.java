import java.util.*;
class WordReversalEncoder {
    String reverseEachWord(String sentence){
        String[] sentarr = sentence.split(" ");
        String revsentence = "";

        for(int i=0;i<sentarr.length;i++){
            StringBuilder word = new StringBuilder(sentarr[i]);
            StringBuilder reverse = word.reverse();
            sentarr[i] = reverse.toString();
            revsentence+=sentarr[i]+" ";
        }
        return revsentence;
    }    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        WordReversalEncoder obj = new WordReversalEncoder();
        String revsentence = obj.reverseEachWord(sentence);
        System.out.println(revsentence);
        sc.close();
    }
}

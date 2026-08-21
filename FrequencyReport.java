import java.util.*;
class FrequencyReport  {
    void printFilteredWordFrequency(String feedback){
        feedback = feedback.toLowerCase();
        feedback = feedback.replaceAll("[.,]","");

        String[] words = feedback.split("\\s+");
        String[] uniqwords = new String[words.length];
        int k=0;
        
        for(int i=0;i<words.length;i++){
            boolean found = false;

            for(int j = 0; j < k; j++){
                if(words[i].equals(uniqwords[j])){
                    found = true;
                    break;
                }
            }

            if(!found){
                uniqwords[k] = words[i];
                k++;
            }
        }

        int[] freq = new int[uniqwords.length];

        for(int i=0;i<freq.length;i++){
            freq[i] = 0;
        }

        for(int i=0;i<words.length;i++){
            for(int j=0;j<uniqwords.length;j++){
                if(words[i].equals(uniqwords[j])&&(!words[i].equals("the")&&!words[i].equals("was")&&!words[i].equals("and")&&!words[i].equals("a")&&!words[i].equals("is"))){
                    freq[j]++;
                }
            }
        }

        for(int i=0;i<k;i++){
            for(int j=i+1;j<k;j++){
                if(freq[j]>freq[i]){
                    int temp = freq[i];
                    freq[i] = freq[j];
                    freq[j] = temp;

                    String temp2 = uniqwords[i];
                    uniqwords[i] = uniqwords[j];
                    uniqwords[j] = temp2;
                }
            }
        }

        for(int i=0;i<uniqwords.length;i++){
            if(freq[i]>0){
                System.out.println(uniqwords[i]+":"+freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String feedback = sc.nextLine();

        FrequencyReport obj = new FrequencyReport();
        obj.printFilteredWordFrequency(feedback);

        sc.close();
    }
}

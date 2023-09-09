public class reverseVowel{
    public static void reverseVow(String str){
        char[] ch = str.toCharArray();

        int i = 0;
        int j = ch.length-1;

        while(i < j){
            while(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u'){
                i++;
            }
            while(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u'){
                j--;
            }

            if(i > j){
                break;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;

        }

        for(char s: ch){
            System.out.print(s);
        }

    }
    public static void main( String args[]){
        String str = "hello";

        // for(int i = 0 ; i<str.length();i++){
        //     if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
        //         continue;
        //     }
        //     System.out.print(str.charAt(i));
        // }
        reverseVow(str);

    }
}
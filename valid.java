public class valid {
    public static void main(String[] args) {
        String s="A man,a plan,a canal : Panama";
        s=s.toLowerCase();
        StringBuilder b = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
        int n=b.length()-1;
        for(int i=0;i<b.length()/2;i++){
            if(b.charAt(i)!=b.charAt(n-1)){
            System.out.println("false");
            }
        }
        System.out.println(true);

        
    }
    
}

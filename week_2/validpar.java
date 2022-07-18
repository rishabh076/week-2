

public class validpar {
    public static void main(String[] args) {
        String s="aabaa";
        String s1="";
        int n=s.length();
        for(int i=0;i<s.length();i++)
        {
            if( i<n-1 && s.charAt(i)!=s.charAt(i+1))
            {
                continue;

            }
            else
            {
                s1+=s.charAt(i);
            }
         
        }
        System.out.println(s1);
       
      

        }
    }
    


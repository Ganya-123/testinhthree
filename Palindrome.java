package assignmenttwo;

public class Palindrome {
    public static void main(String[] args) {
        String value="cbbd";
        String longest="";
        for(int i=0;i<value.length();i++){
            String str=""+value.charAt(i);
            for(int j=i+1;j<value.length();j++){
                str=str+value.charAt(j);
                StringBuilder builder=new StringBuilder(str);

                if (builder.reverse().toString().equals(str) && str.length()>longest.length()){
                    longest=str;

                }
            }
        }
        System.out.println("longest is "+longest);
    }
    }

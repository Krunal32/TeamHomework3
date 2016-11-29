
public class reverse {

	public static void main (String[] args){
		
		String str = IO.readString();
	System.out.println(reverseWordByWord(str));
	//	System.out.println(reverseit(str));
		
		
		//str=str.toLowerCase();
		
	//	String reverse = "";
		//String temp = "";
		
		
			
		
		//str = reverse;
		
		/*char first = Character.toUpperCase(str.charAt(0));
		str = first+str.substring(1);
		
		
		if(Character.isLetter(str.charAt(str.length()-1))==true){
			char period = '.';
			str = str+period;
		}
		System.out.println(str);*/
		
	}
	
	
	public static String reverseWordByWord(String str){
        int strLeng = str.length()-1;
        String reverse = "", temp = "";

        for(int i = 0; i <= strLeng; i++){
            temp += str.charAt(i);
            if((str.charAt(i) == ' ') || (i == strLeng)){
                for(int j = temp.length()-1; j >= 0; j--){
                    reverse += temp.charAt(j);
                    if((j == 0) && (i != strLeng))
                        reverse += " ";
                }
                temp = "";
            }
        }

        return reverse;
    }
	
	
	
	public static String reverseit(String str){
		if(str.length()<=1){
			return str;
		}
		else
			return reverseit(str.substring(1))+str.charAt(0);
		}
	}
	


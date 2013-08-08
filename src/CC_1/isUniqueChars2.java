package CC_1;

public class isUniqueChars2 {
	public static boolean isUniqueChars2(String str){
	boolean[] char_set =new boolean[256];
	for (int i=0;i<str.length();i++){
		int val =str.charAt(i);
		if(char_set[val]) return false;
		char_set[val]=true;
		}
	return true;
	}
	
}

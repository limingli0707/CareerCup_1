package CC_4;
//Write a method to decide if two strings are anagrams or not.判断2 个字符串是否由相同的字符构成
//#1 可以排序
//#2
public class anagram {
	public static boolean anagram(String s, String t){
		if(s.length()!=t.length()) return false;
		int[] letters = new int[256];
		int num_unique_chars=0;
		int num_completed_t=0;
		char[] s_array=s.toCharArray();
		for(char c:s_array){
			if(letters[c]==0) num_unique_chars++;
			letters[c]++;
		}
		
		for(int i=0;i<t.length();i++){
			int c=(int) t.charAt(i);
			if(letters[c]==0) return false;
			letters[c]--;
			if(letters[c]==0){
				num_completed_t++;
				if(num_completed_t==num_unique_chars){
					return i==t.length()-1;
				}
			}
		}
		return false;
	}

}

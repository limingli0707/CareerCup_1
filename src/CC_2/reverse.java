package CC_2;

public class reverse {
    String reverse(String str){
    	if(str.length()==0) return null;
    	char [] arr =str.toCharArray();
    	char swap;
    	for(int begin =0,end=str.length()-1;begin<end;begin++,end--){
    		swap =arr[begin];
    		arr[begin]=arr[end];
    		arr[end]=swap;
    	}
    	return new String(arr);
    	
    }
}
/////////////////////////////////////////////////////////////////
/*问题：

给一个字符串，比如 “I love china”, 把字符反转后变成 “china love I”

思路：

先把字符串从第一个字符与最后一个字符对换，第二个字符和倒数第二个字符对换，这样，我们就把每一个单词位置互换了。但是我们要求单词里面字符的顺序是不能变的，所以，我们要把每一个单词里面的字符从头到尾对换一下。这样就可以得到我们想要的字符串了。

实现：

因为这里两次都会用到字符反转，所以我们就单独写一个swap的方法出来。我们对每个单词进行发转的时候，需要记录每个单词的起始点和结束点，对于第一个单词，起始点是0，最后一个单词，结束点是string.length() - 1。而中间的单词，开始点和结束点是空格的位置。
 * 
 */
 class StringReverse {
	
	public void swap(char[] arr, int begin, int end) {
		while(begin < end) {
			char temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			begin++;
			end--;
		}
	}
	
	public String swapWords(String str) {
		char[] arr = str.toCharArray();
		swap(arr, 0, arr.length - 1);
		int begin = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ' ') {
				swap(arr, begin, i - 1);
				begin = i + 1;
			}
		}
		swap(arr, begin, arr.length - 1);
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String str = "I";
		System.out.println(new StringReverse().swapWords(str));
	}

}
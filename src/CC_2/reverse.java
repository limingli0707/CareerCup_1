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
/*���⣺

��һ���ַ��������� ��I love china��, ���ַ���ת���� ��china love I��

˼·��

�Ȱ��ַ����ӵ�һ���ַ������һ���ַ��Ի����ڶ����ַ��͵����ڶ����ַ��Ի������������ǾͰ�ÿһ������λ�û����ˡ���������Ҫ�󵥴������ַ���˳���ǲ��ܱ�ģ����ԣ�����Ҫ��ÿһ������������ַ���ͷ��β�Ի�һ�¡������Ϳ��Եõ�������Ҫ���ַ����ˡ�

ʵ�֣�

��Ϊ�������ζ����õ��ַ���ת���������Ǿ͵���дһ��swap�ķ������������Ƕ�ÿ�����ʽ��з�ת��ʱ����Ҫ��¼ÿ�����ʵ���ʼ��ͽ����㣬���ڵ�һ�����ʣ���ʼ����0�����һ�����ʣ���������string.length() - 1�����м�ĵ��ʣ���ʼ��ͽ������ǿո��λ�á�
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
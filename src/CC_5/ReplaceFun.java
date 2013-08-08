package CC_5;

public class ReplaceFun {
	public static void ReplaceFun(char[] str,int length){
		int spaceCount=0,i=0,newLength;
		for(i=0;i<length;i++){
			if(str[i]==' ') spaceCount++;
		}
		newLength =length+spaceCount*2;
		str[newLength]=0;
		for(i=length-1;i>=0;i--){
			if(str[i]==' '){
				str[--newLength]='0';
				str[--newLength]='2';
				str[--newLength]='%';
			}
			else{
				str[--newLength]=str[i];
			}
		}
	}
	

}

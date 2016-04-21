
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
		int length=s.length();
		
		String curChar="";
		String curSub="";
		String longestSub="";
		for(int i=1;i<=length;i++){
			curChar=s.substring(i-1,i);
			curSub+=curChar;
			if(i<length){
			curChar=s.substring(i,i+1);
			for(int j=1;j<=curSub.length();j++){
				if(curChar.equals(curSub.substring(j-1,j))){

					
					if(longestSub.length()<curSub.length()){
						longestSub=curSub;

					}
					curSub="";
					
				}
				
			}
			}
			else{
				return longestSub.length();
			}
			
			
			
		}
		System.out.println(longestSub);
		return longestSub.length();
    }
	 public static void main(String[] args) {
		 LongestSubstring test = new LongestSubstring();
	        System.out.println(test.lengthOfLongestSubstring("abcdefabcdefghijkab"));
	    }

}

public class Solution {
	    public String intToRoman(int num) {
	    	if(num<1 || num>3999)  
	    	        return ""; 
	    	String[] romanNumber ={ "I", "IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	    	int[] number ={1,4,5,9,10,40,50,90,100,400,500,900,1000};
	    	int length=number.length;
	    	String out="";
	    	while (num>0){
	    		for(int i=length-1;i>=0;i--){
	    			while(num>=number[i]){
	    				num=num-number[i];
	    				out+=romanNumber[i];
	    			}
	    		}
	    	}
	        return out;
	    }
	    public static void main(String[]args){
	    	Solution test=new Solution();
	    	System.out.println(test.intToRoman(501)+"  501 Shoud be: DI");
	    	System.out.println(test.intToRoman(550)+"  550 Shoud be: DL");
	    	System.out.println(test.intToRoman(530)+"  530 Shoud be: DXXX");
	    	System.out.println(test.intToRoman(1800)+"  1800 Shoud be: MDCCC");
	    	System.out.println(test.intToRoman(900)+"  900 Shoud be: CM");
	    	System.out.println(test.intToRoman(707)+"  707 Shoud be: DCCVII");
	    	System.out.println(test.intToRoman(890)+"  890 Shoud be: DCCCXC");
	    	System.out.println(test.intToRoman(1500)+"  1500 Shoud be: MD");
	    }
	}



import java.util.*;
class RestoreIPAdress {
	
	 public List<String> restoreIpAddresses(String s) {
	        List<String> outPut = new ArrayList<String>();
	        String myTry = new String();
	        restoreHelper(myTry, outPut, s, 0, 1);
	        return outPut;
	    }
   
    public void restoreHelper(String cur, List<String> outPut, String s, int beginIndex, int round) {
    	if(round<4) {
            for(int i = beginIndex + 1; i < beginIndex + 4 && i < s.length(); i++) {
                String part = s.substring(beginIndex, i);
                if(validRange(Integer.parseInt(part))) {
                    if(!startWithZero(part) || (startWithZero(part) && part.equals("0"))) {
                        cur += s.substring(beginIndex, i) + ".";
                        restoreHelper(cur, outPut, s, i, round + 1);
                        cur = cur.substring(0, beginIndex + round - 1);
                    }
                }
            }
        }
    	else if (round==4) {
            if(beginIndex < s.length()) {
                String part = s.substring(beginIndex);
                if(part.length() <= 3 && validRange(Integer.parseInt(part))) {
                    if(!startWithZero(part) || (startWithZero(part) && part.equals("0"))) {
                        cur += part;
                        outPut.add(cur);
                    }
                }
            } 
        } 
    }

    public boolean startWithZero(String s) {
        if(s == null || s == "") {
            return false;
        } else if(s.charAt(0) == '0') {
            return true;
        } else {
            return false;
        }
    }
    public boolean validRange(int num) {
        return (num >= 0 && num <= 255);
    }

    public static void main(String[] args) {
    	RestoreIPAdress test = new RestoreIPAdress();
        System.out.print(test.restoreIpAddresses("2343323423"));
    }
}
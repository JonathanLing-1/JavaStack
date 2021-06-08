public class StringManipulator{
    public String trimAndConcat(String str1, String str2){
        String concatString = str1.trim().concat(str2.trim());
        return concatString;
    }
    public Integer getIndexOrNull(String str1, char c){
        int index = str1.indexOf(c);
        if(index==-1){
            return null;
        }else{
        return index;
        }
    }

    public Integer getIndexOrNull(String str1, String str2){
        int index = str1.indexOf(str2);
        if(index==-1){
            return null;
        }else{
        return index;
        }
    }

    public String concatSubstring(String str, int startI, int endI, String subStr){
        return str.substring(startI,endI).concat(subStr);
    }
}
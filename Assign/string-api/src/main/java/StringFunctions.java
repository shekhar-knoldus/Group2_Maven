public class StringFunctions {
    public int string_length(String str)
    {
        return str.length();
    }
    public  String string_reverse(String str)
    {
        StringBuffer strBfr= new StringBuffer(str);
        strBfr= strBfr.reverse();
        return  strBfr.toString();
    }
}

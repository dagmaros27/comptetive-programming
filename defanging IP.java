class Solution {
    public String defangIPaddr(String address) {
        String[] each = address.split("\\.");
        String defanged = "";
        for(String i : each){
            if(i != each[each.length-1])
             defanged += i + "[.]";
            else
                defanged += i;
        }
        return defanged;
    }
}

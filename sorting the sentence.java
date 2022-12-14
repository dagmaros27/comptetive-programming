class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String sorted = "";
        for(int i =1 ; i<arr.length+1;i++){
           for(int j=0;j<arr.length;j++){
               if(arr[j].endsWith(String.valueOf(i)))
                    sorted = sorted +" "+ arr[j].toString().substring(0, arr[j].length()-1);
           }
        }
        return sorted.trim(); 
    }
}

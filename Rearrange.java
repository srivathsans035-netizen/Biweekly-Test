class Rearrange {
    public static void main(String[] args) {
        String str = "Leetcode makes me happy";
        String str2 = "To be or not to be";
        String str3 = "Keep calm and carry on";
        String str4 = "";
        String str5 = "hello";
        Rearrange mn = new Rearrange();
        System.out.println(mn.rearrangeWords(str));
        System.out.println(mn.rearrangeWords(str2));
        System.out.println(mn.rearrangeWords(str3));
        System.out.println(mn.rearrangeWords(str4));
        System.out.println(mn.rearrangeWords(str5));


    }
    
     public String rearrangeWords(String s){
         if(s.length() == 0){
             return s;
         }
        String [] arr = s.toLowerCase().split(" ");
        if(arr.length == 1){
            return new String(arr[0]);
        }
        for(int i = 1; i < arr.length; i++){
                String key = arr[i];
                int j = i - 1;
                while(j >= 0 && arr[j].length() > key.length()){
                        arr[j+1] = arr[j];
                        j--;
                    }
                arr[j+1] = key;
            }

            String first = "";
            for(int i = 0; i < arr[0].length(); i++){
                if(i == 0){
                    first += Character.toUpperCase(arr[0].charAt(i));
                }
                else{
                    first += arr[0].charAt(i);
                }
            }
            arr[0] = first;
                
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < arr.length-1; i++){
                sb.append(arr[i] + " ");
            }
            sb.append(arr[arr.length-1]);
            return sb.toString();
        }  
}

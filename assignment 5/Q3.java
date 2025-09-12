class Q3{
    public static void main(String args[]){
        String s = "mam";
        String s1 = "";
        for(int i = s.length(); i>0; i--){
            s1 += s.charAt(i);

        }
        System.out.println("s1 : " + s1);
    }
}
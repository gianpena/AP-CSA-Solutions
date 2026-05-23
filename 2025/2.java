class SignedText{
    private String first_name, last_name;
    public SignedText(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public String getSignature(){
        if(first_name.length() == 0) return last_name;
        return first_name.substring(0,1) + "-" + last_name;
    }
    public String addSignature(String str){
        String signature = getSignature();
        if(str.indexOf(signature) == -1)
            return str + signature;
        if(str.length() >= signature.length() && str.substring(str.length()-signature.length()).equals(signature))
            return str;
        if(str.length() >= signature.length() && str.substring(0, signature.length()).equals(signature))
            return str.substring(signature.length()) + signature;
        return "";
    }
}
public String getShortenedName() {
    String shortened = "";

    for(int i=0; i<this.username.length();) {
        if (i+1 < this.username.length() && this.username.substring(i+1, i+2).equals("-"))
            i += 2;
        else {
            shortened += this.username.substring(i, i+1);
            i++;
        }
    }

    return shortened;
}
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        boolean lowercase=password.chars().anyMatch(c->Character.isLowerCase(c));
        if(!lowercase){
            return false;
        }
        boolean uppercase=password.chars().anyMatch(c->Character.isUpperCase(c));
        if(!uppercase){
            return false;
        }
        boolean isdigit=password.chars().anyMatch(c->Character.isDigit(c));
        if(!isdigit){
            return false;
        }

        boolean special=password.chars().anyMatch(c->"!@#$%^&*()-+".indexOf(c)!=-1);
        if(!special){
            return false;
        }
        for(int i=1;i<password.length();++i){
            if(password.charAt(i)==password.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}
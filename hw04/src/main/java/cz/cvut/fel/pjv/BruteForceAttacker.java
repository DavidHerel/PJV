package cz.cvut.fel.pjv;

public class BruteForceAttacker extends Thief {
    
    @Override
    public void breakPassword(int sizeOfPassword) {
        int size = sizeOfPassword;
        char[] chars = getCharacters();
        char[] password = new char[size];
        int depth = 0;
        recursion(0, size, password, chars);
    }
    
    private void recursion(int depth, int size, char[] password, char[] chars){
        if (depth == size){
            if (isOpened()){
                return;
            }
            else if (tryOpen(password)){
                return;
            } else{
                return;
            }
        }
        
        for (int i = 0; i < chars.length; i++){
            password[depth] = chars[i];
            recursion(depth+1, size, password, chars);
        }
    }
    
}

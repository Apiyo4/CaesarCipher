public class Encrypt {
    private int mKey;
    private String mName;

    public Encrypt(int mKey, String mName) {
        this.mKey = mKey;
        this.mName = mName;
    }

    public String getmName() {
        return mName;
    }

    public int getmKey() {
        return mKey;
    }
    public boolean nameContainsLetters(){
        char[] chars =  mName.toCharArray();
        for( char individualChars : chars){
           if(!Character.isLetter(individualChars)){
               return false;
           }
        }
        return true;
    }
    public boolean keyIsValid(){
        return mKey >=1 && mKey<25;
    }
}

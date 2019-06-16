public class Decrypt {
    private int mKey;
    private String mName;

    public Decrypt(int mKey, String mName) {
        this.mKey = mKey;
        this.mName = mName;
    }

    public String getName() {
        return mName;
    }

    public int getKey() {
        return mKey;
    }

    public boolean nameContainsLetters() {
        char[] chars = mName.toCharArray();
        for (char individualChars : chars) {
            if (!Character.isLetter(individualChars)) {
                return false;
            }
        }
        return true;
    }

    public boolean keyIsValid() {
        return mKey >= 1 && mKey < 25;
    }

    public String isDecrypt() {
        String result = "";
        for (int i = 0; i < mName.length(); i++) {
            char ch = mName.charAt(i);
            char shifted = (char) (ch - mKey);
            result += shifted;
        }
        return result;
    }
}

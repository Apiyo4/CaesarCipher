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
}

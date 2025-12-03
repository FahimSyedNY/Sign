public class Sign {
    private String msg;
    private int width;
    private int msglength;
    public Sign(String msg, int width) {
        this.msg = msg;
        this.width = width;
        msglength = msg.length();
    }
    public int numberOfLines() {
        if (msglength % width == 0) return msglength / width;
        return msglength / width + 1;
    }
    public String getLines() {
        String result = "";
        String[] list = msg.split("");
        if (msg.isEmpty()) return null;
        for (int i = 0; i < msglength; i++) {
            result += list[i];
            if (((i + 1) % width == 0) && i != msglength - 1) result += ";";
        }
        return result;
    }
}
public class Sign {
    private String msg;
    private int width;
    public Sign(String msg, int width) {
        this.msg = msg;
        this.width = width;
    }
    public int numberOfLines() {
        if (msg.length() % width == 0) return msg.length() / width;
        return msg.length() / width + 1;
    }
    public String getLines() {
        String result = "";
        String[] list = msg.split("");
        if (msg.isEmpty()) return null;
        for (int i = 0; i < list.length; i++) {
            result += list[i];
            if (((i + 1) % width == 0) && i != width) result += ";";
        }
        return result;
    }
}

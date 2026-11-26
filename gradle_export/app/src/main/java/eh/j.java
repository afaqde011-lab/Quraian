package eh;

public abstract class j implements n {
    public static String a(char c10) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static j b(String str) {
        int length = str.length();
        if (length == 0) {
            return c.F;
        }
        if (length != 1) {
            return length != 2 ? new d(str) : new g(str.charAt(0), str.charAt(1));
        }
        return new f(str.charAt(0), 0);
    }

    public abstract boolean c(char c10);

    public j d() {
        return new d(this);
    }
}

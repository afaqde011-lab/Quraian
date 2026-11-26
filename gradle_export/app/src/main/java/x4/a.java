package x4;

public final class a {

    public static final byte[] f16434e = new byte[1792];

    public final CharSequence f16435a;

    public final int f16436b;

    public int f16437c;

    public char f16438d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            f16434e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.f16435a = charSequence;
        this.f16436b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.f16437c - 1;
        CharSequence charSequence = this.f16435a;
        char cCharAt = charSequence.charAt(i10);
        this.f16438d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f16437c);
            this.f16437c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f16437c--;
        char c10 = this.f16438d;
        return c10 < 1792 ? f16434e[c10] : Character.getDirectionality(c10);
    }
}

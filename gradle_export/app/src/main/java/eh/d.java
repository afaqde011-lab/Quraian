package eh;

import java.util.Arrays;

public class d extends j {
    public final int A = 1;
    public final Object B;

    public d(j jVar) {
        jVar.getClass();
        this.B = jVar;
    }

    public d(String str) {
        char[] charArray = str.toString().toCharArray();
        this.B = charArray;
        Arrays.sort(charArray);
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.A) {
            case 0:
                break;
        }
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c10) {
        switch (this.A) {
            case 0:
                return Arrays.binarySearch((char[]) this.B, c10) >= 0;
            default:
                return !((j) this.B).c(c10);
        }
    }

    @Override
    public j d() {
        switch (this.A) {
            case 1:
                return (j) this.B;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.A) {
            case 0:
                StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c10 : (char[]) this.B) {
                    sb2.append(j.a(c10));
                }
                sb2.append("\")");
                return sb2.toString();
            default:
                return ((j) this.B) + ".negate()";
        }
    }
}

package eh;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class l implements w, kh.q {
    public final int A;
    public String B;

    public l(String str) {
        this.A = 0;
        str.getClass();
        this.B = str;
    }

    public l(String str, int i10) {
        this.A = i10;
        this.B = str;
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb2, Iterator it) {
        try {
            if (it.hasNext()) {
                sb2.append(c(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.B);
                    sb2.append(c(it.next()));
                }
            }
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb2 = new StringBuilder();
        a(sb2, it);
        return sb2.toString();
    }

    @Override
    public void h0(Throwable th2) {
        e7.a.n("MediaNtfMng", "custom command " + this.B + " produced an error: " + th2.getMessage(), th2);
    }

    @Override
    public Iterator k(c50.h hVar, CharSequence charSequence) {
        return new v(this, hVar, charSequence, 1);
    }

    @Override
    public void onSuccess(Object obj) {
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return g4.c.k(new StringBuilder("<"), this.B, '>');
            case 3:
                return this.B;
            default:
                return super.toString();
        }
    }
}

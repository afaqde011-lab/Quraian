package eh;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ta.c0;

public final class v implements Iterator {
    public String B;
    public final CharSequence C;
    public final j D;
    public int F;
    public final int G;
    public final w H;
    public int A = 2;
    public int E = 0;

    public v(w wVar, c50.h hVar, CharSequence charSequence, int i10) {
        this.G = i10;
        this.H = wVar;
        this.D = (j) hVar.C;
        this.F = hVar.B;
        this.C = charSequence;
    }

    @Override
    public final boolean hasNext() {
        String string;
        int length;
        j jVar;
        c0.A(this.A != 4);
        int iB = e4.f.b(this.A);
        if (iB == 0) {
            return true;
        }
        if (iB != 2) {
            this.A = 4;
            int i10 = this.E;
            while (true) {
                int length2 = this.E;
                if (length2 != -1) {
                    switch (this.G) {
                        case 0:
                            f fVar = (f) ((me.i) this.H).B;
                            CharSequence charSequence = this.C;
                            int length3 = charSequence.length();
                            c0.x(length2, length3);
                            while (true) {
                                if (length2 >= length3) {
                                    length2 = -1;
                                } else if (!fVar.c(charSequence.charAt(length2))) {
                                    length2++;
                                }
                                break;
                            }
                            break;
                        default:
                            l lVar = (l) this.H;
                            int length4 = lVar.B.length();
                            CharSequence charSequence2 = this.C;
                            int length5 = charSequence2.length() - length4;
                            while (true) {
                                if (length2 > length5) {
                                    length2 = -1;
                                    break;
                                } else {
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 >= length4) {
                                            break;
                                        } else if (charSequence2.charAt(i11 + length2) != lVar.B.charAt(i11)) {
                                            length2++;
                                        } else {
                                            i11++;
                                        }
                                    }
                                }
                            }
                            break;
                    }
                    CharSequence charSequence3 = this.C;
                    if (length2 == -1) {
                        length2 = charSequence3.length();
                        this.E = -1;
                    } else {
                        switch (this.G) {
                            case 0:
                                length = length2 + 1;
                                break;
                            default:
                                length = ((l) this.H).B.length() + length2;
                                break;
                        }
                        this.E = length;
                    }
                    int i12 = this.E;
                    if (i12 == i10) {
                        int i13 = i12 + 1;
                        this.E = i13;
                        if (i13 > charSequence3.length()) {
                            this.E = -1;
                        }
                    } else {
                        while (true) {
                            jVar = this.D;
                            if (i10 < length2 && jVar.c(charSequence3.charAt(i10))) {
                                i10++;
                            }
                        }
                        while (length2 > i10 && jVar.c(charSequence3.charAt(length2 - 1))) {
                            length2--;
                        }
                        int i14 = this.F;
                        if (i14 == 1) {
                            length2 = charSequence3.length();
                            this.E = -1;
                            while (length2 > i10 && jVar.c(charSequence3.charAt(length2 - 1))) {
                                length2--;
                            }
                        } else {
                            this.F = i14 - 1;
                        }
                        string = charSequence3.subSequence(i10, length2).toString();
                    }
                } else {
                    this.A = 3;
                    string = null;
                }
            }
            this.B = string;
            if (this.A != 3) {
                this.A = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.A = 2;
        String str = this.B;
        this.B = null;
        return str;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

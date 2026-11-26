package y8;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

public final class b {

    public final ArrayList f16777a;

    public final ArrayList f16778b;

    public final StringBuilder f16779c;

    public int f16780d;

    public int f16781e;

    public int f16782f;

    public int f16783g;

    public int f16784h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f16777a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f16778b = arrayList2;
        StringBuilder sb2 = new StringBuilder();
        this.f16779c = sb2;
        this.f16783g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb2.setLength(0);
        this.f16780d = 15;
        this.f16781e = 0;
        this.f16782f = 0;
        this.f16784h = i11;
    }

    public final void a(char c10) {
        StringBuilder sb2 = this.f16779c;
        if (sb2.length() < 32) {
            sb2.append(c10);
        }
    }

    public final void b() {
        StringBuilder sb2 = this.f16779c;
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - 1, length);
            ArrayList arrayList = this.f16777a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i10 = aVar.f16776c;
                if (i10 != length) {
                    return;
                }
                aVar.f16776c = i10 - 1;
            }
        }
    }

    public final d7.b c(int i10) {
        float f3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f16778b;
            if (i11 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i11));
            spannableStringBuilder.append('\n');
            i11++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i12 = this.f16781e + this.f16782f;
        int length = (32 - i12) - spannableStringBuilder.length();
        int i13 = i12 - length;
        int i14 = i10;
        if (i14 == Integer.MIN_VALUE) {
            if (this.f16783g != 2 || (Math.abs(i13) >= 3 && length >= 0)) {
                i14 = (this.f16783g != 2 || i13 <= 0) ? 0 : 2;
            } else {
                i14 = 1;
            }
        }
        if (i14 != 1) {
            if (i14 == 2) {
                i12 = 32 - length;
            }
            f3 = ((i12 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f3 = 0.5f;
        }
        int i15 = this.f16780d;
        if (i15 > 7) {
            i15 -= 17;
        } else if (this.f16783g == 1) {
            i15 -= this.f16784h - 1;
        }
        return new d7.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f3, i14, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f16779c);
        int length = spannableStringBuilder.length();
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f16777a;
            if (i14 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i14);
            boolean z11 = aVar.f16775b;
            int i16 = aVar.f16774a;
            if (i16 != 8) {
                boolean z12 = i16 == 7;
                if (i16 != 7) {
                    i13 = c.B[i16];
                }
                z10 = z12;
            }
            int i17 = aVar.f16776c;
            i14++;
            if (i17 != (i14 < arrayList.size() ? ((a) arrayList.get(i14)).f16776c : length)) {
                if (i10 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i17, 33);
                    i10 = -1;
                } else if (i10 == -1 && z11) {
                    i10 = i17;
                }
                if (i11 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i17, 33);
                    i11 = -1;
                } else if (i11 == -1 && z10) {
                    i11 = i17;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, i17, 33);
                    }
                    i12 = i13;
                    i15 = i17;
                }
            }
        }
        if (i10 != -1 && i10 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i11, length, 33);
        }
        if (i15 != length && i12 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i15, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f16777a.isEmpty() && this.f16778b.isEmpty() && this.f16779c.length() == 0;
    }
}

package d7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import java.util.ArrayList;
import java.util.Objects;
import ta.c0;

public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;

    public static final String f4739s;

    public static final String f4740t;

    public static final String f4741u;

    public static final String f4742v;

    public static final String f4743w;

    public static final String f4744x;

    public static final String f4745y;

    public static final String f4746z;

    public final CharSequence f4747a;

    public final Layout.Alignment f4748b;

    public final Layout.Alignment f4749c;

    public final Bitmap f4750d;

    public final float f4751e;

    public final int f4752f;

    public final int f4753g;

    public final float f4754h;

    public final int f4755i;

    public final float f4756j;

    public final float f4757k;
    public final boolean l;
    public final int m;

    public final int f4758n;

    public final float f4759o;

    public final int f4760p;

    public final float f4761q;

    public final int f4762r;

    static {
        new b(RuntimeVersion.SUFFIX, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = i0.f5136a;
        f4739s = Integer.toString(0, 36);
        f4740t = Integer.toString(17, 36);
        f4741u = Integer.toString(1, 36);
        f4742v = Integer.toString(2, 36);
        f4743w = Integer.toString(3, 36);
        f4744x = Integer.toString(18, 36);
        f4745y = Integer.toString(4, 36);
        f4746z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f3, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14, int i16) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            c0.s(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f4747a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f4747a = charSequence.toString();
        } else {
            this.f4747a = null;
        }
        this.f4748b = alignment;
        this.f4749c = alignment2;
        this.f4750d = bitmap;
        this.f4751e = f3;
        this.f4752f = i10;
        this.f4753g = i11;
        this.f4754h = f10;
        this.f4755i = i12;
        this.f4756j = f12;
        this.f4757k = f13;
        this.l = z10;
        this.m = i14;
        this.f4758n = i13;
        this.f4759o = f11;
        this.f4760p = i15;
        this.f4761q = f14;
        this.f4762r = i16;
    }

    public static b b(Bundle bundle) {
        ?? r7;
        Bitmap bitmapDecodeByteArray;
        float f3;
        int i10;
        float f10;
        int i11;
        int i12;
        ?? charSequence = bundle.getCharSequence(f4739s);
        boolean z10 = true;
        if (charSequence != 0) {
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(f4740t);
            if (parcelableArrayList != null) {
                charSequence = SpannableString.valueOf(charSequence);
                for (Bundle bundle2 : parcelableArrayList) {
                    int i13 = bundle2.getInt(d.f4769a);
                    int i14 = bundle2.getInt(d.f4770b);
                    int i15 = bundle2.getInt(d.f4771c);
                    int i16 = bundle2.getInt(d.f4772d, -1);
                    Bundle bundle3 = bundle2.getBundle(d.f4773e);
                    if (i16 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(g.f4774c);
                        string.getClass();
                        charSequence.setSpan(new g(string, bundle3.getInt(g.f4775d)), i13, i14, i15);
                    } else if (i16 == 2) {
                        bundle3.getClass();
                        charSequence.setSpan(new h(bundle3.getInt(h.f4778d), bundle3.getInt(h.f4779e), bundle3.getInt(h.f4780f)), i13, i14, i15);
                    } else if (i16 == 3) {
                        charSequence.setSpan(new e(), i13, i14, i15);
                    } else if (i16 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(i.f4784b);
                        string2.getClass();
                        charSequence.setSpan(new i(string2), i13, i14, i15);
                    }
                }
            }
        } else {
            charSequence = 0;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f4741u);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(f4742v);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f4743w);
        if (bitmap != null) {
            r7 = 0;
            bitmapDecodeByteArray = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(f4744x);
            if (byteArray != null) {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                r7 = 0;
            } else {
                r7 = charSequence;
                bitmapDecodeByteArray = null;
            }
        }
        String str = f4745y;
        if (bundle.containsKey(str)) {
            String str2 = f4746z;
            if (bundle.containsKey(str2)) {
                f3 = bundle.getFloat(str);
                i10 = bundle.getInt(str2);
            } else {
                f3 = -3.4028235E38f;
                i10 = Integer.MIN_VALUE;
            }
        } else {
            f3 = -3.4028235E38f;
            i10 = Integer.MIN_VALUE;
        }
        String str3 = A;
        int i17 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
        String str4 = B;
        float f11 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
        String str5 = C;
        int i18 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                float f12 = bundle.getFloat(str6);
                i11 = bundle.getInt(str7);
                f10 = f12;
            } else {
                f10 = -3.4028235E38f;
                i11 = Integer.MIN_VALUE;
            }
        } else {
            f10 = -3.4028235E38f;
            i11 = Integer.MIN_VALUE;
        }
        String str8 = F;
        float f13 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
        String str9 = G;
        float f14 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
        String str10 = H;
        if (bundle.containsKey(str10)) {
            i12 = bundle.getInt(str10);
        } else {
            i12 = -16777216;
            z10 = false;
        }
        int i19 = i12;
        boolean z11 = !bundle.getBoolean(I, false) ? false : z10;
        String str11 = J;
        int i20 = bundle.containsKey(str11) ? bundle.getInt(str11) : Integer.MIN_VALUE;
        String str12 = K;
        float f15 = bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
        String str13 = L;
        return new b(r7, alignment2, alignment4, bitmapDecodeByteArray, f3, i10, i17, f11, i18, i11, f10, f13, f14, z11, i19, i20, f15, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
    }

    public final a a() {
        a aVar = new a();
        aVar.f4723a = this.f4747a;
        aVar.f4724b = this.f4750d;
        aVar.f4725c = this.f4748b;
        aVar.f4726d = this.f4749c;
        aVar.f4727e = this.f4751e;
        aVar.f4728f = this.f4752f;
        aVar.f4729g = this.f4753g;
        aVar.f4730h = this.f4754h;
        aVar.f4731i = this.f4755i;
        aVar.f4732j = this.f4758n;
        aVar.f4733k = this.f4759o;
        aVar.l = this.f4756j;
        aVar.m = this.f4757k;
        aVar.f4734n = this.l;
        aVar.f4735o = this.m;
        aVar.f4736p = this.f4760p;
        aVar.f4737q = this.f4761q;
        aVar.f4738r = this.f4762r;
        return aVar;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f4747a;
        if (charSequence != null) {
            bundle.putCharSequence(f4739s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f4769a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f4774c, gVar.f4776a);
                    bundle2.putInt(g.f4775d, gVar.f4777b);
                    arrayList.add(d.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.f4778d, hVar.f4781a);
                    bundle3.putInt(h.f4779e, hVar.f4782b);
                    bundle3.putInt(h.f4780f, hVar.f4783c);
                    arrayList.add(d.a(spanned, hVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f4784b, iVar.f4785a);
                    arrayList.add(d.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f4740t, arrayList);
                }
            }
        }
        bundle.putSerializable(f4741u, this.f4748b);
        bundle.putSerializable(f4742v, this.f4749c);
        bundle.putFloat(f4745y, this.f4751e);
        bundle.putInt(f4746z, this.f4752f);
        bundle.putInt(A, this.f4753g);
        bundle.putFloat(B, this.f4754h);
        bundle.putInt(C, this.f4755i);
        bundle.putInt(D, this.f4758n);
        bundle.putFloat(E, this.f4759o);
        bundle.putFloat(F, this.f4756j);
        bundle.putFloat(G, this.f4757k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.f4760p);
        bundle.putFloat(K, this.f4761q);
        bundle.putInt(L, this.f4762r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.f4750d;
            if (TextUtils.equals(this.f4747a, bVar.f4747a) && this.f4748b == bVar.f4748b && this.f4749c == bVar.f4749c && ((bitmap = this.f4750d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f4751e == bVar.f4751e && this.f4752f == bVar.f4752f && this.f4753g == bVar.f4753g && this.f4754h == bVar.f4754h && this.f4755i == bVar.f4755i && this.f4756j == bVar.f4756j && this.f4757k == bVar.f4757k && this.l == bVar.l && this.m == bVar.m && this.f4758n == bVar.f4758n && this.f4759o == bVar.f4759o && this.f4760p == bVar.f4760p && this.f4761q == bVar.f4761q && this.f4762r == bVar.f4762r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4747a, this.f4748b, this.f4749c, this.f4750d, Float.valueOf(this.f4751e), Integer.valueOf(this.f4752f), Integer.valueOf(this.f4753g), Float.valueOf(this.f4754h), Integer.valueOf(this.f4755i), Float.valueOf(this.f4756j), Float.valueOf(this.f4757k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.f4758n), Float.valueOf(this.f4759o), Integer.valueOf(this.f4760p), Float.valueOf(this.f4761q), Integer.valueOf(this.f4762r));
    }
}

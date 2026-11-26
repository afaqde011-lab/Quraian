package androidx.media3.common;

import android.net.Uri;
import android.util.SparseBooleanArray;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.play_billing.e4;

public class q implements o.w, qi.k, androidx.lifecycle.g0 {
    public final int A;
    public boolean B;
    public Object C;

    public q() {
        this.A = 0;
        this.C = new SparseBooleanArray();
    }

    public q(int i10) {
        this.A = i10;
    }

    public q(Uri uri, boolean z10, boolean z11) {
        this.A = 4;
        this.C = uri;
        this.B = z10;
    }

    public q(Object obj, int i10) {
        this.A = i10;
        this.C = obj;
    }

    public q(Object obj, int i10, boolean z10) {
        this.A = i10;
        this.C = obj;
        this.B = true;
    }

    public q(Object obj, boolean z10, int i10) {
        this.A = i10;
        this.C = obj;
        this.B = z10;
    }

    public q(String str, boolean z10) {
        this.A = 3;
        this.B = z10;
        this.C = str;
    }

    public q(me.d dVar, hf.c cVar) {
        this.A = 14;
        this.B = false;
        this.C = cVar;
    }

    public q(x4.e eVar, boolean z10) {
        this(eVar, 13);
        this.A = 13;
        this.B = z10;
    }

    @Override
    public void a(qi.j jVar, int i10) {
        StringBuilder sb2 = (StringBuilder) this.C;
        if (this.B) {
            this.B = false;
        } else {
            sb2.append(", ");
        }
        sb2.append(i10);
    }

    @Override
    public void b(Object obj) {
        hf.c cVar = (hf.c) this.C;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.B;
        signInHubActivity.setResult(signInHubActivity.D, signInHubActivity.E);
        signInHubActivity.finish();
        this.B = true;
    }

    @Override
    public void c(o.l lVar, boolean z10) {
        p.j jVar;
        k.k0 k0Var = (k.k0) this.C;
        if (this.B) {
            return;
        }
        this.B = true;
        ActionMenuView actionMenuView = k0Var.f8414a.f12208a.A;
        if (actionMenuView != null && (jVar = actionMenuView.T) != null) {
            jVar.h();
            p.f fVar = jVar.T;
            if (fVar != null && fVar.b()) {
                fVar.f11464i.dismiss();
            }
        }
        k0Var.f8415b.onPanelClosed(108, lVar);
        this.B = false;
    }

    public void d(int i10) {
        ta.c0.A(!this.B);
        ((SparseBooleanArray) this.C).append(i10, true);
    }

    public void e(r rVar) {
        for (int i10 = 0; i10 < rVar.f1465a.size(); i10++) {
            d(rVar.b(i10));
        }
    }

    public void f(int... iArr) {
        for (int i10 : iArr) {
            d(i10);
        }
    }

    public r g() {
        ta.c0.A(!this.B);
        this.B = true;
        return new r((SparseBooleanArray) this.C);
    }

    public boolean h() {
        return this.B;
    }

    public boolean i(CharSequence charSequence, int i10) {
        if (charSequence == null || i10 < 0 || charSequence.length() - i10 < 0) {
            throw new IllegalArgumentException();
        }
        x4.e eVar = (x4.e) this.C;
        if (eVar == null) {
            return h();
        }
        eVar.getClass();
        char c10 = 0;
        c10 = 2;
        for (int i11 = 0; i11 < i10 && c10 == 2; i11++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i11));
            q qVar = x4.f.f16449a;
            if (directionality == 0) {
                c10 = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c10 = 1;
                        continue;
                    case 16:
                    case 17:
                        break;
                    default:
                        c10 = 2;
                        continue;
                }
            }
        }
        if (c10 == 0) {
            return true;
        }
        if (c10 != 1) {
            return h();
        }
        return false;
    }

    public void j() {
        this.B = false;
    }

    public void k(byte b7) {
        ((qd.j0) this.C).q(String.valueOf(b7));
    }

    public void l(char c10) {
        qd.j0 j0Var = (qd.j0) this.C;
        j0Var.h(j0Var.B, 1);
        char[] cArr = (char[]) j0Var.C;
        int i10 = j0Var.B;
        j0Var.B = i10 + 1;
        cArr[i10] = c10;
    }

    public void m(int i10) {
        ((qd.j0) this.C).q(String.valueOf(i10));
    }

    public void n(long j9) {
        ((qd.j0) this.C).q(String.valueOf(j9));
    }

    public void o(String str) {
        kotlin.jvm.internal.m.e(str, "v");
        ((qd.j0) this.C).q(str);
    }

    public void p(short s6) {
        ((qd.j0) this.C).q(String.valueOf(s6));
    }

    public void q(String str) {
        byte b7;
        kotlin.jvm.internal.m.e(str, "value");
        qd.j0 j0Var = (qd.j0) this.C;
        j0Var.h(j0Var.B, str.length() + 2);
        char[] cArr = (char[]) j0Var.C;
        int i10 = j0Var.B;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c10 = cArr[i13];
            byte[] bArr = r40.w.b;
            if (c10 < bArr.length && bArr[c10] != 0) {
                int length2 = str.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    j0Var.h(i13, 2);
                    char cCharAt = str.charAt(i14);
                    byte[] bArr2 = r40.w.b;
                    if (cCharAt >= bArr2.length || (b7 = bArr2[cCharAt]) == 0) {
                        int i15 = i13 + 1;
                        ((char[]) j0Var.C)[i13] = cCharAt;
                        i13 = i15;
                    } else if (b7 == 1) {
                        String str2 = r40.w.a[cCharAt];
                        kotlin.jvm.internal.m.b(str2);
                        j0Var.h(i13, str2.length());
                        str2.getChars(0, str2.length(), (char[]) j0Var.C, i13);
                        int length3 = str2.length() + i13;
                        j0Var.B = length3;
                        i13 = length3;
                    } else {
                        char[] cArr2 = (char[]) j0Var.C;
                        cArr2[i13] = '\\';
                        cArr2[i13 + 1] = (char) b7;
                        i13 += 2;
                        j0Var.B = i13;
                    }
                }
                j0Var.h(i13, 1);
                ((char[]) j0Var.C)[i13] = '\"';
                j0Var.B = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        j0Var.B = i12 + 1;
    }

    public void r() {
    }

    public void s() {
    }

    public void t(e4 e4Var) {
        if (this.B) {
            com.google.android.gms.internal.play_billing.q.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            ((ce.c) this.C).D(new ud.a(null, e4Var, ud.d.A, null), new uh.k(13));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.q.h("BillingLogger", "logging failed.");
        }
    }

    public String toString() {
        switch (this.A) {
            case 5:
                return this.B ? "FALL_THROUGH" : String.valueOf(this.C);
            case 14:
                return ((hf.c) this.C).toString();
            default:
                return super.toString();
        }
    }

    public k4 u(long j9, String str) {
        Long lValueOf = Long.valueOf(j9);
        Object obj = k4.f3792g;
        return new k4(this, str, lValueOf, 0);
    }

    public k4 v(String str, boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        Object obj = k4.f3792g;
        return new k4(this, str, boolValueOf, 1);
    }

    public k4 w(String str, String str2) {
        Object obj = k4.f3792g;
        return new k4(this, str, str2, 3);
    }

    @Override
    public boolean x(o.l lVar) {
        ((k.k0) this.C).f8415b.onMenuOpened(108, lVar);
        return true;
    }
}

package c7;

import android.content.Context;
import android.util.Log;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.internal.play_billing.q1;
import e30.a0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import sd.h2;
import sd.q0;
import sd.u0;
import sd.w0;
import sd.y0;
import z4.o0;

public final class g implements o0 {

    public int f2904a;

    public boolean f2905b;

    public Object f2906c;

    public g(int i10) {
        this.f2905b = false;
        this.f2906c = sd.d.B;
        this.f2904a = i10;
    }

    public g(Context context) {
        this.f2906c = context;
        this.f2904a = -1;
    }

    public g(a0 a0Var, int i10, boolean z10) {
        this.f2906c = a0Var;
        this.f2904a = i10;
        this.f2905b = z10;
    }

    public g(MessageDigest messageDigest, int i10) {
        ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.f2906c = messageDigest;
        this.f2904a = i10;
    }

    public static int d(ArrayList arrayList, int i10, w0 w0Var) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = arrayList.get(i10);
        u0 u0Var = w0Var.f14130b;
        if (obj != u0Var) {
            return -1;
        }
        Iterator it = u0Var.a().iterator();
        while (it.hasNext()) {
            if (((y0) it.next()) == w0Var) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static ArrayList f(sd.c cVar) {
        ArrayList arrayList = new ArrayList();
        while (!cVar.y()) {
            String str = (String) cVar.f4032d;
            String strSubstring = null;
            if (!cVar.y()) {
                int i10 = cVar.f4030b;
                char cCharAt = str.charAt(i10);
                if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                    cVar.f4030b = i10;
                } else {
                    int iH = cVar.h();
                    while (true) {
                        if ((iH < 65 || iH > 90) && (iH < 97 || iH > 122)) {
                            break;
                        }
                        iH = cVar.h();
                    }
                    strSubstring = str.substring(i10, cVar.f4030b);
                }
            }
            if (strSubstring == null) {
                break;
            }
            try {
                arrayList.add(sd.d.valueOf(strSubstring));
            } catch (IllegalArgumentException unused) {
            }
            if (!cVar.b0()) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean i(sd.m mVar, int i10, ArrayList arrayList, int i11, w0 w0Var) {
        sd.n nVar = (sd.n) mVar.f14022a.get(i10);
        if (!l(nVar, w0Var)) {
            return false;
        }
        int i12 = nVar.f14025a;
        if (i12 == 1) {
            if (i10 != 0) {
                while (i11 >= 0) {
                    if (!k(mVar, i10 - 1, arrayList, i11)) {
                        i11--;
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 2) {
            return k(mVar, i10 - 1, arrayList, i11);
        }
        int iD = d(arrayList, i11, w0Var);
        if (iD <= 0) {
            return false;
        }
        return i(mVar, i10 - 1, arrayList, i11, (w0) w0Var.f14130b.a().get(iD - 1));
    }

    public static boolean j(sd.m mVar, w0 w0Var) {
        ArrayList arrayList = new ArrayList();
        Object obj = w0Var.f14130b;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((y0) obj).f14130b;
        }
        int size = arrayList.size() - 1;
        ArrayList arrayList2 = mVar.f14022a;
        if ((arrayList2 == null ? 0 : arrayList2.size()) == 1) {
            return l((sd.n) mVar.f14022a.get(0), w0Var);
        }
        ArrayList arrayList3 = mVar.f14022a;
        return i(mVar, (arrayList3 != null ? arrayList3.size() : 0) - 1, arrayList, size, w0Var);
    }

    public static boolean k(sd.m mVar, int i10, ArrayList arrayList, int i11) {
        sd.n nVar = (sd.n) mVar.f14022a.get(i10);
        w0 w0Var = (w0) arrayList.get(i11);
        if (!l(nVar, w0Var)) {
            return false;
        }
        int i12 = nVar.f14025a;
        if (i12 == 1) {
            if (i10 != 0) {
                while (i11 > 0) {
                    i11--;
                    if (k(mVar, i10 - 1, arrayList, i11)) {
                    }
                }
                return false;
            }
            return true;
        }
        if (i12 == 2) {
            return k(mVar, i10 - 1, arrayList, i11 - 1);
        }
        int iD = d(arrayList, i11, w0Var);
        if (iD <= 0) {
            return false;
        }
        return i(mVar, i10 - 1, arrayList, i11, (w0) w0Var.f14130b.a().get(iD - 1));
    }

    public static boolean l(sd.n nVar, w0 w0Var) {
        ArrayList arrayList;
        String str = nVar.f14026b;
        if (str != null && !str.equals(w0Var.o().toLowerCase(Locale.US))) {
            return false;
        }
        ArrayList<sd.b> arrayList2 = nVar.f14027c;
        if (arrayList2 != null) {
            for (sd.b bVar : arrayList2) {
                String str2 = bVar.f13948a;
                String str3 = bVar.f13950c;
                if (str2.equals("id")) {
                    if (!str3.equals(w0Var.f14103c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (arrayList = w0Var.f14107g) == null || !arrayList.contains(str3)) {
                    return false;
                }
            }
        }
        ArrayList arrayList3 = nVar.f14028d;
        if (arrayList3 == null) {
            return true;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            if (!((sd.e) it.next()).a(w0Var)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void a() {
        this.f2905b = true;
    }

    @Override
    public void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f2905b = false;
    }

    @Override
    public void c() {
        if (this.f2905b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f2906c;
        actionBarContextView.F = null;
        super/*android.view.View*/.setVisibility(this.f2904a);
    }

    public void e(db.g gVar, sd.c cVar) throws sd.a {
        int iIntValue;
        char cCharAt;
        int iH0;
        String strJ0 = cVar.J0();
        cVar.c0();
        if (strJ0 == null) {
            throw new sd.a("Invalid '@' rule");
        }
        int i10 = 0;
        if (!this.f2905b && strJ0.equals("media")) {
            ArrayList arrayListF = f(cVar);
            if (!cVar.u('{')) {
                throw new sd.a("Invalid @media rule: missing rule set");
            }
            cVar.c0();
            sd.d dVar = (sd.d) this.f2906c;
            Iterator it = arrayListF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    h(cVar);
                    break;
                }
                sd.d dVar2 = (sd.d) it.next();
                if (dVar2 == sd.d.A || dVar2 == dVar) {
                    this.f2905b = true;
                    gVar.d(h(cVar));
                    this.f2905b = false;
                    break;
                }
            }
            if (!cVar.y() && !cVar.u('}')) {
                throw new sd.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f2905b || !strJ0.equals("import")) {
            Log.w("CSSParser", "Ignoring @" + strJ0 + " rule");
            while (!cVar.y() && ((iIntValue = cVar.L().intValue()) != 59 || i10 != 0)) {
                if (iIntValue != 123) {
                    if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                        break;
                    }
                } else {
                    i10++;
                }
            }
        } else {
            String strI0 = null;
            if (!cVar.y()) {
                int i11 = cVar.f4030b;
                if (cVar.v("url(")) {
                    cVar.c0();
                    String strI1 = cVar.I0();
                    if (strI1 == null) {
                        String str = (String) cVar.f4032d;
                        StringBuilder sb2 = new StringBuilder();
                        while (!cVar.y() && (cCharAt = str.charAt(cVar.f4030b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !q1.I(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                            cVar.f4030b++;
                            if (cCharAt == '\\') {
                                if (!cVar.y()) {
                                    int i12 = cVar.f4030b;
                                    cVar.f4030b = i12 + 1;
                                    cCharAt = str.charAt(i12);
                                    if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                                        int iH1 = sd.c.H0(cCharAt);
                                        if (iH1 != -1) {
                                            for (int i13 = 1; i13 <= 5 && !cVar.y() && (iH0 = sd.c.H0(str.charAt(cVar.f4030b))) != -1; i13++) {
                                                cVar.f4030b++;
                                                iH1 = (iH1 * 16) + iH0;
                                            }
                                            sb2.append((char) iH1);
                                        }
                                    }
                                }
                            }
                            sb2.append(cCharAt);
                        }
                        strI1 = sb2.length() == 0 ? null : sb2.toString();
                    }
                    if (strI1 == null) {
                        cVar.f4030b = i11;
                    } else {
                        cVar.c0();
                        if (cVar.y() || cVar.v(")")) {
                            strI0 = strI1;
                        } else {
                            cVar.f4030b = i11;
                        }
                    }
                }
            }
            if (strI0 == null) {
                strI0 = cVar.I0();
            }
            if (strI0 == null) {
                throw new sd.a("Invalid @import rule: expected string or url()");
            }
            cVar.c0();
            f(cVar);
            if (!cVar.y() && !cVar.u(';')) {
                throw new sd.a("Invalid @media rule: expected '}' at end of rule set");
            }
        }
        cVar.c0();
    }

    public boolean g(db.g gVar, sd.c cVar) throws sd.a {
        ArrayList<sd.m> arrayListK0 = cVar.K0();
        if (arrayListK0 == null || arrayListK0.isEmpty()) {
            return false;
        }
        if (!cVar.u('{')) {
            throw new sd.a("Malformed rule block: expected '{'");
        }
        cVar.c0();
        q0 q0Var = new q0();
        do {
            String strJ0 = cVar.J0();
            cVar.c0();
            if (!cVar.u(':')) {
                throw new sd.a("Expected ':'");
            }
            cVar.c0();
            String str = (String) cVar.f4032d;
            String strSubstring = null;
            if (!cVar.y()) {
                int i10 = cVar.f4030b;
                int iCharAt = str.charAt(i10);
                int i11 = i10;
                while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && iCharAt != 10 && iCharAt != 13) {
                    if (!q1.I(iCharAt)) {
                        i11 = cVar.f4030b + 1;
                    }
                    iCharAt = cVar.h();
                }
                if (cVar.f4030b > i10) {
                    strSubstring = str.substring(i10, i11);
                } else {
                    cVar.f4030b = i10;
                }
            }
            if (strSubstring == null) {
                throw new sd.a("Expected property value");
            }
            cVar.c0();
            if (cVar.u('!')) {
                cVar.c0();
                if (!cVar.v("important")) {
                    throw new sd.a("Malformed rule set: found unexpected '!'");
                }
                cVar.c0();
            }
            cVar.u(';');
            h2.D(q0Var, strJ0, strSubstring);
            cVar.c0();
            if (cVar.y()) {
                break;
            }
        } while (!cVar.u('}'));
        cVar.c0();
        for (sd.m mVar : arrayListK0) {
            int i12 = this.f2904a;
            sd.l lVar = new sd.l();
            lVar.f14014a = mVar;
            lVar.f14015b = q0Var;
            lVar.f14016c = i12;
            gVar.c(lVar);
        }
        return true;
    }

    public db.g h(sd.c cVar) {
        db.g gVar = new db.g(8, (byte) 0);
        while (!cVar.y()) {
            try {
                if (!cVar.v("<!--") && !cVar.v("-->")) {
                    if (!cVar.u('@')) {
                        if (!g(gVar, cVar)) {
                            break;
                        }
                    } else {
                        e(gVar, cVar);
                    }
                }
            } catch (sd.a e3) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e3.getMessage());
                return gVar;
            }
        }
        return gVar;
    }
}

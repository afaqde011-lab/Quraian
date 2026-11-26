package ce;

import a1.i;
import a1.n;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import c3.s1;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.internal.cast.a6;
import com.google.android.gms.internal.cast.b6;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.internal.cast.c6;
import com.google.android.gms.internal.cast.c7;
import com.google.android.gms.internal.cast.d6;
import com.google.android.gms.internal.cast.d8;
import com.google.android.gms.internal.cast.g1;
import com.google.android.gms.internal.cast.g5;
import com.google.android.gms.internal.cast.h5;
import com.google.android.gms.internal.cast.j6;
import com.google.android.gms.internal.cast.k6;
import com.google.android.gms.internal.cast.p5;
import com.google.android.gms.internal.cast.q5;
import com.google.android.gms.internal.cast.r4;
import com.google.android.gms.internal.cast.r5;
import com.google.android.gms.internal.cast.s;
import com.google.android.gms.internal.cast.s5;
import com.google.android.gms.internal.cast.t5;
import com.google.android.gms.internal.cast.u5;
import com.google.android.gms.internal.cast.v5;
import com.google.android.gms.internal.cast.w5;
import com.google.android.gms.internal.cast.x5;
import com.google.android.gms.internal.cast.y5;
import com.google.android.gms.internal.cast.y7;
import com.google.android.gms.internal.cast.z3;
import com.google.android.gms.internal.cast.z7;
import com.google.protobuf.RuntimeVersion;
import d40.o;
import d40.p1;
import d40.x0;
import d40.z0;
import db.g;
import e7.i0;
import g20.l;
import h00.q;
import h00.x;
import h00.y;
import i20.f1;
import java.math.BigInteger;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.m;
import ks.e;
import m3.f;
import m3.h;
import m3.r0;
import m3.t;
import m3.u;
import m3.v;
import r30.k;
import r30.r;
import s10.h1;
import s10.i1;
import s10.j1;
import u.d0;
import wj.b1;
import wj.o0;
import x40.z;
import xd.p;
import zj.j;

public final class c implements zd.b, x8.d, l, u, yj.b {
    public final int A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;

    public c(int i10) {
        this.A = i10;
        switch (i10) {
            case 12:
                break;
            case 13:
            case 15:
            case 17:
            default:
                Boolean bool = Boolean.FALSE;
                p1 p1VarC = o.c(bool);
                this.B = p1VarC;
                this.C = o.c(bool);
                this.D = o.c(0);
                this.E = new cv.a(false, true);
                this.F = new z0(p1VarC);
                break;
            case 14:
                this.B = new HashMap();
                this.C = new HashMap();
                this.D = new HashMap();
                this.E = new HashMap();
                this.F = new HashMap();
                break;
            case 16:
                this.B = new Object();
                this.D = new v1.a(0);
                this.E = new d0();
                this.F = new d0();
                break;
            case TYPE_SINT64_VALUE:
                this.F = new LinkedHashMap();
                this.C = "GET";
                this.D = new g(9, (byte) 0);
                break;
        }
    }

    public c(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.A = 11;
        this.E = new ArrayDeque();
        this.B = sharedPreferences;
        this.C = "topic_operation_queue";
        this.D = ",";
        this.F = scheduledThreadPoolExecutor;
    }

    public c(Drawable.Callback callback) {
        this.A = 5;
        this.B = new gd.d(1);
        this.C = new HashMap();
        this.D = new HashMap();
        this.F = ".ttf";
        if (callback instanceof View) {
            this.E = ((View) callback).getContext().getAssets();
        } else {
            oc.b.a("LottieDrawable must be inside of a view for images to work.");
            this.E = null;
        }
    }

    public c(Layout layout) {
        this.A = 10;
        this.B = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iI0 = k.I0(((Layout) this.B).getText(), '\n', length, 4);
            length = iI0 < 0 ? ((Layout) this.B).getText().length() : iI0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) this.B).getText().length());
        this.C = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.D = arrayList2;
        this.E = new boolean[((ArrayList) this.C).size()];
        ((ArrayList) this.C).size();
    }

    public c(r4 r4Var, c0 c0Var, String str) {
        this.A = 1;
        this.B = r4Var;
        this.C = c0Var;
        this.D = str;
        this.F = new d8(this);
    }

    public c(d9.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.A = 3;
        this.B = cVar;
        this.E = map2;
        this.F = map3;
        this.D = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        this.C = jArr;
    }

    public c(f00.a aVar, f00.a aVar2, i iVar, f00.a aVar3, f00.a aVar4) {
        this.A = 0;
        this.B = aVar;
        this.C = aVar2;
        this.F = iVar;
        this.D = aVar3;
        this.E = aVar4;
    }

    public c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
        this.F = obj5;
    }

    public c(Map map) {
        this.A = 15;
        m.e(map, "initialState");
        this.B = h00.d0.b0(map);
        this.C = new LinkedHashMap();
        this.D = new LinkedHashMap();
        this.E = new LinkedHashMap();
        this.F = new s1(this, 2);
    }

    public c(Map map, Map map2, Map map3, Map map4, Map map5) {
        this.A = 13;
        m.e(map, "class2ContextualFactory");
        m.e(map2, "polyBase2Serializers");
        m.e(map3, "polyBase2DefaultSerializerProvider");
        m.e(map4, "polyBase2NamedSerializers");
        m.e(map5, "polyBase2DefaultDeserializerProvider");
        this.B = map;
        this.C = map2;
        this.D = map3;
        this.E = map4;
        this.F = map5;
    }

    public c(k20.i iVar, f1 f1Var, g00.d dVar, Integer num, String str) {
        this.A = 6;
        m.e(f1Var, "kind");
        this.B = iVar;
        this.C = f1Var;
        this.D = dVar;
        this.E = num;
        this.F = str;
    }

    public c(lb.b bVar) {
        this.A = 7;
        this.B = q.o1(bVar.f10200a);
        this.C = q.o1(bVar.f10201b);
        this.D = q.o1(bVar.f10202c);
        this.E = q.o1(bVar.f10203d);
        this.F = q.o1(bVar.f10204e);
    }

    public c(h hVar, r0 r0Var, List list, y3.c cVar, q3.h hVar2) {
        int i10;
        String strSubstring;
        h hVar3 = hVar;
        r0 r0Var2 = r0Var;
        this.A = 8;
        this.B = hVar3;
        this.C = list;
        g00.i iVar = g00.i.C;
        final int i11 = 0;
        this.D = rd.a.I(iVar, new u00.a(this) {
            public final ce.c B;

            {
                this.B = this;
            }

            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i11) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.B.F;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((t) obj3).f10533a.c();
                            int iM = va.a.M(arrayList);
                            int i12 = 1;
                            if (1 <= iM) {
                                while (true) {
                                    Object obj4 = arrayList.get(i12);
                                    float fC2 = ((t) obj4).f10533a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i12 != iM) {
                                        i12++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        return Float.valueOf(tVar != null ? tVar.f10533a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.B.F;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fB = ((t) obj5).f10533a.I.b();
                            int iM2 = va.a.M(arrayList2);
                            int i13 = 1;
                            if (1 <= iM2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i13);
                                    float fB2 = ((t) obj6).f10533a.I.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj5 = obj6;
                                        fB = fB2;
                                    }
                                    if (i13 != iM2) {
                                        i13++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        return Float.valueOf(tVar2 != null ? tVar2.f10533a.I.b() : 0.0f);
                }
            }
        });
        final int i12 = 1;
        this.E = rd.a.I(iVar, new u00.a(this) {
            public final ce.c B;

            {
                this.B = this;
            }

            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i12) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.B.F;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float fC = ((t) obj3).f10533a.c();
                            int iM = va.a.M(arrayList);
                            int i13 = 1;
                            if (1 <= iM) {
                                while (true) {
                                    Object obj4 = arrayList.get(i13);
                                    float fC2 = ((t) obj4).f10533a.c();
                                    if (Float.compare(fC, fC2) < 0) {
                                        obj3 = obj4;
                                        fC = fC2;
                                    }
                                    if (i13 != iM) {
                                        i13++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        return Float.valueOf(tVar != null ? tVar.f10533a.c() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.B.F;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float fB = ((t) obj5).f10533a.I.b();
                            int iM2 = va.a.M(arrayList2);
                            int i14 = 1;
                            if (1 <= iM2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i14);
                                    float fB2 = ((t) obj6).f10533a.I.b();
                                    if (Float.compare(fB, fB2) < 0) {
                                        obj5 = obj6;
                                        fB = fB2;
                                    }
                                    if (i14 != iM2) {
                                        i14++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        return Float.valueOf(tVar2 != null ? tVar2.f10533a.I.b() : 0.0f);
                }
            }
        });
        v vVar = r0Var2.f10523b;
        h hVar4 = m3.i.f10456a;
        ArrayList arrayList = hVar3.D;
        String str = hVar3.B;
        List list2 = x.A;
        List listI1 = arrayList != null ? q.i1(arrayList, new m3.g(1)) : list2;
        ArrayList arrayList2 = new ArrayList();
        h00.m mVar = new h00.m();
        int size = listI1.size();
        int i13 = 0;
        int i14 = 0;
        while (i13 < size) {
            f fVar = (f) listI1.get(i13);
            f fVarA = f.a(fVar, vVar.a((v) fVar.f10423a), i11, i11, 14);
            Object obj = fVarA.f10423a;
            int i15 = fVarA.f10425c;
            int i16 = fVarA.f10424b;
            while (i14 < i16 && !mVar.isEmpty()) {
                f fVar2 = (f) mVar.last();
                listI1 = listI1;
                int i17 = fVar2.f10425c;
                list2 = list2;
                Object obj2 = fVar2.f10423a;
                if (i16 < i17) {
                    arrayList2.add(new f(obj2, i14, i16));
                    i14 = i16;
                } else {
                    int i18 = size;
                    arrayList2.add(new f(obj2, i14, i17));
                    i14 = fVar2.f10425c;
                    while (!mVar.isEmpty() && i14 == ((f) mVar.last()).f10425c) {
                        mVar.removeLast();
                    }
                    size = i18;
                }
            }
            List list3 = listI1;
            List list4 = list2;
            int i19 = size;
            if (i14 < i16) {
                arrayList2.add(new f(vVar, i14, i16));
                i14 = i16;
            }
            f fVar3 = (f) mVar.l();
            if (fVar3 != null) {
                int i20 = fVar3.f10425c;
                Object obj3 = fVar3.f10423a;
                int i21 = fVar3.f10424b;
                if (i21 == i16 && i20 == i15) {
                    mVar.removeLast();
                    mVar.addLast(new f(((v) obj3).a((v) obj), i16, i15));
                } else if (i21 == i20) {
                    arrayList2.add(new f(obj3, i21, i20));
                    mVar.removeLast();
                    mVar.addLast(new f(obj, i16, i15));
                } else {
                    if (i20 < i15) {
                        throw new IllegalArgumentException();
                    }
                    mVar.addLast(new f(((v) obj3).a((v) obj), i16, i15));
                }
            } else {
                mVar.addLast(new f(obj, i16, i15));
            }
            i13++;
            listI1 = list3;
            list2 = list4;
            size = i19;
            i11 = 0;
        }
        List list5 = list2;
        while (i14 <= str.length() && !mVar.isEmpty()) {
            f fVar4 = (f) mVar.last();
            Object obj4 = fVar4.f10423a;
            int i22 = fVar4.f10425c;
            arrayList2.add(new f(obj4, i14, i22));
            while (!mVar.isEmpty() && i22 == ((f) mVar.last()).f10425c) {
                mVar.removeLast();
            }
            i14 = i22;
        }
        if (i14 < str.length()) {
            arrayList2.add(new f(vVar, i14, str.length()));
        }
        if (arrayList2.isEmpty()) {
            i10 = 0;
            arrayList2.add(new f(vVar, 0, 0));
        } else {
            i10 = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i23 = i10;
        while (i23 < size2) {
            f fVar5 = (f) arrayList2.get(i23);
            int i24 = fVar5.f10424b;
            int i25 = fVar5.f10425c;
            if (i24 != i25) {
                strSubstring = str.substring(i24, i25);
                m.d(strSubstring, "substring(...)");
            } else {
                strSubstring = RuntimeVersion.SUFFIX;
            }
            List listA = m3.i.a(hVar3, i24, i25, new e(28));
            h hVar5 = new h(strSubstring, listA == null ? list5 : listA);
            v vVar2 = (v) fVar5.f10423a;
            if (vVar2.f10538b == 0) {
                vVar2 = new v(vVar2.f10537a, vVar.f10538b, vVar2.f10539c, vVar2.f10540d, vVar2.f10541e, vVar2.f10542f, vVar2.f10543g, vVar2.f10544h, vVar2.f10545i);
            }
            r0 r0Var3 = new r0(r0Var2.f10522a, vVar.a(vVar2));
            List list6 = hVar5.A;
            List list7 = list6 == null ? list5 : list6;
            List list8 = (List) this.C;
            ArrayList arrayList4 = new ArrayList(list8.size());
            int size3 = list8.size();
            int i26 = 0;
            while (i26 < size3) {
                f fVar6 = (f) list8.get(i26);
                int i27 = fVar6.f10424b;
                v vVar3 = vVar;
                int i28 = fVar6.f10425c;
                if (m3.i.b(i24, i25, i27, i28)) {
                    if (i24 > i27 || i28 > i25) {
                        s3.a.a("placeholder can not overlap with paragraph.");
                    }
                    arrayList4.add(new f(fVar6.f10423a, i27 - i24, i28 - i24));
                }
                i26++;
                list8 = list8;
                vVar = vVar3;
            }
            arrayList3.add(new t(new u3.c(strSubstring, r0Var3, list7, arrayList4, hVar2, cVar), i24, i25));
            i23++;
            hVar3 = hVar;
            r0Var2 = r0Var;
            str = str;
            arrayList2 = arrayList2;
        }
        this.F = arrayList3;
    }

    public c(nf.c cVar, nf.c cVar2, yj.c cVar3, yj.c cVar4, nf.c cVar5) {
        this.A = 17;
        this.E = cVar;
        this.B = cVar2;
        this.C = cVar3;
        this.F = cVar4;
        this.D = cVar5;
    }

    public c(ui.b bVar, ui.b bVar2, n20.e eVar, ArrayList arrayList) {
        this.A = 4;
        this.C = bVar;
        this.D = bVar2;
        this.E = eVar;
        this.F = arrayList;
        this.B = bVar;
    }

    public c(boolean z10) {
        this.A = 18;
    }

    public static c t(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        c cVar = new c(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) cVar.E)) {
            try {
                ((ArrayDeque) cVar.E).clear();
                String string = ((SharedPreferences) cVar.B).getString((String) cVar.C, RuntimeVersion.SUFFIX);
                if (!TextUtils.isEmpty(string) && string.contains((String) cVar.D)) {
                    String[] strArrSplit = string.split((String) cVar.D, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) cVar.E).add(str);
                        }
                    }
                    return cVar;
                }
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int A(int i10, int i11) {
        while (i10 > i11) {
            char cCharAt = ((Layout) this.B).getText().charAt(i10 - 1);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != 5760 && ((m.f(cCharAt, 8192) < 0 || m.f(cCharAt, 8202) > 0 || cCharAt == 8199) && cCharAt != 8287 && cCharAt != 12288)) {
                return i10;
            }
            i10--;
        }
        return i10;
    }

    public void B(String str, z zVar) {
        m.e(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (zVar == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(a1.b.p("method ", str, " must have a request body.").toString());
            }
        } else if (!w50.c.Z(str)) {
            throw new IllegalArgumentException(a1.b.p("method ", str, " must not have a request body.").toString());
        }
        this.C = str;
        this.E = zVar;
    }

    public void C() {
        Object value;
        if (((Boolean) ((p1) this.B).getValue()).booleanValue()) {
            return;
        }
        p1 p1Var = (p1) this.D;
        do {
            value = p1Var.getValue();
        } while (!p1Var.i(value, Integer.valueOf(((Number) value).intValue() + 1)));
    }

    public void D(ud.a aVar, ud.g gVar) {
        p pVar = (p) this.F;
        xd.i iVar = (xd.i) this.B;
        String str = (String) this.C;
        ud.e eVar = (ud.e) this.E;
        if (eVar == null) {
            throw new NullPointerException("Null transformer");
        }
        ud.c cVar = (ud.c) this.D;
        d dVar = pVar.f16560c;
        xd.i iVarB = iVar.b(aVar.f15247c);
        n nVar = new n();
        nVar.G = new HashMap();
        nVar.E = Long.valueOf(pVar.f16558a.h());
        nVar.F = Long.valueOf(pVar.f16559b.h());
        nVar.B = str;
        nVar.D = new xd.l(cVar, (byte[]) eVar.apply(aVar.f15246b));
        nVar.C = aVar.f15245a;
        ud.b bVar = aVar.f15248d;
        if (bVar != null) {
            nVar.H = bVar.f15249a;
        }
        b bVar2 = (b) dVar;
        bVar2.f3144b.execute(new ab.k(bVar2, iVarB, gVar, nVar.f(), 1));
    }

    public void E(Object obj, String str) {
        m.e(str, "key");
        ((LinkedHashMap) this.B).put(str, obj);
        p1 p1Var = (x0) ((LinkedHashMap) this.D).get(str);
        if (p1Var != null) {
            p1Var.j(obj);
        }
        p1 p1Var2 = (x0) ((LinkedHashMap) this.E).get(str);
        if (p1Var2 != null) {
            p1Var2.j(obj);
        }
    }

    public void F() {
        Object value;
        p1 p1Var = (p1) this.B;
        if (((Boolean) p1Var.getValue()).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            p1Var.getClass();
            p1Var.k((Object) null, bool);
            p1 p1Var2 = (p1) this.D;
            do {
                value = p1Var2.getValue();
            } while (!p1Var2.i(value, Integer.valueOf(((Number) value).intValue() + 1)));
        }
    }

    public void G(Class cls, Object obj) {
        m.e(cls, "type");
        if (obj == null) {
            ((LinkedHashMap) this.F).remove(cls);
            return;
        }
        if (((LinkedHashMap) this.F).isEmpty()) {
            this.F = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.F;
        Object objCast = cls.cast(obj);
        m.b(objCast);
        linkedHashMap.put(cls, objCast);
    }

    public void H(String str) {
        m.e(str, "url");
        if (r.x0(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
            str = "http:".concat(strSubstring);
        } else if (r.x0(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            m.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            str = "https:".concat(strSubstring2);
        }
        m.e(str, "<this>");
        sg.x xVar = new sg.x(1);
        xVar.e(null, str);
        this.B = xVar.b();
    }

    public void I(g1 g1Var) {
        int i10 = g1Var.f3406e;
        if (i10 == 2 && ((com.google.android.gms.internal.cast.b) this.E) != null) {
            K();
        }
        if (i10 == 2) {
            this.E = new com.google.android.gms.internal.cast.b((r4) this.B, (String) this.D);
        } else {
            this.E = J();
        }
        com.google.android.gms.internal.cast.b bVar = (com.google.android.gms.internal.cast.b) this.E;
        com.google.android.gms.common.internal.d0.h(bVar);
        g1Var.f3405d = bVar.f3347h;
        bVar.f3341b.add(g1Var);
    }

    public com.google.android.gms.internal.cast.b J() {
        if (((com.google.android.gms.internal.cast.b) this.E) == null) {
            com.google.android.gms.internal.cast.b bVar = new com.google.android.gms.internal.cast.b((r4) this.B, (String) this.D);
            this.E = bVar;
            bVar.b(1);
        }
        return (com.google.android.gms.internal.cast.b) this.E;
    }

    public void K() {
        int i10;
        long jLongValue;
        p5 p5Var;
        int i11;
        com.google.android.gms.internal.cast.b bVar = (com.google.android.gms.internal.cast.b) this.E;
        if (bVar != null) {
            CastSession castSession = bVar.f3349j;
            if (castSession != null) {
                castSession.zzb(null);
                bVar.f3349j = null;
            }
            long j9 = bVar.f3348i;
            p5 p5VarM = q5.m();
            p5VarM.a();
            ((q5) p5VarM.B).o(j9);
            String str = bVar.l;
            if (str != null) {
                p5VarM.a();
                ((q5) p5VarM.B).t(str);
            }
            y7 y7VarL = z7.l();
            if (!TextUtils.isEmpty(bVar.f3351n)) {
                String str2 = bVar.f3351n;
                p5VarM.a();
                ((q5) p5VarM.B).p(str2);
                String str3 = bVar.f3351n;
                y7VarL.a();
                ((z7) y7VarL.B).m(str3);
            }
            if (!TextUtils.isEmpty(bVar.f3352o)) {
                String str4 = bVar.f3352o;
                y7VarL.a();
                ((z7) y7VarL.B).n(str4);
            }
            if (!TextUtils.isEmpty(bVar.f3353p)) {
                String str5 = bVar.f3353p;
                y7VarL.a();
                ((z7) y7VarL.B).o(str5);
            }
            if (!TextUtils.isEmpty(bVar.f3354q)) {
                String str6 = bVar.f3354q;
                y7VarL.a();
                ((z7) y7VarL.B).p(str6);
            }
            if (!TextUtils.isEmpty(bVar.f3355r)) {
                String str7 = bVar.f3355r;
                y7VarL.a();
                ((z7) y7VarL.B).q(str7);
            }
            if (!TextUtils.isEmpty(bVar.f3356s)) {
                String str8 = bVar.f3356s;
                y7VarL.a();
                ((z7) y7VarL.B).r(str8);
            }
            int i12 = bVar.f3357t;
            int i13 = 3;
            int i14 = 1;
            if (i12 == 1) {
                i10 = 2;
            } else if (i12 == 2) {
                i10 = 3;
            } else if (i12 == 3) {
                i10 = 4;
            } else if (i12 != 4) {
                i10 = i12 != 5 ? 1 : 6;
            } else {
                i10 = 5;
            }
            y7VarL.a();
            ((z7) y7VarL.B).s(i10);
            z7 z7Var = (z7) y7VarL.c();
            p5VarM.a();
            ((q5) p5VarM.B).z(z7Var);
            g5 g5VarL = h5.l();
            String str9 = com.google.android.gms.internal.cast.b.f3338w;
            g5VarL.a();
            ((h5) g5VarL.B).n(str9);
            String str10 = bVar.f3346g;
            g5VarL.a();
            ((h5) g5VarL.B).m(str10);
            h5 h5Var = (h5) g5VarL.c();
            p5VarM.a();
            ((q5) p5VarM.B).x(h5Var);
            z3 z3Var = bVar.f3340a;
            x5 x5VarL = y5.l();
            String str11 = (String) z3Var.zza();
            if (str11 != null) {
                j6 j6VarL = k6.l();
                j6VarL.a();
                ((k6) j6VarL.B).m(str11);
                k6 k6Var = (k6) j6VarL.c();
                x5VarL.a();
                ((y5) x5VarL.B).m(k6Var);
            }
            String str12 = bVar.f3350k;
            int i15 = 16;
            if (str12 != null) {
                try {
                    String strReplace = str12.replace("-", RuntimeVersion.SUFFIX);
                    jLongValue = new BigInteger(strReplace.substring(0, Math.min(16, strReplace.length())), 16).longValue();
                } catch (NumberFormatException e3) {
                    com.google.android.gms.internal.cast.b.f3337v.w(e3, "receiverSessionId %s is not valid for hash", str12);
                    jLongValue = 0;
                }
                x5VarL.a();
                ((y5) x5VarL.B).n(jLongValue);
            }
            List<g1> list = bVar.f3341b;
            if (list.isEmpty()) {
                p5Var = p5VarM;
            } else {
                ArrayList arrayList = new ArrayList();
                for (g1 g1Var : list) {
                    g1Var.getClass();
                    v5 v5VarL = w5.l();
                    int i16 = g1Var.f3406e;
                    v5VarL.a();
                    ((w5) v5VarL.B).q(i16);
                    p5 p5Var2 = p5VarM;
                    int i17 = (int) (g1Var.f3403b - g1Var.f3405d);
                    v5VarL.a();
                    ((w5) v5VarL.B).p(i17);
                    v5VarL.a();
                    ((w5) v5VarL.B).m(i17);
                    Integer num = g1Var.f3402a;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        v5VarL.a();
                        ((w5) v5VarL.B).n(iIntValue);
                    }
                    Boolean bool = g1Var.f3404c;
                    if (bool != null) {
                        boolean zBooleanValue = bool.booleanValue();
                        v5VarL.a();
                        ((w5) v5VarL.B).o(zBooleanValue);
                    }
                    arrayList.add((w5) v5VarL.c());
                    p5VarM = p5Var2;
                }
                p5Var = p5VarM;
                x5VarL.a();
                ((y5) x5VarL.B).o(arrayList);
            }
            List<com.google.android.gms.internal.cast.r> list2 = bVar.f3342c;
            if (!list2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                for (com.google.android.gms.internal.cast.r rVar : list2) {
                    rVar.getClass();
                    c6 c6VarL = d6.l();
                    int i18 = (int) (rVar.f3514b - rVar.f3515c);
                    c6VarL.a();
                    ((d6) c6VarL.B).m(i18);
                    int i19 = rVar.f3513a;
                    if (i19 == 1) {
                        i11 = 2;
                    } else if (i19 != 2) {
                        i11 = i19 != 3 ? 1 : 4;
                    } else {
                        i11 = 3;
                    }
                    c6VarL.a();
                    ((d6) c6VarL.B).n(i11);
                    arrayList2.add((d6) c6VarL.c());
                }
                x5VarL.a();
                ((y5) x5VarL.B).q(arrayList2);
            }
            List<com.google.android.gms.internal.cast.f1> list3 = bVar.f3343d;
            if (!list3.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (com.google.android.gms.internal.cast.f1 f1Var : list3) {
                    String str13 = f1Var.f3391a;
                    r5 r5VarL = s5.l();
                    switch (str13.hashCode()) {
                        case -1189611734:
                            if (str13.equals("queueInsert")) {
                                i14 = 13;
                            }
                            break;
                        case -1109843021:
                            if (str13.equals("launch")) {
                                i14 = 22;
                            }
                            break;
                        case -940430091:
                            if (str13.equals("queueRemove")) {
                                i14 = 15;
                            }
                            break;
                        case -936597225:
                            if (str13.equals("queueFetchItems")) {
                                i14 = 19;
                            }
                            break;
                        case -930425472:
                            if (str13.equals("setPlaybackDevices")) {
                                i14 = 23;
                            }
                            break;
                        case -921113364:
                            if (str13.equals("volume-mute")) {
                                i14 = 9;
                            }
                            break;
                        case -900560382:
                            if (str13.equals("skipAd")) {
                                i14 = 21;
                            }
                            break;
                        case -892481550:
                            if (str13.equals("status")) {
                                i14 = 10;
                            }
                            break;
                        case -844665542:
                            if (str13.equals("queueUpdate")) {
                                i14 = 14;
                            }
                            break;
                        case -810883302:
                            if (str13.equals("volume")) {
                                i14 = 7;
                            }
                            break;
                        case -402284771:
                            if (str13.equals("setPlaybackRate")) {
                                i14 = 20;
                            }
                            break;
                        case 3327206:
                            if (str13.equals("load")) {
                                i14 = 2;
                            }
                            break;
                        case 3363353:
                            if (str13.equals("mute")) {
                                i14 = 8;
                            }
                            break;
                        case 3443508:
                            if (str13.equals("play")) {
                                i14 = 3;
                            }
                            break;
                        case 3526264:
                            if (str13.equals("seek")) {
                                i14 = 6;
                            }
                            break;
                        case 3540994:
                            if (str13.equals("stop")) {
                                i14 = 5;
                            }
                            break;
                        case 106440182:
                            if (str13.equals("pause")) {
                                i14 = 4;
                            }
                            break;
                        case 525402049:
                            if (str13.equals("queueFetchItemRange")) {
                                i14 = 18;
                            }
                            break;
                        case 913357482:
                            if (str13.equals("queueReorder")) {
                                i14 = i15;
                            }
                            break;
                        case 1148867366:
                            if (str13.equals("trackStyle")) {
                                i14 = 12;
                            }
                            break;
                        case 1451542318:
                            if (str13.equals("activeTracks")) {
                                i14 = 11;
                            }
                            break;
                        case 1873161788:
                            if (str13.equals("queueFetchItemIds")) {
                                i14 = 17;
                            }
                            break;
                        default:
                            break;
                    }
                    r5VarL.a();
                    ((s5) r5VarL.B).q(i14);
                    int i20 = (int) f1Var.f3392b;
                    r5VarL.a();
                    ((s5) r5VarL.B).m(i20);
                    int i21 = f1Var.f3393c;
                    r5VarL.a();
                    ((s5) r5VarL.B).n(i21);
                    int i22 = (int) (f1Var.f3394d - f1Var.f3396f);
                    r5VarL.a();
                    ((s5) r5VarL.B).o(i22);
                    int i23 = (int) (f1Var.f3395e - f1Var.f3396f);
                    r5VarL.a();
                    ((s5) r5VarL.B).p(i23);
                    arrayList3.add((s5) r5VarL.c());
                    i15 = 16;
                }
                x5VarL.a();
                ((y5) x5VarL.B).p(arrayList3);
            }
            if (bVar.m != null) {
                ArrayList arrayList4 = new ArrayList();
                c7 c7Var = bVar.m;
                int i24 = c7Var.f3374c;
                t5 t5VarL = u5.l();
                if (i24 == 1) {
                    i13 = 2;
                } else if (i24 != 2) {
                    i13 = i24 != 3 ? i24 != 4 ? 1 : 5 : 4;
                }
                t5VarL.a();
                ((u5) t5VarL.B).n(i13);
                int i25 = (int) (c7Var.f3372a - c7Var.f3373b);
                t5VarL.a();
                ((u5) t5VarL.B).m(i25);
                arrayList4.add((u5) t5VarL.c());
                x5VarL.a();
                ((y5) x5VarL.B).s(arrayList4);
            }
            Map map = bVar.f3344e;
            if (!map.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                for (s sVar : map.values()) {
                    sVar.getClass();
                    a6 a6VarL = b6.l();
                    int i26 = sVar.f3541e;
                    a6VarL.a();
                    ((b6) a6VarL.B).p(i26);
                    int i27 = sVar.f3540d.get();
                    a6VarL.a();
                    ((b6) a6VarL.B).m(i27);
                    int i28 = (int) (sVar.f3537a - sVar.f3539c);
                    a6VarL.a();
                    ((b6) a6VarL.B).n(i28);
                    int i29 = (int) (sVar.f3538b - sVar.f3539c);
                    a6VarL.a();
                    ((b6) a6VarL.B).o(i29);
                    arrayList5.add((b6) a6VarL.c());
                }
                x5VarL.a();
                ((y5) x5VarL.B).r(arrayList5);
            }
            int i30 = bVar.f3358u;
            x5VarL.a();
            ((y5) x5VarL.B).t(i30);
            y5 y5Var = (y5) x5VarL.c();
            p5Var.a();
            p5 p5Var3 = p5Var;
            ((q5) p5Var3.B).w(y5Var);
            bVar.f3345f.a((q5) p5Var3.c(), 233);
            this.E = null;
        }
    }

    public void a() {
        ((ui.b) this.C).a();
        ui.b bVar = (ui.b) this.D;
        ((HashMap) bVar.C).put((n20.e) this.E, new s20.a((k10.b) q.d1((ArrayList) this.F)));
    }

    @Override
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.F;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((t) arrayList.get(i10)).f10533a.b()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public float c() {
        return ((Number) this.D.getValue()).floatValue();
    }

    @Override
    public int d(long j9) {
        long[] jArr = (long[]) this.C;
        int iB = i0.b(jArr, j9, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override
    public long e(int i10) {
        return ((long[]) this.C)[i10];
    }

    public g20.m f(n20.e eVar) {
        return ((ui.b) this.B).f(eVar);
    }

    @Override
    public List g(long j9) {
        d9.c cVar = (d9.c) this.B;
        Map map = (Map) this.D;
        HashMap map2 = (HashMap) this.E;
        HashMap map3 = (HashMap) this.F;
        ArrayList<Pair> arrayList = new ArrayList();
        cVar.g(j9, cVar.f4804h, arrayList);
        TreeMap treeMap = new TreeMap();
        cVar.i(j9, false, cVar.f4804h, treeMap);
        cVar.h(j9, map, map2, cVar.f4804h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                d9.f fVar = (d9.f) map2.get(pair.first);
                fVar.getClass();
                arrayList2.add(new d7.b(null, null, null, bitmapDecodeByteArray, fVar.f4813c, 0, fVar.f4815e, fVar.f4812b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f4816f, fVar.f4817g, false, -16777216, fVar.f4820j, 0.0f, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            d9.f fVar2 = (d9.f) map2.get(entry.getKey());
            fVar2.getClass();
            d7.a aVar = (d7.a) entry.getValue();
            CharSequence charSequence = aVar.f4723a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (d9.a aVar2 : (d9.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), d9.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) RuntimeVersion.SUFFIX);
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f3 = fVar2.f4813c;
            int i18 = fVar2.f4814d;
            aVar.f4727e = f3;
            aVar.f4728f = i18;
            aVar.f4729g = fVar2.f4815e;
            aVar.f4730h = fVar2.f4812b;
            aVar.l = fVar2.f4816f;
            float f10 = fVar2.f4819i;
            int i19 = fVar2.f4818h;
            aVar.f4733k = f10;
            aVar.f4732j = i19;
            aVar.f4736p = fVar2.f4820j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public Object get() {
        switch (this.A) {
            case 0:
                return new b((Executor) ((f00.a) this.B).get(), (yd.d) ((f00.a) this.C).get(), (i) ((i) this.F).get(), (ee.d) ((f00.a) this.D).get(), (fe.b) ((f00.a) this.E).get());
            case 17:
                return new o0((bi.g) ((nf.c) this.E).A, (jj.d) ((f00.a) this.B).get(), (j) ((f00.a) this.C).get(), (wj.l) ((yj.c) this.F).get(), (k00.i) ((f00.a) this.D).get());
            default:
                return new zj.c((b1) ((f00.a) this.B).get(), (jj.d) ((f00.a) this.C).get(), (wj.b) ((f00.a) this.D).get(), (zj.d) ((f00.a) this.E).get(), (zj.m) ((yj.c) this.F).get());
        }
    }

    public l h(n20.b bVar, n20.e eVar) {
        return ((ui.b) this.B).h(bVar, eVar);
    }

    @Override
    public int i() {
        return ((long[]) this.C).length;
    }

    public void j(n20.e eVar, s20.f fVar) {
        ((ui.b) this.B).j(eVar, fVar);
    }

    public void k(n20.e eVar, Object obj) {
        ((ui.b) this.B).k(eVar, obj);
    }

    @Override
    public float l() {
        return ((Number) this.E.getValue()).floatValue();
    }

    public void m(qb.f fVar, Class cls) {
        ((ArrayList) this.E).add(new g00.k(fVar, cls));
    }

    public void n(n20.e eVar, n20.b bVar, n20.e eVar2) {
        ((ui.b) this.B).n(eVar, bVar, eVar2);
    }

    public void o(tb.a aVar, Class cls) {
        ((ArrayList) this.C).add(new g00.k(aVar, cls));
    }

    public l1.d p(v1.b bVar, u00.a aVar) {
        int i10;
        int i11;
        int i12;
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.A = -1;
        synchronized (this.B) {
            Throwable th2 = (Throwable) this.C;
            if (th2 != null) {
                bVar.b(th2);
                return l1.c.B;
            }
            v1.a aVar2 = (v1.a) this.D;
            do {
                i10 = aVar2.get();
                i11 = i10 + 1;
            } while (!aVar2.compareAndSet(i10, i11));
            boolean z10 = (134217727 & i11) == 1;
            xVar.A = (i11 >>> 27) & 15;
            ((d0) this.E).a(bVar);
            if (z10 && aVar != null) {
                try {
                    aVar.invoke();
                } catch (Throwable th3) {
                    synchronized (this.B) {
                        try {
                            if (((Throwable) this.C) == null) {
                                this.C = th3;
                                d0 d0Var = (d0) this.E;
                                Object[] objArr = d0Var.f14837a;
                                int i13 = d0Var.f14838b;
                                for (int i14 = 0; i14 < i13; i14++) {
                                    ((v1.b) objArr[i14]).b(th3);
                                }
                                ((d0) this.E).d();
                                v1.a aVar3 = (v1.a) this.D;
                                do {
                                    i12 = aVar3.get();
                                } while (!aVar3.compareAndSet(i12, ((((i12 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            d0.g gVar = new d0.g(bVar, this, xVar, 13);
            h1.l lVar = new h1.l();
            lVar.A = gVar;
            lVar.B = new v1.a(0);
            return lVar;
        }
    }

    public Bidi q(int i10) {
        Bidi bidi;
        Layout layout = (Layout) this.B;
        ArrayList arrayList = (ArrayList) this.C;
        ArrayList arrayList2 = (ArrayList) this.D;
        boolean[] zArr = (boolean[]) this.E;
        if (zArr[i10]) {
            return (Bidi) arrayList2.get(i10);
        }
        int iIntValue = i10 == 0 ? 0 : ((Number) arrayList.get(i10 - 1)).intValue();
        int iIntValue2 = ((Number) arrayList.get(i10)).intValue();
        int i11 = iIntValue2 - iIntValue;
        char[] cArr = (char[]) this.F;
        if (cArr == null || cArr.length < i11) {
            cArr = new char[i11];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(layout.getText(), iIntValue, iIntValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i11)) {
            bidi = new Bidi(cArr2, 0, null, 0, i11, layout.getParagraphDirection(layout.getLineForOffset(y(i10))) == -1 ? 1 : 0);
            if (bidi.getRunCount() == 1) {
                bidi = null;
            }
        } else {
            bidi = null;
        }
        arrayList2.set(i10, bidi);
        zArr[i10] = true;
        if (bidi != null) {
            char[] cArr3 = (char[]) this.F;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.F = cArr2;
        return bidi;
    }

    public th.o r() {
        y yVarUnmodifiableMap;
        x40.q qVar = (x40.q) this.B;
        if (qVar == null) {
            throw new IllegalStateException("url == null");
        }
        String str = (String) this.C;
        x40.p pVarJ = ((g) this.D).j();
        z zVar = (z) this.E;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.F;
        byte[] bArr = y40.b.a;
        m.e(linkedHashMap, "<this>");
        if (linkedHashMap.isEmpty()) {
            yVarUnmodifiableMap = y.A;
        } else {
            yVarUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
            m.d(yVarUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        }
        return new th.o(qVar, str, pVarJ, zVar, (Map) yVarUnmodifiableMap);
    }

    public void s(x40.d dVar) {
        m.e(dVar, "cacheControl");
        String string = dVar.toString();
        if (string.length() == 0) {
            ((g) this.D).q("Cache-Control");
        } else {
            z("Cache-Control", string);
        }
    }

    public String toString() {
        String str;
        switch (this.A) {
            case 6:
                String str2 = (String) this.F;
                StringBuilder sb2 = new StringBuilder("since ");
                sb2.append((k20.i) this.B);
                sb2.append(' ');
                sb2.append((g00.d) this.D);
                Integer num = (Integer) this.E;
                String str3 = RuntimeVersion.SUFFIX;
                if (num != null) {
                    str = " error " + num.intValue();
                } else {
                    str = RuntimeVersion.SUFFIX;
                }
                sb2.append(str);
                if (str2 != null) {
                    str3 = ": " + str2;
                }
                sb2.append(str3);
                return sb2.toString();
            case 12:
                StringBuilder sb3 = new StringBuilder("KmVersionRequirement(kind=");
                j1 j1Var = (j1) this.B;
                if (j1Var == null) {
                    m.k("kind");
                    throw null;
                }
                sb3.append(j1Var);
                sb3.append(", level=");
                i1 i1Var = (i1) this.C;
                if (i1Var == null) {
                    m.k("level");
                    throw null;
                }
                sb3.append(i1Var);
                sb3.append(", version=");
                h1 h1Var = (h1) this.F;
                if (h1Var == null) {
                    m.k("version");
                    throw null;
                }
                sb3.append(h1Var);
                sb3.append(", errorCode=");
                sb3.append((Integer) this.D);
                sb3.append(", message=");
                return g4.c.k(sb3, (String) this.E, ')');
            default:
                return super.toString();
        }
    }

    public void u(u00.k kVar) {
        int i10;
        synchronized (this.B) {
            try {
                d0 d0Var = (d0) this.E;
                this.E = (d0) this.F;
                this.F = d0Var;
                v1.a aVar = (v1.a) this.D;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, ((((i10 >>> 27) & 15) + 1) & 15) << 27));
                int i11 = d0Var.f14838b;
                for (int i12 = 0; i12 < i11; i12++) {
                    kVar.invoke(d0Var.f(i12));
                }
                d0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float v(int i10, boolean z10) {
        Layout layout = (Layout) this.B;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i10));
        if (i10 > lineEnd) {
            i10 = lineEnd;
        }
        return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
    }

    public float w(int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        Layout layout = (Layout) this.B;
        if (!z11) {
            return v(i10, z10);
        }
        int iD = n3.f.d(layout, i10, z11);
        int lineStart = layout.getLineStart(iD);
        int lineEnd = layout.getLineEnd(iD);
        if (i10 != lineStart && i10 != lineEnd) {
            return v(i10, z10);
        }
        if (i10 == 0 || i10 == layout.getText().length()) {
            return v(i10, z10);
        }
        int iX = x(i10, z11);
        boolean z12 = layout.getParagraphDirection(layout.getLineForOffset(y(iX))) == -1;
        int iA = A(lineEnd, lineStart);
        int iY = y(iX);
        int i13 = lineStart - iY;
        int i14 = iA - iY;
        Bidi bidiQ = q(iX);
        Bidi bidiCreateLineBidi = bidiQ != null ? bidiQ.createLineBidi(i13, i14) : null;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == zIsRtlCharAt) {
                z12 = !z12;
            }
            return i10 == lineStart ? z12 : !z12 ? layout.getLineLeft(iD) : layout.getLineRight(iD);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        n3.d[] dVarArr = new n3.d[runCount];
        for (int i15 = 0; i15 < runCount; i15++) {
            dVarArr[i15] = new n3.d(bidiCreateLineBidi.getRunStart(i15) + lineStart, bidiCreateLineBidi.getRunLimit(i15) + lineStart, bidiCreateLineBidi.getRunLevel(i15) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i16 = 0; i16 < runCount2; i16++) {
            bArr[i16] = (byte) bidiCreateLineBidi.getRunLevel(i16);
        }
        Bidi.reorderVisually(bArr, 0, dVarArr, 0, runCount);
        if (i10 == lineStart) {
            int i17 = 0;
            while (true) {
                if (i17 >= runCount) {
                    i12 = -1;
                    break;
                }
                if (dVarArr[i17].f11023a == i10) {
                    i12 = i17;
                    break;
                }
                i17++;
            }
            boolean z13 = (z10 || z12 == dVarArr[i12].f11025c) ? !z12 : z12;
            if (i12 == 0 && z13) {
                return layout.getLineLeft(iD);
            }
            if (i12 != runCount - 1 || z13) {
                return z13 ? layout.getPrimaryHorizontal(dVarArr[i12 - 1].f11023a) : layout.getPrimaryHorizontal(dVarArr[i12 + 1].f11023a);
            }
            return layout.getLineRight(iD);
        }
        int iA2 = i10 > iA ? A(i10, lineStart) : i10;
        int i18 = 0;
        while (true) {
            if (i18 >= runCount) {
                i11 = -1;
                break;
            }
            if (dVarArr[i18].f11024b == iA2) {
                i11 = i18;
                break;
            }
            i18++;
        }
        boolean z14 = (z10 || z12 == dVarArr[i11].f11025c) ? z12 : !z12;
        if (i11 == 0 && z14) {
            return layout.getLineLeft(iD);
        }
        if (i11 != runCount - 1 || z14) {
            return z14 ? layout.getPrimaryHorizontal(dVarArr[i11 - 1].f11024b) : layout.getPrimaryHorizontal(dVarArr[i11 + 1].f11024b);
        }
        return layout.getLineRight(iD);
    }

    public int x(int i10, boolean z10) {
        ArrayList arrayList = (ArrayList) this.C;
        int iJ = va.a.j(arrayList, Integer.valueOf(i10));
        int i11 = iJ < 0 ? -(iJ + 1) : iJ + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public int y(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.C).get(i10 - 1)).intValue();
    }

    public void z(String str, String str2) {
        m.e(str2, "value");
        g gVar = (g) this.D;
        gVar.getClass();
        w00.a.m(str);
        w00.a.n(str2, str);
        gVar.q(str);
        gVar.e(str, str2);
    }
}

package oj;

import a1.u0;
import a1.v2;
import a8.n0;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.b1;
import b3.g1;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.internal.measurement.r9;
import com.google.android.gms.internal.measurement.v3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import e7.i0;
import fh.d2;
import fh.e1;
import fh.r0;
import fh.t0;
import i20.h0;
import j10.q0;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import k7.d0;
import k9.a2;
import k9.a4;
import k9.s1;
import k9.t3;
import kotlin.KotlinNothingValueException;
import l9.f0;
import u.s0;
import yh.q1;
import yh.y0;

public final class q implements a30.e, x8.k, c2.g, zd.b, g20.n, g20.l, g20.m, n.a {
    public static q F;
    public final int A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;

    public q(int i10) {
        this.A = i10;
        switch (i10) {
            case 3:
                this.B = new e7.u();
                this.C = new e7.u();
                this.D = new a9.a();
                break;
            case 4:
                break;
            case 7:
                com.google.android.gms.internal.measurement.t tVar = new com.google.android.gms.internal.measurement.t(0);
                this.B = tVar;
                q qVar = new q((q) null, tVar);
                this.D = qVar;
                this.C = qVar.a0();
                r5 r5Var = new r5(1);
                this.E = r5Var;
                qVar.c0("require", new r9(r5Var));
                ((HashMap) r5Var.f3857a).put("internal.platform", c1.f3725a);
                qVar.c0("runtime.counter", new com.google.android.gms.internal.measurement.g(Double.valueOf(0.0d)));
                break;
            case 24:
                this.B = new e4.d(10);
                this.C = new s0(0);
                this.D = new ArrayList();
                this.E = new HashSet();
                break;
            case 25:
                Random random = new Random();
                this.D = new HashMap();
                this.E = random;
                this.B = new HashMap();
                this.C = new HashMap();
                break;
            default:
                this.B = null;
                this.C = null;
                this.D = null;
                this.E = new ArrayDeque();
                break;
        }
    }

    public q(u0 u0Var, g20.p pVar) {
        this.A = 15;
        this.E = u0Var;
        this.A = 15;
        this.D = u0Var;
        this.B = pVar;
        this.C = new ArrayList();
    }

    public q(a20.b bVar, a20.h hVar, g00.h hVar2) {
        this.A = 1;
        kotlin.jvm.internal.m.e(hVar, "typeParameterResolver");
        this.B = bVar;
        this.C = hVar;
        this.D = hVar2;
        this.E = new a1.i(this, hVar);
    }

    public q(Context context) {
        this.A = 22;
        this.B = context != null ? context.getApplicationContext() : null;
        this.D = d0.f9022a;
        if (context == null) {
            this.E = k7.b.f8983c;
        }
    }

    public q(Context context, ActionMode.Callback callback) {
        this.A = 27;
        this.C = context;
        this.B = callback;
        this.D = new ArrayList();
        this.E = new s0(0);
    }

    public q(AudioTrack audioTrack, hf.c cVar) {
        this.A = 21;
        this.B = audioTrack;
        this.C = cVar;
        Handler handlerL = i0.l(null);
        this.D = handlerL;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() {
            @Override
            public final void onRoutingChanged(AudioRouting audioRouting) {
                oj.q qVar = this.f9129a;
                if (((q) qVar.E) == null) {
                    return;
                }
                e7.a.f().execute(new ji.a(qVar, audioRouting, 8));
            }
        };
        this.E = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerL);
    }

    public q(c3.z zVar, c2.j jVar) throws KotlinNothingValueException {
        this.A = 5;
        this.B = zVar;
        this.C = jVar;
        AutofillManager autofillManager = (AutofillManager) zVar.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.D = autofillManager;
        zVar.setImportantForAutofill(1);
        AutofillId autofillId = zVar.getAutofillId();
        if (autofillId == null) {
            throw a1.b.u("Required value was null.");
        }
        this.E = autofillId;
    }

    public q(c30.i iVar) {
        this.A = 6;
        this.E = iVar;
        List list = iVar.E.T;
        kotlin.jvm.internal.m.d(list, "getEnumEntryList(...)");
        int iP = h00.d0.P(h00.r.q0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Object obj : list) {
            linkedHashMap.put(z3.A((k20.g) iVar.L.b, ((i20.w) obj).D), obj);
        }
        this.B = linkedHashMap;
        c30.i iVar2 = (c30.i) this.E;
        this.C = ((a30.i) iVar2.L.a).a.c(new v2(this, iVar2, 9));
        d30.l lVar = ((a30.i) ((c30.i) this.E).L.a).a;
        a30.l lVar2 = new a30.l(this, 5);
        lVar.getClass();
        this.D = new d30.i(lVar, lVar2);
    }

    public q(d30.l lVar, j10.z zVar) {
        this.A = 19;
        kotlin.jvm.internal.m.e(zVar, "module");
        this.B = lVar;
        this.C = zVar;
        this.D = lVar.b(new j10.b0(this, 0));
        this.E = lVar.b(new j10.b0(this, 1));
    }

    public q(d2 d2Var, f7.j jVar, f0 f0Var, f7.j jVar2) {
        Object objO;
        this.A = 12;
        if (d2Var != null) {
            objO = t0.o(d2Var);
        } else {
            r0 r0Var = t0.B;
            objO = d2.E;
        }
        this.B = objO;
        this.C = jVar;
        this.D = f0Var;
        this.E = jVar2;
    }

    public q(h0 h0Var, k20.h hVar, j20.a aVar, a30.c0 c0Var) {
        this.A = 2;
        this.B = hVar;
        this.C = aVar;
        this.D = c0Var;
        List list = h0Var.G;
        kotlin.jvm.internal.m.d(list, "getClass_List(...)");
        int iP = h00.d0.P(h00.r.q0(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP < 16 ? 16 : iP);
        for (Object obj : list) {
            linkedHashMap.put(z3.z((k20.h) this.B, ((i20.k) obj).E), obj);
        }
        this.E = linkedHashMap;
    }

    public q(Class cls) {
        this.A = 26;
        this.C = new ConcurrentHashMap();
        this.B = cls;
        this.E = wh.a.f16082b;
    }

    public q(Long l, Integer num, Integer num2) {
        String strValueOf;
        this.A = 28;
        this.C = l;
        this.D = num;
        this.E = num2;
        if (l == null || (strValueOf = String.valueOf(l.longValue())) == null) {
            strValueOf = num + "|" + num2;
        }
        this.B = strValueOf;
    }

    public q(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    public q(String str, String str2) {
        this.A = 29;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashSet();
        Bundle bundle = new Bundle();
        this.B = bundle;
        if (str == null) {
            throw new NullPointerException("id must not be null");
        }
        bundle.putString("id", str);
        if (str2 == null) {
            throw new NullPointerException("name must not be null");
        }
        bundle.putString("name", str2);
    }

    public q(List list) {
        int i10;
        this.A = 13;
        this.B = new e7.u();
        this.C = new e7.u();
        f9.a aVar = new f9.a();
        this.D = aVar;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = i0.f5136a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(",", -1);
                aVar.f5572d = new int[strArrSplit.length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int[] iArr = aVar.f5572d;
                    try {
                        i10 = Integer.parseInt(strArrSplit[i11].trim(), 16);
                    } catch (RuntimeException unused) {
                        i10 = 0;
                    }
                    iArr[i11] = i10;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        aVar.f5573e = Integer.parseInt(strArrSplit2[0]);
                        aVar.f5574f = Integer.parseInt(strArrSplit2[1]);
                        aVar.f5570b = true;
                    } catch (RuntimeException e3) {
                        e7.a.n("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    public q(s1 s1Var) {
        this.A = 23;
        this.C = new u.e(0);
        this.D = new u.e(0);
        this.B = new Object();
        this.E = new WeakReference(s1Var);
    }

    public q(o9.m mVar) {
        this.A = 29;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new HashSet();
        this.B = new Bundle(mVar.f11825a);
        this.C = mVar.c();
        this.D = mVar.b();
        this.E = mVar.a();
    }

    public q(q qVar, com.google.android.gms.internal.measurement.t tVar) {
        this.A = 8;
        this.D = new HashMap();
        this.E = new HashMap();
        this.B = qVar;
        this.C = tVar;
    }

    public q(th.o oVar, n20.e eVar, ui.b bVar) {
        this.A = 17;
        this.C = oVar;
        this.D = eVar;
        this.E = bVar;
        this.B = new ArrayList();
    }

    public q(ui.b bVar, q qVar, ArrayList arrayList) {
        this.A = 16;
        this.C = bVar;
        this.D = qVar;
        this.E = arrayList;
        this.B = bVar;
    }

    public static synchronized q F() {
        try {
            if (F == null) {
                F = new q(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return F;
    }

    public static void S(long j9, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j9) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public b1 A(a2 a2Var) {
        synchronized (this.B) {
            try {
                k9.f fVar = (k9.f) ((u.e) this.D).get(a2Var);
                if (fVar == null) {
                    return null;
                }
                return fVar.f9284e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public j10.e B(n20.b bVar, List list) {
        kotlin.jvm.internal.m.e(bVar, "classId");
        return (j10.e) ((d30.e) this.E).invoke(new j10.c0(bVar, list));
    }

    public t0 C() {
        t0 t0VarO;
        synchronized (this.B) {
            t0VarO = t0.o(((u.e) this.C).values());
        }
        return t0VarO;
    }

    @Override
    public void D(byte[] bArr, int i10, int i11, x8.j jVar, e7.h hVar) {
        boolean z10;
        d7.b bVar;
        int i12;
        int iA;
        d7.b bVar2;
        int iD;
        d7.b bVar3;
        d2 d2VarS;
        Rect rect;
        int i13 = 4;
        int i14 = 3;
        int i15 = 2;
        boolean z11 = true;
        switch (this.A) {
            case 3:
                a9.a aVar = (a9.a) this.D;
                e7.u uVar = (e7.u) this.C;
                e7.u uVar2 = (e7.u) this.B;
                uVar2.L(i10 + i11, bArr);
                uVar2.N(i10);
                if (((Inflater) this.E) == null) {
                    this.E = new Inflater();
                }
                Inflater inflater = (Inflater) this.E;
                String str = i0.f5136a;
                if (uVar2.a() > 0 && uVar2.j() == 120 && i0.C(uVar2, uVar, inflater)) {
                    uVar2.L(uVar.f5184c, uVar.f5182a);
                }
                aVar.f342d = 0;
                int[] iArr = aVar.f340b;
                e7.u uVar3 = aVar.f339a;
                aVar.f343e = 0;
                aVar.f344f = 0;
                aVar.f345g = 0;
                aVar.f346h = 0;
                aVar.f347i = 0;
                uVar3.K(0);
                aVar.f341c = false;
                ArrayList arrayList = new ArrayList();
                while (uVar2.a() >= i14) {
                    int i16 = uVar2.f5184c;
                    int iA2 = uVar2.A();
                    int iH = uVar2.H();
                    int i17 = uVar2.f5183b + iH;
                    if (i17 > i16) {
                        uVar2.N(i16);
                        z10 = z11;
                        bVar2 = null;
                    } else {
                        char c10 = 128;
                        if (iA2 != 128) {
                            switch (iA2) {
                                case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                                    if (iH % 5 == i15) {
                                        uVar2.O(i15);
                                        Arrays.fill(iArr, 0);
                                        int i18 = iH / 5;
                                        int i19 = 0;
                                        while (i19 < i18) {
                                            int iA3 = uVar2.A();
                                            char c11 = c10;
                                            double dA = uVar2.A();
                                            double dA2 = uVar2.A() - 128;
                                            double dA3 = uVar2.A() - 128;
                                            iArr[iA3] = i0.h((int) ((dA3 * 1.772d) + dA), 0, 255) | (uVar2.A() << 24) | (i0.h((int) ((1.402d * dA2) + dA), 0, 255) << 16) | (i0.h((int) ((dA - (0.34414d * dA3)) - (dA2 * 0.71414d)), 0, 255) << 8);
                                            i19++;
                                            c10 = c11;
                                            z11 = true;
                                        }
                                        z10 = z11;
                                        aVar.f341c = z10;
                                    } else {
                                        z10 = z11;
                                    }
                                    break;
                                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                                    if (iH >= 4) {
                                        uVar2.O(i14);
                                        int i20 = iH - 4;
                                        if ((128 & uVar2.A()) != 0 ? z11 : false) {
                                            if (i20 >= 7 && (iD = uVar2.D()) >= 4) {
                                                aVar.f346h = uVar2.H();
                                                aVar.f347i = uVar2.H();
                                                uVar3.K(iD - 4);
                                                i20 = iH - 11;
                                            }
                                        }
                                        int i21 = uVar3.f5183b;
                                        int i22 = uVar3.f5184c;
                                        if (i21 < i22 && i20 > 0) {
                                            int iMin = Math.min(i20, i22 - i21);
                                            uVar2.k(i21, iMin, uVar3.f5182a);
                                            uVar3.N(i21 + iMin);
                                        }
                                    }
                                    z10 = z11;
                                    break;
                                case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                                    if (iH >= 19) {
                                        aVar.f342d = uVar2.H();
                                        aVar.f343e = uVar2.H();
                                        uVar2.O(11);
                                        aVar.f344f = uVar2.H();
                                        aVar.f345g = uVar2.H();
                                    }
                                    z10 = z11;
                                    break;
                                default:
                                    z10 = z11;
                                    break;
                            }
                            bVar = null;
                        } else {
                            z10 = z11;
                            if (aVar.f342d == 0 || aVar.f343e == 0 || aVar.f346h == 0 || aVar.f347i == 0 || (i12 = uVar3.f5184c) == 0 || uVar3.f5183b != i12 || !aVar.f341c) {
                                bVar = null;
                            } else {
                                uVar3.N(0);
                                int i23 = aVar.f346h * aVar.f347i;
                                int[] iArr2 = new int[i23];
                                int i24 = 0;
                                while (i24 < i23) {
                                    int iA4 = uVar3.A();
                                    if (iA4 != 0) {
                                        iA = i24 + 1;
                                        iArr2[i24] = iArr[iA4];
                                    } else {
                                        int iA5 = uVar3.A();
                                        if (iA5 != 0) {
                                            iA = ((iA5 & 64) == 0 ? iA5 & 63 : ((iA5 & 63) << 8) | uVar3.A()) + i24;
                                            Arrays.fill(iArr2, i24, iA, (iA5 & Cast.MAX_NAMESPACE_LENGTH) == 0 ? iArr[0] : iArr[uVar3.A()]);
                                        }
                                    }
                                    i24 = iA;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, aVar.f346h, aVar.f347i, Bitmap.Config.ARGB_8888);
                                float f3 = aVar.f344f;
                                float f10 = aVar.f342d;
                                float f11 = f3 / f10;
                                float f12 = aVar.f345g;
                                float f13 = aVar.f343e;
                                bVar = new d7.b(null, null, null, bitmapCreateBitmap, f12 / f13, 0, 0, f11, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.f346h / f10, aVar.f347i / f13, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                            }
                            aVar.f342d = 0;
                            aVar.f343e = 0;
                            aVar.f344f = 0;
                            aVar.f345g = 0;
                            aVar.f346h = 0;
                            aVar.f347i = 0;
                            uVar3.K(0);
                            aVar.f341c = false;
                        }
                        uVar2.N(i17);
                        bVar2 = bVar;
                    }
                    if (bVar2 != null) {
                        arrayList.add(bVar2);
                    }
                    z11 = z10;
                    i14 = 3;
                    i15 = 2;
                }
                hVar.accept(new x8.a(-9223372036854775807L, -9223372036854775807L, arrayList));
                break;
            default:
                e7.u uVar4 = (e7.u) this.B;
                uVar4.L(i10 + i11, bArr);
                uVar4.N(i10);
                e7.u uVar5 = (e7.u) this.C;
                f9.a aVar2 = (f9.a) this.D;
                if (((Inflater) this.E) == null) {
                    this.E = new Inflater();
                }
                Inflater inflater2 = (Inflater) this.E;
                String str2 = i0.f5136a;
                if (uVar4.a() > 0 && uVar4.j() == 120 && i0.C(uVar4, uVar5, inflater2)) {
                    uVar4.L(uVar5.f5184c, uVar5.f5182a);
                }
                aVar2.f5571c = false;
                aVar2.f5575g = null;
                aVar2.f5576h = -1;
                aVar2.f5577i = -1;
                int iA6 = uVar4.a();
                if (iA6 < 2 || uVar4.H() != iA6) {
                    bVar3 = null;
                } else {
                    int[] iArr3 = aVar2.f5572d;
                    if (iArr3 != null && aVar2.f5570b) {
                        uVar4.O(uVar4.H() - 2);
                        int iH2 = uVar4.H();
                        int[] iArr4 = aVar2.f5569a;
                        while (uVar4.f5183b < iH2 && uVar4.a() > 0) {
                            switch (uVar4.A()) {
                                case 0:
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                    if (uVar4.a() >= 2) {
                                        int iA7 = uVar4.A();
                                        int iA8 = uVar4.A();
                                        iArr4[3] = f9.a.a(iArr3, iA7 >> 4);
                                        iArr4[2] = f9.a.a(iArr3, iA7 & 15);
                                        iArr4[1] = f9.a.a(iArr3, iA8 >> 4);
                                        iArr4[0] = f9.a.a(iArr3, iA8 & 15);
                                        aVar2.f5571c = true;
                                        i13 = 4;
                                    }
                                    break;
                                case 4:
                                    if (uVar4.a() >= 2 && aVar2.f5571c) {
                                        int iA9 = uVar4.A();
                                        int iA10 = uVar4.A();
                                        iArr4[3] = f9.a.c(iArr4[3], iA9 >> 4);
                                        iArr4[2] = f9.a.c(iArr4[2], iA9 & 15);
                                        iArr4[1] = f9.a.c(iArr4[1], iA10 >> 4);
                                        iArr4[0] = f9.a.c(iArr4[0], iA10 & 15);
                                        i13 = 4;
                                    }
                                    break;
                                case 5:
                                    if (uVar4.a() >= 6) {
                                        int iA11 = uVar4.A();
                                        int iA12 = uVar4.A();
                                        int i25 = (iA11 << i13) | (iA12 >> 4);
                                        int iA13 = ((iA12 & 15) << 8) | uVar4.A();
                                        int iA14 = uVar4.A();
                                        int iA15 = uVar4.A();
                                        aVar2.f5575g = new Rect(i25, (iA14 << i13) | (iA15 >> 4), iA13 + 1, (((iA15 & 15) << 8) | uVar4.A()) + 1);
                                        i13 = 4;
                                    }
                                    break;
                                case 6:
                                    if (uVar4.a() >= i13) {
                                        aVar2.f5576h = uVar4.H();
                                        aVar2.f5577i = uVar4.H();
                                    }
                                    break;
                            }
                        }
                    }
                    if (aVar2.f5572d == null || !aVar2.f5570b || !aVar2.f5571c || (rect = aVar2.f5575g) == null || aVar2.f5576h == -1 || aVar2.f5577i == -1 || rect.width() < 2 || aVar2.f5575g.height() < 2) {
                        bVar3 = null;
                    } else {
                        Rect rect2 = aVar2.f5575g;
                        int[] iArr5 = new int[rect2.height() * rect2.width()];
                        n0 n0Var = new n0();
                        uVar4.N(aVar2.f5576h);
                        n0Var.p(uVar4);
                        aVar2.b(n0Var, true, rect2, iArr5);
                        uVar4.N(aVar2.f5577i);
                        n0Var.p(uVar4);
                        aVar2.b(n0Var, false, rect2, iArr5);
                        bVar3 = new d7.b(null, null, null, Bitmap.createBitmap(iArr5, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / aVar2.f5574f, 0, 0, rect2.left / aVar2.f5573e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / aVar2.f5573e, rect2.height() / aVar2.f5574f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                }
                if (bVar3 != null) {
                    d2VarS = t0.s(bVar3);
                } else {
                    r0 r0Var = t0.B;
                    d2VarS = d2.E;
                }
                hVar.accept(new x8.a(-9223372036854775807L, 5000000L, d2VarS));
                break;
        }
    }

    public a2 E(Object obj) {
        a2 a2Var;
        synchronized (this.B) {
            a2Var = (a2) ((u.e) this.C).get(obj);
        }
        return a2Var;
    }

    public PlaybackException G(a2 a2Var) {
        synchronized (this.B) {
            try {
                return ((k9.f) ((u.e) this.D).get(a2Var)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t3 H(a2 a2Var) {
        synchronized (this.B) {
            try {
                return ((k9.f) ((u.e) this.D).get(a2Var)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public g1 I(a2 a2Var) {
        k9.f fVar;
        synchronized (this.B) {
            fVar = (k9.f) ((u.e) this.D).get(a2Var);
        }
        if (fVar != null) {
            return fVar.f9281b;
        }
        return null;
    }

    public boolean J(Context context) {
        if (((Boolean) this.D) == null) {
            this.D = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.C).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.D).booleanValue();
    }

    public boolean K(Context context) {
        if (((Boolean) this.C) == null) {
            this.C = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.C).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.C).booleanValue();
    }

    @Override
    public boolean L(n.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.B;
        n.f fVarZ = z(bVar);
        s0 s0Var = (s0) this.E;
        Menu a0Var = (Menu) s0Var.get(menu);
        if (a0Var == null) {
            a0Var = new o.a0((Context) this.C, (o.l) menu);
            s0Var.put(menu, a0Var);
        }
        return callback.onPrepareActionMode(fVarZ, a0Var);
    }

    public boolean M(a2 a2Var) {
        boolean z10;
        synchronized (this.B) {
            z10 = ((u.e) this.D).get(a2Var) != null;
        }
        return z10;
    }

    public boolean N(a2 a2Var, int i10) {
        k9.f fVar;
        synchronized (this.B) {
            fVar = (k9.f) ((u.e) this.D).get(a2Var);
        }
        s1 s1Var = (s1) ((WeakReference) this.E).get();
        return fVar != null && fVar.f9284e.a(i10) && s1Var != null && s1Var.f9430t.getAvailableCommands().a(i10);
    }

    public boolean O(q0 q0Var) {
        if (((q0) this.C).equals(q0Var)) {
            return true;
        }
        q qVar = (q) this.B;
        return qVar != null ? qVar.O(q0Var) : false;
    }

    public boolean P(a2 a2Var, int i10) {
        k9.f fVar;
        synchronized (this.B) {
            fVar = (k9.f) ((u.e) this.D).get(a2Var);
        }
        if (fVar == null) {
            return false;
        }
        a4 a4Var = fVar.f9283d;
        a4Var.getClass();
        boolean z10 = false;
        ta.c0.r("Use contains(Command) for custom command", i10 != 0);
        Iterator<E> it = a4Var.f9213a.iterator();
        while (it.hasNext()) {
            if (((k9.z3) it.next()).f9578a == i10) {
                z10 = true;
                break;
            }
        }
        return z10;
    }

    public boolean Q(a2 a2Var, k9.z3 z3Var) {
        k9.f fVar;
        synchronized (this.B) {
            fVar = (k9.f) ((u.e) this.D).get(a2Var);
        }
        if (fVar == null) {
            return false;
        }
        e1 e1Var = fVar.f9283d.f9213a;
        z3Var.getClass();
        return e1Var.contains(z3Var) || k9.b.n(z3Var.f9579b);
    }

    public void R(a2 a2Var) {
        synchronized (this.B) {
            try {
                k9.f fVar = (k9.f) ((u.e) this.D).remove(a2Var);
                if (fVar == null) {
                    return;
                }
                ((u.e) this.C).remove(fVar.f9280a);
                fVar.f9281b.h();
                s1 s1Var = (s1) ((WeakReference) this.E).get();
                if (s1Var == null || s1Var.o()) {
                    return;
                }
                i0.M(s1Var.l, new k9.d(s1Var, a2Var, 0));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m7.b T(List list) {
        m7.b bVar;
        HashMap map = (HashMap) this.D;
        ArrayList arrayListU = u(list);
        if (arrayListU.size() < 2) {
            return (m7.b) fh.w.m(arrayListU, null);
        }
        Collections.sort(arrayListU, new b3.c0(6));
        ArrayList arrayList = new ArrayList();
        int i10 = ((m7.b) arrayListU.get(0)).f10578c;
        for (int i11 = 0; i11 < arrayListU.size(); i11++) {
            m7.b bVar2 = (m7.b) arrayListU.get(i11);
            if (i10 != bVar2.f10578c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (m7.b) arrayListU.get(0);
            }
            arrayList.add(new Pair(bVar2.f10577b, Integer.valueOf(bVar2.f10579d)));
        }
        m7.b bVar3 = (m7.b) map.get(arrayList);
        if (bVar3 != null) {
            return bVar3;
        }
        List listSubList = arrayListU.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((m7.b) listSubList.get(i13)).f10579d;
        }
        int iNextInt = ((Random) this.E).nextInt(i12);
        int i14 = 0;
        for (int i15 = 0; i15 < listSubList.size(); i15++) {
            bVar = (m7.b) listSubList.get(i15);
            i14 += bVar.f10579d;
            if (iNextInt < i14) {
                map.put(arrayList, bVar);
                return bVar;
            }
        }
        bVar = (m7.b) fh.w.n(listSubList);
        map.put(arrayList, bVar);
        return bVar;
    }

    @Override
    public boolean U(n.b bVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.B).onActionItemClicked(z(bVar), new o.s((Context) this.C, (s4.a) menuItem));
    }

    public void V(a2 a2Var, a4 a4Var, b1 b1Var) {
        synchronized (this.B) {
            try {
                k9.f fVar = (k9.f) ((u.e) this.D).get(a2Var);
                if (fVar != null) {
                    fVar.f9283d = a4Var;
                    if (fVar.f9285f != null) {
                        fVar.f9285f = b1Var;
                    } else {
                        fVar.f9284e = b1Var;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ui.b W(int i10, n20.b bVar, o10.a aVar) {
        g20.p pVar = new g20.p(((g20.p) this.B).a + '@' + i10);
        u0 u0Var = (u0) this.E;
        HashMap map = (HashMap) u0Var.C;
        List arrayList = (List) map.get(pVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(pVar, arrayList);
        }
        return ((th.o) u0Var.B).F(bVar, aVar, arrayList);
    }

    public com.google.android.gms.internal.measurement.n X(com.google.android.gms.internal.measurement.n nVar) {
        return ((com.google.android.gms.internal.measurement.t) this.C).c(this, nVar);
    }

    public com.google.android.gms.internal.measurement.n Y(q qVar, v3... v3VarArr) {
        com.google.android.gms.internal.measurement.n nVarR0 = com.google.android.gms.internal.measurement.n.f3814f;
        for (v3 v3Var : v3VarArr) {
            nVarR0 = kh.n.r0(v3Var);
            k00.f.f0((q) this.D);
            if ((nVarR0 instanceof com.google.android.gms.internal.measurement.o) || (nVarR0 instanceof com.google.android.gms.internal.measurement.m)) {
                nVarR0 = ((com.google.android.gms.internal.measurement.t) this.B).c(qVar, nVarR0);
            }
        }
        return nVarR0;
    }

    public com.google.android.gms.internal.measurement.n Z(com.google.android.gms.internal.measurement.d dVar) {
        com.google.android.gms.internal.measurement.n nVarC = com.google.android.gms.internal.measurement.n.f3814f;
        Iterator itL = dVar.l();
        while (itL.hasNext()) {
            nVarC = ((com.google.android.gms.internal.measurement.t) this.C).c(this, dVar.n(((Integer) itL.next()).intValue()));
            if (nVarC instanceof com.google.android.gms.internal.measurement.f) {
                break;
            }
        }
        return nVarC;
    }

    public void a() {
        switch (this.A) {
            case 15:
                ArrayList arrayList = (ArrayList) this.C;
                if (!arrayList.isEmpty()) {
                    ((HashMap) ((u0) this.D).C).put((g20.p) this.B, arrayList);
                }
                break;
            case 16:
                ((ui.b) this.C).a();
                ((ArrayList) ((q) this.D).B).add(new s20.a((k10.b) h00.q.d1((ArrayList) this.E)));
                break;
            default:
                ui.b bVar = (ui.b) this.E;
                n20.e eVar = (n20.e) this.D;
                ArrayList arrayList2 = (ArrayList) this.B;
                bVar.getClass();
                kotlin.jvm.internal.m.e(arrayList2, "elements");
                if (eVar != null) {
                    m10.s0 s0VarG = y3.G(eVar, (j10.e) bVar.E);
                    if (s0VarG != null) {
                        HashMap map = (HashMap) bVar.C;
                        List listD = n30.l.d(arrayList2);
                        e30.w type = s0VarG.getType();
                        kotlin.jvm.internal.m.d(type, "getType(...)");
                        map.put(eVar, new s20.y(listD, type));
                        break;
                    } else if (((th.o) bVar.D).C((n20.b) bVar.F) && kotlin.jvm.internal.m.a(eVar.b(), "value")) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (obj instanceof s20.a) {
                                arrayList3.add(obj);
                            }
                        }
                        List list = (List) bVar.G;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            list.add((k10.b) ((s20.g) ((s20.a) it.next())).a);
                        }
                        break;
                    }
                }
                break;
        }
    }

    public q a0() {
        return new q(this, (com.google.android.gms.internal.measurement.t) this.C);
    }

    public a30.d b(n20.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "classId");
        i20.k kVar = (i20.k) ((LinkedHashMap) this.E).get(bVar);
        if (kVar == null) {
            return null;
        }
        k20.h hVar = (k20.h) this.B;
        j20.a aVar = (j20.a) this.C;
        ((a30.c0) this.D).invoke(bVar);
        return new a30.d(hVar, kVar, aVar, j10.n0.n);
    }

    public boolean b0(String str) {
        if (((HashMap) this.D).containsKey(str)) {
            return true;
        }
        q qVar = (q) this.B;
        if (qVar != null) {
            return qVar.b0(str);
        }
        return false;
    }

    public void c(Object obj) {
        ((ArrayList) this.B).add(th.o.g((th.o) this.C, (n20.e) this.D, obj));
    }

    public void c0(String str, com.google.android.gms.internal.measurement.n nVar) {
        q qVar;
        HashMap map = (HashMap) this.D;
        if (!map.containsKey(str) && (qVar = (q) this.B) != null && qVar.b0(str)) {
            qVar.c0(str, nVar);
        } else {
            if (((HashMap) this.E).containsKey(str)) {
                return;
            }
            if (nVar == null) {
                map.remove(str);
            } else {
                map.put(str, nVar);
            }
        }
    }

    public void d(s20.f fVar) {
        ((ArrayList) this.B).add(new s20.t(new s20.r(fVar)));
    }

    public void d0(String str, com.google.android.gms.internal.measurement.n nVar) {
        HashMap map = (HashMap) this.D;
        if (((HashMap) this.E).containsKey(str)) {
            return;
        }
        if (nVar == null) {
            map.remove(str);
        } else {
            map.put(str, nVar);
        }
    }

    public g20.l e(n20.b bVar, o10.a aVar) {
        return ((th.o) ((u0) this.D).B).F(bVar, aVar, (ArrayList) this.C);
    }

    public com.google.android.gms.internal.measurement.n e0(String str) {
        HashMap map = (HashMap) this.D;
        if (map.containsKey(str)) {
            return (com.google.android.gms.internal.measurement.n) map.get(str);
        }
        q qVar = (q) this.B;
        if (qVar != null) {
            return qVar.e0(str);
        }
        throw new IllegalArgumentException(w.c.j(str, " is not defined"));
    }

    public g20.m f(n20.e eVar) {
        return ((ui.b) this.B).f(eVar);
    }

    @Override
    public boolean g(n.b bVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.B;
        n.f fVarZ = z(bVar);
        s0 s0Var = (s0) this.E;
        Menu a0Var = (Menu) s0Var.get(menu);
        if (a0Var == null) {
            a0Var = new o.a0((Context) this.C, (o.l) menu);
            s0Var.put(menu, a0Var);
        }
        return callback.onCreateActionMode(fVarZ, a0Var);
    }

    public Object get() {
        return new q((Executor) ((f00.a) this.B).get(), (ee.d) ((f00.a) this.C).get(), (a1.i) ((a1.i) this.D).get(), (fe.b) ((f00.a) this.E).get(), 9);
    }

    public g20.l h(n20.b bVar, n20.e eVar) {
        return ((ui.b) this.B).h(bVar, eVar);
    }

    public g20.l i(n20.b bVar) {
        ArrayList arrayList = new ArrayList();
        return new q(((th.o) this.C).E(bVar, j10.n0.n, arrayList), this, arrayList);
    }

    public void j(n20.e eVar, s20.f fVar) {
        ((ui.b) this.B).j(eVar, fVar);
    }

    public void k(n20.e eVar, Object obj) {
        ((ui.b) this.B).k(eVar, obj);
    }

    public void l(n20.b bVar, n20.e eVar) {
        ((ArrayList) this.B).add(new s20.i(bVar, eVar));
    }

    public void n(n20.e eVar, n20.b bVar, n20.e eVar2) {
        ((ui.b) this.B).n(eVar, bVar, eVar2);
    }

    @Override
    public void n0(n.b bVar) {
        ((ActionMode.Callback) this.B).onDestroyActionMode(z(bVar));
    }

    public void o(ArrayList arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("filters must not be null");
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                ArrayList arrayList2 = (ArrayList) this.D;
                if (!arrayList2.contains(intentFilter)) {
                    arrayList2.add(intentFilter);
                }
            }
        }
    }

    @Override
    public int p() {
        switch (this.A) {
        }
        return 2;
    }

    public void q(Object obj, a2 a2Var, a4 a4Var, b1 b1Var) {
        synchronized (this.B) {
            try {
                a2 a2VarE = E(obj);
                if (a2VarE == null) {
                    ((u.e) this.C).put(obj, a2Var);
                    ((u.e) this.D).put(a2Var, new k9.f(obj, new g1(), a4Var, b1Var));
                } else {
                    k9.f fVar = (k9.f) ((u.e) this.D).get(a2VarE);
                    fVar.getClass();
                    fVar.f9283d = a4Var;
                    fVar.f9284e = b1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void r(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList arrayList2 = (ArrayList) this.C;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("groupMemberId must not be empty");
            }
            if (!arrayList2.contains(str)) {
                arrayList2.add(str);
            }
        }
    }

    public void s(Object obj, Object obj2, yh.e1 e1Var, boolean z10) throws GeneralSecurityException {
        byte[] bArrArray;
        if (((ConcurrentHashMap) this.C) == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }
        if (obj == null && obj2 == null) {
            throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
        }
        if (e1Var.C() != y0.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.C;
        Integer numValueOf = Integer.valueOf(e1Var.A());
        if (e1Var.B() == q1.RAW) {
            numValueOf = null;
        }
        mh.b bVarA = th.i.f14800b.a(th.o.r(e1Var.z().A(), e1Var.z().B(), e1Var.z().z(), e1Var.B(), numValueOf));
        int iOrdinal = e1Var.B().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(e1Var.A()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(e1Var.A()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(e1Var.A()).array();
        } else {
            bArrArray = mh.b.f10903a;
        }
        mh.j jVar = new mh.j(obj, obj2, bArrArray, e1Var.C(), e1Var.B(), e1Var.A(), e1Var.z().A(), bVarA);
        ArrayList arrayList = new ArrayList();
        arrayList.add(jVar);
        byte[] bArr = jVar.f10916c;
        mh.k kVar = new mh.k(bArr != null ? Arrays.copyOf(bArr, bArr.length) : null);
        List list = (List) concurrentHashMap.put(kVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(jVar);
            concurrentHashMap.put(kVar, Collections.unmodifiableList(arrayList2));
        }
        if (z10) {
            if (((mh.j) this.D) != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.D = jVar;
        }
    }

    public void t(a2 a2Var, int i10, k9.e eVar) {
        synchronized (this.B) {
            try {
                k9.f fVar = (k9.f) ((u.e) this.D).get(a2Var);
                if (fVar != null) {
                    b1 b1Var = fVar.f9287h;
                    b1Var.getClass();
                    androidx.media3.common.q qVar = new androidx.media3.common.q();
                    qVar.e(b1Var.f1103a);
                    qVar.d(i10);
                    fVar.f9287h = new b1(qVar.g());
                    fVar.f9282c.add(eVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList u(List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = (HashMap) this.B;
        S(jElapsedRealtime, map);
        HashMap map2 = (HashMap) this.C;
        S(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            m7.b bVar = (m7.b) list.get(i10);
            if (!map.containsKey(bVar.f10577b) && !map2.containsKey(Integer.valueOf(bVar.f10578c))) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public o9.m v() {
        Bundle bundle = (Bundle) this.B;
        bundle.putParcelableArrayList("controlFilters", new ArrayList<>((ArrayList) this.D));
        bundle.putStringArrayList("groupMemberIds", new ArrayList<>((ArrayList) this.C));
        bundle.putStringArrayList("allowedPackages", new ArrayList<>((HashSet) this.E));
        return new o9.m(bundle);
    }

    public void w(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((s0) this.C).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                w(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void x(k9.f fVar) {
        s1 s1Var = (s1) ((WeakReference) this.E).get();
        if (s1Var == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            k9.e eVar = (k9.e) fVar.f9282c.poll();
            if (eVar == null) {
                fVar.f9286g = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            q qVar = this;
            i0.M(s1Var.l, new ji.a(s1Var, this.E(fVar.f9280a), (Runnable) new com.revenuecat.purchases.d(qVar, eVar, atomicBoolean2, fVar, atomicBoolean)));
            atomicBoolean2.set(false);
            this = qVar;
        }
    }

    public void y(final a2 a2Var) {
        synchronized (this.B) {
            try {
                k9.f fVar = (k9.f) ((u.e) this.D).get(a2Var);
                if (fVar == null) {
                    return;
                }
                final b1 b1Var = fVar.f9287h;
                fVar.f9287h = b1.f1101b;
                fVar.f9282c.add(new k9.e(a2Var, b1Var) {

                    public final a2 f9242b;

                    @Override
                    public final kh.v run() {
                        s1 s1Var = (s1) ((WeakReference) this.f9241a.E).get();
                        if (s1Var != null) {
                            s1Var.y(this.f9242b);
                        }
                        return kh.t.B;
                    }
                });
                if (fVar.f9286g) {
                    return;
                }
                fVar.f9286g = true;
                x(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public n.f z(n.b bVar) {
        ArrayList arrayList = (ArrayList) this.D;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n.f fVar = (n.f) arrayList.get(i10);
            if (fVar != null && fVar.f10954b == bVar) {
                return fVar;
            }
        }
        n.f fVar2 = new n.f((Context) this.C, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }
}

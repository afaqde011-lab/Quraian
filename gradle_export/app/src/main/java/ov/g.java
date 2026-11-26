package ov;

import android.content.Context;
import androidx.media3.common.q0;
import bt.y1;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import dh.o;
import h00.q;
import h00.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kh.n;
import kotlin.jvm.internal.m;
import r30.r;
import ri.t1;
import rv.i;
import rv.p;
import s10.w0;
import sd.p1;
import tq.k;

public final class g {
    public final k a;
    public final o b;
    public final p c;
    public final i d;
    public final w0 e;
    public final p10.a f;
    public final p1 g;
    public final p10.a h;
    public final th.o i;
    public volatile g00.k j;

    public g(Context context, xw.k kVar, k kVar2, zt.a aVar, xv.c cVar, qu.a aVar2, cw.a aVar3, wu.a aVar4, b00.c cVar2, is.c cVar3, jo.d dVar, ko.c cVar4) {
        this.a = kVar2;
        o oVar = new o(context, (char) 0);
        this.b = oVar;
        p pVar = new p(kVar, aVar, aVar2, aVar4);
        this.c = pVar;
        i iVar = new i(cVar, kVar2, aVar, pVar, aVar2, aVar3, aVar4);
        this.d = iVar;
        this.e = new w0(pVar, oVar, 3);
        this.f = new p10.a(kVar2, iVar, pVar, oVar);
        this.g = new p1(context, oVar, dVar, cVar4);
        this.h = new p10.a(pVar, oVar, cVar2, cVar3);
        this.i = new th.o(pVar, iVar, oVar, aVar, aVar2, aVar3);
    }

    public final Object a(m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.C = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objU = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.C;
        if (i2 == 0) {
            t1.O(objU);
            y1 y1VarC = this.a.c();
            aVar.C = 1;
            objU = d40.o.u(y1VarC, aVar);
            if (objU == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
        }
        List list = (List) objU;
        if (list == null) {
            list = x.A;
        }
        zq.a aVar3 = (zq.a) q.N0(list);
        if (aVar3 != null) {
            return new Integer(aVar3.b);
        }
        return null;
    }

    public final java.lang.Object b(java.lang.String r20, java.lang.String r21, m00.c r22) {
        throw new UnsupportedOperationException("Method not decompiled: ov.g.b(java.lang.String, java.lang.String, m00.c):java.lang.Object");
    }

    public final boolean c(String mediaId) {
        m.e(mediaId, "mediaId");
        this.h.getClass();
        return mediaId.equals("fx_off") || r.x0(mediaId, "fx/", false);
    }

    public final boolean d(String mediaId) {
        m.e(mediaId, "mediaId");
        this.g.getClass();
        return r.x0(mediaId, "story_ep/", false);
    }

    public final java.lang.Object e(java.util.ArrayList r11, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: ov.g.e(java.util.ArrayList, m00.c):java.lang.Object");
    }

    public final java.lang.Object f(java.lang.String r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ov.g.f(java.lang.String, m00.c):java.lang.Object");
    }

    public final q0 g() {
        o oVar = this.b;
        String string = oVar.A.getString(2131886121);
        m.d(string, "getString(...)");
        return o.d(oVar, "root", string, (String) null, (String) null, (Integer) null, (String) null, (qv.a) null, (qv.a) null, 508);
    }

    public final Object h(String str, String str2, m00.c cVar) {
        e eVar;
        String string;
        String str3;
        Integer num;
        String str4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        List list;
        Object objI;
        String str5;
        ArrayList arrayList3;
        List list2 = x.A;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.G = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objF = eVar.E;
        Object obj = l00.a.A;
        int i2 = eVar.G;
        if (i2 == 0) {
            t1.O(objF);
            string = r30.k.j1(str).toString();
            if (string.length() == 0) {
                return list2;
            }
            eVar.A = string;
            eVar.G = 1;
            objF = f(str2, eVar);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            string = eVar.A;
            t1.O(objF);
        } else {
            if (i2 == 2) {
                str4 = eVar.C;
                num = eVar.B;
                str3 = eVar.A;
                t1.O(objF);
                arrayList = new ArrayList();
                for (Object obj2 : (Iterable) objF) {
                    if (((bx.c) obj2).b(str3)) {
                        arrayList.add(obj2);
                    }
                }
                arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
                it = arrayList.iterator();
                while (true) {
                    list = null;
                    if (it.hasNext()) {
                        break;
                    }
                    arrayList2.add(n.W(this.b, (bx.c) it.next(), (String) null, (qv.a) null));
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    eVar.A = null;
                    eVar.B = null;
                    eVar.C = str4;
                    eVar.D = arrayList2;
                    eVar.G = 3;
                    objI = i(str3, iIntValue, eVar);
                    if (objI != obj) {
                        str5 = str4;
                        arrayList3 = arrayList2;
                        objF = objI;
                    }
                    return obj;
                }
                if (list != null) {
                    list2 = list;
                }
                ArrayList arrayListY0 = q.Y0(list2, arrayList2);
                this.j = new g00.k(str4, arrayListY0);
                return arrayListY0;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            arrayList3 = eVar.D;
            str5 = eVar.C;
            t1.O(objF);
        }
        list = (List) objF;
        arrayList2 = arrayList3;
        str4 = str5;
        if (list != null) {
            list2 = list;
        }
        ArrayList arrayListY1 = q.Y0(list2, arrayList2);
        this.j = new g00.k(str4, arrayListY1);
        return arrayListY1;
        str3 = string;
        num = (Integer) objF;
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        str4 = lowerCase + "|" + (num != null ? num.intValue() : -1);
        g00.k kVar = this.j;
        if (kVar != null) {
            String str6 = (String) kVar.A;
            List list3 = (List) kVar.B;
            if (m.a(str6, str4)) {
                return list3;
            }
        }
        p pVar = this.c;
        eVar.A = str3;
        eVar.B = num;
        eVar.C = str4;
        eVar.G = 2;
        objF = pVar.f(eVar);
        if (objF != obj) {
            arrayList = new ArrayList();
            while (r13.hasNext()) {
                if (((bx.c) obj2).b(str3)) {
                    arrayList.add(obj2);
                }
            }
            arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
            it = arrayList.iterator();
            while (true) {
                list = null;
                if (it.hasNext()) {
                    break;
                    break;
                }
                arrayList2.add(n.W(this.b, (bx.c) it.next(), (String) null, (qv.a) null));
            }
            if (num != null) {
                int iIntValue2 = num.intValue();
                eVar.A = null;
                eVar.B = null;
                eVar.C = str4;
                eVar.D = arrayList2;
                eVar.G = 3;
                objI = i(str3, iIntValue2, eVar);
                if (objI != obj) {
                    str5 = str4;
                    arrayList3 = arrayList2;
                    objF = objI;
                    list = (List) objF;
                    arrayList2 = arrayList3;
                    str4 = str5;
                }
            }
            if (list != null) {
                list2 = list;
            }
            ArrayList arrayListY2 = q.Y0(list2, arrayList2);
            this.j = new g00.k(str4, arrayListY2);
            return arrayListY2;
        }
        return obj;
    }

    public final Serializable i(String str, int i, m00.c cVar) {
        f fVar;
        Integer numY0;
        Object objC;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.F = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.D;
        l00.a aVar = l00.a.A;
        int i3 = fVar.F;
        if (i3 == 0) {
            t1.O(obj);
            numY0 = r.y0(str);
            fVar.A = str;
            fVar.B = numY0;
            fVar.C = i;
            fVar.F = 1;
            objC = this.c.c(i, fVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = fVar.C;
            Integer num = fVar.B;
            String str2 = fVar.A;
            t1.O(obj);
            numY0 = num;
            str = str2;
            objC = obj;
        }
        ArrayList<PlayerItem> arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objC) {
            PlayerItem playerItem = (PlayerItem) obj2;
            String surahTranscription = playerItem.getSurahTranscription();
            Locale locale = Locale.ROOT;
            String lowerCase = surahTranscription.toLowerCase(locale);
            m.d(lowerCase, "toLowerCase(...)");
            String lowerCase2 = str.toLowerCase(locale);
            m.d(lowerCase2, "toLowerCase(...)");
            if (!r30.k.A0(lowerCase, lowerCase2, true)) {
                String lowerCase3 = playerItem.getSurahTranslation().toLowerCase(locale);
                m.d(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = str.toLowerCase(locale);
                m.d(lowerCase4, "toLowerCase(...)");
                if (!r30.k.A0(lowerCase3, lowerCase4, true)) {
                    String lowerCase5 = playerItem.getSurahOriginalName().toLowerCase(locale);
                    m.d(lowerCase5, "toLowerCase(...)");
                    String lowerCase6 = str.toLowerCase(locale);
                    m.d(lowerCase6, "toLowerCase(...)");
                    if (r30.k.A0(lowerCase5, lowerCase6, true) || (numY0 != null && playerItem.getSurahNumber() == numY0.intValue())) {
                    }
                }
            }
            arrayList.add(obj2);
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        for (PlayerItem playerItem2 : arrayList) {
            arrayList2.add(o.m(this.b, kh.o.Q(i, playerItem2.getSurahNumber()), playerItem2.getSurahTranscription(), playerItem2.getReciterName()));
        }
        return arrayList2;
    }
}

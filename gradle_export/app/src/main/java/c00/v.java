package c00;

import a40.z;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerEffect$CloseScreen;
import g00.b0;
import h00.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import ri.t1;

public final class v extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x C;

    public v(x xVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v(this.C, cVar, 0);
            case 1:
                return new v(this.C, cVar, 1);
            default:
                return new v(this.C, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((v) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objI;
        zz.c cVar;
        boolean z;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                x xVar = this.C;
                if (i != 0) {
                    if (i == 1) {
                        t1.O(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return b0.a;
                }
                t1.O(obj);
                xVar.f.b();
                aq.a aVar2 = xVar.h;
                this.B = 1;
                if (((bq.a) aVar2).c(false, this) == aVar) {
                    return aVar;
                }
                SoundEffectPickerEffect$CloseScreen soundEffectPickerEffect$CloseScreen = SoundEffectPickerEffect$CloseScreen.INSTANCE;
                this.B = 2;
                if (xVar.c.a(soundEffectPickerEffect$CloseScreen, this) == aVar) {
                    return aVar;
                }
                return b0.a;
            case 1:
                x xVar2 = this.C;
                a00.a aVar3 = xVar2.e;
                pm.b bVar = xVar2.c;
                l00.a aVar4 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    xVar2.i(t.a((t) bVar.d.getValue(), true, null, null, null, null, null, null, 126));
                    this.B = 1;
                    objI = ((uz.f) aVar3).i(this);
                    if (objI == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    objI = obj;
                }
                List items = (List) objI;
                String str = ((t) bVar.d.getValue()).e;
                uz.f fVar = (uz.f) aVar3;
                fVar.getClass();
                SharedPreferences sharedPreferences = fVar.a;
                kotlin.jvm.internal.m.e(items, "items");
                ArrayList<zz.a> arrayList = new ArrayList(h00.r.q0(items, 10));
                Iterator it = items.iterator();
                while (true) {
                    boolean z2 = false;
                    if (!it.hasNext()) {
                        int iP = d0.P(h00.r.q0(arrayList, 10));
                        if (iP < 16) {
                            iP = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                        for (zz.a aVar5 : arrayList) {
                            String soundId = aVar5.a;
                            boolean z3 = aVar5.h;
                            boolean z4 = !z3 || r30.r.x0(aVar5.c, "http", false);
                            boolean zX0 = r30.r.x0(aVar5.b, "http", false);
                            if (!z3 || z4 || zX0) {
                                vz.c cVar2 = xVar2.j;
                                zz.b bVarH = fVar.h();
                                cVar2.getClass();
                                kotlin.jvm.internal.m.e(soundId, "soundId");
                                cVar = ((!z4 || cVar2.d(soundId).exists()) && (!zX0 || cVar2.e(soundId, bVarH).exists())) ? zz.c.A : zz.c.B;
                            } else {
                                cVar = zz.c.A;
                            }
                            linkedHashMap.put(soundId, cVar);
                        }
                        xVar2.i(t.a((t) bVar.d.getValue(), false, g4.d0(arrayList), g4.d0(xVar2.m(str, arrayList)), g4.e0(linkedHashMap), null, null, null, 241));
                        if (((t) bVar.d.getValue()).a) {
                            xVar2.i(t.a((t) bVar.d.getValue(), false, null, null, null, null, null, null, 254));
                        }
                        return b0.a;
                    }
                    zz.a aVar6 = (zz.a) it.next();
                    String code = aVar6.a;
                    kotlin.jvm.internal.m.e(code, "code");
                    boolean zEquals = code.equals("calm_rain");
                    boolean z5 = aVar6.f;
                    Set<String> set = h00.z.A;
                    if (z5) {
                        Set<String> stringSet = sharedPreferences.getStringSet("KEY_NEW_BADGE_SEEN", set);
                        if (stringSet == null) {
                            stringSet = set;
                        }
                        z = !stringSet.contains(code);
                    } else {
                        z = false;
                    }
                    if (zEquals) {
                        Set<String> stringSet2 = sharedPreferences.getStringSet("KEY_FREE_BADGE_SEEN", set);
                        if (stringSet2 != null) {
                            set = stringSet2;
                        }
                        z2 = !set.contains(code);
                    }
                    arrayList.add(zz.a.a(aVar6, null, null, false, z, z2, 255));
                }
                break;
            default:
                l00.a aVar7 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    x xVar3 = this.C;
                    xVar3.i(t.a((t) xVar3.c.d.getValue(), false, null, null, null, null, null, null, 223));
                    g gVar = new g(null);
                    this.B = 1;
                    if (xVar3.c.a(gVar, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}

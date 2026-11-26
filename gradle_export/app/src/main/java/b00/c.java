package b00;

import a40.c0;
import a40.m0;
import android.content.Context;
import androidx.media3.common.d;
import androidx.media3.exoplayer.ExoPlayer;
import com.google.android.gms.internal.measurement.g4;
import d40.o;
import d40.p1;
import f40.m;
import g00.b0;
import h40.e;
import i7.g;
import i7.i;
import i7.k;
import i7.l;
import i7.z;
import j7.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import r30.r;
import ri.t1;
import u00.n;
import uu.w;
import uz.f;

public final class c {
    public final Context a;
    public final uu.a b;
    public final a00.a c;
    public final p1 d;
    public zz.a e;
    public final z f;
    public final p1 g;
    public final p1 h;
    public final p1 i;

    public c(Context context, uu.a aVar, a00.a aVar2) {
        e eVar = m0.a;
        b40.c mainDispatcher = m.a;
        f40.c cVarC = c0.c(mainDispatcher);
        kotlin.jvm.internal.m.e(mainDispatcher, "mainDispatcher");
        this.a = context;
        this.b = aVar;
        this.c = aVar2;
        this.d = o.c(g4.d0(((f) aVar2).e()));
        i iVar = new i(context);
        iVar.c = true;
        HashMap map = new HashMap();
        map.put(j.c.a, 144179200);
        g.a(100, 0, "bufferForPlaybackMs", "0");
        g.a(350, 0, "bufferForPlaybackAfterRebufferMs", "0");
        g.a(2500, 100, "minBufferMs", "bufferForPlaybackMs");
        g.a(2500, 350, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        g.a(12000, 2500, "maxBufferMs", "minBufferMs");
        g gVar = new g(new w7.e(), 2500, 2500, 12000, 12000, 100, 100, 350, 350, false, 0, false, map);
        l lVar = new l(context, new k(iVar, 1), new c7.e(context, 5));
        lVar.b(gVar);
        z zVarA = lVar.a();
        zVarA.setAudioAttributes(new d(4, 0, 1, 1, 0, false, true), false);
        zVarA.mute();
        zVarA.setRepeatMode(1);
        zVarA.setPlayWhenReady(true);
        this.f = zVarA;
        k00.c cVar = null;
        this.g = o.c(null);
        this.h = o.c(null);
        this.i = o.c(Float.valueOf(1.0f));
        ta.c0.M(cVarC, (k00.i) null, (n) null, (u00.k) null, new a(this, cVar, 0), 31);
        ta.c0.M(cVarC, (k00.i) null, (n) null, (u00.k) null, new a(this, cVar, 1), 31);
        ta.c0.M(cVarC, (k00.i) null, (n) null, (u00.k) null, new a(this, cVar, 2), 31);
    }

    public final Object a(m00.c cVar) {
        b bVar;
        Object objS;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objI = bVar.A;
        Object obj = l00.a.A;
        int i2 = bVar.C;
        a00.a aVar = this.c;
        try {
            if (i2 == 0) {
                t1.O(objI);
                bVar.C = 1;
                objI = ((f) aVar).i(bVar);
                if (objI == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objI);
            }
            objS = (List) objI;
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (g00.n.a(objS) != null) {
            objS = ((f) aVar).e();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objS) {
            zz.a aVar2 = (zz.a) obj2;
            if (!aVar2.h) {
                String soundId = aVar2.a;
                String str = aVar2.c;
                f fVar = (f) aVar;
                fVar.getClass();
                kotlin.jvm.internal.m.e(soundId, "soundId");
                String strF = fVar.c.f(soundId, str);
                if (r30.k.L0(strF) || r.x0(strF, "http", false)) {
                }
            }
            arrayList.add(obj2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(((zz.a) obj3).a)) {
                arrayList2.add(obj3);
            }
        }
        this.d.j(g4.d0(arrayList2));
        return b0.a;
    }

    public final void b() {
        ExoPlayer exoPlayer;
        if (!((Boolean) ((w) this.b).G.getValue()).booleanValue() || (exoPlayer = (ExoPlayer) this.g.getValue()) == null) {
            return;
        }
        z zVar = (z) exoPlayer;
        zVar.A();
        if (zVar.l0) {
            exoPlayer = null;
        }
        if (exoPlayer != null) {
            ((androidx.media3.common.f) exoPlayer).play();
        }
    }

    public final b0 c(zz.a aVar, m00.c cVar) {
        this.h.emit(aVar, cVar);
        l00.a aVar2 = l00.a.A;
        return b0.a;
    }
}

package av;

import a40.c0;
import android.content.Context;
import android.net.Uri;
import androidx.media3.common.q0;
import com.google.android.gms.internal.measurement.g4;
import com.mchutov.quranify.lyrics.presentation.screen.tafsirpicker.TafsirPickerEffect$CloseScreen;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerEffect$CloseScreen;
import d0.k2;
import d0.m2;
import ev.v;
import ev.w;
import g00.b0;
import i7.z;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

public final class o extends kotlin.jvm.internal.a implements u00.n {
    public final int H;

    public o(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.H = i3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.H) {
            case 0:
                p pVar = (p) this.A;
                if (((ev.k) obj) instanceof ev.k) {
                    pVar.dismiss();
                    return b0.a;
                }
                pVar.getClass();
                throw new NoWhenBranchMatchedException();
            case 1:
                c00.h hVar = (c00.h) obj;
                q qVar = (q) this.A;
                if (hVar instanceof SoundEffectPickerEffect$CloseScreen) {
                    qVar.dismiss();
                } else {
                    qVar.getClass();
                    if (!(hVar instanceof c00.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zz.a aVar = ((c00.g) hVar).a;
                    if (aVar == null) {
                        z zVar = qVar.E;
                        if (zVar != null) {
                            zVar.release();
                        }
                        qVar.E = null;
                    } else {
                        if (qVar.E == null) {
                            Context contextRequireContext = qVar.requireContext();
                            kotlin.jvm.internal.m.d(contextRequireContext, "requireContext(...)");
                            z zVarA = new i7.l(contextRequireContext).a();
                            zVarA.setAudioAttributes(new androidx.media3.common.d(4, 0, 1, 1, 0, false, true), false);
                            zVarA.setRepeatMode(1);
                            zVarA.prepare();
                            zVarA.setPlayWhenReady(true);
                            qVar.E = zVarA;
                        }
                        z zVar2 = qVar.E;
                        if (zVar2 != null) {
                            zVar2.setMediaItem(q0.b(Uri.parse(aVar.c)));
                        }
                    }
                }
                return b0.a;
            case 2:
                t tVar = (t) this.A;
                tVar.getClass();
                if (!kotlin.jvm.internal.m.a((qt.g) obj, TafsirPickerEffect$CloseScreen.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                tVar.dismiss();
                return b0.a;
            case 3:
                String p0 = (String) obj;
                kotlin.jvm.internal.m.e(p0, "p0");
                rc.c.i((rc.c) this.A, p0, (Map) obj2, 4);
                return b0.a;
            case 4:
                String p1 = (String) obj;
                kotlin.jvm.internal.m.e(p1, "p0");
                rc.c.i((rc.c) this.A, p1, (Map) obj2, 4);
                return b0.a;
            case 5:
                String p2 = (String) obj;
                kotlin.jvm.internal.m.e(p2, "p0");
                rc.c.i((rc.c) this.A, p2, (Map) obj2, 4);
                return b0.a;
            case 6:
                long j = ((y3.q) obj).a;
                m2 m2Var = (m2) this.A;
                c0.y(m2Var.l0.c(), null, null, new k2(m2Var, j, (k00.c) null, 2), 3);
                return b0.a;
            case 7:
                long j2 = ((y3.q) obj).a;
                m2 m2Var2 = (m2) this.A;
                c0.y(m2Var2.l0.c(), null, null, new k2(m2Var2, j2, (k00.c) null, 1), 3);
                return b0.a;
            case 8:
                v vVar = (v) obj;
                ev.c0 c0Var = (ev.c0) this.A;
                pm.b bVar = c0Var.c;
                int i = ((ev.t) bVar.d.getValue()).e;
                if (i == 0) {
                    i = vVar.d;
                } else {
                    List list = vVar.a;
                    if (list == null || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                i = vVar.d;
                            }
                        } while (((w) it.next()).a.a != i);
                    } else {
                        i = vVar.d;
                    }
                }
                c0Var.i(ev.t.a((ev.t) bVar.d.getValue(), g4.d0(vVar.b), !vVar.a.isEmpty(), (String) c0Var.i.getValue(), vVar.d, i, vVar.e, g4.f0((Iterable) vVar.c), false, false, false, null, false, 3968));
                return b0.a;
            default:
                ((v1.c) this.A).i((l1.j) obj, ((Number) obj2).intValue());
                return b0.a;
        }
    }
}

package nv;

import a40.c0;
import a40.m0;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoEvent;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import fh.t0;
import g00.b0;
import java.util.List;
import k9.a2;
import k9.b2;
import k9.e1;
import lu.w;
import ri.t1;

public final class n extends m00.i implements u00.k {
    public final int A;
    public int B;
    public final AudioPlayerService C;
    public final String D;
    public final Object E;
    public final Object F;

    public n(AudioPlayerService audioPlayerService, String str, Object obj, Object obj2, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.C = audioPlayerService;
        this.D = str;
        this.E = obj;
        this.F = obj2;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new n(this.C, this.D, (a2) this.E, (b2) this.F, cVar, 0);
            case 1:
                return new n(this.C, this.D, (a2) this.E, (b2) this.F, cVar, 1);
            default:
                return new n(this.C, this.D, (String) this.E, (e1) this.F, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((n) create(cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        Object obj2 = this.F;
        Object obj3 = this.E;
        String str = this.D;
        AudioPlayerService audioPlayerService = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (AudioPlayerService.o(audioPlayerService, str, (a2) obj3, this) != aVar) {
                    }
                    return aVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                h40.e eVar = m0.a;
                b40.c cVar = f40.m.a;
                w wVar = new w(audioPlayerService, (b2) obj2, (k00.c) null, 7);
                this.B = 2;
                Object objJ = c0.J(wVar, cVar, this);
                if (objJ != aVar) {
                    return objJ;
                }
                return aVar;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    int i4 = AudioPlayerService.j0;
                    ov.g gVarY = audioPlayerService.y();
                    this.B = 1;
                    obj = gVarY.h.g(str, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                if (((Boolean) obj).booleanValue() && AudioPlayerService.C((a2) obj3)) {
                    audioPlayerService.u().logEvent(AndroidAutoEvent.AndroidAutoBackgroundSoundSelected.INSTANCE);
                }
                return (b2) obj2;
            default:
                l00.a aVar3 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    int i6 = AudioPlayerService.j0;
                    this.B = 1;
                    obj = audioPlayerService.y().b(str, (String) obj3, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return k9.q.c(t0.o((List) obj), (e1) obj2);
        }
    }
}

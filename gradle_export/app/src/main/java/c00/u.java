package c00;

import a40.z;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerEvent;
import com.mchutov.quranify.soundeffect.presentation.screen.picker.SoundEffectPickerEffect$CloseScreen;
import g00.b0;
import ri.t1;

public final class u extends m00.i implements u00.n {
    public zz.a A;
    public int B;
    public final x C;

    public u(x xVar, k00.c cVar) {
        super(2, cVar);
        this.C = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new u(this.C, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        zz.a aVar;
        aq.a aVar2;
        SoundEffectPickerEffect$CloseScreen soundEffectPickerEffect$CloseScreen;
        l00.a aVar3 = l00.a.A;
        int i = this.B;
        b0 b0Var = b0.a;
        x xVar = this.C;
        if (i == 0) {
            t1.O(obj);
            aVar = ((t) xVar.c.d.getValue()).f;
            b00.c cVar = xVar.f;
            this.A = aVar;
            this.B = 1;
            cVar.c(aVar, this);
            if (b0Var != aVar3) {
            }
            return aVar3;
        }
        if (i == 1) {
            aVar = this.A;
            t1.O(obj);
        } else {
            if (i == 2) {
                t1.O(obj);
                xVar.f.b();
                aVar2 = xVar.h;
                this.A = null;
                this.B = 3;
                if (((bq.a) aVar2).c(false, this) != aVar3) {
                    soundEffectPickerEffect$CloseScreen = SoundEffectPickerEffect$CloseScreen.INSTANCE;
                    this.A = null;
                    this.B = 4;
                    if (xVar.c.a(soundEffectPickerEffect$CloseScreen, this) != aVar3) {
                    }
                }
                return aVar3;
            }
            if (i == 3) {
                t1.O(obj);
                soundEffectPickerEffect$CloseScreen = SoundEffectPickerEffect$CloseScreen.INSTANCE;
                this.A = null;
                this.B = 4;
                if (xVar.c.a(soundEffectPickerEffect$CloseScreen, this) != aVar3) {
                    return aVar3;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
        }
        return b0Var;
        if (aVar != null) {
            xVar.i.logEvent(new AudioPlayerEvent.BackgroundSoundChanged(aVar.a));
        }
        b00.c cVar2 = xVar.f;
        this.A = null;
        this.B = 2;
        if (cVar2.a(this) != aVar3) {
            xVar.f.b();
            aVar2 = xVar.h;
            this.A = null;
            this.B = 3;
            if (((bq.a) aVar2).c(false, this) != aVar3) {
                soundEffectPickerEffect$CloseScreen = SoundEffectPickerEffect$CloseScreen.INSTANCE;
                this.A = null;
                this.B = 4;
                if (xVar.c.a(soundEffectPickerEffect$CloseScreen, this) != aVar3) {
                    return b0Var;
                }
            }
        }
        return aVar3;
    }
}

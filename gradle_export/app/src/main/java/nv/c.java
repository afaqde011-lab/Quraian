package nv;

import a40.c0;
import a40.u1;
import android.os.SystemClock;
import androidx.media3.common.d1;
import androidx.media3.common.q0;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import i7.z;
import k9.g1;

public final class c implements d1 {
    public final AudioPlayerService A;

    public c(AudioPlayerService audioPlayerService) {
        this.A = audioPlayerService;
    }

    public final void V(boolean z) {
        AudioPlayerService audioPlayerService = this.A;
        int i = AudioPlayerService.j0;
        z zVar = audioPlayerService.H;
        if (zVar == null) {
            zVar = audioPlayerService.G;
        }
        if (zVar != null) {
            z = zVar.isPlaying();
        }
        if (!z) {
            this.A.A().i();
            return;
        }
        br.i iVarA = this.A.A();
        synchronized (iVarA.c) {
            try {
                iVarA.g();
                if (iVarA.g != -1) {
                    return;
                }
                iVarA.g = SystemClock.elapsedRealtime();
                u1 u1Var = iVarA.j;
                if (u1Var != null) {
                    u1Var.i(null);
                }
                iVarA.j = c0.y(iVarA.b, null, null, new a1.d(iVarA, (k00.c) null, 13), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(int i, q0 q0Var) {
        g1 g1Var = this.A.I;
        if (g1Var != null) {
            g1Var.b(1, "tab_home");
        }
    }
}

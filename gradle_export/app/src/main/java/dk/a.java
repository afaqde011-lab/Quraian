package dk;

import com.google.gson.JsonIOException;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import k9.a2;
import k9.g1;
import k9.n3;
import k9.p1;
import k9.q1;
import k9.s1;
import kh.b0;

public final class a implements o, n3 {
    public final int A;
    public final String B;

    public a(String str, int i10) {
        this.A = i10;
        this.B = str;
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        switch (this.A) {
            case 3:
                return s1Var.D(a2Var, this.B);
            default:
                nv.p pVar = s1Var.F;
                g1 g1Var = s1Var.E;
                a2 a2VarF = s1Var.F(a2Var);
                pVar.getClass();
                kotlin.jvm.internal.m.e(g1Var, "session");
                kotlin.jvm.internal.m.e(a2VarF, "browser");
                String str = this.B;
                kotlin.jvm.internal.m.e(str, "mediaId");
                AudioPlayerService audioPlayerService = pVar.a;
                b0 b0VarL = AudioPlayerService.l(audioPlayerService, new d40.l(audioPlayerService, str, (k00.c) null, 5));
                b0VarL.a(new q1(s1Var, b0VarL, a2Var, 0), new p1(s1Var, 0));
                return b0VarL;
        }
    }

    @Override
    public Object j() {
        switch (this.A) {
            case 0:
                throw new JsonIOException(this.B);
            case 1:
                throw new JsonIOException(this.B);
            default:
                throw new JsonIOException(this.B);
        }
    }
}

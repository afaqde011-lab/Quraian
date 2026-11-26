package nv;

import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import fh.r0;
import g00.b0;
import java.util.List;
import k9.a2;
import k9.g1;
import k9.s1;
import ri.t1;

public final class d extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final AudioPlayerService C;

    public d(AudioPlayerService audioPlayerService, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = audioPlayerService;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                d dVar = new d(this.C, cVar, 0);
                dVar.B = obj;
                return dVar;
            case 1:
                d dVar2 = new d(this.C, cVar, 1);
                dVar2.B = obj;
                return dVar2;
            case 2:
                d dVar3 = new d(this.C, cVar, 2);
                dVar3.B = obj;
                return dVar3;
            case 3:
                d dVar4 = new d(this.C, cVar, 3);
                dVar4.B = obj;
                return dVar4;
            case 4:
                d dVar5 = new d(this.C, cVar, 4);
                dVar5.B = obj;
                return dVar5;
            default:
                d dVar6 = new d(this.C, cVar, 5);
                dVar6.B = obj;
                return dVar6;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                d dVar = (d) create((List) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                dVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                d dVar2 = (d) create((List) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                dVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                d dVar3 = (d) create((List) obj, (k00.c) obj2);
                b0 b0Var3 = b0.a;
                dVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                d dVar4 = (d) create((List) obj, (k00.c) obj2);
                b0 b0Var4 = b0.a;
                dVar4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                d dVar5 = (d) create((List) obj, (k00.c) obj2);
                b0 b0Var5 = b0.a;
                dVar5.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                d dVar6 = (d) create((g00.k) obj, (k00.c) obj2);
                b0 b0Var6 = b0.a;
                dVar6.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        AudioPlayerService audioPlayerService = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                List list = (List) obj2;
                l00.a aVar = l00.a.A;
                t1.O(obj);
                g1 g1Var = audioPlayerService.I;
                if (g1Var != null) {
                    g1Var.b(list.size(), "fav_surahs");
                }
                ((sn.c) audioPlayerService.W.getValue()).a(sn.l.A);
                break;
            case 1:
                List list2 = (List) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                g1 g1Var2 = audioPlayerService.I;
                if (g1Var2 != null) {
                    g1Var2.b(list2.size(), "fav_reciters");
                }
                ((sn.c) audioPlayerService.W.getValue()).a(sn.l.A);
                break;
            case 2:
                List list3 = (List) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                g1 g1Var3 = audioPlayerService.I;
                if (g1Var3 != null) {
                    g1Var3.b(list3.size() + 1, "tab_collections");
                }
                g1 g1Var4 = audioPlayerService.I;
                if (g1Var4 != null) {
                    g1Var4.b(list3.size(), "downloads");
                }
                break;
            case 3:
                List<ho.a> list4 = (List) obj2;
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                g1 g1Var5 = audioPlayerService.I;
                if (g1Var5 != null) {
                    g1Var5.b(list4.size(), "stories");
                }
                for (ho.a aVar5 : list4) {
                    g1 g1Var6 = audioPlayerService.I;
                    if (g1Var6 != null) {
                        g1Var6.b(aVar5.g.size() + 1, g4.c.f(aVar5.a, "story/"));
                    }
                }
                g1 g1Var7 = audioPlayerService.I;
                if (g1Var7 != null) {
                    g1Var7.b(1, "tab_home");
                }
                break;
            case 4:
                List<dw.a> list5 = (List) obj2;
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                g1 g1Var8 = audioPlayerService.I;
                if (g1Var8 != null) {
                    g1Var8.b(list5.size() + 1, "tab_collections");
                }
                for (dw.a aVar7 : list5) {
                    g1 g1Var9 = audioPlayerService.I;
                    if (g1Var9 != null) {
                        g1Var9.b(((h00.b) aVar7.i).a(), g4.c.f(aVar7.a, "playlist/"));
                    }
                }
                break;
            default:
                l00.a aVar8 = l00.a.A;
                t1.O(obj);
                audioPlayerService.f0 = ((Boolean) ((g00.k) obj2).A).booleanValue();
                g1 g1Var10 = audioPlayerService.I;
                if (g1Var10 != null) {
                    s1 s1Var = g1Var10.a;
                    r0 r0VarQ = s1Var.g().q(0);
                    while (r0VarQ.hasNext()) {
                        Object next = r0VarQ.next();
                        kotlin.jvm.internal.m.d(next, "next(...)");
                        a2 a2Var = (a2) next;
                        if (s1Var.n(a2Var)) {
                            g1Var10.e(a2Var, audioPlayerService.F(g1Var10, a2Var));
                        }
                    }
                }
                break;
        }
        return b0Var;
    }
}

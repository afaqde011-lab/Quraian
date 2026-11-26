package as;

import android.content.Context;
import android.widget.Toast;
import com.mchutov.quranify.audiostories.presentation.screen.story.AudioStoryEffect$CloseScreen;
import com.mchutov.quranify.deeplink.presentation.share.ShareLauncher;
import com.mchutov.quranify.home.presentation.screen.playlist.PlaylistEffect$CloseScreen;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterEffect$CloseScreen;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class t0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final u00.a D;
    public final Context E;

    public t0(u00.a aVar, Context context, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = aVar;
        this.E = context;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                t0 t0Var = new t0(this.D, this.E, cVar, 0);
                t0Var.C = obj;
                return t0Var;
            case 1:
                t0 t0Var2 = new t0(this.D, this.E, cVar, 1);
                t0Var2.C = obj;
                return t0Var2;
            default:
                t0 t0Var3 = new t0(this.D, this.E, cVar, 2);
                t0Var3.C = obj;
                return t0Var3;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                return ((t0) create((w) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((t0) create((nx.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((t0) create((qo.o) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i;
        switch (this.A) {
            case 0:
                w wVar = (w) this.C;
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    if (wVar instanceof PlaylistEffect$CloseScreen) {
                        this.D.invoke();
                    } else {
                        if (!(wVar instanceof v)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ShareLauncher shareLauncher = ShareLauncher.INSTANCE;
                        oq.a aVar2 = ((v) wVar).a;
                        this.C = null;
                        this.B = 1;
                        if (shareLauncher.share(this.E, aVar2, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                nx.z zVar = (nx.z) this.C;
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    if (kotlin.jvm.internal.m.a(zVar, ReciterEffect$CloseScreen.INSTANCE)) {
                        this.D.invoke();
                    } else {
                        if (!(zVar instanceof nx.y)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ShareLauncher shareLauncher2 = ShareLauncher.INSTANCE;
                        oq.a aVar4 = ((nx.y) zVar).a;
                        this.C = null;
                        this.B = 1;
                        if (shareLauncher2.share(this.E, aVar4, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                qo.o oVar = (qo.o) this.C;
                l00.a aVar5 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    if (kotlin.jvm.internal.m.a(oVar, AudioStoryEffect$CloseScreen.INSTANCE)) {
                        this.D.invoke();
                    } else {
                        boolean z = oVar instanceof qo.n;
                        Context context = this.E;
                        if (z) {
                            int iOrdinal = ((qo.n) oVar).a.ordinal();
                            if (iOrdinal == 0) {
                                i = 2131886137;
                            } else if (iOrdinal == 1) {
                                i = 2131886138;
                            } else if (iOrdinal == 2) {
                                i = 2131886136;
                            } else {
                                if (iOrdinal != 3 && iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i = 2131886135;
                            }
                            Toast.makeText(context, i, 0).show();
                        } else {
                            if (!(oVar instanceof qo.m)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ShareLauncher shareLauncher3 = ShareLauncher.INSTANCE;
                            oq.a aVar6 = ((qo.m) oVar).a;
                            this.C = null;
                            this.B = 1;
                            if (shareLauncher3.share(context, aVar6, this) == aVar5) {
                                return aVar5;
                            }
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}

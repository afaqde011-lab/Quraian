package androidx.media3.cast;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.mediarouter.app.v;
import androidx.mediarouter.media.MediaTransferReceiver;
import b2.r;
import c3.o0;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import g1.x5;
import java.util.List;
import kotlin.Metadata;
import l1.g0;
import l1.r1;
import l1.y;
import l1.z;
import l1.z0;
import o9.c0;
import o9.e0;
import o9.u;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u0002*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\u0002*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0003¢\u0006\u0004\b\r\u0010\t\u001a!\u0010\u000e\u001a\u00020\u0002*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0003¢\u0006\u0004\b\u000e\u0010\t\u001a#\u0010\u0011\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u000e\u0010\u0015\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\n@\nX\u008a\u008e\u0002"}, d2 = {"Lb2/r;", "modifier", "Lg00/b0;", "MediaRouteButton", "(Lb2/r;Ll1/j;II)V", "Landroidx/media3/cast/MediaRouteButtonState;", "Lkotlin/Function0;", "onDismissRequest", "MediaRouteDialog", "(Landroidx/media3/cast/MediaRouteButtonState;Lu00/a;Ll1/j;I)V", RuntimeVersion.SUFFIX, "isMediaTransferEnabled", "(Landroidx/media3/cast/MediaRouteButtonState;)Z", "MediaRouteChooserDialog", "MediaRouteControllerDialog", "Lkotlin/Function1;", "content", "MediaRouteButtonContainer", "(Lu00/o;Ll1/j;I)V", "mediaRouteButtonIcon", "Lu00/o;", "showDialog", "Lo9/u;", "kotlin.jvm.PlatformType", "selector", "lib-cast_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaRouteButtonKt {
    private static final u00.o mediaRouteButtonIcon = ComposableSingletons$MediaRouteButtonKt.INSTANCE.m9getLambda1$lib_cast_release();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 implements u00.o {
        final r $modifier;

        public AnonymousClass1(r rVar) {
            this.$modifier = rVar;
        }

        private static final boolean invoke$lambda$1(z0 z0Var) {
            return ((Boolean) z0Var.getValue()).booleanValue();
        }

        private static final void invoke$lambda$2(z0 z0Var, boolean z10) {
            z0Var.setValue(Boolean.valueOf(z10));
        }

        public static final b0 invoke$lambda$4$lambda$3(z0 z0Var) {
            invoke$lambda$2(z0Var, true);
            return b0.a;
        }

        public static final b0 invoke$lambda$6$lambda$5(z0 z0Var) {
            invoke$lambda$2(z0Var, false);
            return b0.a;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((MediaRouteButtonState) obj, (l1.j) obj2, ((Number) obj3).intValue());
            return b0.a;
        }

        public final void invoke(final MediaRouteButtonState mediaRouteButtonState, l1.j jVar, int i10) {
            kotlin.jvm.internal.m.e(mediaRouteButtonState, "$this$MediaRouteButtonContainer");
            g0 g0Var = (g0) jVar;
            g0Var.c0(209185037);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = l1.q.z(Boolean.FALSE);
                g0Var.n0(objN);
            }
            z0 z0Var = (z0) objN;
            g0Var.r(false);
            g0Var.c0(209186944);
            Object objN2 = g0Var.N();
            if (objN2 == cVar) {
                objN2 = new i(z0Var, 0);
                g0Var.n0(objN2);
            }
            g0Var.r(false);
            x5.e((u00.a) objN2, this.$modifier, false, null, v1.d.d(-2720718, new u00.n() {
                public Object invoke(Object obj, Object obj2) {
                    invoke((l1.j) obj, ((Number) obj2).intValue());
                    return b0.a;
                }

                public final void invoke(l1.j jVar2, int i11) {
                    if ((i11 & 3) == 2) {
                        g0 g0Var2 = (g0) jVar2;
                        if (g0Var2.C()) {
                            g0Var2.V();
                            return;
                        }
                    }
                    MediaRouteButtonKt.mediaRouteButtonIcon.invoke(mediaRouteButtonState, jVar2, 48);
                }
            }, jVar), jVar, 196614);
            if (invoke$lambda$1(z0Var)) {
                g0Var.c0(209190305);
                Object objN3 = g0Var.N();
                if (objN3 == cVar) {
                    objN3 = new i(z0Var, 1);
                    g0Var.n0(objN3);
                }
                g0Var.r(false);
                MediaRouteButtonKt.MediaRouteDialog(mediaRouteButtonState, (u00.a) objN3, jVar, (i10 & 14) | 48);
            }
        }
    }

    public static final void MediaRouteButton(r rVar, l1.j jVar, int i10, int i11) {
        int i12;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1866179016);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && g0Var.C()) {
            g0Var.V();
        } else {
            if (i13 != 0) {
                rVar = b2.o.A;
            }
            MediaRouteButtonContainer(v1.d.d(-286638507, new AnonymousClass1(rVar), g0Var), g0Var, 6);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new f(rVar, i10, i11, 0);
        }
    }

    public static final b0 MediaRouteButton$lambda$0(r rVar, int i10, int i11, l1.j jVar, int i12) {
        MediaRouteButton(rVar, jVar, l1.q.K(i10 | 1), i11);
        return b0.a;
    }

    private static final void MediaRouteButtonContainer(u00.o oVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1306513474);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && g0Var.C()) {
            g0Var.V();
        } else {
            Context context = (Context) g0Var.k(o0.f2722b);
            g0Var.c0(90930122);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                objN = l1.q.z(u.f11876c);
                g0Var.n0(objN);
            }
            z0 z0Var = (z0) objN;
            g0Var.r(false);
            g0Var.c0(90932983);
            boolean zI = g0Var.i(context);
            Object objN2 = g0Var.N();
            if (zI || objN2 == cVar) {
                objN2 = new MediaRouteButtonKt$MediaRouteButtonContainer$1$1(context, z0Var, null);
                g0Var.n0(objN2);
            }
            g0Var.r(false);
            l1.q.i(context, g0Var, (u00.n) objN2);
            if (!MediaRouteButtonContainer$lambda$14(z0Var).d()) {
                u uVarMediaRouteButtonContainer$lambda$14 = MediaRouteButtonContainer$lambda$14(z0Var);
                kotlin.jvm.internal.m.d(uVarMediaRouteButtonContainer$lambda$14, "MediaRouteButtonContainer$lambda$14(...)");
                oVar.invoke(MediaRouteButtonStateKt.rememberMediaRouteButtonState(context, uVarMediaRouteButtonContainer$lambda$14, g0Var, 0), g0Var, Integer.valueOf((i11 << 3) & 112));
            }
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new e(oVar, i10, 0);
        }
    }

    private static final u MediaRouteButtonContainer$lambda$14(z0 z0Var) {
        return (u) z0Var.getValue();
    }

    public static final b0 MediaRouteButtonContainer$lambda$17(u00.o oVar, int i10, l1.j jVar, int i11) {
        MediaRouteButtonContainer(oVar, jVar, l1.q.K(i10 | 1));
        return b0.a;
    }

    private static final void MediaRouteChooserDialog(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1597601814);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(mediaRouteButtonState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && g0Var.C()) {
            g0Var.V();
        } else {
            g0Var.c0(707081960);
            boolean zI = ((i11 & 112) == 32) | g0Var.i(mediaRouteButtonState);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new g(mediaRouteButtonState, aVar, 1);
                g0Var.n0(objN);
            }
            g0Var.r(false);
            l1.q.e(b0.a, (u00.k) objN, g0Var);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new h(mediaRouteButtonState, aVar, i10, 1);
        }
    }

    public static final y MediaRouteChooserDialog$lambda$6$lambda$5(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, z zVar) {
        kotlin.jvm.internal.m.e(zVar, "$this$DisposableEffect");
        final androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h(mediaRouteButtonState.getContext(), R.style.AppThemeDialog);
        hVar.g(mediaRouteButtonState.getSelector());
        hVar.setOnDismissListener(new d(1, aVar));
        hVar.show();
        return new y() {
            @Override
            public void dispose() {
                hVar.dismiss();
            }
        };
    }

    public static final b0 MediaRouteChooserDialog$lambda$7(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, int i10, l1.j jVar, int i11) {
        MediaRouteChooserDialog(mediaRouteButtonState, aVar, jVar, l1.q.K(i10 | 1));
        return b0.a;
    }

    private static final void MediaRouteControllerDialog(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, l1.j jVar, int i10) {
        int i11;
        g0 g0Var = (g0) jVar;
        g0Var.e0(992345703);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(mediaRouteButtonState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && g0Var.C()) {
            g0Var.V();
        } else {
            g0Var.c0(-1235551044);
            boolean zI = ((i11 & 112) == 32) | g0Var.i(mediaRouteButtonState);
            Object objN = g0Var.N();
            if (zI || objN == l1.i.f9868a) {
                objN = new g(mediaRouteButtonState, aVar, 0);
                g0Var.n0(objN);
            }
            g0Var.r(false);
            l1.q.e(b0.a, (u00.k) objN, g0Var);
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new h(mediaRouteButtonState, aVar, i10, 0);
        }
    }

    public static final y MediaRouteControllerDialog$lambda$11$lambda$10(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, z zVar) {
        kotlin.jvm.internal.m.e(zVar, "$this$DisposableEffect");
        final v vVar = new v(mediaRouteButtonState.getContext(), R.style.AppThemeDialog);
        vVar.setOnDismissListener(new d(0, aVar));
        vVar.show();
        return new y() {
            @Override
            public void dispose() {
                vVar.dismiss();
            }
        };
    }

    public static final b0 MediaRouteControllerDialog$lambda$12(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, int i10, l1.j jVar, int i11) {
        MediaRouteControllerDialog(mediaRouteButtonState, aVar, jVar, l1.q.K(i10 | 1));
        return b0.a;
    }

    public static final void MediaRouteDialog(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, l1.j jVar, int i10) {
        int i11;
        boolean z10;
        g0 g0Var = (g0) jVar;
        g0Var.e0(1241576675);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(mediaRouteButtonState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && g0Var.C()) {
            g0Var.V();
        } else {
            if (mediaRouteButtonState.getMediaRouter() != null) {
                c0.b();
                e0 e0Var = c0.c().f11797v;
                if (e0Var != null) {
                    z10 = e0Var.f11774b;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if ((z10 && isMediaTransferEnabled(mediaRouteButtonState)) && f50.k.E(mediaRouteButtonState.getContext())) {
                r1 r1VarT = g0Var.t();
                if (r1VarT != null) {
                    r1VarT.f9921d = new h(mediaRouteButtonState, aVar, i10, 2);
                    return;
                }
                return;
            }
            if (mediaRouteButtonState.isConnectedToRemote()) {
                g0Var.c0(-1235814006);
                MediaRouteControllerDialog(mediaRouteButtonState, aVar, g0Var, i11 & 126);
                g0Var.r(false);
            } else {
                g0Var.c0(-1235754579);
                MediaRouteChooserDialog(mediaRouteButtonState, aVar, g0Var, i11 & 126);
                g0Var.r(false);
            }
        }
        r1 r1VarT2 = g0Var.t();
        if (r1VarT2 != null) {
            r1VarT2.f9921d = new h(mediaRouteButtonState, aVar, i10, 3);
        }
    }

    public static final b0 MediaRouteDialog$lambda$1(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, int i10, l1.j jVar, int i11) {
        MediaRouteDialog(mediaRouteButtonState, aVar, jVar, l1.q.K(i10 | 1));
        return b0.a;
    }

    public static final b0 MediaRouteDialog$lambda$2(MediaRouteButtonState mediaRouteButtonState, u00.a aVar, int i10, l1.j jVar, int i11) {
        MediaRouteDialog(mediaRouteButtonState, aVar, jVar, l1.q.K(i10 | 1));
        return b0.a;
    }

    private static final boolean isMediaTransferEnabled(MediaRouteButtonState mediaRouteButtonState) {
        e0 e0Var;
        Intent intent = new Intent(mediaRouteButtonState.getContext(), (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(mediaRouteButtonState.getContext().getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = mediaRouteButtonState.getContext().getPackageManager().queryBroadcastReceivers(intent, 0);
        kotlin.jvm.internal.m.d(listQueryBroadcastReceivers, "queryBroadcastReceivers(...)");
        boolean zIsEmpty = listQueryBroadcastReceivers.isEmpty();
        if (mediaRouteButtonState.getMediaRouter() != null) {
            c0.b();
            e0Var = c0.c().f11797v;
        } else {
            e0Var = null;
        }
        return !zIsEmpty && (e0Var == null || e0Var.f11773a);
    }
}

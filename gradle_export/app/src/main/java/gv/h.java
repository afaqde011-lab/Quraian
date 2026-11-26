package gv;

import androidx.media3.exoplayer.ExoPlayer;

public final class h implements u00.k {
    public final int A;
    public final androidx.lifecycle.w B;
    public final ExoPlayer C;

    public h(androidx.lifecycle.w wVar, ExoPlayer exoPlayer, int i) {
        this.A = i;
        this.B = wVar;
        this.C = exoPlayer;
    }

    @Override
    public final Object invoke(Object obj) {
        l1.z DisposableEffect = (l1.z) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                final int i = 0;
                final ExoPlayer exoPlayer = this.C;
                androidx.lifecycle.u uVar = new androidx.lifecycle.u() {
                    public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
                        switch (i) {
                            case 0:
                                int i2 = m.a[oVar.ordinal()];
                                androidx.media3.common.f fVar = exoPlayer;
                                if (i2 == 1) {
                                    fVar.pause();
                                    break;
                                } else if (i2 == 2) {
                                    androidx.media3.common.f fVar2 = fVar;
                                    if (fVar2.getMediaItemCount() > 0) {
                                        fVar2.play();
                                    }
                                    break;
                                }
                                break;
                            default:
                                int i3 = kz.e.a[oVar.ordinal()];
                                androidx.media3.common.f fVar3 = exoPlayer;
                                if (i3 == 1) {
                                    i7.z zVar = (i7.z) fVar3;
                                    zVar.setPlayWhenReady(true);
                                    zVar.play();
                                    break;
                                } else if (i3 == 2) {
                                    fVar3.pause();
                                    break;
                                }
                                break;
                        }
                    }
                };
                androidx.lifecycle.w wVar = this.B;
                wVar.getLifecycle().a(uVar);
                return new k(wVar, uVar, exoPlayer, 0);
            default:
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                final int i2 = 1;
                final androidx.media3.common.f fVar = this.C;
                androidx.lifecycle.u uVar2 = new androidx.lifecycle.u() {
                    public final void a(androidx.lifecycle.w wVar2, androidx.lifecycle.o oVar) {
                        switch (i2) {
                            case 0:
                                int i3 = m.a[oVar.ordinal()];
                                androidx.media3.common.f fVar2 = fVar;
                                if (i3 == 1) {
                                    fVar2.pause();
                                    break;
                                } else if (i3 == 2) {
                                    androidx.media3.common.f fVar3 = fVar2;
                                    if (fVar3.getMediaItemCount() > 0) {
                                        fVar3.play();
                                    }
                                    break;
                                }
                                break;
                            default:
                                int i4 = kz.e.a[oVar.ordinal()];
                                androidx.media3.common.f fVar4 = fVar;
                                if (i4 == 1) {
                                    i7.z zVar = (i7.z) fVar4;
                                    zVar.setPlayWhenReady(true);
                                    zVar.play();
                                    break;
                                } else if (i4 == 2) {
                                    fVar4.pause();
                                    break;
                                }
                                break;
                        }
                    }
                };
                androidx.lifecycle.w wVar2 = this.B;
                wVar2.getLifecycle().a(uVar2);
                if (wVar2.getLifecycle().b().compareTo(androidx.lifecycle.p.E) >= 0) {
                    fVar.play();
                }
                return new k(wVar2, uVar2, fVar, 2);
        }
    }
}

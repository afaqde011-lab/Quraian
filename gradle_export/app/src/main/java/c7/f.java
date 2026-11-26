package c7;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import eh.x;
import i7.i0;

public final class f {

    public final x f2896a;

    public final Handler f2897b;

    public i0 f2898c;

    public androidx.media3.common.d f2899d;

    public int f2901f;

    public h f2903h;

    public float f2902g = 1.0f;

    public int f2900e = 0;

    public f(Context context, Looper looper, i0 i0Var) {
        this.f2896a = a.a.T(new e(context, 0));
        this.f2898c = i0Var;
        this.f2897b = new Handler(looper);
    }

    public final void a() {
        int i10 = this.f2900e;
        if (i10 == 1 || i10 == 0 || this.f2903h == null) {
            return;
        }
        AudioManager audioManager = (AudioManager) this.f2896a.get();
        AudioFocusRequest audioFocusRequest = this.f2903h.f2912f;
        audioFocusRequest.getClass();
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public final void b(int i10) {
        i0 i0Var = this.f2898c;
        if (i0Var != null) {
            i0Var.H.a(33, i10, 0).b();
        }
    }

    public final void c(int i10) {
        if (this.f2900e == i10) {
            return;
        }
        this.f2900e = i10;
        float f3 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f2902g == f3) {
            return;
        }
        this.f2902g = f3;
        i0 i0Var = this.f2898c;
        if (i0Var != null) {
            i0Var.H.f(34);
        }
    }

    public final int d(int i10, boolean z10) {
        int i11;
        g gVar;
        boolean z11 = false;
        if (i10 == 1 || (i11 = this.f2901f) != 1) {
            a();
            c(0);
            return 1;
        }
        if (!z10) {
            int i12 = this.f2900e;
            if (i12 == 1) {
                return -1;
            }
            if (i12 == 3) {
                return 0;
            }
        } else if (this.f2900e != 2) {
            h hVar = this.f2903h;
            if (hVar == null) {
                if (hVar == null) {
                    gVar = new g();
                    gVar.f2906c = androidx.media3.common.d.f1142i;
                    gVar.f2904a = i11;
                } else {
                    g gVar2 = new g();
                    gVar2.f2904a = hVar.f2907a;
                    gVar2.f2906c = hVar.f2910d;
                    gVar2.f2905b = hVar.f2911e;
                    gVar = gVar2;
                }
                androidx.media3.common.d dVar = this.f2899d;
                if (dVar != null && dVar.f1148a == 1) {
                    z11 = true;
                }
                dVar.getClass();
                gVar.f2906c = dVar;
                gVar.f2905b = z11;
                ?? r7 = new AudioManager.OnAudioFocusChangeListener() {
                    @Override
                    public final void onAudioFocusChange(int i13) {
                        androidx.media3.common.d dVar2;
                        f fVar = this.f2895a;
                        fVar.getClass();
                        if (i13 == -3 || i13 == -2) {
                            if (i13 != -2 && ((dVar2 = fVar.f2899d) == null || dVar2.f1148a != 1)) {
                                fVar.c(4);
                                return;
                            } else {
                                fVar.b(0);
                                fVar.c(3);
                                return;
                            }
                        }
                        if (i13 == -1) {
                            fVar.b(-1);
                            fVar.a();
                            fVar.c(1);
                        } else if (i13 != 1) {
                            a1.b.y("Unknown focus change type: ", i13, "AudioFocusManager");
                        } else {
                            fVar.c(2);
                            fVar.b(1);
                        }
                    }
                };
                Handler handler = this.f2897b;
                handler.getClass();
                this.f2903h = new h(gVar.f2904a, r7, handler, (androidx.media3.common.d) gVar.f2906c, gVar.f2905b);
            }
            AudioManager audioManager = (AudioManager) this.f2896a.get();
            AudioFocusRequest audioFocusRequest = this.f2903h.f2912f;
            audioFocusRequest.getClass();
            if (audioManager.requestAudioFocus(audioFocusRequest) == 1) {
                c(2);
                return 1;
            }
            c(1);
            return -1;
        }
        return 1;
    }
}

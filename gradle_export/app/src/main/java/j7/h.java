package j7;

import android.media.metrics.PlaybackMetrics;
import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import e7.i0;
import eh.z;
import java.util.HashMap;
import java.util.Random;
import s7.a0;

public final class h {

    public static final z f8215h = new z(3);

    public static final Random f8216i = new Random();

    public i f8220d;

    public String f8222f;

    public final j2 f8217a = new j2();

    public final h2 f8218b = new h2();

    public final HashMap f8219c = new HashMap();

    public k2 f8221e = k2.EMPTY;

    public long f8223g = -1;

    public final void a(g gVar) {
        long j9 = gVar.f8210c;
        if (j9 != -1 && gVar.f8212e) {
            this.f8223g = j9;
        }
        this.f8222f = null;
    }

    public final g b(int i10, a0 a0Var) {
        long j9;
        long j10;
        long j11;
        HashMap map = this.f8219c;
        g gVar = null;
        long j12 = Long.MAX_VALUE;
        for (g gVar2 : map.values()) {
            long j13 = gVar2.f8210c;
            a0 a0Var2 = gVar2.f8211d;
            if (j13 == -1 && i10 == gVar2.f8209b && a0Var != null) {
                long j14 = a0Var.f13647d;
                h hVar = gVar2.f8214g;
                j9 = -1;
                g gVar3 = (g) hVar.f8219c.get(hVar.f8222f);
                if (gVar3 != null) {
                    j11 = gVar3.f8210c;
                    if (j11 == -1) {
                        j11 = hVar.f8223g + 1;
                    }
                } else {
                    j11 = hVar.f8223g + 1;
                }
                if (j14 >= j11) {
                    gVar2.f8210c = j14;
                }
            } else {
                j9 = -1;
            }
            if (a0Var != null) {
                long j15 = a0Var.f13647d;
                if (j15 != j9) {
                    if (a0Var2 == null) {
                        if (!a0Var.b() && j15 == gVar2.f8210c) {
                            j10 = gVar2.f8210c;
                            if (j10 != j9 || j10 < j12) {
                                gVar = gVar2;
                                j12 = j10;
                            } else if (j10 == j12) {
                                String str = i0.f5136a;
                                if (gVar.f8211d != null && a0Var2 != null) {
                                    gVar = gVar2;
                                }
                            }
                        }
                    } else if (j15 == a0Var2.f13647d && a0Var.f13645b == a0Var2.f13645b && a0Var.f13646c == a0Var2.f13646c) {
                        j10 = gVar2.f8210c;
                        if (j10 != j9) {
                        }
                        gVar = gVar2;
                        j12 = j10;
                    }
                }
            }
            if (i10 == gVar2.f8209b) {
                j10 = gVar2.f8210c;
                if (j10 != j9) {
                }
                gVar = gVar2;
                j12 = j10;
            }
        }
        if (gVar != null) {
            return gVar;
        }
        String str2 = (String) f8215h.get();
        g gVar4 = new g(this, str2, i10, a0Var);
        map.put(str2, gVar4);
        return gVar4;
    }

    public final synchronized String c(k2 k2Var, a0 a0Var) {
        return b(k2Var.getPeriodByUid(a0Var.f13644a, this.f8218b).f1233c, a0Var).f8208a;
    }

    public final void d(a aVar) {
        a0 a0Var;
        k2 k2Var = aVar.f8199b;
        int i10 = aVar.f8200c;
        a0 a0Var2 = aVar.f8201d;
        boolean zIsEmpty = k2Var.isEmpty();
        HashMap map = this.f8219c;
        if (zIsEmpty) {
            String str = this.f8222f;
            if (str != null) {
                g gVar = (g) map.get(str);
                gVar.getClass();
                a(gVar);
                return;
            }
            return;
        }
        g gVar2 = (g) map.get(this.f8222f);
        this.f8222f = b(i10, a0Var2).f8208a;
        e(aVar);
        if (a0Var2 != null) {
            long j9 = a0Var2.f13647d;
            if (a0Var2.b()) {
                if (gVar2 != null && gVar2.f8210c == j9 && (a0Var = gVar2.f8211d) != null && a0Var.f13645b == a0Var2.f13645b && a0Var.f13646c == a0Var2.f13646c) {
                    return;
                }
                b(i10, new a0(a0Var2.f13644a, j9));
                this.f8220d.getClass();
            }
        }
    }

    public final synchronized void e(a aVar) {
        long j9;
        this.f8220d.getClass();
        if (aVar.f8199b.isEmpty()) {
            return;
        }
        a0 a0Var = aVar.f8201d;
        if (a0Var != null) {
            long j10 = a0Var.f13647d;
            if (j10 != -1) {
                g gVar = (g) this.f8219c.get(this.f8222f);
                if (gVar != null) {
                    j9 = gVar.f8210c;
                    if (j9 == -1) {
                        j9 = this.f8223g + 1;
                    }
                } else {
                    j9 = this.f8223g + 1;
                }
                if (j10 < j9) {
                    return;
                }
            }
            g gVar2 = (g) this.f8219c.get(this.f8222f);
            if (gVar2 != null && gVar2.f8210c == -1 && gVar2.f8209b != aVar.f8200c) {
                return;
            }
        }
        g gVarB = b(aVar.f8200c, aVar.f8201d);
        if (this.f8222f == null) {
            this.f8222f = gVarB.f8208a;
        }
        a0 a0Var2 = aVar.f8201d;
        if (a0Var2 != null && a0Var2.b()) {
            a0 a0Var3 = aVar.f8201d;
            g gVarB2 = b(aVar.f8200c, new a0(a0Var3.f13644a, a0Var3.f13647d, a0Var3.f13645b));
            if (!gVarB2.f8212e) {
                gVarB2.f8212e = true;
                aVar.f8199b.getPeriodByUid(aVar.f8201d.f13644a, this.f8218b);
                Math.max(0L, i0.W(this.f8218b.d(aVar.f8201d.f13645b)) + i0.W(this.f8218b.f1235e));
                this.f8220d.getClass();
            }
        }
        if (!gVarB.f8212e) {
            gVarB.f8212e = true;
            this.f8220d.getClass();
        }
        if (gVarB.f8208a.equals(this.f8222f) && !gVarB.f8213f) {
            gVarB.f8213f = true;
            i iVar = this.f8220d;
            String str = gVarB.f8208a;
            iVar.getClass();
            a0 a0Var4 = aVar.f8201d;
            if (a0Var4 == null || !a0Var4.b()) {
                iVar.b();
                iVar.f8233j = str;
                iVar.f8234k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.9.0");
                iVar.c(aVar.f8199b, a0Var4);
            }
        }
    }
}

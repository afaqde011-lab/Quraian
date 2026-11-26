package s7;

import android.util.Log;
import c3.w2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c0 implements e7.h, xf.f, xf.a, m3.p, d4.i {
    public final int A;
    public final Object B;
    public final Object C;

    public c0(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    @Override
    public Object M(Task task) throws Throwable {
        InputStream errorStream;
        ?? r10;
        ?? ValueOf;
        switch (this.A) {
            case 2:
                return ((sj.g) this.B).b(task, 0L, (HashMap) this.C);
            case 3:
                sj.g gVar = (sj.g) this.B;
                Date date = (Date) this.C;
                gVar.getClass();
                if (task.o()) {
                    sj.l lVar = gVar.f14272g;
                    synchronized (lVar.f14304b) {
                        lVar.f14303a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception excJ = task.j();
                    if (excJ != null) {
                        if (!(excJ instanceof FirebaseRemoteConfigFetchThrottledException)) {
                            sj.l lVar2 = gVar.f14272g;
                            synchronized (lVar2.f14304b) {
                                lVar2.f14303a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        } else {
                            sj.l lVar3 = gVar.f14272g;
                            synchronized (lVar3.f14304b) {
                                lVar3.f14303a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            default:
                ?? r4 = (sj.j) this.B;
                ?? inputStream = (Task) this.C;
                ve.b bVar = r4.f14296p;
                boolean z10 = true;
                ?? r7 = 0;
                try {
                    try {
                        if (!inputStream.o()) {
                            throw new IOException(inputStream.j());
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.k();
                        r4.f14288f = httpURLConnection;
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            errorStream = r4.f14288f.getErrorStream();
                            try {
                                int responseCode = r4.f14288f.getResponseCode();
                                ValueOf = Integer.valueOf(responseCode);
                                if (responseCode == 200) {
                                    try {
                                        synchronized (r4) {
                                            r4.f14285c = 8;
                                        }
                                        r4.f14297q.e(0, sj.l.f14302f);
                                        k7.e eVarJ = r4.j(r4.f14288f);
                                        r4.f14289g = eVarJ;
                                        eVarJ.c();
                                    } catch (IOException e3) {
                                        e = e3;
                                        if (r4.f14287e) {
                                            synchronized (r4) {
                                                r4.f14285c = 8;
                                            }
                                        } else {
                                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                        }
                                        r4.b(inputStream, errorStream);
                                        synchronized (r4) {
                                            r4.f14284b = false;
                                        }
                                        if (r4.f14287e || (ValueOf != 0 && !sj.j.d(ValueOf.intValue()))) {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            bVar.getClass();
                                            r4.k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!z10 || ValueOf.intValue() == 200) {
                                            r4.h();
                                        } else {
                                            String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (ValueOf.intValue() == 403) {
                                                strF = sj.j.f(r4.f14288f.getErrorStream());
                                            }
                                            new FirebaseRemoteConfigServerException(ValueOf.intValue(), strF, 0);
                                        }
                                        r4.f14288f = null;
                                        r4.f14289g = null;
                                        return Tasks.d(null);
                                    }
                                }
                                r4.b(inputStream, errorStream);
                                synchronized (r4) {
                                    r4.f14284b = false;
                                }
                                z10 = !r4.f14287e && sj.j.d(responseCode);
                                if (z10) {
                                    bVar.getClass();
                                    r4.k(new Date(System.currentTimeMillis()));
                                }
                                if (z10 || responseCode == 200) {
                                    r4.h();
                                } else {
                                    String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (responseCode == 403) {
                                        strF2 = sj.j.f(r4.f14288f.getErrorStream());
                                    }
                                    new FirebaseRemoteConfigServerException(responseCode, strF2, 0);
                                    r4.g();
                                }
                            } catch (IOException e10) {
                                e = e10;
                                ValueOf = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                ValueOf = 0;
                                r7 = inputStream;
                                r10 = ValueOf;
                                r4.b(r7, errorStream);
                                synchronized (r4) {
                                    r4.f14284b = false;
                                    if (r4.f14287e || (r10 != 0 && !sj.j.d(r10.intValue()))) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        bVar.getClass();
                                        r4.k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z10 || r10.intValue() == 200) {
                                        r4.h();
                                    } else {
                                        String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                                        if (r10.intValue() == 403) {
                                            strF3 = sj.j.f(r4.f14288f.getErrorStream());
                                        }
                                        new FirebaseRemoteConfigServerException(r10.intValue(), strF3, 0);
                                        r4.g();
                                    }
                                    throw th;
                                }
                            }
                        } catch (IOException e11) {
                            e = e11;
                            errorStream = null;
                            inputStream = inputStream;
                            ValueOf = errorStream;
                            if (r4.f14287e) {
                                synchronized (r4) {
                                    r4.f14285c = 8;
                                }
                            } else {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            }
                            r4.b(inputStream, errorStream);
                            synchronized (r4) {
                                r4.f14284b = false;
                                if (r4.f14287e) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    bVar.getClass();
                                    r4.k(new Date(System.currentTimeMillis()));
                                }
                                if (z10) {
                                }
                                r4.h();
                                r4.f14288f = null;
                                r4.f14289g = null;
                                return Tasks.d(null);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            errorStream = null;
                            ValueOf = 0;
                        }
                        r4.f14288f = null;
                        r4.f14289g = null;
                        return Tasks.d(null);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (IOException e12) {
                    e = e12;
                    inputStream = 0;
                    errorStream = null;
                } catch (Throwable th5) {
                    th = th5;
                    errorStream = null;
                    r10 = 0;
                    r4.b(r7, errorStream);
                    synchronized (r4) {
                        r4.f14284b = false;
                        if (r4.f14287e) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            bVar.getClass();
                            r4.k(new Date(System.currentTimeMillis()));
                        }
                        if (z10) {
                            r4.h();
                        } else {
                            r4.h();
                        }
                        throw th;
                    }
                }
                break;
        }
    }

    @Override
    public void accept(Object obj) {
        c50.h hVar = (c50.h) this.B;
        ((g0) obj).q(hVar.B, (a0) hVar.C, (w) this.C);
    }

    @Override
    public Object h(d4.h hVar) {
        Executor executor = (Executor) this.B;
        u00.a aVar = (u00.a) this.C;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        za.o oVar = new za.o(atomicBoolean, 1);
        za.j jVar = za.j.A;
        d4.m mVar = hVar.f4611c;
        if (mVar != null) {
            mVar.a(oVar, jVar);
        }
        executor.execute(new za.p(atomicBoolean, hVar, aVar, 1));
        return g00.b0.a;
    }

    @Override
    public Task k(Object obj) {
        sj.c cVar = (sj.c) this.B;
        sj.e eVar = (sj.e) this.C;
        synchronized (cVar) {
            cVar.f14246c = Tasks.d(eVar);
        }
        return Tasks.d(eVar);
    }

    @Override
    public void l(m3.o oVar) {
        w2 w2Var = (w2) this.B;
        String str = (String) this.C;
        kotlin.jvm.internal.m.e(oVar, "it");
        w2Var.a(str);
    }
}

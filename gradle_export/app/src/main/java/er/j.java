package er;

import a1.z;
import a10.h0;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import com.mchutov.quranify.home.domain.exception.IntegrityTokenException;
import g00.b0;
import g00.p;
import h00.n;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import kotlin.jvm.internal.m;
import r30.k;
import retrofit2.HttpException;
import ri.t1;
import yg.l;

public final class j {
    public final SharedPreferences a;
    public final SharedPreferences b;
    public final yg.b c;
    public final gr.b d;
    public final p e;
    public final p f;
    public final j40.c g;
    public volatile yg.j h;

    public j(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2, yg.b bVar, gr.b bVar2) {
        String string;
        this.a = sharedPreferences;
        this.b = sharedPreferences2;
        this.c = bVar;
        this.d = bVar2;
        String string2 = null;
        try {
            string = sharedPreferences.getString("SESSION_TOKEN_KEY", null);
        } catch (Throwable unused) {
            string = null;
        }
        try {
            string2 = sharedPreferences2.getString("SESSION_TOKEN_KEY", null);
        } catch (Throwable unused2) {
        }
        if ((string == null || k.L0(string)) && string2 != null && !k.L0(string2)) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("SESSION_TOKEN_KEY", string2);
                editorEdit.apply();
            } catch (Throwable unused3) {
            }
        }
        if (string2 != null && !k.L0(string2)) {
            try {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.remove("SESSION_TOKEN_KEY");
                editorEdit2.apply();
            } catch (Throwable unused4) {
            }
        }
        this.e = rd.a.J(new e00.g(7));
        this.f = rd.a.J(new z(this, 27));
        this.g = j40.d.a();
    }

    public static String c() throws NoSuchAlgorithmException {
        String str = UUID.randomUUID().toString() + System.currentTimeMillis();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(r30.a.a);
        m.d(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        m.b(bArrDigest);
        return n.L0(bArrDigest, "", new e6.c(6), 30);
    }

    public final Object a(m00.c cVar) {
        e eVar;
        j40.c cVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i = eVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.D = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object obj = eVar.B;
        l00.a aVar = l00.a.A;
        int i2 = eVar.D;
        if (i2 == 0) {
            t1.O(obj);
            j40.c cVar3 = this.g;
            eVar.A = cVar3;
            eVar.D = 1;
            if (cVar3.l(eVar) == aVar) {
                return aVar;
            }
            cVar2 = cVar3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar2 = eVar.A;
            t1.O(obj);
        }
        try {
            this.h = null;
            return b0.a;
        } finally {
            cVar2.i(null);
        }
    }

    public final Serializable b(m00.c cVar) {
        f fVar;
        dr.d dVar;
        String sessionToken;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.D = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objF = fVar.B;
        l00.a aVar = l00.a.A;
        int i2 = fVar.D;
        try {
            if (i2 == 0) {
                t1.O(objF);
                fVar.D = 1;
                objF = f(fVar);
                if (objF == aVar) {
                }
                return aVar;
            }
            if (i2 == 1) {
                t1.O(objF);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = fVar.A;
                    t1.O(objF);
                    return str;
                }
                t1.O(objF);
            }
            dVar = (dr.d) objF;
            if (dVar != null) {
                sessionToken = dVar.getSessionToken();
            } else {
                sessionToken = null;
            }
            if (sessionToken != null && !k.L0(sessionToken)) {
                fVar.A = sessionToken;
                fVar.D = 3;
                try {
                    SharedPreferences.Editor editorEdit = this.a.edit();
                    editorEdit.putString("SESSION_TOKEN_KEY", sessionToken);
                    editorEdit.apply();
                } catch (Throwable unused) {
                }
                try {
                    SharedPreferences.Editor editorEdit2 = this.b.edit();
                    editorEdit2.remove("SESSION_TOKEN_KEY");
                    editorEdit2.apply();
                } catch (Throwable unused2) {
                }
                if (b0.a != aVar) {
                    return sessionToken;
                }
                return aVar;
            }
            return t1.s(new IllegalStateException("check-integrity returned no session_token"));
            gr.b bVar = this.d;
            dr.c cVar2 = new dr.c((String) objF);
            fVar.D = 2;
            objF = bVar.a(cVar2, fVar);
            if (objF != aVar) {
                dVar = (dr.d) objF;
                if (dVar != null) {
                    sessionToken = dVar.getSessionToken();
                } else {
                    sessionToken = null;
                }
                if (sessionToken != null) {
                    fVar.A = sessionToken;
                    fVar.D = 3;
                    SharedPreferences.Editor editorEdit3 = this.a.edit();
                    editorEdit3.putString("SESSION_TOKEN_KEY", sessionToken);
                    editorEdit3.apply();
                    SharedPreferences.Editor editorEdit4 = this.b.edit();
                    editorEdit4.remove("SESSION_TOKEN_KEY");
                    editorEdit4.apply();
                    if (b0.a != aVar) {
                        return sessionToken;
                    }
                }
                return t1.s(new IllegalStateException("check-integrity returned no session_token"));
            }
            return aVar;
        } catch (Exception e) {
            e = e;
            if ((e instanceof HttpException) && ((HttpException) e).A == 401) {
                e = new IntegrityTokenException("Device not recognized by Google Play", e);
            }
            return t1.s(e);
        }
    }

    public final java.lang.Object d(m00.c r6) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: er.j.d(m00.c):java.lang.Object");
    }

    public final Object e(m00.c cVar) throws Throwable {
        h hVar;
        j40.a aVar;
        int i;
        j40.a aVar2;
        yg.j jVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.E;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.E = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.C;
        l00.a aVar3 = l00.a.A;
        int i3 = hVar.E;
        try {
            if (i3 == 0) {
                t1.O(obj);
                yg.j jVar2 = this.h;
                if (jVar2 != null) {
                    return jVar2;
                }
                aVar = this.g;
                hVar.A = aVar;
                i = 0;
                hVar.B = 0;
                hVar.E = 1;
                if (aVar.l(hVar) != aVar3) {
                }
                return aVar3;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = hVar.A;
                try {
                    t1.O(obj);
                    this.h = (yg.j) obj;
                    m.d(obj, "also(...)");
                    jVar = (yg.j) obj;
                    aVar = aVar2;
                    aVar.i(null);
                    return jVar;
                } catch (Throwable th) {
                    th = th;
                    aVar2.i(null);
                    throw th;
                }
            }
            i = hVar.B;
            j40.a aVar4 = hVar.A;
            t1.O(obj);
            aVar = aVar4;
            jVar = this.h;
            if (jVar == null) {
                yg.b bVar = this.c;
                Object value = this.f.getValue();
                m.d(value, "getValue(...)");
                Task taskA = bVar.a((l) value);
                hVar.A = aVar;
                hVar.B = i;
                hVar.E = 2;
                Object objI = h0.i(taskA, hVar);
                if (objI != aVar3) {
                    aVar2 = aVar;
                    obj = objI;
                    this.h = (yg.j) obj;
                    m.d(obj, "also(...)");
                    jVar = (yg.j) obj;
                    aVar = aVar2;
                }
                return aVar3;
            }
            aVar.i(null);
            return jVar;
        } catch (Throwable th2) {
            th = th2;
            aVar2 = aVar;
            aVar2.i(null);
            throw th;
        }
    }

    public final java.lang.Object f(m00.c r17) throws com.mchutov.quranify.home.domain.exception.IntegrityTokenException {
        throw new UnsupportedOperationException("Method not decompiled: er.j.f(m00.c):java.lang.Object");
    }
}

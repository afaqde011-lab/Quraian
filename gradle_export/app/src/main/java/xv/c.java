package xv;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import g00.b0;
import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import lu.w;
import ri.t1;
import vv.d;

public final class c {
    public final d a;
    public final aw.a b;
    public final yv.c c;
    public final LocaleManager d;
    public final au.a e;
    public final SharedPreferences f;
    public final j40.c g = j40.d.a();

    public c(d dVar, aw.a aVar, yv.c cVar, LocaleManager localeManager, au.a aVar2, SharedPreferences sharedPreferences) {
        this.a = dVar;
        this.b = aVar;
        this.c = cVar;
        this.d = localeManager;
        this.e = aVar2;
        this.f = sharedPreferences;
    }

    public final Object a(boolean z, m00.c cVar) throws Throwable {
        a aVar;
        j40.a aVar2;
        int i;
        int i2;
        boolean z2;
        int i3;
        Object objA;
        int i4;
        int i5;
        Object objUpdateData;
        Serializable serializableA;
        ?? r2;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i6 = aVar.G;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aVar.G = i6 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.E;
        l00.a aVar3 = l00.a.A;
        ?? r3 = aVar.G;
        yv.c cVar2 = this.c;
        int i7 = 0;
        k00.c cVar3 = null;
        try {
            if (r3 == 0) {
                t1.O(obj);
                if (((Boolean) this.e.c.getValue()).booleanValue()) {
                    j40.c cVar4 = this.g;
                    aVar.B = cVar4;
                    aVar.A = z;
                    aVar.C = 0;
                    aVar.G = 1;
                    if (cVar4.l(aVar) != aVar3) {
                        aVar2 = cVar4;
                        i = 0;
                    }
                } else {
                    aVar.B = null;
                    aVar.A = z;
                    aVar.G = 5;
                    serializableA = cVar2.a(aVar);
                    if (serializableA != aVar3) {
                        return serializableA;
                    }
                }
                return aVar3;
            }
            if (r3 != 1) {
                if (r3 == 2) {
                    int i8 = aVar.D;
                    i3 = aVar.C;
                    boolean z3 = aVar.A;
                    j40.a aVar4 = aVar.B;
                    try {
                        t1.O(obj);
                        i2 = i8;
                        z2 = z3;
                        aVar2 = aVar4;
                        i5 = i2;
                        if (((Boolean) obj).booleanValue()) {
                            i = i3;
                            z = z2;
                            i7 = i5;
                            String strC = c();
                            aw.a aVar5 = this.b;
                            aVar.B = aVar2;
                            aVar.A = z;
                            aVar.C = i;
                            aVar.D = i7;
                            aVar.G = 3;
                            objA = aVar5.a(strC, aVar);
                            if (objA != aVar3) {
                                i4 = i;
                                obj = objA;
                                r3 = aVar2;
                                List listX = this.a.X((wv.a) obj);
                                aVar.B = r3;
                                aVar.A = z;
                                aVar.C = i4;
                                aVar.D = i7;
                                aVar.G = 4;
                                objUpdateData = cVar2.a.updateData(new w(cVar2, listX, cVar3, 25), aVar);
                                if (objUpdateData == aVar3) {
                                    objUpdateData = b0.a;
                                }
                                if (objUpdateData == aVar3) {
                                }
                            }
                            return aVar3;
                        }
                        z = z2;
                        r2 = aVar2;
                        r2.i(null);
                        aVar.B = null;
                        aVar.A = z;
                        aVar.G = 5;
                        serializableA = cVar2.a(aVar);
                        if (serializableA != aVar3) {
                            return aVar3;
                        }
                        return serializableA;
                    } catch (Throwable th) {
                        th = th;
                        r3 = aVar4;
                    }
                } else if (r3 == 3) {
                    int i9 = aVar.D;
                    int i11 = aVar.C;
                    boolean z4 = aVar.A;
                    j40.a aVar6 = aVar.B;
                    try {
                        t1.O(obj);
                        i7 = i9;
                        z = z4;
                        i4 = i11;
                        r3 = aVar6;
                        List listX2 = this.a.X((wv.a) obj);
                        aVar.B = r3;
                        aVar.A = z;
                        aVar.C = i4;
                        aVar.D = i7;
                        aVar.G = 4;
                        objUpdateData = cVar2.a.updateData(new w(cVar2, listX2, cVar3, 25), aVar);
                        if (objUpdateData == aVar3) {
                            objUpdateData = b0.a;
                        }
                        if (objUpdateData == aVar3) {
                        }
                        return aVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = aVar6;
                    }
                } else {
                    if (r3 != 4) {
                        if (r3 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                        return obj;
                    }
                    z = aVar.A;
                    r3 = aVar.B;
                    t1.O(obj);
                }
                r3.i(null);
                throw th;
            }
            int i12 = aVar.C;
            boolean z5 = aVar.A;
            j40.a aVar7 = aVar.B;
            t1.O(obj);
            i = i12;
            z = z5;
            aVar2 = aVar7;
            long jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences.Editor editorEdit = this.f.edit();
            editorEdit.putLong("KEY_PLAYLIST_FETCHED_AT", jCurrentTimeMillis);
            editorEdit.putString("KEY_PLAYLIST_LAST_SAVED_LANG", c());
            editorEdit.apply();
            r2 = r3;
            r2.i(null);
            aVar.B = null;
            aVar.A = z;
            aVar.G = 5;
            serializableA = cVar2.a(aVar);
            if (serializableA != aVar3) {
                return aVar3;
            }
            return serializableA;
            if (z) {
                String strC2 = c();
                aw.a aVar8 = this.b;
                aVar.B = aVar2;
                aVar.A = z;
                aVar.C = i;
                aVar.D = i7;
                aVar.G = 3;
                objA = aVar8.a(strC2, aVar);
                if (objA != aVar3) {
                    i4 = i;
                    obj = objA;
                    r3 = aVar2;
                    List listX3 = this.a.X((wv.a) obj);
                    aVar.B = r3;
                    aVar.A = z;
                    aVar.C = i4;
                    aVar.D = i7;
                    aVar.G = 4;
                    objUpdateData = cVar2.a.updateData(new w(cVar2, listX3, cVar3, 25), aVar);
                    if (objUpdateData == aVar3) {
                        objUpdateData = b0.a;
                    }
                    if (objUpdateData == aVar3) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        SharedPreferences.Editor editorEdit2 = this.f.edit();
                        editorEdit2.putLong("KEY_PLAYLIST_FETCHED_AT", jCurrentTimeMillis2);
                        editorEdit2.putString("KEY_PLAYLIST_LAST_SAVED_LANG", c());
                        editorEdit2.apply();
                        r2 = r3;
                        r2.i(null);
                        aVar.B = null;
                        aVar.A = z;
                        aVar.G = 5;
                        serializableA = cVar2.a(aVar);
                        if (serializableA != aVar3) {
                            return serializableA;
                        }
                    }
                }
            } else {
                aVar.B = aVar2;
                aVar.A = z;
                aVar.C = i;
                aVar.D = 0;
                aVar.G = 2;
                Object objD = d(aVar);
                if (objD != aVar3) {
                    i2 = 0;
                    z2 = z;
                    i3 = i;
                    obj = objD;
                    aVar2 = aVar2;
                    i5 = i2;
                    if (((Boolean) obj).booleanValue()) {
                        i = i3;
                        z = z2;
                        i7 = i5;
                        String strC3 = c();
                        aw.a aVar9 = this.b;
                        aVar.B = aVar2;
                        aVar.A = z;
                        aVar.C = i;
                        aVar.D = i7;
                        aVar.G = 3;
                        objA = aVar9.a(strC3, aVar);
                        if (objA != aVar3) {
                            i4 = i;
                            obj = objA;
                            r3 = aVar2;
                            List listX4 = this.a.X((wv.a) obj);
                            aVar.B = r3;
                            aVar.A = z;
                            aVar.C = i4;
                            aVar.D = i7;
                            aVar.G = 4;
                            objUpdateData = cVar2.a.updateData(new w(cVar2, listX4, cVar3, 25), aVar);
                            if (objUpdateData == aVar3) {
                                objUpdateData = b0.a;
                            }
                            if (objUpdateData == aVar3) {
                                long jCurrentTimeMillis3 = System.currentTimeMillis();
                                SharedPreferences.Editor editorEdit3 = this.f.edit();
                                editorEdit3.putLong("KEY_PLAYLIST_FETCHED_AT", jCurrentTimeMillis3);
                                editorEdit3.putString("KEY_PLAYLIST_LAST_SAVED_LANG", c());
                                editorEdit3.apply();
                                r2 = r3;
                            }
                        }
                    } else {
                        z = z2;
                        r2 = aVar2;
                    }
                    r2.i(null);
                    aVar.B = null;
                    aVar.A = z;
                    aVar.G = 5;
                    serializableA = cVar2.a(aVar);
                    if (serializableA != aVar3) {
                        return serializableA;
                    }
                }
            }
            return aVar3;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final String c() {
        String language;
        LocaleManager localeManager = this.d;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        return (locale == null || (language = locale.getLanguage()) == null) ? "en" : language;
    }

    public final Object d(m00.c cVar) {
        b bVar;
        long jCurrentTimeMillis;
        String str;
        String str2;
        long j;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.G;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.G = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.E;
        l00.a aVar = l00.a.A;
        int i2 = bVar.G;
        boolean z = true;
        if (i2 == 0) {
            t1.O(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            SharedPreferences sharedPreferences = this.f;
            long j2 = sharedPreferences.getLong("KEY_PLAYLIST_FETCHED_AT", 0L);
            String strC = c();
            String string = sharedPreferences.getString("KEY_PLAYLIST_LAST_SAVED_LANG", null);
            bVar.C = strC;
            bVar.D = string;
            bVar.A = jCurrentTimeMillis;
            bVar.B = j2;
            bVar.G = 1;
            Serializable serializableA = this.c.a(bVar);
            if (serializableA == aVar) {
                return aVar;
            }
            str = strC;
            obj = serializableA;
            str2 = string;
            j = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = bVar.B;
            jCurrentTimeMillis = bVar.A;
            str2 = bVar.D;
            str = bVar.C;
            t1.O(obj);
        }
        if (!((List) obj).isEmpty() && jCurrentTimeMillis - j < HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS && m.a(str, str2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

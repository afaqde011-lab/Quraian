package uz;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import bk.m;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import g00.n;
import g00.s;
import h00.q;
import h00.x;
import h00.z;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import r30.k;
import r30.r;
import ri.t1;

public final class f implements a00.a {
    public final SharedPreferences a;
    public final m b;
    public final vz.c c;
    public final wz.a d;
    public final sz.a e;
    public final au.a f;
    public final LocaleManager g;

    public f(SharedPreferences sharedPreferences, m mVar, vz.c cVar, wz.a aVar, sz.a aVar2, au.a aVar3, LocaleManager localeManager) {
        this.a = sharedPreferences;
        this.b = mVar;
        this.c = cVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.g = localeManager;
    }

    public static final void a(f fVar, String str, String str2) {
        fVar.getClass();
        SharedPreferences sharedPreferences = fVar.a;
        Set<String> set = z.A;
        Set<String> stringSet = sharedPreferences.getStringSet(str, set);
        if (stringSet != null) {
            set = stringSet;
        }
        HashSet hashSet = new HashSet(set);
        hashSet.add(str2);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet(str, hashSet);
        editorEdit.commit();
    }

    public final void b(List list, long j, zz.b bVar) {
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("KEY_CATALOG_JSON", this.b.i(list));
        editorEdit.putLong("KEY_CATALOG_FETCHED_AT", j);
        editorEdit.putString("KEY_CATALOG_LAST_SAVED_QUALITY", bVar.A);
        editorEdit.putString("KEY_CATALOG_LAST_SAVED_LANG", d());
        editorEdit.apply();
    }

    public final Object c(zz.a aVar, m00.c cVar) {
        a aVar2;
        Object objC;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i = aVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.C = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        a aVar3 = aVar2;
        Object obj = aVar3.A;
        l00.a aVar4 = l00.a.A;
        int i2 = aVar3.C;
        if (i2 == 0) {
            t1.O(obj);
            String str = aVar.a;
            String str2 = aVar.c;
            if (!r.x0(str2, "http", false)) {
                str2 = null;
            }
            String str3 = aVar.b;
            if (!r.x0(str3, "http", false)) {
                str3 = null;
            }
            String str4 = aVar.e;
            zz.b bVarH = h();
            aVar3.C = 1;
            objC = this.c.c(str, str2, str3, str4, bVarH, aVar3);
            if (objC == aVar4) {
                return aVar4;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            objC = ((n) obj).A;
        }
        return Boolean.valueOf(!(objC instanceof g00.m));
    }

    public final String d() {
        String languageTag;
        LocaleManager localeManager = this.g;
        Locale locale = !localeManager.getApplicationLocales().isEmpty() ? localeManager.getApplicationLocales().get(0) : Locale.getDefault();
        return (locale == null || (languageTag = locale.toLanguageTag()) == null) ? "en" : k.d1(languageTag, '-');
    }

    public final List e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        zz.b bVarH = h();
        int iOrdinal = bVarH.ordinal();
        if (iOrdinal == 0) {
            str = "asset:///videos/background/rain_video_full.mp4";
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "asset:///videos/background/rain_video.mp4";
        }
        zz.a aVar = new zz.a("calm_rain", str, "asset:///audio/calm_rain.mp3", new ResourceText.Res(2131887289, null, 2, null), null, false, false, true, 880);
        int iOrdinal2 = bVarH.ordinal();
        if (iOrdinal2 == 0) {
            str2 = "asset:///videos/background/morning_birds_full.mp4";
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "asset:///videos/background/morning_birds.mp4";
        }
        zz.a aVar2 = new zz.a("bird_singing", str2, "asset:///audio/morning_birds.mp3", new ResourceText.Res(2131887287, null, 2, null), null, false, true, true, 816);
        int iOrdinal3 = bVarH.ordinal();
        if (iOrdinal3 == 0) {
            str3 = "asset:///videos/background/bonfire_video_full.mp4";
        } else {
            if (iOrdinal3 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "asset:///videos/background/bonfire_video.mp4";
        }
        zz.a aVar3 = new zz.a("calm_bonfire", str3, "asset:///audio/calm_bonfire.mp3", new ResourceText.Res(2131887288, null, 2, null), null, false, true, true, 816);
        int iOrdinal4 = bVarH.ordinal();
        if (iOrdinal4 == 0) {
            str4 = "asset:///videos/background/wave_video_full.mp4";
        } else {
            if (iOrdinal4 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str4 = "asset:///videos/background/wave_video.mp4";
        }
        zz.a aVar4 = new zz.a("wave_effect", str4, "asset:///audio/wave_effect.mp3", new ResourceText.Res(2131887293, null, 2, null), null, false, true, true, 816);
        int iOrdinal5 = bVarH.ordinal();
        if (iOrdinal5 == 0) {
            str5 = "asset:///videos/background/wind_video_full.mp4";
        } else {
            if (iOrdinal5 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str5 = "asset:///videos/background/wind_video.mp4";
        }
        return va.a.S(new zz.a[]{aVar, aVar2, aVar3, aVar4, new zz.a("calm_wind", str5, "asset:///audio/light_wind.mp3", new ResourceText.Res(2131887294, null, 2, null), null, false, true, true, 816)});
    }

    public final List f(boolean z) {
        Object objS;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = d();
        SharedPreferences sharedPreferences = this.a;
        Object obj = null;
        String string = sharedPreferences.getString("KEY_SELECTED_CATALOG_QUALITY", null);
        String string2 = sharedPreferences.getString("KEY_CATALOG_LAST_SAVED_QUALITY", null);
        String string3 = sharedPreferences.getString("KEY_CATALOG_LAST_SAVED_LANG", null);
        long j = sharedPreferences.getLong("KEY_CATALOG_FETCHED_AT", 0L);
        String string4 = sharedPreferences.getString("KEY_CATALOG_JSON", null);
        if (!z && jCurrentTimeMillis - j >= HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS) {
            return null;
        }
        if ((!z && !strD.equals(string3)) || !kotlin.jvm.internal.m.a(string2, string) || string4 == null) {
            return null;
        }
        try {
            objS = (List) this.b.e(string4, new b().getType());
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (objS instanceof g00.m) {
            objS = null;
        }
        List list = (List) objS;
        if (list != null && !list.isEmpty()) {
            obj = objS;
        }
        List list2 = (List) obj;
        return list2 == null ? x.A : list2;
    }

    public final Serializable g(zz.b bVar, m00.c cVar) {
        c cVar2;
        sz.a aVar;
        List<tz.a.C0022a> items;
        zz.a aVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.D = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objA = cVar2.B;
        l00.a aVar3 = l00.a.A;
        int i2 = cVar2.D;
        if (i2 == 0) {
            t1.O(objA);
            String strD = d();
            String str = bVar.A;
            sz.a aVar4 = this.e;
            cVar2.A = aVar4;
            cVar2.D = 1;
            objA = this.d.a(strD, str, cVar2);
            if (objA == aVar3) {
                return aVar3;
            }
            aVar = aVar4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = cVar2.A;
            t1.O(objA);
        }
        tz.a aVar5 = (tz.a) objA;
        aVar.getClass();
        ArrayList arrayList = null;
        if (aVar5 != null && (items = aVar5.getItems()) != null) {
            ArrayList arrayList2 = new ArrayList();
            for (tz.a.C0022a c0022a : items) {
                if (c0022a == null || c0022a.getCode() == null) {
                    aVar2 = null;
                } else {
                    String code = c0022a.getCode();
                    String videoUrl = c0022a.getVideoUrl();
                    String soundUrl = c0022a.getSoundUrl();
                    String title = c0022a.getTitle();
                    ResourceText.String string = title != null ? new ResourceText.String(title, null, 2, null) : null;
                    String iconUrl = c0022a.getIconUrl();
                    Boolean isNew = c0022a.getIsNew();
                    Boolean bool = Boolean.TRUE;
                    aVar2 = new zz.a(code, videoUrl, soundUrl, string, iconUrl, kotlin.jvm.internal.m.a(isNew, bool), kotlin.jvm.internal.m.a(c0022a.getIsPaid(), bool), false, 768);
                }
                if (aVar2 != null) {
                    arrayList2.add(aVar2);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? x.A : arrayList;
    }

    public final zz.b h() {
        Object obj = null;
        String string = this.a.getString("KEY_SELECTED_CATALOG_QUALITY", null);
        n00.b bVar = zz.b.E;
        bVar.getClass();
        s sVar = new s(bVar, 4);
        while (sVar.hasNext()) {
            Object next = sVar.next();
            if (((zz.b) next).A.equals(string)) {
                obj = next;
                break;
            }
        }
        zz.b bVar2 = (zz.b) obj;
        return bVar2 == null ? zz.b.HD : bVar2;
    }

    public final Serializable i(m00.c cVar) {
        d dVar;
        List listF;
        zz.b bVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.D = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.B;
        Serializable serializable = l00.a.A;
        int i2 = dVar.D;
        try {
            if (i2 == 0) {
                t1.O(obj);
                boolean zBooleanValue = ((Boolean) this.f.c.getValue()).booleanValue();
                List listF2 = f(false);
                if (listF2 != null && !listF2.isEmpty()) {
                    return j(listF2);
                }
                if (zBooleanValue) {
                    zz.b bVarH = h();
                    dVar.A = bVarH;
                    dVar.D = 1;
                    Serializable serializableG = g(bVarH, dVar);
                    if (serializableG == serializable) {
                        return serializable;
                    }
                    bVar = bVarH;
                    obj = serializableG;
                } else {
                    listF = f(true);
                }
                if (listF == null) {
                    listF = x.A;
                }
                return j(listF);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = dVar.A;
            t1.O(obj);
            listF = (List) obj;
            b(listF, System.currentTimeMillis(), bVar);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            listF = f(true);
        }
        if (listF == null) {
            listF = x.A;
        }
        return j(listF);
    }

    public final ArrayList j(List list) {
        boolean z;
        ArrayList<zz.a> arrayListY0 = q.Y0(list, e());
        ArrayList arrayList = new ArrayList(h00.r.q0(arrayListY0, 10));
        for (zz.a aVar : arrayListY0) {
            String code = aVar.a;
            kotlin.jvm.internal.m.e(code, "code");
            boolean zEquals = code.equals("calm_rain");
            boolean z2 = false;
            boolean z3 = aVar.h ? !code.equals("calm_rain") : aVar.g;
            boolean z4 = aVar.f;
            Set<String> set = z.A;
            SharedPreferences sharedPreferences = this.a;
            if (z4) {
                Set<String> stringSet = sharedPreferences.getStringSet("KEY_NEW_BADGE_SEEN", set);
                if (stringSet == null) {
                    stringSet = set;
                }
                z = !stringSet.contains(code);
            } else {
                z = false;
            }
            if (zEquals) {
                Set<String> stringSet2 = sharedPreferences.getStringSet("KEY_FREE_BADGE_SEEN", set);
                if (stringSet2 != null) {
                    set = stringSet2;
                }
                z2 = !set.contains(code);
            }
            arrayList.add(zz.a.a(aVar, null, null, z3, z, z2, 191));
        }
        return arrayList;
    }

    public final String k(String soundId, String str) {
        kotlin.jvm.internal.m.e(soundId, "soundId");
        File fileE = this.c.e(soundId, h());
        if (!fileE.exists()) {
            return str == null ? "" : str;
        }
        String string = fileE.toURI().toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }
}

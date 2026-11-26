package com.mchutov.quranify.audiostories.data.worker;

import a1.r0;
import a40.c0;
import a40.m0;
import ab.a0;
import ab.y;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b60.b;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalyticsEvent;
import eo.h;
import eo.j;
import eo.l;
import eo.s;
import g00.b0;
import g00.i;
import g00.k;
import g00.n;
import h40.d;
import h40.e;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import jo.o;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import m00.c;
import ri.t1;
import t50.a;
import za.g;
import za.q;
import za.r;
import za.t;
import za.u;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/audiostories/data/worker/AudioStoryDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoryDownloadWorker extends CoroutineWorker implements a {
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public String o;
    public String p;
    public int q;
    public long r;

    public AudioStoryDownloadWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        i iVar = i.A;
        this.h = rd.a.I(iVar, new l(this, 0));
        this.i = rd.a.I(iVar, new l(this, 1));
        this.j = rd.a.I(iVar, new l(this, 2));
        this.k = rd.a.I(iVar, new a20.a(this, new b("WORK_MANAGER_OK_HTTP_CLIENT"), 18));
        this.l = rd.a.I(iVar, new l(this, 3));
        this.m = rd.a.I(iVar, new l(this, 4));
        this.n = rd.a.I(iVar, new l(this, 5));
        this.q = -1;
    }

    public static final java.lang.Object i(com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker r17, m00.c r18) {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker.i(com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker, m00.c):java.lang.Object");
    }

    public static final Object j(AudioStoryDownloadWorker audioStoryDownloadWorker, float f, c cVar) {
        j jVar;
        float f2;
        int i;
        long j;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.F;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.F = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(audioStoryDownloadWorker, cVar);
            }
        } else {
            jVar = new j(audioStoryDownloadWorker, cVar);
        }
        Object obj = jVar.D;
        Object obj2 = l00.a.A;
        int i3 = jVar.F;
        b0 b0Var = b0.a;
        if (i3 == 0) {
            t1.O(obj);
            int iY = a0.y((int) (100 * f), 0, 100);
            if (iY != audioStoryDownloadWorker.q) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (iY >= 100 || jElapsedRealtime - audioStoryDownloadWorker.r >= 500) {
                    audioStoryDownloadWorker.q = iY;
                    audioStoryDownloadWorker.r = jElapsedRealtime;
                    k kVar = new k("storyId", new Integer(audioStoryDownloadWorker.p()));
                    Integer numO = audioStoryDownloadWorker.o();
                    k[] kVarArr = {kVar, new k("episodeId", new Integer(numO != null ? numO.intValue() : -1)), new k("progress", new Float(iY / 100.0f))};
                    za.b0 b0Var2 = new za.b0();
                    for (int i4 = 0; i4 < 3; i4++) {
                        k kVar2 = kVarArr[i4];
                        b0Var2.b(kVar2.B, (String) kVar2.A);
                    }
                    g gVarA = b0Var2.a();
                    jVar.A = f;
                    jVar.B = iY;
                    jVar.C = jElapsedRealtime;
                    jVar.F = 1;
                    if (audioStoryDownloadWorker.h(gVarA, jVar) != obj2) {
                        f2 = f;
                        i = iY;
                        j = jElapsedRealtime;
                    }
                }
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        j = jVar.C;
        i = jVar.B;
        f2 = jVar.A;
        t1.O(obj);
        jVar.A = f2;
        jVar.B = i;
        jVar.C = j;
        jVar.F = 2;
        return audioStoryDownloadWorker.u(i, jVar) == obj2 ? obj2 : b0Var;
    }

    public final Object e(k00.c cVar) {
        eo.b bVar;
        eo.a aVar;
        Throwable th;
        if (cVar instanceof eo.b) {
            bVar = (eo.b) cVar;
            int i = bVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.D = i - Integer.MIN_VALUE;
            } else {
                bVar = new eo.b(this, (c) cVar);
            }
        } else {
            bVar = new eo.b(this, (c) cVar);
        }
        Object obj = bVar.B;
        l00.a aVar2 = l00.a.A;
        int i2 = bVar.D;
        try {
            if (i2 == 0) {
                t1.O(obj);
                if (p() == -1) {
                    return new q();
                }
                e eVar = m0.a;
                d dVar = d.C;
                a1.a0 a0Var = new a1.a0(this, (k00.c) null, 17);
                bVar.D = 1;
                if (c0.J(a0Var, dVar, bVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = bVar.A;
                    try {
                        t1.O(obj);
                        Object obj2 = ((n) obj).A;
                    } catch (Throwable th2) {
                        th = th2;
                        t1.s(th);
                    }
                    e = aVar;
                    return m(e.A);
                }
                t1.O(obj);
            }
            return t.a();
        } catch (eo.a e) {
            e = e;
            if (e.A == ho.e.A) {
                try {
                    o oVar = (o) this.l.getValue();
                    bVar.A = e;
                    bVar.D = 2;
                    if (oVar.a(true, bVar) != aVar2) {
                        aVar = e;
                    }
                    return aVar2;
                } catch (Throwable th3) {
                    aVar = e;
                    th = th3;
                    t1.s(th);
                }
            }
        } catch (IOException unused) {
            return ((u) this).c.c < 5 ? new r() : m(ho.e.E);
        } catch (CancellationException e2) {
            throw e2;
        }
    }

    public final Object k(s sVar, u00.n nVar, c cVar) {
        eo.e eVar;
        String audioUrl;
        File file;
        un.c cVar2;
        String language;
        File file2;
        File file3;
        String str;
        s sVar2;
        un.c cVar3;
        File file4;
        String str2;
        String label;
        String str3;
        Integer num;
        int iIntValue;
        Long durationMs;
        long jLongValue;
        String absolutePath;
        Object objN;
        AudioStoryDownloadWorker audioStoryDownloadWorker = this;
        s sVar3 = sVar;
        if (cVar instanceof eo.e) {
            eVar = (eo.e) cVar;
            int i = eVar.H;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.H = i - Integer.MIN_VALUE;
            } else {
                eVar = new eo.e(audioStoryDownloadWorker, cVar);
            }
        } else {
            eVar = new eo.e(audioStoryDownloadWorker, cVar);
        }
        eo.e eVar2 = eVar;
        Object obj = eVar2.F;
        l00.a aVar = l00.a.A;
        int i2 = eVar2.H;
        ?? r11 = audioStoryDownloadWorker.j;
        b0 b0Var = b0.a;
        if (i2 == 0) {
            t1.O(obj);
            un.c cVar4 = sVar3.b;
            String language2 = cVar4.getLanguage();
            if (language2 != null && (audioUrl = cVar4.getAudioUrl()) != null) {
                ao.a aVar2 = (ao.a) r11.getValue();
                int i3 = sVar3.a;
                aVar2.getClass();
                File file5 = new File(aVar2.a, String.valueOf(i3));
                file5.mkdirs();
                File file6 = new File(file5, language2.concat(".mp3"));
                Long audioSizeBytes = cVar4.getAudioSizeBytes();
                String audioSha256 = cVar4.getAudioSha256();
                eVar2.A = sVar3;
                eVar2.B = cVar4;
                eVar2.C = language2;
                eVar2.D = file6;
                eVar2.H = 1;
                file = file6;
                if (audioStoryDownloadWorker.v(audioUrl, file, audioSizeBytes, audioSha256, false, nVar, eVar2) != aVar) {
                    cVar2 = cVar4;
                    language = language2;
                }
                return aVar;
            }
            return b0Var;
        }
        if (i2 == 1) {
            file = eVar2.D;
            String str4 = eVar2.C;
            un.c cVar5 = eVar2.B;
            s sVar4 = eVar2.A;
            t1.O(obj);
            language = str4;
            cVar2 = cVar5;
            sVar3 = sVar4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            file3 = eVar2.E;
            file4 = eVar2.D;
            str2 = eVar2.C;
            cVar3 = eVar2.B;
            sVar2 = eVar2.A;
            t1.O(obj);
        }
        file2 = file4;
        str = str2;
        cVar2 = cVar3;
        sVar3 = sVar2;
        xn.b bVar = (xn.b) audioStoryDownloadWorker.i.getValue();
        int i4 = sVar3.a;
        int iP = audioStoryDownloadWorker.p();
        label = cVar2.getLabel();
        if (label == null) {
            str3 = str;
        } else {
            str3 = label;
        }
        num = cVar2.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        durationMs = cVar2.getDurationMs();
        if (durationMs != null) {
            jLongValue = durationMs.longValue();
        } else {
            jLongValue = 0;
        }
        String absolutePath2 = file2.getAbsolutePath();
        m.d(absolutePath2, "getAbsolutePath(...)");
        if (file3 != null) {
            absolutePath = file3.getAbsolutePath();
        } else {
            absolutePath = null;
        }
        bo.a aVar3 = new bo.a(i4, str, iP, str3, iIntValue, jLongValue, absolutePath2, absolutePath, file2.length() + (file3 != null ? file3.length() : 0L), System.currentTimeMillis());
        eVar2.A = null;
        eVar2.B = null;
        eVar2.C = null;
        eVar2.D = null;
        eVar2.E = null;
        eVar2.H = 3;
        objN = rd.a.N(bVar.a, false, true, new mu.q(bVar, aVar3, 25), eVar2);
        if (objN != aVar) {
            objN = b0Var;
        }
        if (objN == aVar) {
            return aVar;
        }
        return b0Var;
        file2 = file;
        String transcriptUrl = cVar2.getTranscriptUrl();
        if (transcriptUrl != null) {
            ao.a aVar4 = (ao.a) r11.getValue();
            int i5 = sVar3.a;
            aVar4.getClass();
            m.e(language, "language");
            File file7 = new File(aVar4.a, String.valueOf(i5));
            file7.mkdirs();
            file3 = new File(file7, language.concat(".json.gz"));
            Long transcriptSizeBytes = cVar2.getTranscriptSizeBytes();
            br.c cVar6 = new br.c(2, null, 4);
            eVar2.A = sVar3;
            eVar2.B = cVar2;
            eVar2.C = language;
            eVar2.D = file2;
            eVar2.E = file3;
            eVar2.H = 2;
            un.c cVar7 = cVar2;
            String str5 = language;
            audioStoryDownloadWorker = this;
            if (audioStoryDownloadWorker.v(transcriptUrl, file3, transcriptSizeBytes, null, false, cVar6, eVar2) != aVar) {
                sVar2 = sVar3;
                cVar3 = cVar7;
                file4 = file2;
                str2 = str5;
                file2 = file4;
                str = str2;
                cVar2 = cVar3;
                sVar3 = sVar2;
                xn.b bVar2 = (xn.b) audioStoryDownloadWorker.i.getValue();
                int i6 = sVar3.a;
                int iP2 = audioStoryDownloadWorker.p();
                label = cVar2.getLabel();
                if (label == null) {
                    str3 = str;
                } else {
                    str3 = label;
                }
                num = cVar2.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                durationMs = cVar2.getDurationMs();
                if (durationMs != null) {
                    jLongValue = durationMs.longValue();
                } else {
                    jLongValue = 0;
                }
                String absolutePath3 = file2.getAbsolutePath();
                m.d(absolutePath3, "getAbsolutePath(...)");
                if (file3 != null) {
                    absolutePath = file3.getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                bo.a aVar5 = new bo.a(i6, str, iP2, str3, iIntValue, jLongValue, absolutePath3, absolutePath, file2.length() + (file3 != null ? file3.length() : 0L), System.currentTimeMillis());
                eVar2.A = null;
                eVar2.B = null;
                eVar2.C = null;
                eVar2.D = null;
                eVar2.E = null;
                eVar2.H = 3;
                objN = rd.a.N(bVar2.a, false, true, new mu.q(bVar2, aVar5, 25), eVar2);
                if (objN != aVar) {
                    objN = b0Var;
                }
                if (objN == aVar) {
                    return b0Var;
                }
            }
        } else {
            String str6 = language;
            audioStoryDownloadWorker = this;
            file3 = null;
            str = str6;
            xn.b bVar3 = (xn.b) audioStoryDownloadWorker.i.getValue();
            int i7 = sVar3.a;
            int iP3 = audioStoryDownloadWorker.p();
            label = cVar2.getLabel();
            if (label == null) {
                str3 = str;
            } else {
                str3 = label;
            }
            num = cVar2.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            durationMs = cVar2.getDurationMs();
            if (durationMs != null) {
                jLongValue = durationMs.longValue();
            } else {
                jLongValue = 0;
            }
            String absolutePath4 = file2.getAbsolutePath();
            m.d(absolutePath4, "getAbsolutePath(...)");
            if (file3 != null) {
                absolutePath = file3.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            bo.a aVar6 = new bo.a(i7, str, iP3, str3, iIntValue, jLongValue, absolutePath4, absolutePath, file2.length() + (file3 != null ? file3.length() : 0L), System.currentTimeMillis());
            eVar2.A = null;
            eVar2.B = null;
            eVar2.C = null;
            eVar2.D = null;
            eVar2.E = null;
            eVar2.H = 3;
            objN = rd.a.N(bVar3.a, false, true, new mu.q(bVar3, aVar6, 25), eVar2);
            if (objN != aVar) {
                objN = b0Var;
            }
            if (objN == aVar) {
                return b0Var;
            }
        }
        return aVar;
    }

    public final java.lang.Object l(eo.s r19, eo.d r20, m00.c r21) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker.l(eo.s, eo.d, m00.c):java.lang.Object");
    }

    public final q m(ho.e eVar) {
        String str;
        if (!q()) {
            AudioStoryAnalytics audioStoryAnalytics = (AudioStoryAnalytics) this.m.getValue();
            int iP = p();
            Integer numO = o();
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                str = "not_found";
            } else if (iOrdinal == 1) {
                str = "unavailable";
            } else if (iOrdinal == 2) {
                str = "no_space";
            } else if (iOrdinal == 3) {
                str = "mismatch";
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "failed";
            }
            audioStoryAnalytics.logEvent(new AudioStoryAnalyticsEvent.AudioStoryDownloadFailed(iP, numO, str));
        }
        k[] kVarArr = {new k("error", eVar.name())};
        za.b0 b0Var = new za.b0();
        k kVar = kVarArr[0];
        b0Var.b(kVar.B, (String) kVar.A);
        return new q(b0Var.a());
    }

    public final java.io.Serializable n(m00.c r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker.n(m00.c):java.io.Serializable");
    }

    public final Integer o() {
        Integer numValueOf = Integer.valueOf(((u) this).c.b.a("episodeId", -1));
        if (numValueOf.intValue() != -1) {
            return numValueOf;
        }
        return null;
    }

    public final int p() {
        return ((u) this).c.b.a("storyId", -1);
    }

    public final boolean q() {
        g gVar = ((u) this).c.b;
        gVar.getClass();
        Object obj = Boolean.FALSE;
        Object obj2 = gVar.a.get("silent");
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final Object r(int i, c cVar) {
        h hVar;
        Object objS;
        ho.a aVar;
        Integer num;
        String string;
        Object next;
        Object next2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.D = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objS2 = hVar.B;
        l00.a aVar2 = l00.a.A;
        int i3 = hVar.D;
        try {
            if (i3 == 0) {
                t1.O(objS2);
                e40.i iVarA = ((jo.d) this.n.getValue()).a();
                hVar.A = i;
                hVar.D = 1;
                objS2 = d40.o.s(iVarA, hVar);
                if (objS2 == aVar2) {
                    return aVar2;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = hVar.A;
                t1.O(objS2);
            }
            objS = (List) objS2;
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        String quantityString = null;
        if (objS instanceof g00.m) {
            objS = null;
        }
        List list = (List) objS;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((ho.a) next2).a != p());
            aVar = (ho.a) next2;
        } else {
            aVar = null;
        }
        Resources resources = ((u) this).b.getResources();
        String string2 = resources.getString(2131886132);
        m.d(string2, "getString(...)");
        Integer numO = o();
        if (numO != null) {
            int iIntValue = numO.intValue();
            if (aVar != null) {
                Iterator it2 = aVar.g.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((ho.g) next).a != iIntValue);
                ho.g gVar = (ho.g) next;
                if (gVar != null) {
                    num = new Integer(gVar.b);
                } else {
                    num = null;
                }
            } else {
                num = null;
            }
        } else {
            num = null;
        }
        if (num != null) {
            quantityString = resources.getString(2131886133, num);
        } else if (o() == null) {
            quantityString = resources.getQuantityString(2131755008, i, new Integer(i));
        }
        if (aVar != null) {
            string = aVar.c;
        } else {
            string = resources.getString(2131886154);
            m.d(string, "getString(...)");
        }
        this.o = string;
        this.p = h00.q.R0(h00.n.C0(new String[]{string2, quantityString}), " · ", null, null, null, 62);
        return b0.a;
    }

    public final Object s(s sVar, c cVar) {
        eo.i iVar;
        if (cVar instanceof eo.i) {
            iVar = (eo.i) cVar;
            int i = iVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.D = i - Integer.MIN_VALUE;
            } else {
                iVar = new eo.i(this, cVar);
            }
        } else {
            iVar = new eo.i(this, cVar);
        }
        Object objN = iVar.B;
        l00.a aVar = l00.a.A;
        int i2 = iVar.D;
        if (i2 == 0) {
            t1.O(objN);
            String language = sVar.b.getLanguage();
            if (language == null) {
                return Boolean.FALSE;
            }
            xn.b bVar = (xn.b) this.i.getValue();
            int i3 = sVar.a;
            iVar.A = sVar;
            iVar.D = 1;
            objN = rd.a.N(bVar.a, true, false, new r0(i3, language, 4), iVar);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = iVar.A;
            t1.O(objN);
        }
        bo.a aVar2 = (bo.a) objN;
        if (aVar2 == null) {
            return Boolean.TRUE;
        }
        int i4 = aVar2.e;
        Integer num = sVar.b.getCom.revenuecat.purchases.common.diagnostics.DiagnosticsEntry.VERSION_KEY java.lang.String();
        return Boolean.valueOf(i4 < (num != null ? num.intValue() : 0) || !new File(aVar2.g).exists());
    }

    public final za.m t(int i) {
        String string = this.o;
        Context context = ((u) this).b;
        if (string == null) {
            string = context.getString(2131886154);
            m.d(string, "getString(...)");
        }
        String string2 = this.p;
        if (string2 == null) {
            string2 = context.getString(2131886132);
            m.d(string2, "getString(...)");
        }
        String string3 = context.getString(2131886920);
        m.d(string3, "getString(...)");
        y yVarL0 = y.l0(context);
        UUID uuid = ((u) this).c.a;
        m.d(uuid, "getId(...)");
        PendingIntent pendingIntentK0 = yVarL0.k0(uuid);
        n4.j jVar = new n4.j(context, "download_channel");
        jVar.e = n4.j.c(string);
        jVar.f = n4.j.c(string2);
        jVar.n = n4.j.c(i + "%");
        jVar.d(8, true);
        jVar.z.tickerText = n4.j.c(string);
        jVar.z.icon = 2131230842;
        jVar.d(2, true);
        jVar.o = 100;
        jVar.p = i;
        jVar.a(R.drawable.ic_delete, pendingIntentK0, string3);
        Notification notificationB = jVar.b();
        m.d(notificationB, "build(...)");
        return new za.m(p() + 7000, notificationB, 1);
    }

    public final Object u(int i, c cVar) {
        eo.k kVar;
        if (cVar instanceof eo.k) {
            kVar = (eo.k) cVar;
            int i2 = kVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.C = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new eo.k(this, cVar);
            }
        } else {
            kVar = new eo.k(this, cVar);
        }
        Object obj = kVar.A;
        l00.a aVar = l00.a.A;
        int i3 = kVar.C;
        try {
            if (i3 == 0) {
                t1.O(obj);
                za.m mVarT = t(i);
                kVar.C = 1;
                if (g(mVarT, kVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
        } catch (Throwable th) {
            t1.s(th);
        }
        return b0.a;
    }

    public final java.lang.Object v(java.lang.String r26, java.io.File r27, java.lang.Long r28, java.lang.String r29, boolean r30, u00.n r31, m00.c r32) {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker.v(java.lang.String, java.io.File, java.lang.Long, java.lang.String, boolean, u00.n, m00.c):java.lang.Object");
    }

    public final java.lang.Object w(java.io.InputStream r17, java.io.File r18, long r19, br.h r21, m00.c r22) {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker.w(java.io.InputStream, java.io.File, long, br.h, m00.c):java.lang.Object");
    }
}

package ht;

import ab.a0;
import android.content.SharedPreferences;
import d40.o;
import d40.p1;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

public final class b {
    public final SharedPreferences a;
    public final p1 b = o.c(Boolean.valueOf(c("playerNew.showQuranInLyrics", true)));
    public final p1 c = o.c(Boolean.valueOf(c("playerNew.showTafsirInLyrics", false)));
    public final p1 d;
    public final p1 e;
    public final p1 f;
    public final p1 g;
    public final p1 h;

    public b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("playerNew.appliedTafsirTranslationId", "");
        this.d = o.c(string != null ? string : "");
        this.e = o.c(b(ot.e.TRANSCRIPTION));
        Object obj = null;
        String string2 = sharedPreferences.getString("playerNew.verseScript", null);
        for (Object obj2 : ot.d.D) {
            if (m.a(((ot.d) obj2).name(), string2)) {
                obj = obj2;
                break;
            }
        }
        ot.d dVar = (ot.d) obj;
        this.f = o.c(dVar == null ? ot.d.A : dVar);
        List list = ot.c.a;
        this.g = o.c(Integer.valueOf(a0.y(this.a.getInt("playerNew.lyricsTextSizeStep", 0), 0, ot.c.d - 1)));
        this.h = o.c(Boolean.valueOf(c("playerNew.cinematicMode", false)));
    }

    public final void a() {
        Boolean boolValueOf = Boolean.valueOf(c("playerNew.showQuranInLyrics", true));
        p1 p1Var = this.b;
        p1Var.getClass();
        p1Var.k(null, boolValueOf);
        Boolean boolValueOf2 = Boolean.valueOf(c("playerNew.showTafsirInLyrics", false));
        p1 p1Var2 = this.c;
        p1Var2.getClass();
        p1Var2.k(null, boolValueOf2);
        String string = this.a.getString("playerNew.appliedTafsirTranslationId", "");
        String str = string != null ? string : "";
        p1 p1Var3 = this.d;
        p1Var3.getClass();
        p1Var3.k(null, str);
    }

    public final String b(ot.e kind) {
        m.e(kind, "kind");
        int iOrdinal = kind.ordinal();
        SharedPreferences sharedPreferences = this.a;
        if (iOrdinal == 0) {
            String string = sharedPreferences.getString("playerNew.appliedTafsirTranslationId", "");
            return string == null ? "" : string;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String string2 = sharedPreferences.getString("playerNew.appliedTranscriptionId", null);
        return string2 == null ? "" : string2;
    }

    public final boolean c(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        return !sharedPreferences.contains(str) ? z : sharedPreferences.getBoolean(str, z);
    }

    public final void d(String id) {
        m.e(id, "id");
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("playerNew.appliedTafsirTranslationId", id);
        editorEdit.apply();
        p1 p1Var = this.d;
        p1Var.getClass();
        p1Var.k(null, id);
    }

    public final void e(ot.e kind, String id) {
        m.e(kind, "kind");
        m.e(id, "id");
        int iOrdinal = kind.ordinal();
        if (iOrdinal == 0) {
            d(id);
            return;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        SharedPreferences.Editor editorEdit = this.a.edit();
        editorEdit.putString("playerNew.appliedTranscriptionId", id);
        editorEdit.apply();
        p1 p1Var = this.e;
        p1Var.getClass();
        p1Var.k(null, id);
    }

    public final void f(String str, boolean z) {
        oi.k.v(this.a, str, z);
    }
}

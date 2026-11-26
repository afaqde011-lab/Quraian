package ih;

import c50.h;
import com.google.android.gms.cast.HlsSegmentFormat;
import eh.b;
import eh.c;
import eh.f;
import eh.j;
import eh.l;
import fh.a0;
import fh.d2;
import fh.i0;
import fh.n0;
import fh.q0;
import fh.s1;
import fh.t0;
import fh.u0;
import fh.w;
import fh.w1;
import fh.y;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import me.i;

public final class a {

    public static final u0 f7666f;

    public static final b f7667g;

    public static final HashMap f7668h;

    public static final a f7669i;

    public static final i f7670j;

    public final String f7671a;

    public final String f7672b;

    public final u0 f7673c;

    public String f7674d;

    public int f7675e;

    static {
        u0 u0Var;
        String strI = w00.a.I(StandardCharsets.UTF_8.name());
        w.f("charset", strI);
        a0 a0VarA = a0.a();
        n0 n0VarN = (n0) a0VarA.get("charset");
        if (n0VarN == null) {
            n0VarN = t0.n(4);
            a0VarA.put("charset", n0VarN);
        }
        n0VarN.a(strI);
        Collection collectionEntrySet = a0VarA.entrySet();
        if (((AbstractCollection) collectionEntrySet).isEmpty()) {
            u0Var = i0.G;
        } else {
            y<Map.Entry> yVar = (y) collectionEntrySet;
            h hVar = new h(yVar.B.size(), 7);
            int i10 = 0;
            for (Map.Entry entry : yVar) {
                Object key = entry.getKey();
                d2 d2VarG = ((q0) entry.getValue()).g();
                hVar.z(key, d2VarG);
                i10 += d2VarG.D;
            }
            u0Var = new u0(hVar.c(true), i10);
        }
        f7666f = u0Var;
        c cVar = c.D;
        c cVar2 = c.E;
        cVar2.getClass();
        eh.i iVar = new eh.i(cVar2);
        cVar.getClass();
        f7667g = new b(new b(new b(cVar, iVar), new f(' ', 1)), j.b("()<>@,;:\\\"/[]?=").d());
        j.b("\"\\\r").d().getClass();
        j.b(" \t\r\n");
        f7668h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", HlsSegmentFormat.AAC);
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        f7669i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        f7670j = new i(new l("; "), 22);
    }

    public a(String str, String str2, u0 u0Var) {
        this.f7671a = str;
        this.f7672b = str2;
        this.f7673c = u0Var;
    }

    public static void a(String str, String str2) {
        a aVar = new a(str, str2, i0.G);
        f7668h.put(aVar, aVar);
    }

    public static a b(String str, String str2) {
        a aVar = new a(str, str2, f7666f);
        f7668h.put(aVar, aVar);
        StandardCharsets.UTF_8.getClass();
        return aVar;
    }

    public final s1 c() {
        return new s1(this.f7673c.b(), new qj.c(new du.w(22), 24));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7671a.equals(aVar.f7671a) && this.f7672b.equals(aVar.f7672b) && c().equals(aVar.c());
    }

    public final int hashCode() {
        int i10 = this.f7675e;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(new Object[]{this.f7671a, this.f7672b, c()});
        this.f7675e = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str = this.f7674d;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7671a);
        sb2.append('/');
        sb2.append(this.f7672b);
        u0 u0Var = this.f7673c;
        if (u0Var.F != 0) {
            sb2.append("; ");
            Collection collectionA = new w1(u0Var, new qj.c(new du.w(21), 24)).a();
            i iVar = f7670j;
            iVar.getClass();
            try {
                iVar.A(sb2, collectionA.iterator());
            } catch (IOException e3) {
                throw new AssertionError(e3);
            }
        }
        String string = sb2.toString();
        this.f7674d = string;
        return string;
    }
}

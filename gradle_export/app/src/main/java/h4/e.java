package h4;

import java.util.ArrayList;
import java.util.Iterator;

public class e implements d {

    public final n f6579d;

    public int f6581f;

    public int f6582g;

    public n f6576a = null;

    public boolean f6577b = false;

    public boolean f6578c = false;

    public int f6580e = 1;

    public int f6583h = 1;

    public f f6584i = null;

    public boolean f6585j = false;

    public final ArrayList f6586k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public e(n nVar) {
        this.f6579d = nVar;
    }

    @Override
    public final void a(d dVar) {
        ArrayList<e> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((e) it.next()).f6585j) {
                return;
            }
        }
        this.f6578c = true;
        n nVar = this.f6576a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f6577b) {
            this.f6579d.a(this);
            return;
        }
        e eVar = null;
        int i10 = 0;
        for (e eVar2 : arrayList) {
            if (!(eVar2 instanceof f)) {
                i10++;
                eVar = eVar2;
            }
        }
        if (eVar != null && i10 == 1 && eVar.f6585j) {
            f fVar = this.f6584i;
            if (fVar != null) {
                if (!fVar.f6585j) {
                    return;
                } else {
                    this.f6581f = this.f6583h * fVar.f6582g;
                }
            }
            d(eVar.f6582g + this.f6581f);
        }
        n nVar2 = this.f6576a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(n nVar) {
        this.f6586k.add(nVar);
        if (this.f6585j) {
            nVar.a(nVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.f6586k.clear();
        this.f6585j = false;
        this.f6582g = 0;
        this.f6578c = false;
        this.f6577b = false;
    }

    public void d(int i10) {
        if (this.f6585j) {
            return;
        }
        this.f6585j = true;
        this.f6582g = i10;
        for (d dVar : this.f6586k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f6579d.f6599b.f6136g0);
        sb2.append(":");
        switch (this.f6580e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("(");
        sb2.append(this.f6585j ? Integer.valueOf(this.f6582g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.l.size());
        sb2.append(":d=");
        sb2.append(this.f6586k.size());
        sb2.append(">");
        return sb2.toString();
    }
}

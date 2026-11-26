package m3;

import java.util.ArrayList;
import java.util.List;

public final class e implements Appendable {
    public final StringBuilder A;
    public final ArrayList B;
    public final ArrayList C;

    public e() {
        this.A = new StringBuilder(16);
        this.B = new ArrayList();
        this.C = new ArrayList();
        new ArrayList();
    }

    public e(h hVar) {
        this();
        c(hVar);
    }

    public final void a(m mVar, int i10, int i11) {
        this.C.add(new d(mVar, i10, i11, 8));
    }

    @Override
    public final Appendable append(char c10) {
        this.A.append(c10);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof h) {
            c((h) charSequence);
            return this;
        }
        this.A.append(charSequence);
        return this;
    }

    @Override
    public final Appendable append(CharSequence charSequence, int i10, int i11) {
        boolean z10 = charSequence instanceof h;
        StringBuilder sb2 = this.A;
        if (!z10) {
            sb2.append(charSequence, i10, i11);
            return this;
        }
        h hVar = (h) charSequence;
        int length = sb2.length();
        sb2.append((CharSequence) hVar.B, i10, i11);
        List listA = i.a(hVar, i10, i11, null);
        if (listA != null) {
            int size = listA.size();
            for (int i12 = 0; i12 < size; i12++) {
                f fVar = (f) listA.get(i12);
                this.C.add(new d(fVar.f10424b + length, fVar.f10425c + length, fVar.f10423a, fVar.f10426d));
            }
        }
        return this;
    }

    public final void b(String str) {
        this.A.append(str);
    }

    public final void c(h hVar) {
        StringBuilder sb2 = this.A;
        int length = sb2.length();
        sb2.append(hVar.B);
        List list = hVar.A;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) list.get(i10);
                this.C.add(new d(fVar.f10424b + length, fVar.f10425c + length, fVar.f10423a, fVar.f10426d));
            }
        }
    }

    public final void d(int i10) {
        ArrayList arrayList = this.B;
        if (i10 >= arrayList.size()) {
            s3.a.b(i10 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i10) {
            if (arrayList.isEmpty()) {
                s3.a.b("Nothing to pop.");
            }
            ((d) arrayList.remove(arrayList.size() - 1)).f10421c = this.A.length();
        }
    }

    public final int e(i0 i0Var) {
        d dVar = new d(i0Var, this.A.length(), 0, 12);
        ArrayList arrayList = this.B;
        arrayList.add(dVar);
        this.C.add(dVar);
        return arrayList.size() - 1;
    }

    public final h f() {
        StringBuilder sb2 = this.A;
        String string = sb2.toString();
        ArrayList arrayList = this.C;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((d) arrayList.get(i10)).a(sb2.length()));
        }
        return new h(string, arrayList2);
    }
}

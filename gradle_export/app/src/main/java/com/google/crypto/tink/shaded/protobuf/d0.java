package com.google.crypto.tink.shaded.protobuf;

import com.google.protobuf.RuntimeVersion;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class d0 extends b implements e0, RandomAccess {
    public final ArrayList B;

    static {
        new d0(10).A = false;
    }

    public d0(int i10) {
        this(new ArrayList(i10));
    }

    public d0(ArrayList arrayList) {
        this.B = arrayList;
    }

    @Override
    public final void add(int i10, Object obj) {
        a();
        this.B.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof e0) {
            collection = ((e0) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.B.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.B.size(), collection);
    }

    @Override
    public final void clear() {
        a();
        this.B.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final void g(i iVar) {
        a();
        this.B.add(iVar);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.B;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof i)) {
            byte[] bArr = (byte[]) obj;
            String str2 = new String(bArr, b0.f4244a);
            if (p1.f4308a.G(bArr, 0, bArr.length)) {
                arrayList.set(i10, str2);
            }
            return str2;
        }
        i iVar = (i) obj;
        Charset charset = b0.f4244a;
        if (iVar.size() == 0) {
            str = RuntimeVersion.SUFFIX;
        } else {
            h hVar = (h) iVar;
            str = new String(hVar.D, hVar.i(), hVar.size(), charset);
        }
        h hVar2 = (h) iVar;
        int i11 = hVar2.i();
        if (p1.f4308a.G(hVar2.D, i11, hVar2.size() + i11)) {
            arrayList.set(i10, str);
        }
        return str;
    }

    @Override
    public final Object getRaw(int i10) {
        return this.B.get(i10);
    }

    @Override
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.B);
    }

    @Override
    public final e0 getUnmodifiableView() {
        return this.A ? new h1(this) : this;
    }

    @Override
    public final a0 mutableCopyWithCapacity(int i10) {
        ArrayList arrayList = this.B;
        if (i10 < arrayList.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList2 = new ArrayList(i10);
        arrayList2.addAll(arrayList);
        return new d0(arrayList2);
    }

    @Override
    public final Object remove(int i10) {
        a();
        Object objRemove = this.B.remove(i10);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (!(objRemove instanceof i)) {
            return new String((byte[]) objRemove, b0.f4244a);
        }
        i iVar = (i) objRemove;
        Charset charset = b0.f4244a;
        if (iVar.size() == 0) {
            return RuntimeVersion.SUFFIX;
        }
        h hVar = (h) iVar;
        return new String(hVar.D, hVar.i(), hVar.size(), charset);
    }

    @Override
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.B.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof i)) {
            return new String((byte[]) obj2, b0.f4244a);
        }
        i iVar = (i) obj2;
        Charset charset = b0.f4244a;
        if (iVar.size() == 0) {
            return RuntimeVersion.SUFFIX;
        }
        h hVar = (h) iVar;
        return new String(hVar.D, hVar.i(), hVar.size(), charset);
    }

    @Override
    public final int size() {
        return this.B.size();
    }
}

package o20;

import java.io.UnsupportedEncodingException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class r extends AbstractList implements RandomAccess, s {
    public static final g0 B = new g0(new r());
    public final ArrayList A;

    public r() {
        this.A = new ArrayList();
    }

    public r(s sVar) {
        this.A = new ArrayList(sVar.size());
        addAll(sVar);
    }

    @Override
    public final void add(int i, Object obj) {
        this.A.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(int i, Collection collection) {
        if (collection instanceof s) {
            collection = ((s) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.A.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return addAll(this.A.size(), collection);
    }

    @Override
    public final void clear() {
        this.A.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object get(int i) {
        ArrayList arrayList = this.A;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            String strQ = eVar.q();
            if (eVar.k()) {
                arrayList.set(i, strQ);
            }
            return strQ;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = q.a;
        try {
            String str = new String(bArr, "UTF-8");
            if (c0.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override
    public final e getByteString(int i) {
        e tVar;
        ArrayList arrayList = this.A;
        Object obj = arrayList.get(i);
        if (obj instanceof e) {
            tVar = (e) obj;
        } else if (obj instanceof String) {
            try {
                tVar = new t(((String) obj).getBytes("UTF-8"));
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 not supported?", e);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            tVar = new t(bArr2);
        }
        if (tVar != obj) {
            arrayList.set(i, tVar);
        }
        return tVar;
    }

    @Override
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.A);
    }

    @Override
    public final g0 getUnmodifiableView() {
        return new g0(this);
    }

    @Override
    public final void j(t tVar) {
        this.A.add(tVar);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i) {
        Object objRemove = this.A.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        if (objRemove instanceof e) {
            return ((e) objRemove).q();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = q.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override
    public final Object set(int i, Object obj) {
        Object obj2 = this.A.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof e) {
            return ((e) obj2).q();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = q.a;
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    @Override
    public final int size() {
        return this.A.size();
    }
}

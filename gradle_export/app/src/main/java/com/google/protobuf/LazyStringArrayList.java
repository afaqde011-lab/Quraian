package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class LazyStringArrayList extends AbstractProtobufList<String> implements LazyStringList, RandomAccess {

    @Deprecated
    public static final LazyStringList EMPTY;
    private static final LazyStringArrayList EMPTY_LIST;
    private final List<Object> list;

    public static class ByteArrayListView extends AbstractList<byte[]> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteArrayListView(LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        @Override
        public void add(int i10, byte[] bArr) {
            this.list.add(i10, bArr);
            ((AbstractList) this).modCount++;
        }

        @Override
        public byte[] get(int i10) {
            return this.list.getByteArray(i10);
        }

        @Override
        public byte[] remove(int i10) {
            String strRemove = this.list.remove(i10);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(strRemove);
        }

        @Override
        public byte[] set(int i10, byte[] bArr) {
            Object andReturn = this.list.setAndReturn(i10, bArr);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteArray(andReturn);
        }

        @Override
        public int size() {
            return this.list.size();
        }
    }

    public static class ByteStringListView extends AbstractList<ByteString> implements RandomAccess {
        private final LazyStringArrayList list;

        public ByteStringListView(LazyStringArrayList lazyStringArrayList) {
            this.list = lazyStringArrayList;
        }

        @Override
        public void add(int i10, ByteString byteString) {
            this.list.add(i10, byteString);
            ((AbstractList) this).modCount++;
        }

        @Override
        public ByteString get(int i10) {
            return this.list.getByteString(i10);
        }

        @Override
        public ByteString remove(int i10) {
            String strRemove = this.list.remove(i10);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(strRemove);
        }

        @Override
        public ByteString set(int i10, ByteString byteString) {
            Object andReturn = this.list.setAndReturn(i10, byteString);
            ((AbstractList) this).modCount++;
            return LazyStringArrayList.asByteString(andReturn);
        }

        @Override
        public int size() {
            return this.list.size();
        }
    }

    static {
        LazyStringArrayList lazyStringArrayList = new LazyStringArrayList(false);
        EMPTY_LIST = lazyStringArrayList;
        EMPTY = lazyStringArrayList;
    }

    public LazyStringArrayList() {
        this(10);
    }

    public LazyStringArrayList(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.list = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    private LazyStringArrayList(ArrayList<Object> arrayList) {
        this.list = arrayList;
    }

    public LazyStringArrayList(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    private LazyStringArrayList(boolean z10) {
        super(z10);
        this.list = Collections.EMPTY_LIST;
    }

    public void add(int i10, ByteString byteString) {
        ensureIsMutable();
        this.list.add(i10, byteString);
        ((AbstractList) this).modCount++;
    }

    public void add(int i10, byte[] bArr) {
        ensureIsMutable();
        this.list.add(i10, bArr);
        ((AbstractList) this).modCount++;
    }

    public static byte[] asByteArray(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        return obj instanceof String ? Internal.toByteArray((String) obj) : ((ByteString) obj).toByteArray();
    }

    public static ByteString asByteString(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.copyFromUtf8((String) obj) : ByteString.copyFrom((byte[]) obj);
    }

    private static String asString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : Internal.toStringUtf8((byte[]) obj);
    }

    public static LazyStringArrayList emptyList() {
        return EMPTY_LIST;
    }

    public Object setAndReturn(int i10, ByteString byteString) {
        ensureIsMutable();
        return this.list.set(i10, byteString);
    }

    public Object setAndReturn(int i10, byte[] bArr) {
        ensureIsMutable();
        return this.list.set(i10, bArr);
    }

    @Override
    public void add(int i10, String str) {
        ensureIsMutable();
        this.list.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override
    public void add(ByteString byteString) {
        ensureIsMutable();
        this.list.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override
    public void add(byte[] bArr) {
        ensureIsMutable();
        this.list.add(bArr);
        ((AbstractList) this).modCount++;
    }

    @Override
    public boolean add(Object obj) {
        return super.add(obj);
    }

    @Override
    public boolean addAll(int i10, Collection<? extends String> collection) {
        ensureIsMutable();
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).getUnderlyingElements();
        }
        boolean zAddAll = this.list.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override
    public boolean addAllByteArray(Collection<byte[]> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        ensureIsMutable();
        boolean zAddAll = this.list.addAll(collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override
    public List<byte[]> asByteArrayList() {
        return new ByteArrayListView(this);
    }

    @Override
    public List<ByteString> asByteStringList() {
        return new ByteStringListView(this);
    }

    @Override
    public void clear() {
        ensureIsMutable();
        this.list.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String get(int i10) {
        Object obj = this.list.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.list.set(i10, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String stringUtf9 = Internal.toStringUtf8(bArr);
        if (Internal.isValidUtf8(bArr)) {
            this.list.set(i10, stringUtf9);
        }
        return stringUtf9;
    }

    @Override
    public byte[] getByteArray(int i10) {
        Object obj = this.list.get(i10);
        byte[] bArrAsByteArray = asByteArray(obj);
        if (bArrAsByteArray != obj) {
            this.list.set(i10, bArrAsByteArray);
        }
        return bArrAsByteArray;
    }

    @Override
    public ByteString getByteString(int i10) {
        Object obj = this.list.get(i10);
        ByteString byteStringAsByteString = asByteString(obj);
        if (byteStringAsByteString != obj) {
            this.list.set(i10, byteStringAsByteString);
        }
        return byteStringAsByteString;
    }

    @Override
    public Object getRaw(int i10) {
        return this.list.get(i10);
    }

    @Override
    public List<?> getUnderlyingElements() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public LazyStringList getUnmodifiableView() {
        return isModifiable() ? new UnmodifiableLazyStringList(this) : this;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean isModifiable() {
        return super.isModifiable();
    }

    @Override
    public void mergeFrom(LazyStringList lazyStringList) {
        ensureIsMutable();
        for (Object obj : lazyStringList.getUnderlyingElements()) {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                this.list.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.list.add(obj);
            }
        }
    }

    @Override
    public LazyStringArrayList mutableCopyWithCapacity2(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.list);
        return new LazyStringArrayList((ArrayList<Object>) arrayList);
    }

    @Override
    public String remove(int i10) {
        ensureIsMutable();
        Object objRemove = this.list.remove(i10);
        ((AbstractList) this).modCount++;
        return asString(objRemove);
    }

    @Override
    public boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override
    public String set(int i10, String str) {
        ensureIsMutable();
        return asString(this.list.set(i10, str));
    }

    @Override
    public void set(int i10, ByteString byteString) {
        setAndReturn(i10, byteString);
    }

    @Override
    public void set(int i10, byte[] bArr) {
        setAndReturn(i10, bArr);
    }

    @Override
    public int size() {
        return this.list.size();
    }
}

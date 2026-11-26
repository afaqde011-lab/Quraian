package com.mchutov.quranify;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import ym.m0;
import ym.n0;
import ym.o0;
import ym.t0;
import ym.y;

public final class Reciter extends GeneratedMessageLite<Reciter, n0> implements o0 {
    public static final int BIO_FIELD_NUMBER = 7;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 8;
    public static final int COUNTRY_NAME_FIELD_NUMBER = 9;
    public static final int COUNTRY_NAME_OTHER_LANGUAGES_FIELD_NUMBER = 12;
    private static final Reciter DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_NEW_FIELD_NUMBER = 6;
    public static final int LETTER_FIELD_NUMBER = 3;
    public static final int MOSHAF_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NAME_OTHER_LANGUAGES_FIELD_NUMBER = 11;
    private static volatile Parser<Reciter> PARSER = null;
    public static final int PHOTO_URL_FIELD_NUMBER = 5;
    public static final int SOCIAL_LINKS_FIELD_NUMBER = 10;
    private int bitField0_;
    private int id_;
    private boolean isNew_;
    private String name_ = "";
    private String letter_ = "";
    private Internal.ProtobufList<MoshafLocalModel> moshaf_ = GeneratedMessageLite.emptyProtobufList();
    private String photoUrl_ = "";
    private String bio_ = "";
    private String countryCode_ = "";
    private String countryName_ = "";
    private Internal.ProtobufList<SocialLinkLocalModel> socialLinks_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> nameOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> countryNameOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();

    static {
        Reciter reciter = new Reciter();
        DEFAULT_INSTANCE = reciter;
        GeneratedMessageLite.registerDefaultInstance(Reciter.class, reciter);
    }

    private Reciter() {
    }

    public void addAllCountryNameOtherLanguages(Iterable<String> iterable) {
        ensureCountryNameOtherLanguagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.countryNameOtherLanguages_);
    }

    public void addAllMoshaf(Iterable<? extends MoshafLocalModel> iterable) {
        ensureMoshafIsMutable();
        AbstractMessageLite.addAll(iterable, this.moshaf_);
    }

    public void addAllNameOtherLanguages(Iterable<String> iterable) {
        ensureNameOtherLanguagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.nameOtherLanguages_);
    }

    public void addAllSocialLinks(Iterable<? extends SocialLinkLocalModel> iterable) {
        ensureSocialLinksIsMutable();
        AbstractMessageLite.addAll(iterable, this.socialLinks_);
    }

    private void addCountryNameOtherLanguages(String str) {
        str.getClass();
        ensureCountryNameOtherLanguagesIsMutable();
        this.countryNameOtherLanguages_.add(str);
    }

    private void addCountryNameOtherLanguagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureCountryNameOtherLanguagesIsMutable();
        this.countryNameOtherLanguages_.add(byteString.toStringUtf8());
    }

    private void addMoshaf(int i, MoshafLocalModel moshafLocalModel) {
        moshafLocalModel.getClass();
        ensureMoshafIsMutable();
        this.moshaf_.add(i, moshafLocalModel);
    }

    private void addMoshaf(MoshafLocalModel moshafLocalModel) {
        moshafLocalModel.getClass();
        ensureMoshafIsMutable();
        this.moshaf_.add(moshafLocalModel);
    }

    private void addNameOtherLanguages(String str) {
        str.getClass();
        ensureNameOtherLanguagesIsMutable();
        this.nameOtherLanguages_.add(str);
    }

    private void addNameOtherLanguagesBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureNameOtherLanguagesIsMutable();
        this.nameOtherLanguages_.add(byteString.toStringUtf8());
    }

    private void addSocialLinks(int i, SocialLinkLocalModel socialLinkLocalModel) {
        socialLinkLocalModel.getClass();
        ensureSocialLinksIsMutable();
        this.socialLinks_.add(i, socialLinkLocalModel);
    }

    private void addSocialLinks(SocialLinkLocalModel socialLinkLocalModel) {
        socialLinkLocalModel.getClass();
        ensureSocialLinksIsMutable();
        this.socialLinks_.add(socialLinkLocalModel);
    }

    private void clearBio() {
        this.bio_ = getDefaultInstance().getBio();
    }

    private void clearCountryCode() {
        this.countryCode_ = getDefaultInstance().getCountryCode();
    }

    private void clearCountryName() {
        this.countryName_ = getDefaultInstance().getCountryName();
    }

    private void clearCountryNameOtherLanguages() {
        this.countryNameOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearId() {
        this.id_ = 0;
    }

    private void clearIsNew() {
        this.isNew_ = false;
    }

    private void clearLetter() {
        this.bitField0_ &= -2;
        this.letter_ = getDefaultInstance().getLetter();
    }

    private void clearMoshaf() {
        this.moshaf_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    private void clearNameOtherLanguages() {
        this.nameOtherLanguages_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearPhotoUrl() {
        this.photoUrl_ = getDefaultInstance().getPhotoUrl();
    }

    private void clearSocialLinks() {
        this.socialLinks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureCountryNameOtherLanguagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.countryNameOtherLanguages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.countryNameOtherLanguages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureMoshafIsMutable() {
        Internal.ProtobufList<MoshafLocalModel> protobufList = this.moshaf_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.moshaf_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureNameOtherLanguagesIsMutable() {
        Internal.ProtobufList<String> protobufList = this.nameOtherLanguages_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.nameOtherLanguages_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    private void ensureSocialLinksIsMutable() {
        Internal.ProtobufList<SocialLinkLocalModel> protobufList = this.socialLinks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.socialLinks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Reciter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n0 newBuilder() {
        return (n0) DEFAULT_INSTANCE.createBuilder();
    }

    public static n0 newBuilder(Reciter reciter) {
        return (n0) DEFAULT_INSTANCE.createBuilder(reciter);
    }

    public static Reciter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Reciter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reciter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Reciter) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Reciter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Reciter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Reciter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Reciter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Reciter parseFrom(InputStream inputStream) throws IOException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Reciter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Reciter parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Reciter parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Reciter parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Reciter parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Reciter) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Reciter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeMoshaf(int i) {
        ensureMoshafIsMutable();
        this.moshaf_.remove(i);
    }

    private void removeSocialLinks(int i) {
        ensureSocialLinksIsMutable();
        this.socialLinks_.remove(i);
    }

    public void setBio(String str) {
        str.getClass();
        this.bio_ = str;
    }

    private void setBioBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bio_ = byteString.toStringUtf8();
    }

    public void setCountryCode(String str) {
        str.getClass();
        this.countryCode_ = str;
    }

    private void setCountryCodeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryCode_ = byteString.toStringUtf8();
    }

    public void setCountryName(String str) {
        str.getClass();
        this.countryName_ = str;
    }

    private void setCountryNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.countryName_ = byteString.toStringUtf8();
    }

    private void setCountryNameOtherLanguages(int i, String str) {
        str.getClass();
        ensureCountryNameOtherLanguagesIsMutable();
        this.countryNameOtherLanguages_.set(i, str);
    }

    public void setId(int i) {
        this.id_ = i;
    }

    public void setIsNew(boolean z) {
        this.isNew_ = z;
    }

    public void setLetter(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.letter_ = str;
    }

    private void setLetterBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.letter_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    private void setMoshaf(int i, MoshafLocalModel moshafLocalModel) {
        moshafLocalModel.getClass();
        ensureMoshafIsMutable();
        this.moshaf_.set(i, moshafLocalModel);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    private void setNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.toStringUtf8();
    }

    private void setNameOtherLanguages(int i, String str) {
        str.getClass();
        ensureNameOtherLanguagesIsMutable();
        this.nameOtherLanguages_.set(i, str);
    }

    public void setPhotoUrl(String str) {
        str.getClass();
        this.photoUrl_ = str;
    }

    private void setPhotoUrlBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.photoUrl_ = byteString.toStringUtf8();
    }

    private void setSocialLinks(int i, SocialLinkLocalModel socialLinkLocalModel) {
        socialLinkLocalModel.getClass();
        ensureSocialLinksIsMutable();
        this.socialLinks_.set(i, socialLinkLocalModel);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        GeneratedMessageLite.DefaultInstanceBasedParser defaultInstanceBasedParser;
        switch (m0.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Reciter();
            case 2:
                return new n0(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0004\u0000\u0001\u0004\u0002Ȉ\u0003ለ\u0000\u0004\u001b\u0005Ȉ\u0006\u0007\u0007Ȉ\bȈ\tȈ\n\u001b\u000bȚ\fȚ", new Object[]{"bitField0_", "id_", "name_", "letter_", "moshaf_", MoshafLocalModel.class, "photoUrl_", "isNew_", "bio_", "countryCode_", "countryName_", "socialLinks_", SocialLinkLocalModel.class, "nameOtherLanguages_", "countryNameOtherLanguages_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Reciter> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Reciter.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getBio() {
        return this.bio_;
    }

    public ByteString getBioBytes() {
        return ByteString.copyFromUtf8(this.bio_);
    }

    public String getCountryCode() {
        return this.countryCode_;
    }

    public ByteString getCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.countryCode_);
    }

    public String getCountryName() {
        return this.countryName_;
    }

    public ByteString getCountryNameBytes() {
        return ByteString.copyFromUtf8(this.countryName_);
    }

    public String getCountryNameOtherLanguages(int i) {
        return (String) this.countryNameOtherLanguages_.get(i);
    }

    public ByteString getCountryNameOtherLanguagesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.countryNameOtherLanguages_.get(i));
    }

    public int getCountryNameOtherLanguagesCount() {
        return this.countryNameOtherLanguages_.size();
    }

    public List<String> getCountryNameOtherLanguagesList() {
        return this.countryNameOtherLanguages_;
    }

    public int getId() {
        return this.id_;
    }

    public boolean getIsNew() {
        return this.isNew_;
    }

    public String getLetter() {
        return this.letter_;
    }

    public ByteString getLetterBytes() {
        return ByteString.copyFromUtf8(this.letter_);
    }

    public MoshafLocalModel getMoshaf(int i) {
        return (MoshafLocalModel) this.moshaf_.get(i);
    }

    public int getMoshafCount() {
        return this.moshaf_.size();
    }

    public List<MoshafLocalModel> getMoshafList() {
        return this.moshaf_;
    }

    public y getMoshafOrBuilder(int i) {
        return (y) this.moshaf_.get(i);
    }

    public List<? extends y> getMoshafOrBuilderList() {
        return this.moshaf_;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    public String getNameOtherLanguages(int i) {
        return (String) this.nameOtherLanguages_.get(i);
    }

    public ByteString getNameOtherLanguagesBytes(int i) {
        return ByteString.copyFromUtf8((String) this.nameOtherLanguages_.get(i));
    }

    public int getNameOtherLanguagesCount() {
        return this.nameOtherLanguages_.size();
    }

    public List<String> getNameOtherLanguagesList() {
        return this.nameOtherLanguages_;
    }

    public String getPhotoUrl() {
        return this.photoUrl_;
    }

    public ByteString getPhotoUrlBytes() {
        return ByteString.copyFromUtf8(this.photoUrl_);
    }

    public SocialLinkLocalModel getSocialLinks(int i) {
        return (SocialLinkLocalModel) this.socialLinks_.get(i);
    }

    public int getSocialLinksCount() {
        return this.socialLinks_.size();
    }

    public List<SocialLinkLocalModel> getSocialLinksList() {
        return this.socialLinks_;
    }

    public t0 getSocialLinksOrBuilder(int i) {
        return (t0) this.socialLinks_.get(i);
    }

    public List<? extends t0> getSocialLinksOrBuilderList() {
        return this.socialLinks_;
    }

    public boolean hasLetter() {
        return (this.bitField0_ & 1) != 0;
    }
}

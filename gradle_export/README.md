# gradle_export — مشروع Gradle من الكود المُفكَّك

هذا هو **الشكل الهندسي الحقيقي** بعد فك APK بـ jadx 1.5.7، مش مجرد smali.

## البنية
```
settings.gradle, build.gradle
app/
  build.gradle
  src/main/AndroidManifest.xml
  src/main/java/     (14,652 ملف Java مُفكَّك)
  src/main/res/      (1,728 مورد XML/رسم/خط)
  src/main/assets/   (397 أصوات/أعلام/بيانات سور)
  src/main/jniLibs/  (مكتبات ARM)
```

## افتحه في Android Studio
File → Open → اختر مجلد `gradle_export` → Gradle sync.

## حقيقة مهمة
- الكود **مُفكَّك ومُعمّى** (jadx output). فيه تعليقات `/* JADX ERROR */`، مش السورس الأصلي للناشر.
- خدمات Google أُزيلت من هذا النسخ (Manifest نظيف، لا GMS/Firebase/PairIP).
- **البناء مش مضمون بدون شغل إضافي**: لازم تضيف الـ dependencies الناقصة وتصلح أخطاء jadx.
- للتعديل السهل والمضمون استخدم المجاور `clean_source/` — سورس Kotlin/Compose مقروء ومعاد كتابته.

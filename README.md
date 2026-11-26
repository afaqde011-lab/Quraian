# Quranify — Fresh source

مستودع نظيف اتعمل من الصفر بعد مسح كل الملفات القديمة (APKs، smali، ومخرجات الفك القديمة).

## المجلدات

| المجلد | الوصف |
|---|---|
| `clean_source/` | **السورس الحقيقي القابل للتعديل**: Kotlin + Jetpack Compose، منظّم حسب الميزة، مقروء وبدون تعمية. |
| `gradle_export/` | مشروع Android Gradle فيه الكود المُفكَّك (jadx) والموارد — للرجوع للمصدر الأصلي عند الحاجة فقط. |

## ملفات التوثيق

- `GEMINI.md` — تعليمات لـ Google AI Studio: يقرأ ويعدّل كل الملفات.
- `DESIGN.md` — نظام التصميم والألوان والخطوط والشاشات.
- `FEATURES.md` — المميزات ومواقعها في الكود.
- `GOOGLE_SERVICES_REMOVAL.md` — تقرير إزالة خدمات Google.

## التشغيل

افتح `clean_source/` في Android Studio (Arctic Fox أو أحدث)، ثم:

```powershell
./gradlew assembleDebug
```

يتطلب Android SDK 35 و JDK 17.

## ملاحظات مهمة

- **لا توجد خدمات Google** (GMS / Firebase / PairIP / Play Integrity).
- `clean_source` هو المفضل للتعديل؛ `gradle_export` للرجوع فقط.
- Google AI Studio يستطيع قراءة الكود وتعديله، لكنه لا يشغّل تطبيقات Android مباشرة.

## الرابط

https://github.com/afaqde011-lab/Quraian

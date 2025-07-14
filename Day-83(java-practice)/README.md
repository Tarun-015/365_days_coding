# 🔡 Java StringBuilder & StringBuffer Programs

This repository contains multiple Java programs that demonstrate key concepts of working with `StringBuilder` and `StringBuffer`, showcasing both **mutable string manipulation** and conversion to `String` for advanced operations.

---

## 📂 Files Overview

| File Name                         | Description |
|----------------------------------|-------------|
| `StringBuilderMethodsDemo.java`  | Shows basic methods like `append`, `ensureCapacity`, `setLength`, and `trimToSize`. |
| `StringBuilderMethodsPart2.java` | Demonstrates advanced methods: `insert`, `setCharAt`, `delete`, `replace`, and `reverse`. |
| `StringBufferAppendDemo.java`    | Shows how `StringBuffer` handles `append(Object)` to add various data types. |
| `StringBuilderToStringMethods.java` | Explains how to use `String` methods (`indexOf`, `substring`, etc.) on a `StringBuilder` by converting it. |

---

## 📌 1. StringBuilderMethodsDemo.java

### 🔧 Key Methods:
- `append(String)`
- `capacity()`
- `length()`
- `ensureCapacity(int)`
- `setLength(int)`
- `trimToSize()`


---

## 📌 2. StringBuilderMethodsPart2.java

### 🔧 Key Methods:
- `insert(int, String/char)`
- `setCharAt(int, char)`
- `deleteCharAt(int)`
- `delete(start, end)`
- `replace(start, end, str)`
- `reverse()`


---

## 📌 3. StringBufferAppendDemo.java

### 🔧 Demonstrates appending various data types using `append(Object)`:
- `String`
- `int`
- `long`
- `float`
- `double`
- `char`
- `boolean`


---

## 📌 4. StringBuilderToStringMethods.java

### 🔧 Shows how to:
- Use `indexOf()`, `lastIndexOf()`, `substring()`, `codePointAt()` on a `StringBuilder` by converting it to `String`.


---

## 🔍 Key Concepts Explained

| Concept             | StringBuilder | StringBuffer | Notes |
|---------------------|----------------|----------------|-------|
| Mutable             | ✅              | ✅              | More efficient than `String` for modifications |
| Thread-safe         | ❌              | ✅              | Use `StringBuffer` in multi-threaded apps |
| Capacity vs Length  | ✅              | ✅              | Understand internal buffer size |
| Conversion to String| ✅ via `.toString()` | ✅ | Required for `indexOf`, `substring`, etc. |

---





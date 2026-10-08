# Bye Java String Template

A demonstration and historical reference for Java's String Templates preview feature, which was available in Java 21 and Java 22 before being withdrawn in Java 23.

---

## Overview

In Java 21, [JEP 430](https://openjdk.org/jeps/430) introduced **String Templates (Preview)** to provide string interpolation and structured template processing safely. It was further refined in Java 22 ([JEP 459](https://openjdk.org/jeps/459)).

However, based on community and architectural feedback regarding the syntax and design (such as the `STR."..."` prefix and processor mechanics), the feature was **withdrawn in Java 23** to be redesigned.

This repository demonstrates the syntax and execution of String Templates as implemented in Java 21 preview.

---

## Code Example (`string_template`)

```java
#!/usr/bin/env -S jbang
//JAVA 21
//COMPILE_OPTIONS --enable-preview --source 21 -Xlint:preview
//RUNTIME_OPTIONS --enable-preview --source 21 

void main() {
    var a = this.getClass();
    System.out.println(STR."Hello \{a}!");
}
```

### Key Features Used:
- **JBang Directives**: Automatically sets Java 21 and passes `--enable-preview` flags for compilation and runtime.
- **Unnamed Classes and Instance Main Method** ([JEP 445](https://openjdk.org/jeps/445)): Allows running `void main()` without boilerplate class definitions (`public static void main(String[] args)`).
- **String Templates (`STR."..."`)**: Uses the built-in `STR` template processor with embedded expression syntax (`\{a}`).

---

## Prerequisites

- [JBang](https://www.jbang.dev/) or JDK 21 installed.

---

## How to Run

### Option 1: Direct execution via JBang
The file has executable permissions and a JBang shebang:
```bash
./string_template
```
Or explicitly via JBang:
```bash
jbang string_template
```

### Option 2: Using the helper script
The repository includes `string_template.sh`:
```bash
./string_template.sh
```

### Option 3: Using the `java` launcher directly
If using JDK 21:
```bash
java --enable-preview --source 21 string_template
```

---

## Output

```text
Note: string_template uses preview features of Java SE 21.
Note: Recompile with -Xlint:preview for details.
Hello class string_template!
```

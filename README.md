# Projet Java Swing

Projet Java Maven avec interface graphique Swing et package `com.tp.swing`.

## Compiler

```bash
./mvnw compile
```

## Lancer l'application

```bash
./mvnw exec:java
```

## Compiler et lancer avec javac

```bash
javac -d out $(find src/main/java -name "*.java")
java -cp out com.tp.swing.Main
```

La classe principale est `com.tp.swing.Main`.

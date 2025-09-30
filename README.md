# impact-cli-only

A tiny **Java picocli** command-line app that prints **impact** in ASCII.

## Quick run
```bash
cd cli
mvn -q -DskipTests package
java -jar target/impact-cli-1.0.0-jar-with-dependencies.jar banner
```
If `mvn` isn't available:
```bash
cd cli
sed -i 's/\r$//' mvnw 2>/dev/null || true
chmod +x mvnw 2>/dev/null || true
./mvnw -q -DskipTests package
java -jar target/impact-cli-1.0.0-jar-with-dependencies.jar banner
```

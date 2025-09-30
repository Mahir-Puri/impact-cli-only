# impact-cli-only

A tiny **Java picocli CLI** project for the impact.com job posting bonus.  
When you run it, it prints a big ASCII **impact.com** banner and introduces me.

---

## Quick Run (in Codespaces)

1. Click **Code → Codespaces → Create codespace on main**
2. Run:
   ```bash
   cd cli
   mvn -q -DskipTests package || (sed -i 's/\r$//' mvnw && chmod +x mvnw && ./mvnw -q -DskipTests package)
   java -jar target/impact-cli-1.0.0-jar-with-dependencies.jar banner

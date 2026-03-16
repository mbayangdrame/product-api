# Utiliser une image officielle Java 17
FROM eclipse-temurin:17-jdk

# ✅ Nom exact du JAR généré par Maven
COPY target/product-api-0.3.0.jar app.jar

# Exécuter l'application
ENTRYPOINT ["java", "-jar", "/app.jar"]

EXPOSE 8086
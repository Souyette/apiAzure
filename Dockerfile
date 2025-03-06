# 1️⃣ Utiliser une image de base avec Java 17
FROM openjdk:17

# 2️⃣ Définir le répertoire de travail dans le conteneur
WORKDIR /app

# 3️⃣ Copier les fichiers de l'application (le fichier JAR généré par Gradle)
COPY build/libs/*.jar apiazure.jar

# 4️⃣ Exposer le port de l'application (par défaut 8080, modifie si nécessaire)
EXPOSE 8080

# 5️⃣ Définir la commande de démarrage
CMD ["java", "-jar", "apiazure.jar"]

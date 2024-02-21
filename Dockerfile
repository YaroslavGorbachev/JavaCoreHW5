# Устанавливаем базовый образ, содержащий JDK
FROM openjdk:latest

WORKDIR /usr/src/app

COPY ./src/main/java .

RUN javac -sourcepath . -d out ./ru/geekbrains/core/lesson1/task1/Program.java

WORKDIR /usr/src/app/out

ENTRYPOINT ["java","ru.geekbrains.core.lesson1.task1.Program"]
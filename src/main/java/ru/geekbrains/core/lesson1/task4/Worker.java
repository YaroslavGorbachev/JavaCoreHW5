package ru.geekbrains.core.lesson1.task4;

import java.util.Objects;

public class Worker {
    private int personalId;
    private String name;
    private String phone;
    private int seniority;

    public Worker(int personalId, String name, String phone, int seniority) {
        this.personalId = personalId;
        this.name = name;
        this.phone = phone;
        this.seniority = seniority;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getSeniority() {
        return seniority;
    }



    @Override
    public String toString() {
        return String.format("%d: %s, %s, %s years", personalId, name, phone, seniority);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return seniority == worker.seniority && Objects.equals(name, worker.name) && Objects.equals(phone, worker.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, seniority);
    }
}
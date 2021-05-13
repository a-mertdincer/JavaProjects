package entities;

import java.time.LocalDate;
import Abstract.Entity;

public class Player {

    private int id;
    private String fullName;
    private String nationalIdentity;
    private LocalDate birthDate;
    private String phoneNumber;


    public Player(int id, String fullName, String nationalIdentity, LocalDate birthDate, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.nationalIdentity = nationalIdentity;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

package com.company.M2ChallengeRedfordKatharine.models;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Month {

    @NotEmpty(message ="you must have a value for number")
    private Integer number;
    private String month;

    public Month() {

    }

    public Month(Integer number, String month){
        this.number = number;
        this.month = month;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month1 = (Month) o;
        return number == month1.number && Objects.equals(month, month1.month);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, month);
    }
}

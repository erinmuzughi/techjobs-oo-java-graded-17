package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency extends JobField {

    public CoreCompetency(String value) {
        super(value);
    }

    // Custom toString, equals, and hashCode methods:
    @Override
    public String toString() {
    return this.getValue();
}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return this.getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public boolean isEmpty() {

        return getValue() == null || getValue().isEmpty();
    }

}

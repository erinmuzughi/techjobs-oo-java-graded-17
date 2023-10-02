package org.launchcode.techjobs.oo;

public class JobField {
    private int id; //every subclass will have an ID
    private static int nextId = 1;
    private String value; //every subclass will have a value

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public String toString() { //every subclass has a toString method that will override this one, wondering if this should have been an abstract method for that reason? I didn't set it up as one
        return getValue();
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

}


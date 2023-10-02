package org.launchcode.techjobs.oo;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //TO DO: Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the
        // class and value of each field. Your test should have 5 assert statements of each type.
        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJob.getName());
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob1.getId() != testJob2.getId());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newString = testJob1.toString();
        assertTrue(newString.startsWith(System.lineSeparator()));
        assertTrue(newString.endsWith(System.lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        //The string should contain a label for each field, followed by the data stored in that field.
        // Each field should be on its own line.
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newString = testJob1.toString();
        String expected =
                        System.lineSeparator() +
                        "ID: " + testJob1.getId()+"\n" +
                        "Name: " + testJob1.getName() + "\n" +
                        "Employer: " + testJob1.getEmployer().getValue() + "\n" +
                        "Location: " + testJob1.getLocation().getValue() + "\n" +
                        "Position Type: " + testJob1.getPositionType().getValue() +"\n" +
                        "Core Competency: " + testJob1.getCoreCompetency().getValue() +
                                System.lineSeparator();

        assertEquals(expected, newString);

    }

    @Test //If a field is empty, the method should add, “Data not available” after the label.
    public void testToStringHandlesEmptyField() {
        Job testJob1 = new Job("", new Employer(""), new Location(""),
                new PositionType(""), new CoreCompetency(""));

        String newString = testJob1.toString();
        String expected =
                System.lineSeparator() +
                        "ID: " + testJob1.getId()+"\n" +
                        "Name: Data not available\n" +
                        "Employer: Data not available\n" +
                        "Location: Data not available\n" +
                        "Position Type: Data not available\n" +
                        "Core Competency: Data not available" +
                        System.lineSeparator();

        assertEquals(expected, newString);



    }
}

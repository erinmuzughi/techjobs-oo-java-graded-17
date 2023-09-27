package org.launchcode.techjobs.oo;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.fail;

public class JobTest {
    @Test
    public void testSettingJobId () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);

    }

    public void testJobConstructorSetsAllFields() {
        new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
    //TO DO: Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the
        // class and value of each field. Your test should have 5 assert statements of each type.
    }
    //TODO: Create your unit tests here
}

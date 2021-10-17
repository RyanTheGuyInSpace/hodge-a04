package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeReaderTest {

    @Test
    void readEmployees() {
        EmployeeReader reader = new EmployeeReader();

        reader.readEmployees("data/testinput.txt");

        assertEquals("Hodge", reader.employees.get(0).lastName);

    }

    @Test
    void saveEmployee() {
        EmployeeReader reader = new EmployeeReader();

        reader.readEmployees("data/testinput.txt");

        assertEquals("Hodge", reader.employees.get(0).lastName);
    }
}
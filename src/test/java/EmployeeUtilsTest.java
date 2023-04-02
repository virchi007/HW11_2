import data.EmployeeData;
import homeworkEight2.EmployeeUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {

    @Test
    public void findByNameTest() {

        Assert.assertEquals(EmployeeUtils.findByName(EmployeeData.name, EmployeeData.getEmployeesData()), 1);

    }

    @Test
    public void findBySubNameTest() {
        Assert.assertEquals(EmployeeUtils.findBySubName(EmployeeData.subName, EmployeeData.getEmployeesData()), 1);
    }

    @Test
    public void salarySumTest() {
        Assert.assertEquals(EmployeeUtils.salarySum(EmployeeData.getWorkerData()), 60);
    }

    @Test
    public void findMaxSalaryTest() {
        Assert.assertEquals(EmployeeUtils.findMaxSalary(EmployeeData.getWorkerData()), 20);
    }

    @Test
    public void findMinSalaryTest() {
        Assert.assertEquals(EmployeeUtils.findMinSalary(EmployeeData.getManagerData()), 1);
    }

    @Test
    public void findMinNumberOfSubordinatesTest() {
        Assert.assertEquals(EmployeeUtils.findMinNumberOfSubordinates(EmployeeData.getDirectorData()), 50);

    }

    @Test
    public void findMaxNumberOfSubordinatesTest() {
        Assert.assertEquals(EmployeeUtils.findMaxNumberOfSubordinates(EmployeeData.getManagerData()), 15);
    }

    @Test
    public void findMaxIncrementTest() {
        Assert.assertEquals(EmployeeUtils.findMaxIncrement(EmployeeData.getManagerData()), -11);
    }

    @Test
    public void findMinIncrementTest() {
        Assert.assertEquals(EmployeeUtils.findMinIncrement(EmployeeData.getManagerData()), -19);
    }
}

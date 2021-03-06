import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {


    public Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        Map<String, List<Employee>> resultMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            List<Employee> employeeSubList = resultMap.getOrDefault(employee.getTitle(), new ArrayList<Employee>());
            employeeSubList.add(employee);
            resultMap.put(employee.getTitle(), employeeSubList);
        }
        return resultMap;
    }
    public double calculateAverage(List<Employee> employeeList) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            Employee employee = employeeList.get(i);
            sum += employee.getSalary();
            count++;
        }
        return (double) sum / count;
    }
}

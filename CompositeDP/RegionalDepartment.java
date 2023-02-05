package StructuralDP.CompositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

        // bu class ara class tum departmentdaki çalışanları almak için kullnılacak
    List<Department> childDepartments ;    // abstract class ı alırsak tum departmentları almış oluruz

    public RegionalDepartment(List<Department> childDepartments) { // Runner da new yaparsak childDepartments i alacaz
        this.childDepartments = childDepartments;
    }

    @Override
    String getName() {
        return childDepartments.stream().// Finance ve Sales objesi var
                                map(Department::getName).// burada "Finance"ve"Sales" alır
                                collect(Collectors.joining(",")); // bize tek bir string olarak verir "," ile araya koymak için
    }

    @Override
    List<String> getEmployees() {
        return childDepartments.stream().
                                flatMap(d->d.getEmployees().stream()).// map in ozelleştirilmiş halidir.
                                collect(Collectors.toList()); // donen degeri list halınde aldık

    }
}

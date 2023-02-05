package StructuralDP.CompositeDP;

import java.util.Arrays;

public class CompositeRunner {

    public static void main(String[] args) {
        CompositeRunner composite = new CompositeRunner();
        composite.CompositeDemo();
    }

    public void CompositeDemo(){
        Department financeDepartment =new Finance();
        Department salesDepartment =new Sales();
        Department argeDepartment =new Arge();
        Department regionalDepartment =new RegionalDepartment(Arrays.asList(financeDepartment,salesDepartment,argeDepartment));
        System.out.println(regionalDepartment.getName());// burası bize bolumleri berir
        System.out.println("**".repeat(50));
        System.out.println(regionalDepartment.getEmployees());// burasıda tum çalışanları bize verir


    }
}

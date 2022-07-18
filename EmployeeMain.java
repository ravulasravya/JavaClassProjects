import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;


public class EmployeeMain {

    public static void main (String [] args ) {

        final int TOTAL_NUMBER_OF_HEROS = 3;

        Employee thor = new Employee("Thor", 'E', "Odinsson", "1234567", "000-12-3456", LocalDate.parse("1600-06-12"));
        Employee blackWidow = new Employee ("Natasha", 'R', "Romanova", "7654321", "413-44-7777", LocalDate.parse("1984-12-03"), BigDecimal.valueOf(332223.80));

        System.out.println(thor.COMPLEX_CODE);

        System.out.println(thor);
        System.out.println();
        System.out.println(blackWidow);


        Employee[] employees = new Employee [TOTAL_NUMBER_OF_HEROS];
        employees[0] = thor;
        employees[1] = blackWidow;
        employees[2] = new Employee ("Peter", 'N', "Parker", "123333", "123-44-5566", LocalDate.parse("1990-01-01"), BigDecimal.valueOf(420000.00));


        for (int heroCounter = 0; heroCounter < employees.length; ++heroCounter ) {
            System.out.println(employees[heroCounter] + "\n");
        }

        for (Employee hero : employees ) {
            System.out.println(hero);
        }

        ArrayList<Employee> arrayListHeroNames = new ArrayList<Employee>();

        arrayListHeroNames.add(0, thor);
        arrayListHeroNames.add(1, blackWidow);
        arrayListHeroNames.add(2, employees[2]);
        arrayListHeroNames.add(3, new Employee ("Stephen", 'R', "Strange", "056342", "428-35-3421", LocalDate.parse("1968-04-19"), BigDecimal.valueOf(250000.00)));
        arrayListHeroNames.add(4, new EmployeeWithInsurance ("James", '0', "Bond", "056348", "428-35-3420", LocalDate.parse("1918-04-19"), BigDecimal.valueOf(150000.00), InsuranceType.BLUECROSS));

        Employee tempEmployee = arrayListHeroNames.get(1);
        arrayListHeroNames.forEach(System.out::println);
        arrayListHeroNames.get(3).setMiddleInitial('Z');
        arrayListHeroNames.forEach(System.out::println);

        System.out.println(tempEmployee);
        System.out.println(arrayListHeroNames.get(3));

        System.out.println (Math.PI);
        System.out.println();
        System.out.println( Math.round( Math.pow( 5.0, 2.0 ) ) );
        System.out.println();
        System.out.println( ( Math.pow( 2.0, 3.0 ) ) );
        System.out.println();

    }

}

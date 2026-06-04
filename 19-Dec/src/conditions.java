public class conditions {

    String[] person_name;
    String[] person_age;


    void saveRecords(String[] names, String[] ages) {
        if (names == null || ages == null || names.length != ages.length) {
            System.out.println("Invalid data.");
            return;
        }
        this.person_name = names;
        this.person_age = ages;
        System.out.println("Records saved successfully.");
    }


    void displayRecords() {
        if (person_name == null || person_age == null) {
            System.out.println("No records found. Please enter records first.");
            return;
        }

        for (int i = 0; i < person_name.length; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Name: " + person_name[i]);
            System.out.println("Age: " + person_age[i]);
            System.out.println("-------------------");
        }
    }

    void checkGreater(int x, int y) {
        if (x > y) {
            System.out.println("Value of X is greater than Y");
        } else if (x == y) {
            System.out.println("X and Y are equal");
        } else {
            System.out.println("Y is greater than X");
        }
    }

    void checkTemperature(int x) {
        if (x <= 0) {
            System.out.println("Temperature is extremely cold");
        } else if (x <= 10) {
            System.out.println("Temperature is cold");
        } else if (x <= 20) {
            System.out.println("Temperature is normal");
        } else if (x <= 30) {
            System.out.println("Temperature is warm");
        } else if (x <= 35) {
            System.out.println("Temperature is hot");
        } else {
            System.out.println("Temperature is extremely hot");
        }
    }
}

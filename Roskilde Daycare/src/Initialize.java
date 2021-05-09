import java.util.ArrayList;

public class Initialize {

    //Create Employees
    Employee e1 = new Employee("110180-4223", "A", "Victor", "Lund", 40, "male", "50121266", "Nørrebro Gade 190, 3B", 250);
    Employee e2 = new Employee("170592-9945", "B", "Alice", "Holst", 28, "female", "90237128", "Tyrolsgade 1, Stuen", 250);
    Employee e3 = new Employee("030475-1239", "C", "Marie", "Smidsen", 45, "female", "51101177", "Brøndlunds Alle, 37", 250);
    Employee e4 = new Employee("291096-5523", "D", "Amelie", "Hansen", 24, "female", "71887893", "Holtegade 13, 4D", 250);

    //Add Employees to ArrayList
    ArrayList<Employee> employeeList = new ArrayList<Employee>() {
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
    }

    //Create Children
    Child c1 = new Child("070517-7854", "B", "Nuria", "Soto", 2, "female", "52348893", "Vesterbrogade 62, 7", "Anna", "Grabøl");
    Child c2 = new Child("230917-1234", "B", "Sophie", "Kors", 2, "female", "50111078", "Carstengade 7, 3", "Maria", "Henriksen");
    Child c3 = new Child("160116-5566", "A", "Kara", "Chin", 4, "female", "29788345", "Platanvej 12, St.Th", "Alexander", "Chin");
    Child c4 = new Child("140218-9098", "C", "Paul", "Mogesen", 2, "male", "90905482", "Vesterbrogade 99, 3B", "Sandra", "Kofoed");
    Child c5 = new Child("061217-6623", "B", "Bo", "Andersen", 2, "male", "54810349", "Norsvej 1, 5", "Richard", "Andersen");
    Child c6 = new Child("300616-4491", "A", "Ana", "Bauer", 3, "female", "59693301", "Ceresvej 39, 5", "Nanna", "Henriksen");
    Child c7 = new Child("251018-3437", "C", "Ida", "Hansen", 1, "female", "22336095", "Amalievej, St.Tv", "Monica", "Svens");
    Child c8 = new Child("030319-1119", "D", "Johanne", "Laugesen", 1, "female", "50771022", "Eriksgade 21, St.Th", "Cecilia", "Lund");
    Child c9 = new Child("270318-7429", "C", "Mateo", "Roman", 2, "male", "21845356", "Alsgade 2, 6", "Pat", "Jensen");
    Child c10 = new Child("140219-1104", "D", "Jeanette", "Varder", 1, "female", "56763333", "Heilsgade 44, 3-1", "Søren", "Varder");
    Child c11 = new Child("090917-2353", "B", "Laura", "Holst", 2, "female", "29684312", "Amerikavej 9, 7A", "Lars", "Holst");
    Child c12 = new Child("210818-1558", "C", "Klaudia", "Barz", 1, "female", "90005862", "Henrik Ibsen Vej 51, 2", "Annette", "Grunnet");
    Child c13 = new Child("240716-0257", "A", "Holger", "Torson", 3, "male", "22576881", "Carstengade 1, St.14", "Otto", "Torson");
    Child c14 = new Child("100319-3283", "D", "Berit", "Madsen", 1, "female", "50901177", "Gl. Kongevej 78, 5A", "Jakob", "Madsen");
    Child c15 = new Child("010918-7721", "C", "Lars", "Olsen", 1, "male", "21213450", "Heilsgade 44, 3-1", "Søren", "Olsen");
    Child c16 = new Child("200419-0687", "D", "Mikkel", "Møller", 0, "male", "99379031", "Nyvej 99, St. Tv", "Birthe", "Jensen");
    Child c17 = new Child("310519-9921", "D", "Helena", "Carter", 0, "female", "54884405", "Vesterbrogade 112, 6-7", "Karin", "Kofoed");
    Child c18 = new Child("241217-8723", "B", "Frederik", "Lund", 2, "male", "27045605", "Kastanevej 30, 5", "Anders", "Lund");
    Child c19 = new Child("220916-4333", "A", "Kristine", "Larsen", 3, "female", "90227402", "Tøndergade 7, St.5", "Lisbeth", "Bryld");
    Child c20 = new Child("060616-1010", "A", "Otto", "Smith", 3, "male", "50126611", "Stefansgade 12, St.Th", "Lisa", "Karsbøl");

    //Add Children to Active ArrayList
    ArrayList<Child> childActiveList = new ArrayList<Child>() {
        childActiveList.add(c1);
        childActiveList.add(c2);
        childActiveList.add(c3);
        childActiveList.add(c4);
        childActiveList.add(c5);
        childActiveList.add(c6);
        childActiveList.add(c7);
        childActiveList.add(c8);
        childActiveList.add(c9);
        childActiveList.add(c10);
        childActiveList.add(c11);
        childActiveList.add(c12);
        childActiveList.add(c13);
        childActiveList.add(c14);
        childActiveList.add(c15);
        childActiveList.add(c16);
        childActiveList.add(c17);
        childActiveList.add(c18);
        childActiveList.add(c19);
        childActiveList.add(c20);

    }

}

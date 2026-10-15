class Appointment {
    String patientName, patientId, doctorName, type;
    double fee;

    // Constructor 1
    Appointment(String p, String id, String d, String t, double f) {
        patientName = p.toUpperCase();
        patientId = id;
        doctorName = d.toUpperCase();
        type = t.toUpperCase();
        fee = f;
    }

    // Constructor 2
    Appointment(String p, String id, String d) {
        this(p, id, d, "GENERAL", 500);
    }

    // Method overloading
    void display() {
        System.out.println("Patient Name       : " + patientName);
        System.out.println("Patient ID         : " + patientId);
        System.out.println("Doctor Name        : " + doctorName);
        System.out.println("Appointment Type   : " + type);
        System.out.printf("Consultation Fee   : Rs. %.2f%n", fee);
        System.out.println("Appointment Status : Confirmed\n");
    }

    void display(String msg) {
        System.out.println(msg);
        display();
    }

    public static void main(String[] args) {
        Appointment a1 = new Appointment(
            "Priya Sharma", "P101", "Dr. Kumar", "General", 500);

        Appointment a2 = new Appointment(
            "Rahul Verma", "P102", "Dr. Meena", "Specialist", 800);

        System.out.println("====== CLINIC APPOINTMENT SYSTEM ======\n");

        a1.display();
        a2.display();

        double total = a1.fee + a2.fee;

        System.out.println("------ APPOINTMENT SUMMARY ------");
        System.out.println("Total Appointments : 2");
        System.out.printf("Total Consultation : Rs. %.2f%n", total);

        if (a1.patientName.equals(a2.patientName))
            System.out.println("Patient Verification: Names Match");
        else
            System.out.println("Patient Verification: Names Do Not Match");
    }
}
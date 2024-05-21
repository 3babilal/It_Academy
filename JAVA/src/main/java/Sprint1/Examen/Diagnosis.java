package Sprint1.Examen;

public class Diagnosis {
    private String name;
    private String time;
    private Doctor doctor;

    private static int totalAppointments = 0;
    private final int appointmentsTotal;

    public Diagnosis(String name, String time, Doctor doctor, int appointmentsTotal) {
        this.name = name;
        this.time = time;
        this.doctor = doctor;
        this.appointmentsTotal = appointmentsTotal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public static int getTotalAppointments() {
        return totalAppointments;
    }

    public static void setTotalAppointments(int totalAppointments) {
        Diagnosis.totalAppointments = totalAppointments;
    }

    public int getAppointmentsTotal() {
        return appointmentsTotal;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", doctor=" + doctor +
                ", appointmentsTotal=" + appointmentsTotal +
                '}';
    }
}

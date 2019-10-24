import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClinicCalendarTest {
     @Test
    public void allowEntryOfAppoinment(){


    ClinicCalendar calendar = new ClinicCalendar();
    calendar.addAppointment("Jim", "Johanson", "avery", "12/7/1992 7:00 pm");
    List<PatientAppointment> appointments = calendar.getAppointments();
    assertNotNull(appointments, "Unesite sve podatke");
    assertEquals(1, appointments.size());

    PatientAppointment enteredApt = appointments.get(0);
    assertEquals("Jim", enteredApt.getPatientFirstName());
    assertEquals("Johanson", enteredApt.getPatientLastName());
    assertEquals (Doctor.avery, enteredApt.getDoctor());
    assertEquals("12/7/1992 07:00 PM", enteredApt.getAppointmentDateTime().format(DateTimeFormatter.ofPattern("M/d/yyyy hh:mm a")));


     }


}

import scheduler.Appointment;
import singleton.AppointmentScheduler;
import strategy.AppointmentStrategy;
import strategy.BasicAppointmentStrategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AppointmentScheduler scheduler = AppointmentScheduler.getInstance();

        Appointment appointment1 = new Appointment("2023-10-10", "10:00 AM", "General Checkup");
        Appointment appointment2 = new Appointment("2023-10-12", "02:30 PM", "Dental Cleaning");

        AppointmentStrategy basicStrategy = new BasicAppointmentStrategy((ArrayList<Object>) new ArrayList<>());
        scheduler.setAppointmentStrategy(basicStrategy);

        scheduler.scheduleAppointment(appointment1);
        scheduler.scheduleAppointment(appointment2);

        System.out.println("Scheduled Appointments:");
        scheduler.viewAppointments();

        int appointmentIdToCancel = 1; 
        scheduler.cancelAppointment(appointmentIdToCancel);

        System.out.println("\nAppointments after Cancellation:");
        scheduler.viewAppointments();
    }
}

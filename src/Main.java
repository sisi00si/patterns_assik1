
import scheduler.Appointment;
import singleton.AppointmentScheduler;
import strategy.AppointmentStrategy;
import strategy.BasicAppointmentStrategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create the appointment scheduler instance
        AppointmentScheduler scheduler = AppointmentScheduler.getInstance();

        // Create some appointments
        Appointment appointment1 = new Appointment("2023-10-10", "10:00 AM", "General Checkup");
        Appointment appointment2 = new Appointment("2023-10-12", "02:30 PM", "Dental Cleaning");

        // Set the initial appointment strategy (basic strategy in this case)
        AppointmentStrategy basicStrategy = new BasicAppointmentStrategy((ArrayList<Object>) new ArrayList<>());
        scheduler.setAppointmentStrategy(basicStrategy);

        // Schedule appointments using the scheduler with the basic strategy
        scheduler.scheduleAppointment(appointment1);
        scheduler.scheduleAppointment(appointment2);

        // View scheduled appointments using the basic strategy
        System.out.println("Scheduled Appointments:");
        scheduler.viewAppointments();

        // Cancel an appointment
        int appointmentIdToCancel = 1; // Replace with the actual appointment ID to cancel
        scheduler.cancelAppointment(appointmentIdToCancel);

        // View updated appointments after cancellation
        System.out.println("\nAppointments after Cancellation:");
        scheduler.viewAppointments();
    }
}

package com.quest.BMWServiceCenterOperations;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BookingManager {
    private Map<Customer, List<ServiceBooking>> bookings = new HashMap<>();
    private Set<String> bookingIds = new HashSet<>();

    public void addBooking(Customer customer, ServiceBooking booking) throws InvalidBookingException {
        if (bookingIds.contains(booking.getBookingId())) {
            throw new InvalidBookingException("Duplicate booking ID: " + booking.getBookingId());
        }

        if (booking.getServiceDate().isBefore(LocalDateTime.now())) {
            throw new InvalidBookingException("Cannot book service for past date");
        }

        bookingIds.add(booking.getBookingId());
        bookings.computeIfAbsent(customer, k -> new ArrayList<>()).add(booking);
    }

    public static final Predicate<ServiceBooking> isWithinNextWeek = booking -> {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime weekLater = now.plusDays(7);
        return booking.getServiceDate().isAfter(now) &&
                booking.getServiceDate().isBefore(weekLater);
    };

    public static final Consumer<Map.Entry<Customer, List<ServiceBooking>>> printInvoice = entry -> {
        Customer customer = entry.getKey();
        List<ServiceBooking> customerBookings = entry.getValue();
        double totalCost = customerBookings.stream()
                .mapToDouble(ServiceBooking::getCost)
                .sum();

        System.out.println("\n=== INVOICE ===");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("\nBookings:");
        customerBookings.forEach(booking ->
                System.out.println("- " + booking.getServiceType() +
                        " on " + booking.getServiceDate() +
                        " : $" + booking.getCost())
        );
        System.out.println("\nTotal Cost: $" + totalCost);
    };

    public static final Function<Double, Double> applyDiscount = cost -> cost * 0.85;

    public static final Supplier<ServiceBooking> randomBooking = () -> {
        Random random = new Random();
        String[] serviceTypes = {"Oil Change", "Tire Rotation", "Battery Check", "Break Service"};
        return new ServiceBooking(
                "BK" + random.nextInt(1000),
                null,
                LocalDateTime.now().plusDays(random.nextInt(30)),
                serviceTypes[random.nextInt(serviceTypes.length)],
                500 + random.nextDouble() * 1000
        );
    };

    public Map<Customer, List<ServiceBooking>> getBookings() {
        return bookings;
    }
}

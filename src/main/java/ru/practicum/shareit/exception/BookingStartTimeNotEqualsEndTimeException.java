package ru.practicum.shareit.exception;

public class BookingStartTimeNotEqualsEndTimeException extends RuntimeException {
    public BookingStartTimeNotEqualsEndTimeException(String e) {
        super(e);
    }
}

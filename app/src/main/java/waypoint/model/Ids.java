package waypoint.model;

/** Distinct id types so they can never be swapped at a call site. */
public record TicketId(String value) { /* TODO: reject null/blank */ }
public record SpotId(String value)   { /* TODO: reject null/blank */ }

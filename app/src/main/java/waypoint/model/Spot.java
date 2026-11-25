package waypoint.model;

/** ENTITY. Identity = id. Invariant: a spot cannot be assigned while occupied. */
public final class Spot {
    private final SpotId id;
    private VehicleId occupant;   // the ONLY mutable field

    // TODO: constructor validating id
    // TODO: boolean tryAssign(VehicleId v)  — true only if this call took it
    // TODO: void release(VehicleId v)       — idempotent; releasing a free spot is not an error
    // TODO: boolean isFree()
    // TODO: equals/hashCode on id ALONE (entity identity, not state)
}

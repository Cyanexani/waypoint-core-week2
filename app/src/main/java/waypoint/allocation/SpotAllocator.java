package waypoint.allocation;

import waypoint.model.*;

/**
 * TODO — WRITE THE CONTRACT BEFORE ANY IMPLEMENTATION EXISTS.
 *
 * For allocate(...) and release(...) state:
 *   PRE  :
 *   POST :
 *   INV  :
 * Then the clauses from section 2.5 that apply here:
 *   Timing       :
 *   Side effects :
 *   Idempotency  :
 *   Threading    :
 *   Ordering     :
 *
 * This Javadoc is graded. It is the specification the whole suite tests.
 */
public interface SpotAllocator {
    Spot allocate(Vehicle vehicle) throws NoSpotAvailable;
    void release(Spot spot);
}

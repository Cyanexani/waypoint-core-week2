package waypoint.model;

import java.time.Instant;

/** ENTITY. Invariants:
 *   I1  entry is always present
 *   I2  exit is null, or not before entry
 *   I3  fare is null, or not negative
 *   I4  fare exists only if exit exists
 *   I5  a closed ticket never reopens
 */
public final class Ticket {
    // TODO: fields. Exactly two of them are non-final. Work out which.

    // TODO: private constructor + static factory  open(TicketId, SpotId, Instant)
    // TODO: boolean isOpen()
    // TODO: Money close(Instant at, FarePolicy policy)
    //       - reject a second close with TicketAlreadyClosed
    //       - reject at < entry with IllegalArgumentException
    //       - set exit and fare together
    // RULE: no setters. No Instant.now() in this file.
}

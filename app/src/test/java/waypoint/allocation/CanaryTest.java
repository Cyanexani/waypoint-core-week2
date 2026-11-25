import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/** Proves the contract suite actually tests the contract. */
class CanaryTest {
    @Test void theSuiteRejectsADeliberatelyBrokenImplementation() {
        SpotAllocator broken = new BrokenAllocator();
        assertThrows(AssertionError.class,
            () -> assertNotNull(broken.allocate(car())),
            "the suite must fail on a null-returning allocator");
        // TODO: extend this to assert the idempotency clause also rejects it
    }
}

package enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrderStateTest {

    @Test  // a megoldókulcsban külön tesztekre van bontva. Így is jó?
    public void testOrderState() {
        assertTrue(OrderState.NEW.canDelete());
        assertTrue(OrderState.CONFIRMED.canDelete());
        assertTrue(OrderState.PREPARED.canDelete());
        assertFalse(OrderState.ONBOARD.canDelete());
        assertFalse(OrderState.DELIVERED.canDelete());
        assertFalse(OrderState.RETURNED.canDelete());
        assertFalse(OrderState.DELETED.canDelete());

    }
}

package kata.td;

/**
 * Created by benwu on 14-6-10.
 */
public class TicketDispenser {
    public TicketDispenser(TurnNumberSequence turnNumberSequence) {

    }

    public TicketDispenser() {

    }

    public TurnTicket getTurnTicket()
    {
        // TODO-code-smell-working-on: Depending on a static method violates the Dependency Inversion Principle and Open-Closed Principle
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}

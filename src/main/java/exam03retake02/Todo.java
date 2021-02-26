package exam03retake02;

public class Todo {

    private String text;
    private State state;
    private int priority;   //1-5

    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;
        state= State.NON_COMPLETED;
    }

    public State complete() {
        if (priority < 1 || priority > 5) {
            throw new IllegalArgumentException("Invalid" + priority);
        }

        if (state == State.NON_COMPLETED) {
            State newState= State.COMPLETED;
        }
        return State.COMPLETED;
    }






    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getPriority() {
        return priority;
    }
}

package extrapractice.statemachine.typewriter;

public enum TypeWriterState {

    UPPERCASE{
        public TypeWriterState next() {
            return LOWERCASE;
        }
    }, LOWERCASE{
        public TypeWriterState next() {
            return UPPERCASE;
        }
    };

    public abstract TypeWriterState next();
}

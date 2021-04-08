package interfacedefaultmethods.demo;

public interface Hasname {

    default String getName(){
        return "Anonymous";
    }
}

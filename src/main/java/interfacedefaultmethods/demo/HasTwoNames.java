package interfacedefaultmethods.demo;

public interface HasTwoNames extends Hasname{

    default String getName(){
        return "Joe";
    }
}

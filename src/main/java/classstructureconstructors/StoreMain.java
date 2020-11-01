package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("corn");
        store.store(1000);
        System.out.println(store.getProduct() + ": " + store.getStock());

        Store anotherStore = new Store("beans");
        anotherStore.store(2000);
        System.out.println(anotherStore.getProduct() + ": " + anotherStore.getStock());

        store.dispatch(20);
        anotherStore.dispatch(100);

        System.out.println(store.getProduct() + ": " + store.getStock());
        System.out.println(anotherStore.getProduct() + ": " + anotherStore.getStock());




    }
}

public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        Bakery bc = new Bakery();
        System.out.println("Birthday cake flavor: " + bc.getFlavor());
        System.out.println("Birthday cake price: " + bc.getPrice());

        Wedding wed = new Wedding();
        wed.setFlavor("Pina Colada");
        wed.setPrice(350);
        System.out.println("Wedding cake flavor: " + wed.getFlavor());
        System.out.println("Wedding cake price: " + wed.getPrice());
    }
}

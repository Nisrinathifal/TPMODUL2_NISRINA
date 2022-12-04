public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat(10, "sandisk", 1.2);
        perangkat.informasi();

        System.out.println(" ");

        Laptop laptop = new Laptop(20, "toshiba", 2.5, true);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("icha@gmail.com");
        laptop.kirimEmail("icha@gmail.com","thifal@gmail.com");

        System.out.println(" ");

        Handphone hp = new Handphone(6, "samsung", 4.1, false);
        hp.informasi();
        hp.telfon(62812345);
        hp.kirimSMS(62876543);
        hp.kirimSMS(62876543, 628456321);
    }
}

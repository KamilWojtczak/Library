public class Library {
    public static void main(String[] args) {
        final String appName = "Biblioteka v0.4";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2010, 296, "Greg", "983242341");
        Book book2 = new Book("Lolita", "Vladimir Nabokov",
                2012, 214, "Greg", "353232");
        Book book3 = new Book("Encyklopedia", "Praca zbiorowa",
                1998, 296, "PWN", "932483823");


        System.out.println(appName);
        System.out.println("Kiążki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}

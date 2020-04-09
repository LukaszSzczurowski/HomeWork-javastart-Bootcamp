package zajecia03.internetshop;

public class Main {
    public static void main(String[] args) {
        Category category = new Category("Słodycze", "Coś słodkiego dla każdego");
        Category category1 = new Category("Napoje", "Bez picia nie ma życia");

        Product product1 = new Product("Czekolada", 3.95, "Z mlecznej krainy", category);
        Product product2 = new Product("Baton", 8.95, "Proteinowy wzmacniacz", category);
        Product product3 = new Product("Woda", 1.15, "Czysta kranówka", category1);
        Product product4 = new Product("Woda", 1.15, "Brudna kranówka", null);

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();


        SpecialOffer specialOffer = new SpecialOffer("Tniemy Batony !!!", "od 07-04-2020 do 08-04-2020", 0.8, product2);

        specialOffer.specialPrice(product2);
        specialOffer.specialCutPrice(product1, 0.1);
        System.out.println("\u2605-------------------------\u2605\u2605\u2605 STREFA PROMOCJI \u2605\u2605\u2605-------------------------\u2605");
        product2.showInfo();
        product1.showInfo();



    }
}

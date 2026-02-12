package person_JPA;

public class User {

    public static void main(String[] args) {

        ProductDao dao = new ProductDao();

        Product p = new Product();
        p.setId(20);
        p.setName("Notebook");
        p.setPrice(50);
        p.setQuantity(10);

        dao.insertProduct(p);

        dao.close();
    }
}

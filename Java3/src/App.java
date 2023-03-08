public class App {

    public static void main(String[] args) {

        ContaLogin cl1 = new ContaLogin("lucasfloriano09@gmail.com");
        ContaLogin cl2 = new ContaLogin("lucasfloriano09@gmail.com", "1502200412");
        ContaLogin cl3 = new ContaLogin();

        cl1.setNome("Lucas", 10);

        System.out.println("CL1: " + cl1.getNome());

    }

}
public class App {
    public static void main(String[] args) throws Exception {
        pyramid(Integer.parseInt(args[0]));
    }

    private static void pyramid(Integer number) {
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

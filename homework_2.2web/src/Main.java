public class Main {
    public static void main(String[] args) {
        WebHelper webHelper = WebHelper.getInstance();

        // Apelul care declanșează încărcarea paginii web
        String content = webHelper.getWebSiteContent();

        System.out.println("Continutul paginii web:");
        System.out.println(content);

        // Al doilea apel - NU reîncarcă pagina, doar returnează conținutul deja salvat
        String contentAgain = webHelper.getWebSiteContent();
        System.out.println("\nReapelare (fără reîncărcare):");
        System.out.println(contentAgain.equals(content) ? "Conținut reutilizat." : "Conținut diferit.");
    }
}
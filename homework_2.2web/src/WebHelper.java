import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {
    private static WebHelper instance = null;
    private String content = null;
    private final String targetUrl = "https://example.com"; // URL hardcodat

    private WebHelper() {
        // Constructor privat pentru Singleton
    }

    public static WebHelper getInstance() {
        if (instance == null) {
            synchronized (WebHelper.class) {
                if (instance == null) {
                    instance = new WebHelper();
                }
            }
        }
        return instance;
    }

    public String getWebSiteContent() {
        if (content == null) {
            content = loadWebPage();
        }
        return content;
    }

    private String loadWebPage() {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(targetUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to load content.";
        }
        return result.toString();
    }
}

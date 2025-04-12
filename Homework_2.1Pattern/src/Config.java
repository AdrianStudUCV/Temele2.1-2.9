
import java.io.FileReader;
import java.io.IOException;
import jsonsimp.org.json.simple.JSONObject;
import jsonsimp.org.json.simple.parser.JSONParser;
import jsonsimp.org.json.simple.parser.ParseException;

public class Config {
    private static Config instance = null;
    private String color;
    private int weight;
    private boolean isLoaded = false;

    private Config() {
        // Constructor privat pentru Singleton
    }

    public static Config getInstance() {
        if (instance == null) {
            synchronized (Config.class) {
                if (instance == null) {
                    instance = new Config();
                }
            }
        }
        return instance;
    }

    private void loadConfig() {
        if (!isLoaded) {
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader("config.json")) {
                Object obj = parser.parse(reader);
                JSONObject jsonObject = (JSONObject) obj;

                this.color = (String) jsonObject.get("color");
                Long weightLong = (Long) jsonObject.get("weight");
                this.weight = weightLong.intValue();
                isLoaded = true;
            } catch (IOException | ParseException e) {
                e.printStackTrace();
                this.color = "#000000"; // default
                this.weight = 0;        // default
            }
        }
    }

    public String getColor() {
        if (!isLoaded) loadConfig();
        return color;
    }

    public int getWeight() {
        if (!isLoaded) loadConfig();
        return weight;
    }
}

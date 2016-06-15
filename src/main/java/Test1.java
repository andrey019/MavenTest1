import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Test1 {
    public static void main(String[] args) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        System.out.println("Hello world!");
    }
}

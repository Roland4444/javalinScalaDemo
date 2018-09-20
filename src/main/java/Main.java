import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> "<h1>Hello World<h1><h1>next</h1>");
    }
}
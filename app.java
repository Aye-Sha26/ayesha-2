import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {

        String htmlContent = """
        <!DOCTYPE html>
        <html>
        <head>
            <title>CI/CD Java Demo</title>

            <style>
                body {
                    font-family: Arial;
                    background-color: #f2f2f2;
                    text-align: center;
                    margin-top: 100px;
                }

                .box {
                    background: white;
                    padding: 40px;
                    width: 60%;
                    margin: auto;
                    border-radius: 10px;
                    box-shadow: 0px 0px 10px gray;
                }

                button {
                    padding: 10px 20px;
                    background: blue;
                    color: white;
                    border: none;
                    border-radius: 5px;
                }
            </style>

        </head>

        <body>

            <div class="box">

                <h1>CI/CD Pipeline Successful 🚀</h1>

                <p>
                    This webpage was generated using Java
                    and deployed automatically using GitHub Actions.
                </p>

                <button onclick="showMessage()">
                    Click Me
                </button>

                <h3 id="msg"></h3>

            </div>

            <script>
                function showMessage() {
                    document.getElementById("msg").innerHTML =
                    "Deployment Successful!";
                }
            </script>

        </body>
        </html>
        """;

        try {
            FileWriter writer = new FileWriter("index.html");
            writer.write(htmlContent);
            writer.close();

            System.out.println("HTML webpage generated successfully.");

        } catch (IOException e) {
            System.out.println("Error writing HTML file.");
        }
    }
}
package CreateLauncher;

import javax.swing.text.html.HTMLDocument;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class Launcher {

    private static String contentHtml = "<!doctype html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <meta name=\"viewport\"\n" +
            "          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\n" +
            "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
            "    <link rel=\"stylesheet\" href=\"../css/style.css\">\n" +
            "    <title>Document</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "<h1>arquivo foi gerado !!!</h1>\n" +
            "<script src=\"../js/script.js\"></script>\n" +
            "</body>\n" +
            "</html>";
    private static String contentCss = "body{\n" +
            "    background-color: #1C1C1C;\n" +
            "    color : white;\n" +
            "}";
    private static String path = Paths.get(System.getProperty("user.dir")).toString();
    private static String pathLauncher = path + "/WebbApp";
    private static String pathHtml = pathLauncher + "/html";
    private static String pathJs = pathLauncher + "/js";
    private static String pathCss = pathLauncher + "/css";

    private static String contentjs = "window.alert(\"js foi gerado\")";
    public void generatedFiles() throws IOException {
        Boolean
                launcher = new File(pathLauncher).mkdir(),
                htmlFile = new File(pathHtml).mkdir(),
                jsFile = new File(pathJs).mkdir(),
                cssFile = new File(pathCss).mkdir();
        FileWriter
                htmlPure = new FileWriter(pathHtml + "/index.html"),
                jsPure = new FileWriter(pathJs + "/script.js"),
                cssPure = new FileWriter(pathCss + "/style.css");

        BufferedWriter
                html = new BufferedWriter(htmlPure),
                js = new BufferedWriter(jsPure),
                css = new BufferedWriter(cssPure);

        html.write(contentHtml);
        html.flush();

        js.write(contentjs);
        js.flush();

        css.write(contentCss);
        css.flush();




    }
}

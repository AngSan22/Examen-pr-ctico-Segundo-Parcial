package uaslp.objetos.parcial2.exam.exporters;


public class ExporterFactory {
    public static String getExporter(ExporterType type){
        switch (type){
            case XML -> {
                return new XmlExporter();
            }
            case JSON -> {
                return new JsonExporter();
            }
            case HTML -> {
                return new HtmlExporter();
            }
        }
    }

}

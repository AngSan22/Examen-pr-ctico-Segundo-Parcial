package uaslp.objetos.parcial2.exam.exporters;

import uaslp.objetos.parcial2.exam.messagebuilder.MessageBuilder;


public class XmlExporter implements Exporter{
    @Override
    public String export(String message) {
        return "<message>XML format</message>";
    }
}

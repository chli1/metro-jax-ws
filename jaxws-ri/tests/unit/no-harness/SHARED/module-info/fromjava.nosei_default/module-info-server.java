module server {
    requires java.xml.ws;
    requires jdk.httpserver;
    requires java.logging;

    // generated by WebServiceWrapperGenerator
    exports fromjava.nosei_default.server.jaxws;
    exports fromjava.nosei_default.server;
}

package hello.java;

interface Service {
    int serveA(int param) throws Exception;
}

class CoreService implements Service {
    @Override
    public int serveA(int param) throws Exception {
        return 1 / param;
    }
}

class Logging implements Service {

    private final Service service;

    Logging(Service s) {
        this.service = s;
    }

    @Override
    public int serveA(int param) throws Exception {
        System.out.println("Logging...");
        return this.service.serveA(param);
    }
}

class ExceptionHandling implements Service {

    private final Service service;

    ExceptionHandling(Service s) {
        this.service = s;
    }

    @Override
    public int serveA(int param) {
        System.out.println("ExceptionHandling...");
        try {
            return this.service.serveA(param);
        } catch (Exception e) {
            System.out.println("catch ExceptionHandling " + e.getMessage());
            return 0;
        }
    }
}

class OnionDemo {

    public static void main(String[] args) {
        var coreService = new CoreService();
        var log = new Logging(coreService);
        var exc = new ExceptionHandling(log);
        exc.serveA(0);
    }
}

package DesignPatterns.Behevioural;

    /*
    The Chain of Responsibility design pattern is a behavioral design pattern that
    allows an object to pass a request along a chain of handlers.
    Each handler in the chain decides either to process the request or to pass it
    along the chain to the next handler.
     */

interface SupportHandler {
    void handelRequest(Request request);
}

class Level1SupportHandler implements SupportHandler {

    SupportHandler handler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.handler = nextHandler;
    }

    @Override
    public void handelRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 Support handled the request.");
        } else if (handler != null) {
            handler.handelRequest(request);
        }
    }
}

class Level2SupportHandler implements SupportHandler {

    SupportHandler handler;

    @Override
    public void handelRequest(Request request) {
        if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level 2 Support handled the request.");
        } else if (handler != null) {
            handler.handelRequest(request);
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {
        this.handler = nextHandler;
    }
}

class Level3SupportHandler implements SupportHandler {

    @Override
    public void handelRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 Support handled the request.");
        } else {
            System.out.println("Request cannot be handled !");
        }
    }

    public void setNextHandler(SupportHandler nextHandler) {

    }
}

class Request {
    private final Priority priority;

    public Request(Priority priority) {
        this.priority = priority;
    }

    public Priority getPriority() {
        return priority;
    }
}

enum Priority {
    BASIC, INTERMEDIATE, CRITICAL;
}

public class ChainResponsibilityPattern {
    public static void main(String[] args) {
        Level1SupportHandler level1 = new Level1SupportHandler();
        Level2SupportHandler level2 = new Level2SupportHandler();
        Level3SupportHandler level3 = new Level3SupportHandler();

        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        level1.handelRequest(request1);
        level1.handelRequest(request2);
        level1.handelRequest(request3);
    }
}

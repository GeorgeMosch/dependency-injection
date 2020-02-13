package dependencyInjection;

public interface ServiceA {

    String jobA();

    ServiceB getServiceB();

    void setServiceB(final ServiceB serviceB);
}

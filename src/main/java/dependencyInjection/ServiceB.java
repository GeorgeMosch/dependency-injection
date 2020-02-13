package dependencyInjection;

public interface ServiceB {

    public String jobB();

    void setServiceA(final ServiceA serviceA);

    ServiceA getServiceA();
}

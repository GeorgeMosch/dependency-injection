package dependencyInjection;

@Service
public class ServiceBImpl implements ServiceB{

    @Inject
    private ServiceA serviceA;

    @Override
    public String jobB(){
        return "jobB()";
    }

    @Override
    public void setServiceA(ServiceA serviceA) {
    }

    @Override
    public ServiceA getServiceA() {
        return null;
    }
}

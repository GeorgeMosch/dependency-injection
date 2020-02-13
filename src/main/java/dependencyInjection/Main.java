package dependencyInjection;

public class Main {

    public static void main(String[] args) throws Exception {
        DIContext context = createContext();
        doBusinessLogic(context);
    }
        private static DIContext createContext() throws Exception {
            String rootPackage = Main.class.getPackage().getName();
            return DIContext.createContextForPackage(rootPackage);
            /*Set<Class<?>> serviceClasses = new HashSet<>();
            serviceClasses.add(ServiceAImpl.class);
            serviceClasses.add(ServiceBImpl.class);
            return new DIContecxt(serviceClasses);*/
        }

//        ServiceA serviceA = createServiceA(serviceClasses);

//        ServiceB serviceB = new ServiceBImpl();
//        ServiceA serviceA = new ServiceAImpl(serviceB);

        // create instances
//        ServiceB serviceB = new ServiceBImpl();
//        ServiceA serviceA = new ServiceAImpl();

        // wire them together
//        serviceA.setServiceB(serviceB);
//        serviceB.setServiceA(serviceA);

        //System.out.println(serviceA.jobA());


    private static void doBusinessLogic(DIContext context) {

        ServiceA serviceA = context.getServiceInstance(ServiceA.class);
        ServiceB serviceB = context.getServiceInstance(ServiceB.class);
        System.out.println(serviceA.jobA());
        System.out.println(serviceB.jobB());
    }

//    private static ServiceA createServiceA(Set<Class<?>> serviceClasses) throws Exception {
//
//        // step 1: create an instance of each service class
//        Set<Object> serviceInstances = new HashSet<>();
//        for (Class<?> serviceClass : serviceClasses) {
//            Constructor<?> constructor = serviceClass.getConstructor();
//            constructor.setAccessible(true);
//            serviceInstances.add(constructor.newInstance());
//        }
//
//        // step 2: wire them up together
//        for (Object serviceInstance : serviceInstances) {
//            for (Field field : serviceInstance.getClass().getDeclaredFields()) {
//                Class<?> fieldType = field.getType();
//                field.setAccessible(true);
//                // find a suitable matching service instance
//                for (Object matchPartner : serviceClasses) {
//                    if (fieldType.isInstance(matchPartner)) {
//                        field.set(serviceInstance, matchPartner);
//                    }
//                }
//            }
//        }
//        // step 3: from all our service instances, find ServiceA
//        for (Object serviceInstance : serviceInstances) {
//            if (serviceInstance instanceof ServiceA) {
//                return (ServiceA) serviceInstance;
//            }
//        }
//        // we didn't find the requested service instance
//        return null;
//    }
}

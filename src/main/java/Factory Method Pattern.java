// Transport interface
interface Transport {
    void deliver();
}

// Truck class
class Truck implements Transport {
    public void deliver() {
        System.out.println("Delivering by land using a truck.");
    }
}

// Ship class
class Ship implements Transport {
    public void deliver() {
        System.out.println("Delivering by water using a ship.");
    }
}

// Drone class
class Drone implements Transport {
    public void deliver() {
        System.out.println("Delivering by air using a drone.");
    }
}

// TransportFactory class
abstract class TransportFactory {
    abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

// Concrete factories
class LandTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Truck();
    }
}

class WaterTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Drone();
    }
}

// Test class
public class FactoryMethodDemo {
    public static void main(String[] args) {
        TransportFactory landFactory = new LandTransportFactory();
        landFactory.planDelivery(); // Truck delivery

        TransportFactory waterFactory = new WaterTransportFactory();
        waterFactory.planDelivery(); // Ship delivery

        TransportFactory airFactory = new AirTransportFactory();
        airFactory.planDelivery(); // Drone delivery
    }
}

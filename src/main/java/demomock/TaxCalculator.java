package demomock;

public class TaxCalculator {

    private TaxBroker broker;

    public TaxCalculator(TaxBroker broker) {
        this.broker = broker;
    }

    public double getNds(double sum){
        return broker.getNds() * sum;
    }
}

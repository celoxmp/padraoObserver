package one.digitalinnovation;

public interface Monitorado {
    public void addMonitorador( Monitorador observer );
    public void removeMonitorador( Monitorador observer );
    public void notificaMonitoradores();
}

package one.digitalinnovation;

public class DisplayPage implements Monitorador{
    private Monitorado monitorado;
    private int porcentagem;
    public DisplayPage( Monitorado monitorado ){

        this.monitorado = monitorado;
        this.monitorado.addMonitorador(this);
    }
    public void alteraStatus(int porcentagem) {
        System.out.println("Displays on WebPage: A porcentagem subiu de "+this.porcentagem+" para: "+porcentagem);
        this.porcentagem = porcentagem;
    }
}

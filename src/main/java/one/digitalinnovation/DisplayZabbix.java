package one.digitalinnovation;

public class DisplayZabbix  implements Monitorador{
    private Monitorado monitorado;
    private int porcentagem;
    public DisplayZabbix( Monitorado monitorado ){

        this.monitorado = monitorado;
        this.monitorado.addMonitorador(this);
    }


    public void alteraStatus(int porcentagem) {
        System.out.println("Displays on Zabbix: A porcentagem subiu de "+this.porcentagem+" para: "+porcentagem);
        this.porcentagem = porcentagem;
    }
}

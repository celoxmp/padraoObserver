package one.digitalinnovation;

public class SenderEmailComplete implements Monitorador{
    private Monitorado monitorado;
    public SenderEmailComplete( Monitorado monitorado ){

        this.monitorado = monitorado;
        this.monitorado.addMonitorador(this);
    }

    public void alteraStatus(int porcentagem) {
        if (porcentagem == 100) {
            System.out.println("Email enviado pelo SenderEmail, a integração terminou com sucesso!");
        }       
    }
    
}

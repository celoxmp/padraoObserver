package one.digitalinnovation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MonitoramentoIntegracao integracao = new MonitoramentoIntegracao();

        DisplayZabbix zabbix = new DisplayZabbix(integracao);
        DisplayPage pageMonitoramento = new DisplayPage(integracao);
        SenderEmailComplete senderEmail = new SenderEmailComplete(integracao);

        integracao.setAndamentoIntegracao(3);
        integracao.setAndamentoIntegracao(10);
        integracao.setAndamentoIntegracao(15);
        integracao.setAndamentoIntegracao(25);
        integracao.setAndamentoIntegracao(40);
        integracao.setAndamentoIntegracao(60);
        integracao.setAndamentoIntegracao(65);
        integracao.setAndamentoIntegracao(80);
        integracao.setAndamentoIntegracao(83);
        integracao.setAndamentoIntegracao(89);
        integracao.setAndamentoIntegracao(100);
    }
}

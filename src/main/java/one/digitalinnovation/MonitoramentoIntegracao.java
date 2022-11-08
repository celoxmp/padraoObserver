package one.digitalinnovation;

import java.util.ArrayList;
import java.util.List;

public class MonitoramentoIntegracao implements Monitorado{
    private List<Monitorador> observers; /* NOSSAS ENTIDADES OBSERVADORAS ESTÃO AQUI */
    private int porcentagem;

    public MonitoramentoIntegracao(){
        observers = new ArrayList<Monitorador>();
    }

    public void setAndamentoIntegracao(int porcentagem){
        this.porcentagem = porcentagem;
        notificaMonitoradores();
    }

    public void addMonitorador(Monitorador observer){
        observers.add( observer );
    }

    public void removeMonitorador( Monitorador observer ){
        int index = observers.indexOf( observer );
        if( index > -1 ){
            observers.remove( observer );
        }
    }

    public void notificaMonitoradores(){ /* MÉTODO ONDE HÁ A COMUNICAÇÃO DA MUDANÇA DE ESTADO */
        for( Monitorador o :observers ){
            o.alteraStatus(porcentagem);
        }
    }
}

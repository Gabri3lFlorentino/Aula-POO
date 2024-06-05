import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppController
{
    AppView appView;
    Stage stage;
    App app;
    public Label cliente,
    
    /**
     * Construtor para objetos da classe IMCController
     */
    public AppController()
    {
        this.stage = new Stage();
        this.appView = new AppView();
        this.appView.setController(this);
        
        App();
    }
    
    public void iniciar() throws Exception {
        this.appView.start(this.stage);
        this.stage.show();
    }    

    
}

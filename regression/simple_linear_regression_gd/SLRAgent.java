//Regresion Lineal Simple (SLR) via Gradiente Descendente (GD)

package regression.simple_linear_regression_gd;

import jade.core.Agent;
import jade.core.behaviours.Behaviour;

public class SLRAgent extends Agent {

  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    addBehaviour(new MyGenericBehaviour());
  } 

  private class MyGenericBehaviour extends Behaviour {
    int cont = 0;

    public void action() {
      System.out.println("Agent's action method executed");

      SLR regresion = new SLR();
      regresion.getX();

      cont += 1;
    } 
    
    public boolean done() {
      return cont == 1;
    }
   
    public int onEnd() {
      myAgent.doDelete();
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}



import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BlocoDeNotas{
   private ArrayList<String> notas;
   
   public BlocoDeNotas(){
      notas = new ArrayList<String>();
   }
   
   public void addNota(String nota){
      notas.add(nota);
   }
   
   public int buscarNota(String nota){
      for(int i=0; i < notas.size(); i++){
         if(notas.get(i).equals(nota))
            return i;
      }
      return -1;
   }
   
   public boolean removerNota(int posicao){
      if(posicao >= 0){
         notas.remove(posicao);
         return true;
      }
      return false;
   }   
      
   public void listarNotas(){
      for(int i = 0; i < notas.size(); i++){
         System.out.println(notas.get(i));      
      }                     
   }
   
   public void mudarNota(int posicao, String nNota){
      notas.set(posicao, nNota);
   }
   
   public String mostarNota(int posicao){
      return notas.get(posicao);
   }
}
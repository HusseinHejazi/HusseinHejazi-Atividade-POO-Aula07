import javax.swing.*;

public class AppBloco{
   public static void main(String[] args){
   
      BlocoDeNotas notas = new BlocoDeNotas();
      
      int menu;
      String nota;
      int posicao;
      
      do{
         menu = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Nota\n2- Remover Nota \n3- Alterar Nota \n4- Listar Todas as Notas \n5- Sair do Sistema"));
         switch(menu){
            case 1:{
              nota = JOptionPane.showInputDialog("Digite a Nota");
               notas.addNota(nota);
               break;   
            }
            case 2:{
               posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da Nota pra remover"));
               notas.removerNota(posicao);
               break;
            }
            case 3:{
               nota = JOptionPane.showInputDialog("Digite uma nota que deseje mudar");
               posicao = notas.buscarNota(nota);
               if(posicao > -1){
                  nota = JOptionPane.showInputDialog("Digite o novo texto para mudar a nota");
                  notas.mudarNota(posicao, nota);
               }
               else{
                  JOptionPane.showMessageDialog(null,"Nota nao armazenada");
               }
            }
            case 4:{
               notas.listarNotas();
               break;
            }
            case 5:{
               JOptionPane.showMessageDialog(null, "Sistema encerrado");
            }
         }
         
      }while(menu != 5);      
   }
}
   
   
   
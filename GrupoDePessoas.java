import java.util.Scanner;
public class GrupoDePessoas {
    


    public static void main(String[] args) {

      int Dados = 0;
      String SexoFeminino = "feminino";
      String SexoMasculino = "masculino";
      int mulher = 0;
      int homem = 0;
      int altura = 0;
      int SomaDeAltura = 0;
      int AlturaMaior = 0;
      int AlturaMenor = 0;



    while(Dados < 2)
    {
        

    
      Scanner cadastro = new Scanner(System.in);


      System.out.println("Digite qual seu sexo - Feminino ou Masculino: ");
      String Sexo = cadastro.nextLine();
      System.out.println("Digite sua altura em cm:  ");
      altura = cadastro.nextInt();


      if(Sexo.equalsIgnoreCase(SexoFeminino)){
        mulher++;

      } else if(Sexo.equalsIgnoreCase(SexoMasculino)){

         homem++;
         
    SomaDeAltura += altura;


      } else {
        System.out.println("opção invalida");
      }

      if(altura > AlturaMaior){

        AlturaMaior = altura;
      }

       
      if(altura < AlturaMenor){
          
        AlturaMenor = altura;
      }
   

 Dados++;

}
int media = SomaDeAltura/homem;
    System.out.println("altura menor: " +AlturaMenor);
    System.out.println("altura maior: " +AlturaMaior);
    System.out.println("media: "+ media);
    System.out.println("mulheres: "+ mulher);
        
    }
}

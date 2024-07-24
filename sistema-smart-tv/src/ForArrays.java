public class ForArrays {
  public static void main(String[] args) {
    String alunos[] = {"FELIPE", "ADRIANO", "ANA", "FER"};

    // for(int aluno = 0; aluno <= alunos.length; aluno++){
    //   System.out.println("Indice do aluno: "+aluno+" Nome do aluno "+ alunos[aluno]);
    // }
    for (String aluno : alunos) {
      if (aluno == "ANA") {
        continue;
      }
      System.out.println(aluno);
      
      
    }
  }
}

package atvd04;

public class Questao05 {

    public static void main(String [] args){
        Disciplina disciplina = new Disciplina("LP2");
        Professor professor = new Professor("Jucelio", disciplina);
        Aluno aluno1 = new Aluno("yossef");
        Aluno aluno2 = new Aluno("isaac");
        Aluno aluno3 = new Aluno("oliveira");
        Aluno[] alunos = new Aluno[3];
        alunos[0] = aluno1; 
        alunos[1] = aluno2;
        alunos[2] = aluno3;
  
        Turma turma = new Turma("3 periodo", professor, disciplina, alunos);
        
        System.out.println("O professor " +  turma.getProfessor().getNome() + " ensina " +  turma.getDisciplina().getNome() + " na turma do " + turma.getNome() + " aos alunos:");
        for(int i=0; i<3;i++){
            System.out.println(alunos[i].getNome());
        }
    }
}

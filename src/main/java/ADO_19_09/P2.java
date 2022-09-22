package ADO_19_09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/** 
   por Rafael Ferreira Goulart
**/

public class P2 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Rafael Goulart");
        aluno.setIdade(24);
        aluno.setAltura(1.75);
        aluno.setPeso(60.0);

        P2 arquivosObjetos = new P2();
        try {
            arquivosObjetos.criarObjeto(aluno);
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }

        Aluno aluno2 = null;
        try {
            aluno2 = (Aluno) arquivosObjetos.lerObjeto();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getIdade());
        System.out.println(aluno2.getAltura());
        System.out.println(aluno2.getPeso());
    }

    public void criarObjeto(Object object) throws Exception {
	try (FileOutputStream fileOutputStream = new FileOutputStream(new File("database.db"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
	} 
    }
	
    public Object lerObjeto() throws Exception {
        try (FileInputStream fileInputStream = new FileInputStream(new File("database.db"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return objectInputStream.readObject();
        }
    }
}
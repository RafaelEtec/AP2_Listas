package ADO_19_09;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/** 
   por Rafael Ferreira Goulart
**/

public class P1 {
    public static void main(String[] args) throws Exception {
        Path newDir = Files.createDirectory(Path.of("C:/DiretorioADOP1"));
        System.out.println("Diretório criado em: " + newDir.toAbsolutePath());
        Path newArch = Files.createFile(newDir.resolve("ArquivoADOP1.txt"));
        
        for (int i = 1; i <= 1910; i++) {
            Files.writeString(newArch, "Linha " + i + "\r\n", StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
        }
    }
}

//public class ArquivosDiretoriosEscrita {
//	
//    public static void main(String[] args) throws Exception {
//        Path novoDiretorio = Files.createDirectory(Path.of("C:/novoDiretorio-" + UUID.randomUUID()));
//        System.out.println("Novo diretório:" + novoDiretorio.toAbsolutePath());
//        Path novoArquivo = Files.createFile(novoDiretorio.resolve("novoArquivo.txt"));
//        
//        for (int pos1 = 0; pos1 < 10; pos1++) {
//            System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());
//        }
//        for (int i=0;i<=10;i++) {
//            Files.writeString(novoArquivo, "Valor gerado é " + UUID.randomUUID() + "\r\n", 
//            StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
//        }
//    }  
//}
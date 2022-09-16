import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class ExceptionPersonalizada {

	public static void main(String[] args)    {
		
		String nomeDoArquivo= JOptionPane.showInputDialog("Nome do arquivo a ser exibido");
		imprimirArquivoNoConsole(nomeDoArquivo);
		
		System.out.println("Apesar da exception ou nao, o programa continua");
	}
	public static void imprimirArquivoNoConsole(String nomeDoArquivo){
		
    try {		
    	BufferedReader br= lerArquivos(nomeDoArquivo);
    	String line= br.readLine();
    	BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
    	
    }do {
		bw.write(line);
		bw.newLine();
		line=br.readLine();
		}while(line !=null);
		
		bw.flush();
		br.close();
   }catch(IOException ex) {
	JOptionPane.showMessageDialog(null, "Ocorreu um erro, entre em conato com o supoprte"+ex.getMessage());
	ex.printStackTrace();
}

public static BufferedReader lerArquivos(String nomeDoArquivo) {
	File file=new File(nomeDoArquivo);
	return new BufferedReader(new FileReader(nomeDoArquivo));
		
}	
}
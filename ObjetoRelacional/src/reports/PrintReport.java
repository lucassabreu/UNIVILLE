package reports;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import com.sun.org.apache.xerces.internal.util.URI;
//import sun.management.FileSystem;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.view.JasperViewer;

public class PrintReport {
	
	public Connection connectDB() {
		
		//Cria a conexão JDBC que será utilizada pelo relatório
		Connection jdbcConnection = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			jdbcConnection = DriverManager
					.getConnection("jdbc:sqlserver://localhost:1433;databaseName=univille;user=bob;password=bob");
		} catch (Exception ex) {
			String connectMsg = "Could not connect to the database: "
					+ ex.getMessage() + " " + ex.getLocalizedMessage();
			System.out.println(connectMsg);
		}
		return jdbcConnection;
	}
 
	public void runReport(String report) {
		try {
			// Busca o arquivo JRXML
			java.net.URI file = ClassLoader.getSystemResource(report).toURI();
			JasperDesign jasperDesign = JRXmlLoader.load(file.getPath());
			//Compila o relatório
			JasperReport jasperReport = JasperCompileManager
					.compileReport(jasperDesign);
			Connection jdbcConnection = connectDB();
			//Cria um HashMap contendo os parametros
			HashMap parametros = new HashMap();
			parametros.put("OID", new Integer(1));
			
			//Executa o relatório
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					jasperReport, parametros, jdbcConnection);
			
			JasperViewer.viewReport(jasperPrint,false);
			
		} catch (Exception ex) {
			String connectMsg = "Could not create the report "
					+ ex.getMessage() + " " + ex.getLocalizedMessage();
			System.out.println(connectMsg);
		}
	}
 
	public static void main(String[] args) {
		PrintReport imprimir = new PrintReport();
		imprimir.runReport("report/ClienteReport.jrxml");
	}
}